package com.lauren.web.restclient;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class JerseyGet {

    public static void main(String[] args) {
        try {

            Client client = Client.create();

            WebResource webResource = client
                    .resource("https://api.stattleship.com/baseball/mlb/game_logs?mlb-mil");



            ClientResponse response = webResource.accept("application/vnd.stattleship.com; version=1").header("Authorization", "Token token=9ef8954d0efdc1836bcc2507df00992f").header("Content-Type", "application/json").get(ClientResponse.class);

            if (response.getStatus() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.getStatus());
            }

            String output = response.getEntity(String.class);

            System.out.println("Output from Server .... \n");
            System.out.println(output);

        } catch (Exception e) {

            e.printStackTrace();

        }

    }
}