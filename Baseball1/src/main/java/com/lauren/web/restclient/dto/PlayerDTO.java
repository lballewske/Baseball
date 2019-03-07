package com.lauren.web.restclient.dto;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.Date;

//https://api.stattleship.com/baseball/mlb/players?season_id=mlb-2018

public class PlayerDTO extends BaseDTO {
    @JsonProperty("id")
    private String externalId;
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
    @JsonProperty("captain")
    private String captain;
    @JsonProperty("city")
    private String city;
    @JsonProperty("country")
    private String country;
    @JsonProperty("draft_overall_pick")
    private Integer draftOverallPick;
    @JsonProperty("draft_round")
    private Integer draftRound;
    @JsonProperty("draft_season")
    private Integer draftSeason;
    @JsonProperty("draft_team_name")
    private String draftTeamName;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("handedness")
    private String handedness;
    @JsonProperty("height")
    private int height;
    @JsonProperty("high_school")
    private String highSchool;
    @JsonProperty("humanized_salary")
    private String humanizedSalary;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("mlbam_id")
    private Integer mlbam_Id;
    @JsonProperty("name")
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
    private String salary;
    @JsonProperty("salary_currency")
    private String salaryCurrency;
    @JsonProperty("school")
    private String school;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("sport")
    private String sport;
    @JsonProperty("state")
    private String state;
    @JsonProperty("uniform_number")
    private Integer uniformNumber;
    @JsonProperty("unit_of_height")
    private String unitOfHeight;
    @JsonProperty("unit_of_weight")
    private String unitOfWeight;
    @JsonProperty("weight")
    private int weight;
    @JsonProperty("years_of_experience")
    private Integer yearsOfExperience;
    @JsonProperty("league_id")
    private String leagueId;
    @JsonProperty("playing_position_id")
    private String playingPositionId;
    @JsonProperty("team_id")
    private String teamId;

    public String getExternalId() { return externalId; }

    public void setExternalId(String externalId) { this.externalId = externalId; }

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

    public String getCaptain() {
        return captain;
    }

    public void setCaptain(String captain) {
        this.captain = captain;
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

    public Integer getDraftOverallPick() {
        return draftOverallPick;
    }

    public void setDraftOverallPick(Integer draftOverallPick) {
        this.draftOverallPick = draftOverallPick;
    }

    public Integer getDraftRound() {
        return draftRound;
    }

    public void setDraftRound(Integer draftRound) {
        this.draftRound = draftRound;
    }

    public Integer getDraftSeason() {
        return draftSeason;
    }

    public void setDraftSeason(Integer draftSeason) {
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getHighSchool() {
        return highSchool;
    }

    public void setHighSchool(String highSchool) {
        this.highSchool = highSchool;
    }

    public String getHumanizedSalary() {
        return humanizedSalary;
    }

    public void setHumanizedSalary(String humanizedSalary) {
        this.humanizedSalary = humanizedSalary;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getMlbam_Id() { return mlbam_Id; }

    public void setMlbam_Id(Integer mlbam_Id) { this.mlbam_Id = mlbam_Id; }

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

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getSalaryCurrency() {
        return salaryCurrency;
    }

    public void setSalaryCurrency(String salaryCurrency) {
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

    public Integer getUniformNumber() {
        return uniformNumber;
    }

    public void setUniformNumber(Integer uniformNumber) {
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Integer getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(Integer yearsOfExperience) {
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
}
