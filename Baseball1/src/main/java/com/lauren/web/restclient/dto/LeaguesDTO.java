package com.lauren.web.restclient.dto;

import java.util.List;

public class LeaguesDTO {
    private List<LeagueDTO> leagues;

    public List<LeagueDTO> getLeagues() {
        return leagues;
    }

    public void setLeagues(List<LeagueDTO> leagues) {
        this.leagues = leagues;
    }
}
