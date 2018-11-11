package com.lauren.web.restclient.dto;

import java.util.List;

public class AtBatsDTO {
    private List<AtBatsDTO> atBats;

    public List<AtBatsDTO> getAtBats() {
        return atBats;
    }

    public void getAtBats (List<AtBatsDTO> atBats) {
        this.atBats = atBats;
    }
}
