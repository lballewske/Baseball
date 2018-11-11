package com.lauren.web.restclient.dto;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.Date;

public class AtBatDTO extends BaseDTO {
    @JsonProperty("id")
    private String id;
    @JsonProperty("created_at")
    private Date createdAt;
    @JsonProperty("updated_at")
    private Date updatedAt;
    @JsonProperty("inning")
    private int inning;
    @JsonProperty("inning_label")
    private String inningLabel;
    @JsonProperty("half")
    private String half;
    @JsonProperty("description")
    private String description;
    @JsonProperty("game_id")
    private String gameId;
    @JsonProperty("hitter_id")
    private String hitterId;
    @JsonProperty("hitter_team_id")
    private String hitterTeamId;
    @JsonProperty("baseball_pitch_ids")
    private String baseballPitchIds;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getInning() {
        return inning;
    }

    public void setInning(int inning) {
        this.inning = inning;
    }

    public String getInningLabel() {
        return inningLabel;
    }

    public void setInningLabel(String inningLabel) {
        this.inningLabel = inningLabel;
    }

    public String getHalf() {
        return half;
    }

    public void setHalf(String half) {
        this.half = half;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public String getHitterId() {
        return hitterId;
    }

    public void setHitterId(String hitterId) {
        this.hitterId = hitterId;
    }

    public String getHitterTeamId() {
        return hitterTeamId;
    }

    public void setHitterTeamId(String hitterTeamId) {
        this.hitterTeamId = hitterTeamId;
    }

    public String getBaseballPitchIds() {
        return baseballPitchIds;
    }

    public void setBaseballPitchIds(String baseballPitchIds) {
        this.baseballPitchIds = baseballPitchIds;
    }
}
