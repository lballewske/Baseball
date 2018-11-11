package com.lauren.web.restclient.dto;

import java.util.List;

public class StartingPitchersDTO {
    private List<StartingPitcherDTO> startingPitcher;

    public List<StartingPitcherDTO> getStartingPitcher() {
        return startingPitcher;
    }

    public void setStartingPitcher(List<StartingPitcherDTO> startingPitcher) {
        this.startingPitcher = startingPitcher;
    }
}
