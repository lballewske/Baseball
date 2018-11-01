package com.lauren.web.restclient.dto;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.Date;

//https://api.stattleship.com/baseball/mlb/teams

public class LeaguesDTO {
    @JsonProperty("id")
    private String id;
    @JsonProperty("created_at")
    private Date createdAt;
    @JsonProperty("updated_at")
    private Date updatedAt;
    @JsonProperty("abbreviation")
    private String abbreviation;
    @JsonProperty("color")
    private String color;
    @JsonProperty("minutes_per_period")
    private double minutesPerPeriod;
    @JsonProperty("name")
    private String name;
    @JsonProperty("periods")
    private double periods;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("sport")
    private String sport;

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

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMinutesPerPeriod() {
        return minutesPerPeriod;
    }

    public void setMinutesPerPeriod(double minutesPerPeriod) {
        this.minutesPerPeriod = minutesPerPeriod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPeriods() {
        return periods;
    }

    public void setPeriods(double periods) {
        this.periods = periods;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }
}
