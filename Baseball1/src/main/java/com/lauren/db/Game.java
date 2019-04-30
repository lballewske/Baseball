package com.lauren.db;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "games")
public class Game extends BaseEntity {
    private int id;
    private String externalId;
    private Date createdAt;
    private Date updatedAt;
    private boolean atNeutralSite;
    private int attendance;
    private String awayTeamOutcome;
    private int awayTeamScore;
    private String broadcast;
    private String clock;
    private String clockSecs;
    private boolean daytime;
    private int duration;
    private Date endedAt;
    private String homeTeamOutcome;
    private int homeTeamScore;
    private String humidity; //nullable
    private String interval;
    private int intervalNumber;
    private String intervalType;
    private String label;
    private String name;
    private String on;
    private int period;
    private String periodLabel;
    private String score;
    private int scoreDifferential;
    private String scoreline;
    private String slug;
    private Date startedAt;
    private String status;
    private boolean internetCoverage; //nullable
    private boolean satelliteCoverage; //nullable
    private String temperature;
    private String temperatureUnit;
    private int timestamp;
    private String title;
    private String weatherConditions; //nullable
    private String windDirection; //nullable
    private double windSpeed; //nullable
    private String homeTeamId;
    private String awayTeamId;
    private String winningTeamId;
    private String seasonId;
    private String venueId;
    private List<String> officialIds;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "external_id", nullable = false)
    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    @Column(name = "created_at", nullable = false)
    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Column(name = "updated_at", nullable = false)
    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Column(name = "at_neutral_site")
    public boolean isAtNeutralSite() {
        return atNeutralSite;
    }

    public void setAtNeutralSite(boolean atNeutralSite) {
        this.atNeutralSite = atNeutralSite;
    }

    @Column(name = "attendance")
    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    @Column(name = "away_team_outcome")
    public String getAwayTeamOutcome() {
        return awayTeamOutcome;
    }

    public void setAwayTeamOutcome(String awayTeamOutcome) {
        this.awayTeamOutcome = awayTeamOutcome;
    }

    @Column(name = "away_team_score")
    public int getAwayTeamScore() {
        return awayTeamScore;
    }

    public void setAwayTeamScore(int awayTeamScore) {
        this.awayTeamScore = awayTeamScore;
    }

    @Column(name = "broadcast")
    public String getBroadcast() {
        return broadcast;
    }

    public void setBroadcast(String broadcast) {
        this.broadcast = broadcast;
    }

    @Column(name = "clock")
    public String getClock() {
        return clock;
    }

    public void setClock(String clock) {
        this.clock = clock;
    }

    @Column(name = "clock_secs")
    public String getClockSecs() {
        return clockSecs;
    }

    public void setClockSecs(String clockSecs) {
        this.clockSecs = clockSecs;
    }

    @Column(name="daytime")
    public boolean isDaytime() {
        return daytime;
    }

    public void setDaytime(boolean daytime) {
        this.daytime = daytime;
    }

    @Column(name="duration")
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Column(name = "ended_at")
    public Date getEndedAt() {
        return endedAt;
    }

    public void setEndedAt(Date endedAt) {
        this.endedAt = endedAt;
    }

    @Column(name = "home_team_outcome")
    public String getHomeTeamOutcome() {
        return homeTeamOutcome;
    }

    public void setHomeTeamOutcome(String homeTeamOutcome) {
        this.homeTeamOutcome = homeTeamOutcome;
    }

    @Column(name = "home_team_score")
    public int getHomeTeamScore() {
        return homeTeamScore;
    }

    public void setHomeTeamScore(int homeTeamScore) {
        this.homeTeamScore = homeTeamScore;
    }

    @Column(name = "humidity")
    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    @Column(name = "interval", nullable = false)
    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    @Column(name = "interval_number", nullable = false)
    public int getIntervalNumber() {
        return intervalNumber;
    }

    public void setIntervalNumber(int intervalNumber) {
        this.intervalNumber = intervalNumber;
    }

    @Column(name="interval_type", nullable = false)
    public String getIntervalType() {
        return intervalType;
    }

    public void setIntervalType(String intervalType) {
        this.intervalType = intervalType;
    }

    @Column(name = "label")
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "on")
    public String getOn() {
        return on;
    }

    public void setOn(String on) {
        this.on = on;
    }

    @Column(name = "period")
    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    @Column(name ="period_label")
    public String getPeriodLabel() {
        return periodLabel;
    }

    public void setPeriodLabel(String periodLabel) {
        this.periodLabel = periodLabel;
    }

    @Column(name = "score")
    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Column(name = "score_differential")
    public int getScoreDifferential() {
        return scoreDifferential;
    }

    public void setScoreDifferential(int scoreDifferential) {
        this.scoreDifferential = scoreDifferential;
    }

    @Column(name = "scoreline")
    public String getScoreline() {
        return scoreline;
    }

    public void setScoreline(String scoreline) {
        this.scoreline = scoreline;
    }

    @Column(name = "slug")
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    @Column(name = "started_at")
    public Date getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(Date startedAt) {
        this.startedAt = startedAt;
    }

    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Column(name = "intenet_coverage")
    public boolean isInternetCoverage() {
        return internetCoverage;
    }

    public void setInternetCoverage(boolean internetCoverage) {
        this.internetCoverage = internetCoverage;
    }

    @Column(name = "satelite_coverage")
    public boolean isSatelliteCoverage() {
        return satelliteCoverage;
    }

    public void setSatelliteCoverage(boolean satelliteCoverage) {
        this.satelliteCoverage = satelliteCoverage;
    }

    @Column(name = "temperature")
    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    @Column(name =" temperature_unit")
    public String getTemperatureUnit() {
        return temperatureUnit;
    }

    public void setTemperatureUnit(String temperatureUnit) {
        this.temperatureUnit = temperatureUnit;
    }

    @Column(name = "timestamp")
    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "weather_conditions")
    public String getWeatherConditions() {
        return weatherConditions;
    }

    public void setWeatherConditions(String weatherConditions) {
        this.weatherConditions = weatherConditions;
    }

    @Column(name = "wind_direction")
    public String getWindDirection() {
        return windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    @Column(name = "wind_speed")
    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    @Column(name = "home_team_id")
    public String getHomeTeamId() {
        return homeTeamId;
    }

    public void setHomeTeamId(String homeTeamId) {
        this.homeTeamId = homeTeamId;
    }

    @Column(name = "away_team_id")
    public String getAwayTeamId() {
        return awayTeamId;
    }

    public void setAwayTeamId(String awayTeamId) {
        this.awayTeamId = awayTeamId;
    }

    @Column(name="winning_team_id")
    public String getWinningTeamId() {
        return winningTeamId;
    }

    public void setWinningTeamId(String winningTeamId) {
        this.winningTeamId = winningTeamId;
    }

    @Column(name="season_id", nullable = false)
    public String getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(String seasonId) {
        this.seasonId = seasonId;
    }

    @Column(name = "venue_id", nullable = false)
    public String getVenueId() {
        return venueId;
    }

    public void setVenueId(String venueId) {
        this.venueId = venueId;
    }

    @Column(name = "official_ids")
    public List<String> getOfficialIds() {
        return officialIds;
    }

    public void setOfficialIds(List<String> officialIds) {
        this.officialIds = officialIds;
    }
}


