package com.lauren.db;

//https://api.stattleship.com/baseball/mlb/players?season_id=mlb-2018
//This is basically similar to the league/team/division/conference structure, but slightly different because players can be called up
//whenever and they can play different positions day to day - not quite sure how to handle that so I'm going to hold off on Player stuff
//which kinda means holding off on everything

import javax.persistence.*;
import java.time.Year;
import java.util.Currency;
import java.util.Date;

public class Player extends BaseEntity {
    public int id;
    public String externalId;
    public Date createdAt;
    public Date updatedAt;
    public boolean active;
    public String bats;
    public  Date birthDate;
    public String captain; //can be null
    public String city;
    public String country;
    public int draftOverallPick;
    public int draftRound;
    public Year draftSeason;
    public String draftTeamName;
    public String firstName;
    public String handedness;
    public int height;
    public String highSchool; //can be null
    public float humanizedSalary;
    public String lastName;
    public int mlbam_id; //cam be null
    public String name;
    public String nickname;
    public String positionAbbreviation;
    public String positionName;
    public Date proDebut; //can be null
    public float Salary;
    public String salaryCurrency;
    public String school;
    public String slug;
    public String sport;
    public String state;
    public int uniformNumber;
    public String unitOfHeight;
    public String unitOfWeight;
    public int weight;
    public int yearsOfExperience;
    public String leagueId;
    public String playingPositionId;
    public String teamId;


    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Column(name="external_id", nullable = false)
    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    @Column(name="created_at", nullable = false)
    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Column(name="updated_at", nullable = false)
    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Column(name="active", nullable = false)
    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Column(name="bats", nullable = false)
    public String getBats() {
        return bats;
    }

    public void setBats(String bats) {
        this.bats = bats;
    }

    @Column(name="birth_date", nullable = false)
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Column(name = "captain", nullable)
    public String getCaptain() {
        return captain;
    }

    public void setCaptain(String captain) {
        this.captain = captain;
    }

    @Column(name = "city", nullable = false)
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Column(name = "country", nullable = false)
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Column(name = "draft_overall_pick", nullable)
    public int getDraftOverallPick() {
        return draftOverallPick;
    }

    public void setDraftOverallPick(int draftOverallPick) {
        this.draftOverallPick = draftOverallPick;
    }

    @Column(name = "draft_round", nullable)
    public int getDraftRound() {
        return draftRound;
    }

    public void setDraftRound(int draftRound) {
        this.draftRound = draftRound;
    }

    @Column(name = "draft_season", nullable)
    public Year getDraftSeason() {
        return draftSeason;
    }

    public void setDraftSeason(Year draftSeason) {
        this.draftSeason = draftSeason;
    }

    @Column(name = "draft_team_name", nullable)
    public String getDraftTeamName() {
        return draftTeamName;
    }

    public void setDraftTeamName(String draftTeamName) {
        this.draftTeamName = draftTeamName;
    }

    @Column(name = "first_name", nullable = false)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "handedness", nullable = false)
    public String getHandedness() {
        return handedness;
    }

    public void setHandedness(String handedness) {
        this.handedness = handedness;
    }

    @Column(name = "height", nullable = false)
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Column(name = "high_school", nullable)
    public String getHighSchool() {
        return highSchool;
    }

    public void setHighSchool(String highSchool) {
        this.highSchool = highSchool;
    }

    @Column(name = "humanized_salary", nullable)
    public float getHumanizedSalary() {
        return humanizedSalary;
    }

    public void setHumanizedSalary(float humanizedSalary) {
        this.humanizedSalary = humanizedSalary;
    }

    @Column(name = "last_name", nullable = false)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "mlbam_id", nullable)
    public int getMlbam_id() {
        return mlbam_id;
    }

    public void setMlbam_id(int mlbam_id) {
        this.mlbam_id = mlbam_id;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "nickname", nullable)
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Column(name = "position_abbreviation", nullable = false)
    public String getPositionAbbreviation() {
        return positionAbbreviation;
    }

    public void setPositionAbbreviation(String positionAbbreviation) {
        this.positionAbbreviation = positionAbbreviation;
    }

    @Column(name = "position_name", nullable = false)
    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    @Column(name = "pro_debut", nullable)
    public Date getProDebut() {
        return proDebut;
    }

    public void setProDebut(Date proDebut) {
        this.proDebut = proDebut;
    }

    @Column(name = "salary", nullable)
    public float getSalary() {
        return Salary;
    }

    public void setSalary(float salary) {
        Salary = salary;
    }

    @Column(name = "salary_currency", nullable)
    public String getSalaryCurrency() {
        return salaryCurrency;
    }

    public void setSalaryCurrency(String salaryCurrency) {
        this.salaryCurrency = salaryCurrency;
    }

    @Column(name = "school", nullable)
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Column(name = "slug", nullable = false)
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    @Column(name = "sport", nullable = false)
    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    @Column(name = "state", nullable)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Column(name = "uniform_number", nullable)
    public int getUniformNumber() {
        return uniformNumber;
    }

    public void setUniformNumber(int uniformNumber) {
        this.uniformNumber = uniformNumber;
    }

    @Column(name = "unit_of_height", nullable = false)
    public String getUnitOfHeight() {
        return unitOfHeight;
    }

    public void setUnitOfHeight(String unitOfHeight) {
        this.unitOfHeight = unitOfHeight;
    }

    @Column(name = "unit_of_weight", nullable = false)
    public String getUnitOfWeight() {
        return unitOfWeight;
    }

    public void setUnitOfWeight(String unitOfWeight) {
        this.unitOfWeight = unitOfWeight;
    }

    @Column(name = "weight", nullable)
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Column(name = "years_of_experience", nullable)
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "league_id")
    public String getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(String leagueId) {
        this.leagueId = leagueId;
    }

    @Column(name = "playing_position_id", nullable = false)
    public String getPlayingPositionId() {
        return playingPositionId;
    }

    public void setPlayingPositionId(String playingPositionId) {
        this.playingPositionId = playingPositionId;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id")
    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }
}
