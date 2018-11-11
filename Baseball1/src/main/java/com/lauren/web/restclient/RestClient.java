package com.lauren.web.restclient;

import com.lauren.web.restclient.dto.BaseDTO;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;

public class RestClient {
    public <T extends BaseDTO> T getRequest(String url, Class<T> expectedClass) throws IOException {
        Client client = Client.create();

        WebResource webResource = client
                .resource(url);
        //"https://api.stattleship.com/baseball/mlb/game_logs?mlb-mil"



        ClientResponse response = webResource.accept("application/vnd.stattleship.com; version=1").header("Authorization", "Token token=9ef8954d0efdc1836bcc2507df00992f").header("Content-Type", "application/json").get(ClientResponse.class);

        if (response.getStatus() != 200) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + response.getStatus());
        }

//            String output = response.getEntity(String.class);

        ObjectMapper mapper = new ObjectMapper().configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        T output  = mapper.readValue(response.getEntity(String.class),  expectedClass);
//            GameDTO output = response.getEntity(GameDTO.class);


        return output;
    }

}
