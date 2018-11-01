package com.lauren.web.restclient.dto;

import org.codehaus.jackson.annotate.JsonProperty;
import java.util.Date;

//https://api.stattleship.com/baseball/mlb/starting_pitchers?season_id=mlb-2018

public class StartingPitchersDTO {
    @JsonProperty("id")
    private String id;
    @JsonProperty("created_at")
    private Date createdAt;
    @JsonProperty("updated_at")
    private Date updatedAt;
    @JsonProperty("wins")
    private int wins;
    @JsonProperty("losses")
    private int losses;
    @JsonProperty("era")
    private double era;
    @JsonProperty("game_id")
    private String gameId;
    @JsonProperty("player_id")
    private String plyaerId;
    @JsonProperty("team_id")
    private String teamId;

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

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public double getEra() {
        return era;
    }

    public void setEra(double era) {
        this.era = era;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    public String getPlyaerId() {
        return plyaerId;
    }

    public void setPlyaerId(String plyaerId) {
        this.plyaerId = plyaerId;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }
}
