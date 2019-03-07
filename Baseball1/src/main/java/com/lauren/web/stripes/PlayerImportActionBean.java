package com.lauren.web.stripes;

import com.lauren.db.HibernateUtil;
import com.lauren.db.League;
import com.lauren.db.Player;
import com.lauren.db.Team;
import com.lauren.web.restclient.RestClient;
import com.lauren.web.restclient.dto.PlayerDTO;
import com.lauren.web.restclient.dto.PlayersDTO;
import net.sourceforge.stripes.action.*;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.text.DecimalFormat;
import java.text.ParseException;

public class PlayerImportActionBean extends BaseActionBean {
    @DefaultHandler
    public Resolution DisplayImportPage() {
        return new ForwardResolution("playerimport.jsp");
    }

    public Resolution doImport() {
        try {
            RestClient client = new RestClient();
            PlayersDTO players = client.getRequest("https://api.stattleship.com/baseball/mlb/players?season_id=mlb-2018", PlayersDTO.class);
            Session newSession = HibernateUtil.getSessionFactory().openSession();
            for (PlayerDTO player : players.getPlayers()) {
                Transaction tx = null;
                try {
                    tx = newSession.beginTransaction();
                    insertPlayer(newSession, player);

                    tx.commit();
                } catch (Exception e) {
                    if (tx != null) tx.rollback();
                    throw e;
                } finally {
                    newSession.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ErrorResolution(500, e.getMessage());
        }
        return new StreamingResolution("text/plain", "OK");
    }

    private void insertPlayer(Session newSession, PlayerDTO player) {
        Player playerEntity = new Player();
        playerEntity.setExternalId(player.getExternalId());
        playerEntity.setCreatedAt(player.getCreatedAt());
        playerEntity.setUpdatedAt(player.getUpdatedAt());
        playerEntity.setActive(player.isActive());
        playerEntity.setBats(player.getBats());
        playerEntity.setBirthDate(player.getBirthDate());
        playerEntity.setCaptain(player.getCaptain());
        playerEntity.setCountry(player.getCountry());
        playerEntity.setDraftOverallPick(player.getDraftOverallPick());
        playerEntity.setDraftRound(player.getDraftRound());
        playerEntity.setDraftSeason(player.getDraftSeason());
        playerEntity.setDraftTeamName(player.getDraftTeamName());
        playerEntity.setFirstName(player.getFirstName());
        playerEntity.setHandedness(player.getHandedness());
        playerEntity.setHeight(player.getHeight());
        playerEntity.setHighSchool(player.getHighSchool());

        DecimalFormat format = new DecimalFormat("#,###,###.##");
        try {
            playerEntity.setHumanizedSalary(format.parse(player.getHumanizedSalary()).floatValue());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        playerEntity.setLastName(player.getLastName());
        playerEntity.setMlbam_id(player.getMlbam_Id());
        playerEntity.setName(player.getName());
        playerEntity.setNickname(player.getNickname());
        playerEntity.setPositionAbbreviation(player.getPositionAbbreviation());
        playerEntity.setPositionName(player.getPositionName());
        playerEntity.setProDebut(player.getProDebut());
        try {
            playerEntity.setSalary(format.parse(player.getSalary()).floatValue());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        playerEntity.setSalaryCurrency(player.getSalaryCurrency());
        playerEntity.setSchool(player.getSchool());
        playerEntity.setSlug(player.getSlug());
        playerEntity.setSport(player.getSport());
        playerEntity.setState(player.getState());
        playerEntity.setUniformNumber(player.getUniformNumber());
        playerEntity.setUnitOfHeight(player.getUnitOfHeight());
        playerEntity.setUnitOfWeight(player.getUnitOfWeight());
        playerEntity.setWeight(player.getWeight());
        playerEntity.setYearsOfExperience(player.getYearsOfExperience());

        Criteria playerLeague = newSession.createCriteria(League.class);
        playerLeague.add(Restrictions.eq("externalId", player.getLeagueId()));
        League pLeague = (League) playerLeague.uniqueResult();
        playerEntity.setLeagueId(pLeague);

        playerEntity.setPlayingPositionId(player.getPlayingPositionId());

        Criteria playerTeam = newSession.createCriteria(League.class);
        playerTeam.add(Restrictions.eq("externalId", player.getTeamId()));
        Team pTeam = (Team) playerTeam.uniqueResult();
        playerEntity.setTeamId(pTeam);


        newSession.saveOrUpdate(playerEntity);
    }
}
