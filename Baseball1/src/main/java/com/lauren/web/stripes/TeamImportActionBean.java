package com.lauren.web.stripes;

import com.lauren.db.HibernateUtil;
import com.lauren.db.League;
import com.lauren.db.PersistenceManager;
import com.lauren.db.Team;
import com.lauren.web.restclient.RestClient;
import com.lauren.web.restclient.dto.LeagueDTO;
import com.lauren.web.restclient.dto.TeamsDTO;
import net.sourceforge.stripes.action.*;
import org.hibernate.Session;

import java.util.List;

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
            return new ErrorResolution(500, e.getMessage());
        }
        return new StreamingResolution("text/plain", "OK");
    }
}
