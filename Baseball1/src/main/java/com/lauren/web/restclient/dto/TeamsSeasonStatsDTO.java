package com.lauren.web.restclient.dto;

import java.util.List;

public class TeamsSeasonStatsDTO {
    private List<TeamSeasonStatsDTO> teamsSeasonStats;

    public List<TeamSeasonStatsDTO> getTeamSeasonStats() {
        return teamsSeasonStats;
    }

    public void setTeamSeasonStats(List<TeamSeasonStatsDTO> teamsSeasonStats) {
        this.teamsSeasonStats = teamsSeasonStats;
    }
}
