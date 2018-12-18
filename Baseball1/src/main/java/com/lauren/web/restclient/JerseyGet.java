package com.lauren.web.restclient;

import com.lauren.web.restclient.dto.GamesDTO;
import com.lauren.web.restclient.dto.PlayerDTO;
import com.lauren.web.restclient.dto.TeamsDTO;

public class JerseyGet {

    public static void main(String[] args) {
        try {
            RestClient client = new RestClient();
            TeamsDTO teams = client.getRequest("https://api.stattleship.com/baseball/mlb/teams", TeamsDTO.class);

            //PlayerDTO players = client.getRequest("https://api.stattleship.com/baseball/mlb/players?season_id=mlb-2018", PlayerDTO.class);


            System.out.println("Output from Server .... \n");
            System.out.println(teams);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }
}