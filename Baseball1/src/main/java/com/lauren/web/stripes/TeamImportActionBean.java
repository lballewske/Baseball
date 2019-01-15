package com.lauren.web.stripes;

import com.lauren.db.*;
import com.lauren.web.restclient.RestClient;
import com.lauren.web.restclient.dto.*;
import net.sourceforge.stripes.action.*;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TeamImportActionBean extends BaseActionBean {
    @DefaultHandler
    public Resolution DisplayImportPage () {
        return new ForwardResolution("teamimport.jsp");
    }
    public Resolution doImport () {
        try {
            RestClient client = new RestClient();
            TeamsDTO teams = client.getRequest("https://api.stattleship.com/baseball/mlb/teams", TeamsDTO.class);
            Session newSession = HibernateUtil.getSessionFactory().openSession();
            for (LeagueDTO league: teams.getLeagues()) {
                Transaction tx=null;
                try {
                    tx = newSession.beginTransaction();
                    insertLeague(newSession, league);

                    tx.commit();
                }
                catch (Exception e) {
                    if (tx!=null) tx.rollback();
                    throw e;
                }
                finally {
                    newSession.close();
                }
            }

            for (ConferenceDTO conference: teams.getConferences()) {
                Transaction tx=null;
                try {
                    tx = newSession.beginTransaction();
                    insertConference(newSession, conference);

                    tx.commit();
                }
                catch (Exception e) {
                    if (tx!=null) tx.rollback();
                    throw e;
                }
                finally {
                    newSession.close();
                }
            }

            for (DivisionDTO division: teams.getDivisions()) {
                Transaction tx=null;
                try {
                    tx = newSession.beginTransaction();
                    insertDivision(newSession, division);

                    tx.commit();
                }
                catch (Exception e) {
                    if (tx!=null) tx.rollback();
                    throw e;
                }
                finally {
                    newSession.close();
                }
            }

            for (TeamDTO team: teams.getTeams()) {
                Transaction tx=null;
                try {
                    tx = newSession.beginTransaction();
                    insertTeam(newSession, team);

                    tx.commit();
                }
                catch (Exception e) {
                    if (tx!=null) tx.rollback();
                    throw e;
                }
                finally {
                    newSession.close();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            return new ErrorResolution(500, e.getMessage());
        }
        return new StreamingResolution("text/plain", "OK");
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
        conferenceEntity.setLeagueId(conference.getLeagueId());
        newSession.saveOrUpdate(conferenceEntity);
    }

    private void insertDivision(Session newSession, DivisionDTO division) {
        Division divisionEntity = new Division();
        divisionEntity.setExternalId(division.getExternalId());
        divisionEntity.setCreatedAt(division.getCreatedAt());
        divisionEntity.setUpdatedAt(division.getUpdatedAt());
        divisionEntity.setName(division.getName());
        divisionEntity.setConferenceId(division.getConferenceId());
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
        teamEntity.setDvisionId(team.getDvisionId());
        teamEntity.setLeagueId(team.getLeagueId());
        newSession.saveOrUpdate(teamEntity);

    }
}
