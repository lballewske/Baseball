package com.lauren.web.restclient.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import org.codehaus.jackson.annotate.JsonProperty;

//https://api.stattleship.com/baseball/mlb/games?season_id=mlb-2019

@XmlRootElement
public class GameDTO extends BaseDTO {

    @JsonProperty("id")
    private String externalId;
    @JsonProperty("created_at")
    private Date createdAt;
    @JsonProperty("updated_at")
    private Date updatedAt;
    @JsonProperty("at_neutral_site")
    private boolean atNeutralSite;
    @JsonProperty("attendance")
    private int attendance;
    @JsonProperty("away_team_outcome")
    private String awayTeamOutcome;
    @JsonProperty("away_team_score")
    private int awayTeamScore;
    @JsonProperty("broadcast")
    private String broadcast;
    @JsonProperty("clock")
    private String clock;
    @JsonProperty("clock_secs")
    private String clockSecs;
    @JsonProperty("daytime")
    private boolean daytime;
    @JsonProperty("duration")
    private int duration;
    @JsonProperty("ended_at")
    private Date endedAt;
    @JsonProperty("home_team_outcome")
    private String homeTeamOutcome;
    @JsonProperty("home_team_score")
    private int homeTeamScore;
    @JsonProperty("humidity")
    private String humidity; //nullable
    @JsonProperty("interval")
    private String interval;
    @JsonProperty("interval_number")
    private int intervalNumber;
    @JsonProperty("interval_type")
    private String intervalType;
    @JsonProperty("label")
    private String label;
    @JsonProperty("name")
    private String name;
    @JsonProperty("on")
    private String on;
    @JsonProperty("period")
    private int period;
    @JsonProperty("period_label")
    private String periodLabel;
    @JsonProperty("score")
    private String score;
    @JsonProperty("score_differential")
    private int scoreDifferential;
    @JsonProperty("scoreline")
    private String scoreline;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("started_at")
    private Date startedAt;
    @JsonProperty("status")
    private String status;
    @JsonProperty("internet_coverage")
    private boolean internetCoverage; //nullable
    @JsonProperty("satellite_coverage")
    private boolean satelliteCoverage; //nullable
    @JsonProperty("temperature")
    private String temperature;
    @JsonProperty("temperature_unit")
    private String temperatureUnit;
    @JsonProperty("timestamp")
    private int timestamp;
    @JsonProperty("title")
    private String title;
    @JsonProperty("weather_conditions")
    private String weatherConditions; //nullable
    @JsonProperty("wind_direction")
    private String windDirection; //nullable
    @JsonProperty("wind_speed")
    private double windSpeed; //nullable
    @JsonProperty("home_team_id")
    private String homeTeamId;
    @JsonProperty("away_team_id")
    private String awayTeamId;
    @JsonProperty("winning_team_id")
    private String winningTeamId;
    @JsonProperty("season_id")
    private String seasonId;
    @JsonProperty("venue_id")
    private String venueId;
    @JsonProperty("official_ids")
    private List<String> officialIds;

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
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

    public boolean isAtNeutralSite() {
        return atNeutralSite;
    }

    public void setAtNeutralSite(boolean atNeutralSite) {
        this.atNeutralSite = atNeutralSite;
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

    public String getClock() {
        return clock;
    }

    public void setClock(String clock) {
        this.clock = clock;
    }

    public String getClockSecs() {
        return clockSecs;
    }

    public void setClockSecs(String clockSecs) {
        this.clockSecs = clockSecs;
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

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
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

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
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

    public boolean isInternetCoverage() {
        return internetCoverage;
    }

    public void setInternetCoverage(boolean internetCoverage) {
        this.internetCoverage = internetCoverage;
    }

    public boolean isSatelliteCoverage() {
        return satelliteCoverage;
    }

    public void setSatelliteCoverage(boolean satelliteCoverage) {
        this.satelliteCoverage = satelliteCoverage;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getTemperatureUnit() {
        return temperatureUnit;
    }

    public void setTemperatureUnit(String temperatureUnit) {
        this.temperatureUnit = temperatureUnit;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
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

