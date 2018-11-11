package com.lauren.web.restclient.dto;

import java.util.List;

public class PlayersDTO {
    private List<PlayerDTO> players;

    public List<PlayerDTO> getPlayers() {
        return players;
    }

    public void setPlayers(List<PlayerDTO> players) {
        this.players = players;
    }
}
