package com.lauren.web.stripes;

import com.lauren.db.Conference;
import com.lauren.db.Division;
import com.lauren.db.League;
import com.lauren.db.Team;
import com.lauren.web.restclient.RestClient;
import com.lauren.web.restclient.dto.ConferenceDTO;
import com.lauren.web.restclient.dto.DivisionDTO;
import com.lauren.web.restclient.dto.LeagueDTO;
import com.lauren.web.restclient.dto.TeamDTO;
import com.lauren.web.restclient.dto.TeamsDTO;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class TeamImportActionBean extends BaseImportActionBean {

    @Override
    public String getImportJsp() {
        return "teamimport.jsp";
    }

    @Override
    void doImportImpl(Session session, RestClient client) throws Exception {
        TeamsDTO teams = client.getRequest("https://api.stattleship.com/baseball/mlb/teams", TeamsDTO.class);
        for (LeagueDTO league: teams.getLeagues()) {
            doInTransaction(session, () -> {
                saveTeamsInLeague(session, teams, league);
            });

        }

    }

    private void saveTeamsInLeague(Session session, TeamsDTO teams, LeagueDTO league) {
        insertLeague(session, league);

        for (ConferenceDTO conference: teams.getConferences()) {
            insertConference(session, conference);
        }

        for (DivisionDTO division: teams.getDivisions()) {
            insertDivision(session, division);
        }

        for (TeamDTO team: teams.getTeams()) {
            insertTeam(session, team);
        }
    }

    private void insertLeague(Session newSession, LeagueDTO league) {
        League leagueEntity = new League();
        leagueEntity.setExternalId(league.getExternalId());
        leagueEntity.setCreatedAt(league.getCreatedAt());
        leagueEntity.setUpdatedAt(league.getUpdatedAt());
        leagueEntity.setAbbreviation(league.getAbbreviation());
        leagueEntity.setName(league.getName());
        leagueEntity.setPeriods(league.getPeriods());
        leagueEntity.setSlug(league.getSlug());
        leagueEntity.setSport(league.getSport());
        newSession.saveOrUpdate(leagueEntity);
    }

    private void insertConference(Session newSession, ConferenceDTO conference) {
        Conference conferenceEntity = new Conference();
        conferenceEntity.setExternalId(conference.getExternalId());
        conferenceEntity.setCreatedAt(conference.getCreatedAt());
        conferenceEntity.setUpdatedAt(conference.getUpdatedAt());
        conferenceEntity.setName(conference.getName());
        Criteria cr = newSession.createCriteria(League.class);
        cr.add(Restrictions.eq("externalId", conference.getLeagueId()));
        League league = (League) cr.uniqueResult();
        conferenceEntity.setLeague(league);
        newSession.saveOrUpdate(conferenceEntity);
    }

    private void insertDivision(Session newSession, DivisionDTO division) {
        Division divisionEntity = new Division();
        divisionEntity.setExternalId(division.getExternalId());
        divisionEntity.setCreatedAt(division.getCreatedAt());
        divisionEntity.setUpdatedAt(division.getUpdatedAt());
        divisionEntity.setName(division.getName());
        Criteria cr = newSession.createCriteria(Conference.class);
        cr.add(Restrictions.eq("externalId", division.getConferenceId()));
        Conference conference = (Conference) cr.uniqueResult();
        divisionEntity.setConference(conference);
        newSession.saveOrUpdate(divisionEntity);
    }

    private void insertTeam(Session newSession, TeamDTO team) {
        Team teamEntity = new Team();
        teamEntity.setExternalId(team.getExternalId());
        teamEntity.setCreatedAt(team.getCreatedAt());
        teamEntity.setUpdatedAt(team.getUpdatedAt());
        teamEntity.setAbbreviation(team.getAbbreviation());
        teamEntity.setColors(team.getColors());
        teamEntity.setHashtag(team.getHastag());
        teamEntity.setHashtags(team.getHashtags());
        teamEntity.setName(team.getName());
        teamEntity.setNickname(team.getNickname());
        teamEntity.setLattitude(team.getLattitude());
        teamEntity.setLongitude(team.getLongitude());
        teamEntity.setSlug(team.getSlug());
        Criteria cr = newSession.createCriteria(Division.class);
        cr.add(Restrictions.eq("externalId", team.getDivisionId()));
        Division division = (Division) cr.uniqueResult();
        teamEntity.setDivision(division);
        Criteria cri = newSession.createCriteria(League.class);
        cri.add(Restrictions.eq("externalId", team.getLeagueId()));
        League league = (League) cri.uniqueResult();
        teamEntity.setLeague(league);
        newSession.saveOrUpdate(teamEntity);
    }
}
