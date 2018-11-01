package com.lauren.web.restclient.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.annotate.JsonProperty;

//https://api.stattleship.com/baseball/mlb/games?season_id=mlb-2018

@XmlRootElement
public class GameDTO {

    @JsonProperty("id")
    private String id;
    @JsonProperty("created_at")
    private Date createdAt;
    @JsonProperty("updated_at")
    private Date updatedAt;
    @JsonProperty("attendance")
    private int attendance;
    @JsonProperty("awayTeamOutcome")
    private String awayTeamOutcome;
    @JsonProperty("awayTeamScore")
    private int awayTeamScore;
    @JsonProperty("broadcast")
    private String broadcast;
    @JsonProperty("daytime")
    private boolean daytime;
    @JsonProperty("duration")
    private int duration;
    @JsonProperty("endedAt")
    private Date endedAt;
    @JsonProperty("homeTeamOutcome")
    private String homeTeamOutcome;
    @JsonProperty("homeTeamScore")
    private int homeTeamScore;
    @JsonProperty("interval")
    private String interval;
    @JsonProperty("intervalNumber")
    private int intervalNumber;
    @JsonProperty("intervalType")
    private String intervalType;
    @JsonProperty("label")
    private String label;
    @JsonProperty("name")
    private String name;
    @JsonProperty("on")
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "'on' MMMMMMM  d, yyyy")
    private String on;
    @JsonProperty("period")
    private int period;
    @JsonProperty("periodLabel")
    private String periodLabel;
    @JsonProperty("scoreDiffernetial")
    private int scoreDifferential;
    @JsonProperty("scoreLine")
    private String scoreline;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("startedAt")
    private Date startedAt;
    @JsonProperty("status")
    private String status;
    @JsonProperty("televisionCoverage")
    private String televisionCoverage;
    @JsonProperty("temperature")
    private double temperature;
    @JsonProperty("temperatureUnit")
    private String temperatureUnit;
    @JsonProperty("title")
    private String title;
    @JsonProperty("weatherConditions")
    private String weatherConditions;
    @JsonProperty("windDirection")
    private String windDirection;
    @JsonProperty("windSpeed")
    private double windSpeed;
    @JsonProperty("windSpeedUnit")
    private String windSpeedUnit;
    @JsonProperty("homeTeamId")
    private String homeTeamId;
    @JsonProperty("awayTeamId")
    private String awayTeamId;
    @JsonProperty("winningTeamId")
    private String winningTeamId;
    @JsonProperty("seasonId")
    private String seasonId;
    @JsonProperty("venueId")
    private String venueId;
    @JsonProperty("officialIds")
    private List <String> officialIds;

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

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public String getAwayTeamOutcome() {
        return awayTeamOutcome;
    }

    public void setAwayTeamOutcome(String awayTeamOutcome) {
        this.awayTeamOutcome = awayTeamOutcome;
    }

    public int getAwayTeamScore() {
        return awayTeamScore;
    }

    public void setAwayTeamScore(int awayTeamScore) {
        this.awayTeamScore = awayTeamScore;
    }

    public String getBroadcast() {
        return broadcast;
    }

    public void setBroadcast(String broadcast) {
        this.broadcast = broadcast;
    }

    public boolean isDaytime() {
        return daytime;
    }

    public void setDaytime(boolean daytime) {
        this.daytime = daytime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Date getEndedAt() {
        return endedAt;
    }

    public void setEndedAt(Date endedAt) {
        this.endedAt = endedAt;
    }

    public String getHomeTeamOutcome() {
        return homeTeamOutcome;
    }

    public void setHomeTeamOutcome(String homeTeamOutcome) {
        this.homeTeamOutcome = homeTeamOutcome;
    }

    public int getHomeTeamScore() {
        return homeTeamScore;
    }

    public void setHomeTeamScore(int homeTeamScore) {
        this.homeTeamScore = homeTeamScore;
    }

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public int getIntervalNumber() {
        return intervalNumber;
    }

    public void setIntervalNumber(int intervalNumber) {
        this.intervalNumber = intervalNumber;
    }

    public String getIntervalType() {
        return intervalType;
    }

    public void setIntervalType(String intervalType) {
        this.intervalType = intervalType;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOn() {
        return on;
    }

    public void setOn(String on) {
        this.on = on;
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

    public int getScoreDifferential() {
        return scoreDifferential;
    }

    public void setScoreDifferential(int scoreDifferential) {
        this.scoreDifferential = scoreDifferential;
    }

    public String getScoreline() {
        return scoreline;
    }

    public void setScoreline(String scoreline) {
        this.scoreline = scoreline;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Date getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(Date startedAt) {
        this.startedAt = startedAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTelevisionCoverage() {
        return televisionCoverage;
    }

    public void setTelevisionCoverage(String televisionCoverage) {
        this.televisionCoverage = televisionCoverage;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getTemperatureUnit() {
        return temperatureUnit;
    }

    public void setTemperatureUnit(String temperatureUnit) {
        this.temperatureUnit = temperatureUnit;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWeatherConditions() {
        return weatherConditions;
    }

    public void setWeatherConditions(String weatherConditions) {
        this.weatherConditions = weatherConditions;
    }

    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getWindSpeedUnit() {
        return windSpeedUnit;
    }

    public void setWindSpeedUnit(String windSpeedUnit) {
        this.windSpeedUnit = windSpeedUnit;
    }

    public String getHomeTeamId() {
        return homeTeamId;
    }

    public void setHomeTeamId(String homeTeamId) {
        this.homeTeamId = homeTeamId;
    }

    public String getAwayTeamId() {
        return awayTeamId;
    }

    public void setAwayTeamId(String awayTeamId) {
        this.awayTeamId = awayTeamId;
    }

    public String getWinningTeamId() {
        return winningTeamId;
    }

    public void setWinningTeamId(String winningTeamId) {
        this.winningTeamId = winningTeamId;
    }

    public String getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(String seasonId) {
        this.seasonId = seasonId;
    }

    public String getVenueId() {
        return venueId;
    }

    public void setVenueId(String venueId) {
        this.venueId = venueId;
    }

    public List<String> getOfficialIds() {
        return officialIds;
    }

    public void setOfficialIds(List<String> officialIds) {
        this.officialIds = officialIds;
    }
}
