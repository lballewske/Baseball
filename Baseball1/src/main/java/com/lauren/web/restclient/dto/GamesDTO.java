package com.lauren.web.restclient.dto;

import java.util.List;

public class GamesDTO {
    private List<GameDTO> games;

    public List<GameDTO> getGames() {
        return games;
    }

    public void setGames(List<GameDTO> games) {
        this.games = games;
    }
}
