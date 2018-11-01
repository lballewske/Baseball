package com.lauren.web.restclient.dto;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.Currency;
import java.util.Date;

//https://api.stattleship.com/baseball/mlb/lineups?season_id=mlb-2018

public class LineupDTO {
    @JsonProperty("id")
    private String id;
    @JsonProperty("created_at")
    private Date createdAt;
    @JsonProperty("updated_at")
    private Date updatedAt;
    @JsonProperty("active")
    private boolean active;
    @JsonProperty("bats")
    private String bats;
    @JsonProperty("birth_date")
    private Date birthDate;
    @JsonProperty("captain") //returns null sometimes
    private String capatin;
    @JsonProperty("city")
    private String city;
    @JsonProperty("country")
    private String country;
    @JsonProperty("draft_overall_pick") //returns null sometimes (as do the other draft variables following)
    private String draftOverallPick; //?//
    @JsonProperty("draft_round")
    private String draftRound;
    @JsonProperty("draft_season")
    private String draftSeason;
    @JsonProperty("draft_team_name")
    private String draftTeamName;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("handedness")
    private String handedness;
    @JsonProperty("height")
    private double height;
    @JsonProperty("high_school")
    private String highSchool;
    @JsonProperty("humanized_salary")
    private double humanizedSalary;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("mlbam_id")
    private int mlbamId;
    @JsonProperty("name") //can be empty
    private String name;
    @JsonProperty("nickname")
    private String nickname;
    @JsonProperty("position_abbreviation")
    private String positionAbbreviation;
    @JsonProperty("position_name")
    private String positionName;
    @JsonProperty("pro_debut")
    private Date proDebut;
    @JsonProperty("salary")
    private double salary;
    @JsonProperty("salary_currency")
    private Currency salaryCurrency;
    @JsonProperty("school")
    private String school;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("sport")
    private String sport;
    @JsonProperty("state")
    private String state;
    @JsonProperty("uniform_number")
    private int uniformNumber;
    @JsonProperty("unit_of_height")
    private String unitOfHeight;
    @JsonProperty("unit_of_weight")
    private String unitOfWeight;
    @JsonProperty("weight")
    private String weight;
    @JsonProperty("years_of_experience")
    private double yearsOfExperience;
    @JsonProperty("league_id")
    private String leagueId;
    @JsonProperty("playing_position_id")
    private String playingPositionId;
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getBats() {
        return bats;
    }

    public void setBats(String bats) {
        this.bats = bats;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getCapatin() {
        return capatin;
    }

    public void setCapatin(String capatin) {
        this.capatin = capatin;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDraftRound() {
        return draftRound;
    }

    public void setDraftRound(String draftRound) {
        this.draftRound = draftRound;
    }

    public String getDraftSeason() {
        return draftSeason;
    }

    public void setDraftSeason(String draftSeason) {
        this.draftSeason = draftSeason;
    }

    public String getDraftTeamName() {
        return draftTeamName;
    }

    public void setDraftTeamName(String draftTeamName) {
        this.draftTeamName = draftTeamName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getHandedness() {
        return handedness;
    }

    public void setHandedness(String handedness) {
        this.handedness = handedness;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getHighSchool() {
        return highSchool;
    }

    public void setHighSchool(String highSchool) {
        this.highSchool = highSchool;
    }

    public double getHumanizedSalary() {
        return humanizedSalary;
    }

    public void setHumanizedSalary(double humanizedSalary) {
        this.humanizedSalary = humanizedSalary;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getMlbamId() {
        return mlbamId;
    }

    public void setMlbamId(int mlbamId) {
        this.mlbamId = mlbamId;
    }

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

    public String getPositionAbbreviation() {
        return positionAbbreviation;
    }

    public void setPositionAbbreviation(String positionAbbreviation) {
        this.positionAbbreviation = positionAbbreviation;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public Date getProDebut() {
        return proDebut;
    }

    public void setProDebut(Date proDebut) {
        this.proDebut = proDebut;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Currency getSalaryCurrency() {
        return salaryCurrency;
    }

    public void setSalaryCurrency(Currency salaryCurrency) {
        this.salaryCurrency = salaryCurrency;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getUniformNumber() {
        return uniformNumber;
    }

    public void setUniformNumber(int uniformNumber) {
        this.uniformNumber = uniformNumber;
    }

    public String getUnitOfHeight() {
        return unitOfHeight;
    }

    public void setUnitOfHeight(String unitOfHeight) {
        this.unitOfHeight = unitOfHeight;
    }

    public String getUnitOfWeight() {
        return unitOfWeight;
    }

    public void setUnitOfWeight(String unitOfWeight) {
        this.unitOfWeight = unitOfWeight;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public double getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(double yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(String leagueId) {
        this.leagueId = leagueId;
    }

    public String getPlayingPositionId() {
        return playingPositionId;
    }

    public void setPlayingPositionId(String playingPositionId) {
        this.playingPositionId = playingPositionId;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getDraftOverallPick() {
        return draftOverallPick;
    }

    public void setDraftOverallPick(String draftOverallPick) {
        this.draftOverallPick = draftOverallPick;
    }
}
