package com.lauren.web.restclient.dto;

import java.util.List;

public class ScoreboardsDTO {
    private List<ScoreboardDTO> scoreboards;

    public List<ScoreboardDTO> getScoreboards() {
        return scoreboards;
    }

    public void setScoreboards(List<ScoreboardDTO> scoreboards) {
        this.scoreboards = scoreboards;
    }
}
