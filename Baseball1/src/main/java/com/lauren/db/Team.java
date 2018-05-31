package com.lauren.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="MLB_Teams")

public class Team {
    private int teamId;
    private String teamName;
    private String abbreviation;

    @Column(name="teamID", nullable=false)
    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    @Column(name="team_name", nullable=false, length=100)
    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Column(name="abbreviation", nullable=false, length=100)
    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
}

