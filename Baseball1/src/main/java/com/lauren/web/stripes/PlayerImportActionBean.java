//package com.lauren.web.stripes;
//
//import com.lauren.db.HibernateUtil;
//import com.lauren.db.Player;
//import com.lauren.web.restclient.RestClient;
//import com.lauren.web.restclient.dto.LeagueDTO;
//import com.lauren.web.restclient.dto.PlayerDTO;
//import com.lauren.web.restclient.dto.PlayersDTO;
//import com.lauren.web.restclient.dto.TeamsDTO;
//import net.sourceforge.stripes.action.*;
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//
//public class PlayerImportActionBean extends BaseActionBean{
//        @DefaultHandler
//        public Resolution DisplayImportPage () {
//            return new ForwardResolution("playerimport.jsp");
//        }
//        public Resolution doImport () {
//            try {
//                RestClient client = new RestClient();
//                PlayersDTO players = client.getRequest("https://api.stattleship.com/baseball/mlb/players?season_id=mlb-2018", PlayersDTO.class);
//                Session newSession = HibernateUtil.getSessionFactory().openSession();
//                for (PlayerDTO player : players.getPlayers()) {
//                    Transaction tx = null;
//                    try {
//                        tx = newSession.beginTransaction();
//                        insertPlayer(newSession, player);
//
//                        tx.commit();
//                    } catch (Exception e) {
//                        if (tx != null) tx.rollback();
//                        throw e;
//                    } finally {
//                        newSession.close();
//                    }
//                }
//            }
//            catch (Exception e) {
//                e.printStackTrace();
//                return new ErrorResolution(500, e.getMessage());
//            }
//            return new StreamingResolution("text/plain", "OK");
//        }
//                private void insertPlayer(Session newSession, PlayerDTO player) {
//                    Player playerEntity = new Player();
//                    leagueEntity.setExternalId(league.getExternalId());
//                    leagueEntity.setCreatedAt(league.getCreatedAt());
//                    leagueEntity.setUpdatedAt(league.getUpdatedAt());
//                    leagueEntity.setAbbreviation(league.getAbbreviation());
//                    leagueEntity.setName(league.getName());
//                    leagueEntity.setPeriods(league.getPeriods());
//                    leagueEntity.setSlug(league.getSlug());
//                    leagueEntity.setSport(league.getSport());
//                    newSession.saveOrUpdate(leagueEntity);
//                }
//}
