package com.lauren.web.restclient.dto;

import org.codehaus.jackson.annotate.JsonProperty;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Date;

public class TeamDTO {
    @JsonProperty("id")
    private String id;
    @JsonProperty("created_at")
    private Date createdAt;
    @JsonProperty("updated_at")
    private Date updatedAt;
    @JsonProperty("abbreviation")
    private String abbreviation;
//    @JsonProperty("color"): //"BD3039"
//    private String color; //because we're getting a String here, I'll have to use color.decode to convert to RBG value
    @JsonProperty("colors")
    private String[] colors; //this one returns all of the official colors in an array
    @JsonProperty("hashtag")
    private String hashtag;
    @JsonProperty("hashtags")
    private String[] hashtags;
    @JsonProperty("location")
//    private String location;
//    @JsonProperty("name")
    private String name;
    @JsonProperty("nickname")
    private String nickname;
    @JsonProperty("latitude")
    private double lattitude;
    @JsonProperty("longitude")
    private double longitude;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("division_id")
    private String dvisionId;
    @JsonProperty("league_id")
    private String leagueId;

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

//    public Color getColor() {
//        return color;
//    }
//
//    public void setColor(Color color) {
//        this.color = color;
//    }

    public String[] getColors() {
        return colors;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    public String getHastag() {
        return hashtag;
    }

    public void setHastag(String hastag) {
        this.hashtag = hastag;
    }

    public String[] getHashtags() {
        return hashtags;
    }

    public void setHashtags(String[] hashtags) {
        this.hashtags = hashtags;
    }

//    public String getLocation() {
//        return location;
//    }
//
//    public void setLocation(String location) {
//        this.location = location;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public double getLattitude() {
        return lattitude;
    }

    public void setLattitude(double lattitude) {
        this.lattitude = lattitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getDvisionId() {
        return dvisionId;
    }

    public void setDvisionId(String dvisionId) {
        this.dvisionId = dvisionId;
    }

    public String getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(String leagueId) {
        this.leagueId = leagueId;
    }
}
