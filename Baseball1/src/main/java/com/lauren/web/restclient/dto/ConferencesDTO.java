package com.lauren.web.restclient.dto;

import java.util.List;

public class ConferencesDTO {
    private List<ConferenceDTO> conferences;

    public List<ConferenceDTO> getConferences() {
        return conferences;
    }

    public void setConferences(List<ConferenceDTO> conferences) {
        this.conferences = conferences;
    }
}
