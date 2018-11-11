package com.lauren.web.restclient.dto;

import java.util.List;

public class PlayersSeasonStatsDTO {
    private List<PlayerSeasonStatsDTO> playerSeasonStats;

    public List<PlayerSeasonStatsDTO> getPlayerSeasonStats() {
        return playerSeasonStats;
    }

    public void setPlayerSeasonStats(List<PlayerSeasonStatsDTO> playerSeasonStats) {
        this.playerSeasonStats = playerSeasonStats;
    }
}
