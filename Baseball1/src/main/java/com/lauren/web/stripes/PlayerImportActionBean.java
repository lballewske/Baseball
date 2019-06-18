package com.lauren.web.stripes;

import com.lauren.db.Player;
import com.lauren.db.Team;
import com.lauren.web.restclient.RestClient;
import com.lauren.web.restclient.dto.PlayerDTO;
import com.lauren.web.restclient.dto.PlayersDTO;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

public class PlayerImportActionBean extends BaseImportActionBean {


    @Override
    public String getImportJsp() {
        return "playerimport.jsp";
    }

    @Override
    @SuppressWarnings("unchecked")
    void doImportImpl(Session session, RestClient client) throws Exception {
        List<Team> teamList = session.createCriteria(Team.class).list();
        for (Team team : teamList) {
            PlayersDTO players = client.getRequest("https://api.stattleship.com/baseball/mlb/players?season_id=mlb-2019&team_id=" + team.getSlug(), PlayersDTO.class);


            for (PlayerDTO player : players.getPlayers()) {
                doInTransaction(session, () -> savePlayer(session, player));
            }
        }
    }

    private void savePlayer(Session newSession, PlayerDTO player) {
        Criteria playerCriteria = newSession.createCriteria(Player.class);
        playerCriteria.add(Restrictions.eq("externalId", player.getExternalId()));
        Player playerEntity  = (Player) playerCriteria.uniqueResult();
        if (playerEntity == null) {
            playerEntity = new Player();
        }

        playerEntity.setExternalId(player.getExternalId());
        playerEntity.setCreatedAt(player.getCreatedAt());
        playerEntity.setUpdatedAt(player.getUpdatedAt());
        playerEntity.setActive(player.isActive());
        playerEntity.setBats(player.getBats());
        playerEntity.setBirthDate(player.getBirthDate());
        playerEntity.setCaptain(player.getCaptain());
        playerEntity.setCity(player.getCity());
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
        } catch (Exception e) {
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



        playerEntity.setPlayingPositionId(player.getPlayingPositionId());

        Criteria playerTeam = newSession.createCriteria(Team.class);
        playerTeam.add(Restrictions.eq("externalId", player.getTeamId()));
        Team pTeam = (Team) playerTeam.uniqueResult();
        playerEntity.setTeam(pTeam);


        newSession.saveOrUpdate(playerEntity);
    }
}
