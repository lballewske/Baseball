package com.lauren.web.restclient.dto;

import java.util.List;

public class TeamsDTO extends BaseDTO {
    private List<TeamDTO> teams;
    private List<LeagueDTO> leagues;
    private List<ConferenceDTO> conferences;
    private List<DivisionDTO> divisions;

    public List<TeamDTO> getTeams() {
        return teams;
    }

    public void setTeams(List<TeamDTO> teams) {
        this.teams = teams;
    }

    public List<LeagueDTO> getLeagues() {
        return leagues;
    }

    public void setLeagues(List<LeagueDTO> leagues) {
        this.leagues = leagues;
    }

    public List<ConferenceDTO> getConferences() { return conferences; }

    public void setConferences(List<ConferenceDTO> conferences) {
        this.conferences = conferences;
    }

    public List<DivisionDTO> getDivisions() {
        return divisions;
    }

    public void setDivisions(List<DivisionDTO> divisions) {
        this.divisions = divisions;
    }
}
