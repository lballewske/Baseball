package com.lauren.web.restclient.dto;

import org.codehaus.jackson.annotate.JsonProperty;

import java.sql.Time;
import java.util.Date;

//https://api.stattleship.com/baseball/mlb/scoreboards?mlb-2018

public class ScoreboardDTO {
    @JsonProperty("id")
    private String id;
    @JsonProperty("created_at")
    private Date createdAt;
    @JsonProperty("updated_at")
    private Date updatedAt;
    @JsonProperty("away_description")
    private String awayDescription;
    @JsonProperty("away_team_outcome")
    private String loss;
    @JsonProperty("away_team_score")
    private int awayTeamScore;
    @JsonProperty("away_team_verb")
    private String awayTeamVerb;
    @JsonProperty("broadcast")
    private String broadcast;
    @JsonProperty("clock") //: ":00"
    private Time clock;
    @JsonProperty("clock_seconds")
    private int clockSeconds;
    @JsonProperty("game_clock_seconds")
    private int gameClockSeconds;
    @JsonProperty("game_over")
    private boolean gameOver;
    @JsonProperty("home_description")
    private String homeDescription;
    @JsonProperty("home_team_outcome")
    private String homeTeamOutcome;
    @JsonProperty("home_team_verb")
    private String homeTeamVerb;
    @JsonProperty("home_team_score")
    private int homeTeamScore;
    @JsonProperty("period")
    private int period;
    @JsonProperty("period_label")
    private String periodLabel;
    @JsonProperty("points")
    private int points;
    @JsonProperty("score")
    private String score;
    @JsonProperty("status")
    private String status;
    @JsonProperty("title")
    private String title;
    @JsonProperty("week_label")
    private String weekLabel;
    @JsonProperty("game_id")
    private String gameId;

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

    public String getAwayDescription() {
        return awayDescription;
    }

    public void setAwayDescription(String awayDescription) {
        this.awayDescription = awayDescription;
    }

    public String getLoss() {
        return loss;
    }

    public void setLoss(String loss) {
        this.loss = loss;
    }

    public int getAwayTeamScore() {
        return awayTeamScore;
    }

    public void setAwayTeamScore(int awayTeamScore) {
        this.awayTeamScore = awayTeamScore;
    }

    public String getAwayTeamVerb() {
        return awayTeamVerb;
    }

    public void setAwayTeamVerb(String awayTeamVerb) {
        this.awayTeamVerb = awayTeamVerb;
    }

    public String getBroadcast() {
        return broadcast;
    }

    public void setBroadcast(String broadcast) {
        this.broadcast = broadcast;
    }

    public Time getClock() {
        return clock;
    }

    public void setClock(Time clock) {
        this.clock = clock;
    }

    public int getClockSeconds() {
        return clockSeconds;
    }

    public void setClockSeconds(int clockSeconds) {
        this.clockSeconds = clockSeconds;
    }

    public int getGameClockSeconds() {
        return gameClockSeconds;
    }

    public void setGameClockSeconds(int gameClockSeconds) {
        this.gameClockSeconds = gameClockSeconds;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    public String getHomeDescription() {
        return homeDescription;
    }

    public void setHomeDescription(String homeDescription) {
        this.homeDescription = homeDescription;
    }

    public String getHomeTeamOutcome() {
        return homeTeamOutcome;
    }

    public void setHomeTeamOutcome(String homeTeamOutcome) {
        this.homeTeamOutcome = homeTeamOutcome;
    }

    public String getHomeTeamVerb() {
        return homeTeamVerb;
    }

    public void setHomeTeamVerb(String homeTeamVerb) {
        this.homeTeamVerb = homeTeamVerb;
    }

    public int getHomeTeamScore() {
        return homeTeamScore;
    }

    public void setHomeTeamScore(int homeTeamScore) {
        this.homeTeamScore = homeTeamScore;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public String getPeriodLabel() {
        return periodLabel;
    }

    public void setPeriodLabel(String periodLabel) {
        this.periodLabel = periodLabel;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWeekLabel() {
        return weekLabel;
    }

    public void setWeekLabel(String weekLabel) {
        this.weekLabel = weekLabel;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }
}
