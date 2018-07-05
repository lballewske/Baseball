package com.lauren.db;

public class Games {
    private String homeTaamId;
    private String awayTeamId;
    private String location;
    private String winningTeamId;
    private String gameDate;

    public String getGameDate() {
        return gameDate;
    }

    public void setGameDate(String gameDate) {
        this.gameDate = gameDate;
    }

    public String getHomeTaamId() {
        return homeTaamId;
    }

    public void setHomeTaamId(String homeTaamId) {
        this.homeTaamId = homeTaamId;
    }

    public String getAwayTeamId() {
        return awayTeamId;
    }

    public void setAwayTeamId(String awayTeamId) {
        this.awayTeamId = awayTeamId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWinningTeamId() {
        return winningTeamId;
    }

    public void setWinningTeamId(String winningTeamId) {
        this.winningTeamId = winningTeamId;
    }
}
