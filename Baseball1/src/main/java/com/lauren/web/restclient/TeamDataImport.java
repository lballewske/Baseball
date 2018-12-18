package com.lauren.web.restclient;

import com.lauren.db.HibernateUtil;
import com.lauren.db.League;
import com.lauren.web.restclient.dto.LeagueDTO;
import com.lauren.web.restclient.dto.TeamsDTO;
import org.hibernate.Session;

public class TeamDataImport {
    public static void main(String[] args) {
        try {
            RestClient client = new RestClient();
            TeamsDTO teams = client.getRequest("https://api.stattleship.com/baseball/mlb/teams", TeamsDTO.class);
            Session newSession = HibernateUtil.getSessionFactory().openSession();
            for (LeagueDTO league: teams.getLeagues()) {
                League leagueEntity = new League();
                leagueEntity.setExternalId(league.getExternalId());
                leagueEntity.setCreatedAt(league.getCreatedAt());
                leagueEntity.setUpdatedAt(league.getUpdatedAt());
                leagueEntity.setAbbreviation(league.getAbbreviation());
                leagueEntity.setName(league.getName());
                leagueEntity.setPeriods(league.getPeriods());
                leagueEntity.setSlug(league.getSlug());
                leagueEntity.setSport(league.getSport());
                newSession.persist(leagueEntity);

            }


        } catch (Exception e) {

            e.printStackTrace();

        }

    }
}
