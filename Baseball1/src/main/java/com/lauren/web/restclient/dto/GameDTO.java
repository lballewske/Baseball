package com.lauren.web.restclient.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.annotate.JsonProperty;

@XmlRootElement
public class GameDTO {

    private String id;

    @JsonProperty("created_at")
    private Date createdAt;
    @JsonProperty("updated_at")
    private Date updatedAt;
    private int attendance;
    private String awayTeamOutcome;
    private int awayTeamScore;
    private String broadcast;
    private boolean daytime;
    private int duration;
    private Date endedAt;
    private String homeTeamOutcome;
    private int homeTeamScore;
    private String interval;
    private int intervalNumber;
    private String intervalType;
    private String label;
    private String name;

    @JsonFormat(pattern = "on MMMM  d, yyyy")
    private Date on;
    private int period;
    private String periodLabel;
    private int scoreDifferential;
    private String scoreline;
    private String slug;
    private Date startedAt;
    private String status;
    private String televisionCoverage;
    private double temperature;
    private String temperatureUnit;
    private String title;
    private String weatherConditions;
    private String windDirection;
    private double windSpeed;
    private String windSpeedUnit;
    private String homeTeamId;
    private String awayTeamId;
    private String winningTeamId;
    private String seasonId;
    private String venueId;
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

    public Date getOn() {
        return on;
    }

    public void setOn(Date on) {
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
