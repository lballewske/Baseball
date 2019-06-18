package com.lauren.db;

import javax.persistence.*;
import java.util.Date;

public class TeamSeasonStats extends BaseEntity{

    private int id;
    private String externalId;
    private Date createdAt;
    private Date updatedAt;
    private String intervalType;
    private Date statisticsOn;
    private int assists;
    private int atBats;
    private double atBatsPerHomeRun;
    private double atBatsPerStrikeOut;
    private double atBatsRisp;
    private double babip;
    private int balls;
    private int ballsInPlay;
    private int ballsThrowns;
    private int battersFaced;
    private double battingAverage;
    private int blownSave;
    private int caughtStealing;
    private int completeGames;
    private int doublePlays;
    private int doubles;
    private int doublesAllowed;
    private int earnedRuns;
    private int earnedRunsAllowed;
    private double era;
    private int extraBaseHits;
    private int fieldersChoice;
    private int fieldersChoiceAllowed;
    private int fieldingErrors;
    private double fieldingPct;
    private int flyOuts;
    private int flyOutsAllowed;
    private int groundOuts;
    private int groundOutsAllowed;
    private int hits;
    private int hitsAllowed;
    private int hitsRisp;
    private int holds;
    private int homeRuns;
    private int homeRunsAllowed;
    private double inningsPitched;
    private int lineOuts;
    private int lineOutsAllowed;
    private int lobRisp2Out;
    private int losses;
    private double onBasePercentage;
    private double opponentsBattingAverage;
    private double ops;
    private int pitcherRunnersLeftOnBase;
    private int pitchesFaced;
    private int pitchesThrown;
    private int plateAppearances;
    private int popOuts;
    private int popOutsAllowed;
    private int putouts;
    private int quialityStarts;
    private int rbi;
    private int reachedOnError;
    private int runnersCaughtStealing;
    private int runnersLeftOnBase;
    private int runs;
    private int runsAllowed;
    private int sacrificeFlies;
    private int sacrificeFliesAllowed;
    private int sacrificeHits;
    private int sacrificeHitsAllowed;
    private int saveOpportunities;
    private int saves;
    private int shutouts;
    private int singles;
    private int singlesAllowed;
    private double sluggingPct;
    private double stolenBasePct;
    private int stolenBases;
    private int stolenBasesAllowed;
    private int strikeouts;
    private int strikeoutsAllowed;
    private double strikeoutsPer9Innings;
    private int strikes;
    private int strikesThrown;
    private int teamShutouts;
    private int totalBases;
    private int totalBasesAllowed;
    private int triplePlays;
    private int triples;
    private int triplesAllowed;
    private int unearnedRuns;
    private int unearnedRunsAllowed;
    private int walks;
    private int walksAllowed;
    private double whip;
    private int wins;
    private String seasonId;
    private String teamId;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id", nullable=false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="external_id", nullable=false)
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

    @Column(name="updated_at")
    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Column(name="interval_type")
    public String getIntervalType() {
        return intervalType;
    }

    public void setIntervalType(String intervalType) {
        this.intervalType = intervalType;
    }

    @Column(name="statistics_on")
    public Date getStatisticsOn() {
        return statisticsOn;
    }

    public void setStatisticsOn(Date statisticsOn) {
        this.statisticsOn = statisticsOn;
    }

    @Column(name="assists")
    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    @Column(name="at_bats")
    public int getAtBats() {
        return atBats;
    }

    public void setAtBats(int atBats) {
        this.atBats = atBats;
    }

    @Column(name="at_bats_per_home_run")
    public double getAtBatsPerHomeRun() {
        return atBatsPerHomeRun;
    }

    public void setAtBatsPerHomeRun(double atBatsPerHomeRun) {
        this.atBatsPerHomeRun = atBatsPerHomeRun;
    }

    @Column(name="at_bats_per_strike_out")
    public double getAtBatsPerStrikeOut() {
        return atBatsPerStrikeOut;
    }

    public void setAtBatsPerStrikeOut(double atBatsPerStrikeOut) {
        this.atBatsPerStrikeOut = atBatsPerStrikeOut;
    }

    @Column(name="at_bats_risp")
    public double getAtBatsRisp() {
        return atBatsRisp;
    }

    public void setAtBatsRisp(double atBatsRisp) {
        this.atBatsRisp = atBatsRisp;
    }

    @Column(name="babip")
    public double getBabip() {
        return babip;
    }

    public void setBabip(double babip) {
        this.babip = babip;
    }

    @Column(name="balls")
    public int getBalls() {
        return balls;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }

    @Column(name="balls_in_play")
    public int getBallsInPlay() {
        return ballsInPlay;
    }

    public void setBallsInPlay(int ballsInPlay) {
        this.ballsInPlay = ballsInPlay;
    }

    @Column(name="balls_throwns")
    public int getBallsThrowns() {
        return ballsThrowns;
    }

    public void setBallsThrowns(int ballsThrowns) {
        this.ballsThrowns = ballsThrowns;
    }

    @Column(name="batters_faced")
    public int getBattersFaced() {
        return battersFaced;
    }

    public void setBattersFaced(int battersFaced) {
        this.battersFaced = battersFaced;
    }

    @Column(name="batting_average")
    public double getBattingAverage() {
        return battingAverage;
    }

    public void setBattingAverage(double battingAverage) {
        this.battingAverage = battingAverage;
    }

    @Column(name="blown_save")
    public int getBlownSave() {
        return blownSave;
    }

    public void setBlownSave(int blownSave) {
        this.blownSave = blownSave;
    }

    @Column(name="caught_stealing")
    public int getCaughtStealing() {
        return caughtStealing;
    }

    public void setCaughtStealing(int caughtStealing) {
        this.caughtStealing = caughtStealing;
    }

    @Column(name="complete_games")
    public int getCompleteGames() {
        return completeGames;
    }

    public void setCompleteGames(int completeGames) {
        this.completeGames = completeGames;
    }

    @Column(name="double_plays")
    public int getDoublePlays() {
        return doublePlays;
    }

    public void setDoublePlays(int doublePlays) {
        this.doublePlays = doublePlays;
    }

    @Column(name="doubles")
    public int getDoubles() {
        return doubles;
    }

    public void setDoubles(int doubles) {
        this.doubles = doubles;
    }

    @Column(name="doubles_allowed")
    public int getDoublesAllowed() {
        return doublesAllowed;
    }

    public void setDoublesAllowed(int doublesAllowed) {
        this.doublesAllowed = doublesAllowed;
    }

    @Column(name="earned_runs")
    public int getEarnedRuns() {
        return earnedRuns;
    }

    public void setEarnedRuns(int earnedRuns) {
        this.earnedRuns = earnedRuns;
    }

    @Column(name="earned_runs_allowed")
    public int getEarnedRunsAllowed() {
        return earnedRunsAllowed;
    }

    public void setEarnedRunsAllowed(int earnedRunsAllowed) {
        this.earnedRunsAllowed = earnedRunsAllowed;
    }

    @Column(name="era")
    public double getEra() {
        return era;
    }

    public void setEra(double era) {
        this.era = era;
    }

    @Column(name="extra_base_hits")
    public int getExtraBaseHits() {
        return extraBaseHits;
    }

    public void setExtraBaseHits(int extraBaseHits) {
        this.extraBaseHits = extraBaseHits;
    }

    @Column(name="fielders_choice")
    public int getFieldersChoice() {
        return fieldersChoice;
    }

    public void setFieldersChoice(int fieldersChoice) {
        this.fieldersChoice = fieldersChoice;
    }

    @Column(name="fielders_choice_allowed")
    public int getFieldersChoiceAllowed() {
        return fieldersChoiceAllowed;
    }

    public void setFieldersChoiceAllowed(int fieldersChoiceAllowed) {
        this.fieldersChoiceAllowed = fieldersChoiceAllowed;
    }

    @Column(name="fielding_errors")
    public int getFieldingErrors() {
        return fieldingErrors;
    }

    public void setFieldingErrors(int fieldingErrors) {
        this.fieldingErrors = fieldingErrors;
    }

    @Column(name="fielding_pct")
    public double getFieldingPct() {
        return fieldingPct;
    }

    public void setFieldingPct(double fieldingPct) {
        this.fieldingPct = fieldingPct;
    }

    @Column(name="fly_outs")
    public int getFlyOuts() {
        return flyOuts;
    }

    public void setFlyOuts(int flyOuts) {
        this.flyOuts = flyOuts;
    }

    @Column(name="fly_outs_allowed")
    public int getFlyOutsAllowed() {
        return flyOutsAllowed;
    }

    public void setFlyOutsAllowed(int flyOutsAllowed) {
        this.flyOutsAllowed = flyOutsAllowed;
    }

    @Column(name="ground_outs")
    public int getGroundOuts() {
        return groundOuts;
    }

    public void setGroundOuts(int groundOuts) {
        this.groundOuts = groundOuts;
    }

    @Column(name="ground_outs_allowed")
    public int getGroundOutsAllowed() {
        return groundOutsAllowed;
    }

    public void setGroundOutsAllowed(int groundOutsAllowed) {
        this.groundOutsAllowed = groundOutsAllowed;
    }

    @Column(name="hits")
    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    @Column(name="hits_allowed")
    public int getHitsAllowed() {
        return hitsAllowed;
    }

    public void setHitsAllowed(int hitsAllowed) {
        this.hitsAllowed = hitsAllowed;
    }

    @Column(name="hits_risp")
    public int getHitsRisp() {
        return hitsRisp;
    }

    public void setHitsRisp(int hitsRisp) {
        this.hitsRisp = hitsRisp;
    }

    @Column(name="holds")
    public int getHolds() {
        return holds;
    }

    public void setHolds(int holds) {
        this.holds = holds;
    }

    @Column(name="home_runs")
    public int getHomeRuns() {
        return homeRuns;
    }

    public void setHomeRuns(int homeRuns) {
        this.homeRuns = homeRuns;
    }

    @Column(name="home_runs_allowed")
    public int getHomeRunsAllowed() {
        return homeRunsAllowed;
    }

    public void setHomeRunsAllowed(int homeRunsAllowed) {
        this.homeRunsAllowed = homeRunsAllowed;
    }

    @Column(name="innings_pitched")
    public double getInningsPitched() {
        return inningsPitched;
    }

    public void setInningsPitched(double inningsPitched) {
        this.inningsPitched = inningsPitched;
    }

    @Column(name="line_outs")
    public int getLineOuts() {
        return lineOuts;
    }

    public void setLineOuts(int lineOuts) {
        this.lineOuts = lineOuts;
    }

    @Column(name="line_outs_allowed")
    public int getLineOutsAllowed() {
        return lineOutsAllowed;
    }

    public void setLineOutsAllowed(int lineOutsAllowed) {
        this.lineOutsAllowed = lineOutsAllowed;
    }

    @Column(name="lob_risp_2out")
    public int getLobRisp2Out() {
        return lobRisp2Out;
    }

    public void setLobRisp2Out(int lobRisp2Out) {
        this.lobRisp2Out = lobRisp2Out;
    }

    @Column(name="losses")
    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    @Column(name="on_base_percentage")
    public double getOnBasePercentage() {
        return onBasePercentage;
    }

    public void setOnBasePercentage(double onBasePercentage) {
        this.onBasePercentage = onBasePercentage;
    }

    @Column(name="opponents_batting_average")
    public double getOpponentsBattingAverage() {
        return opponentsBattingAverage;
    }

    public void setOpponentsBattingAverage(double opponentsBattingAverage) {
        this.opponentsBattingAverage = opponentsBattingAverage;
    }

    @Column(name="ops")
    public double getOps() {
        return ops;
    }

    public void setOps(double ops) {
        this.ops = ops;
    }

    @Column(name="pitcher_runners_left_on_base")
    public int getPitcherRunnersLeftOnBase() {
        return pitcherRunnersLeftOnBase;
    }

    public void setPitcherRunnersLeftOnBase(int pitcherRunnersLeftOnBase) {
        this.pitcherRunnersLeftOnBase = pitcherRunnersLeftOnBase;
    }

    @Column(name="pitches_faced")
    public int getPitchesFaced() {
        return pitchesFaced;
    }

    public void setPitchesFaced(int pitchesFaced) {
        this.pitchesFaced = pitchesFaced;
    }

    @Column(name="pitches_thrown")
    public int getPitchesThrown() {
        return pitchesThrown;
    }

    public void setPitchesThrown(int pitchesThrown) {
        this.pitchesThrown = pitchesThrown;
    }

    @Column(name="plate_appearances")
    public int getPlateAppearances() {
        return plateAppearances;
    }

    public void setPlateAppearances(int plateAppearances) {
        this.plateAppearances = plateAppearances;
    }

    @Column(name="pop_outs")
    public int getPopOuts() {
        return popOuts;
    }

    public void setPopOuts(int popOuts) {
        this.popOuts = popOuts;
    }

    @Column(name="pop_outs_allowed")
    public int getPopOutsAllowed() {
        return popOutsAllowed;
    }

    public void setPopOutsAllowed(int popOutsAllowed) {
        this.popOutsAllowed = popOutsAllowed;
    }

    @Column(name="putouts")
    public int getPutouts() {
        return putouts;
    }

    public void setPutouts(int putouts) {
        this.putouts = putouts;
    }

    @Column(name="quality_starts")
    public int getQuialityStarts() {
        return quialityStarts;
    }

    public void setQuialityStarts(int quialityStarts) {
        this.quialityStarts = quialityStarts;
    }

    @Column(name="rbi")
    public int getRbi() {
        return rbi;
    }

    public void setRbi(int rbi) {
        this.rbi = rbi;
    }

    @Column(name="reached_on_error")
    public int getReachedOnError() {
        return reachedOnError;
    }

    public void setReachedOnError(int reachedOnError) {
        this.reachedOnError = reachedOnError;
    }

    @Column(name="runners_caught_stealing")
    public int getRunnersCaughtStealing() {
        return runnersCaughtStealing;
    }

    public void setRunnersCaughtStealing(int runnersCaughtStealing) {
        this.runnersCaughtStealing = runnersCaughtStealing;
    }

    @Column(name="runners_left_on_base")
    public int getRunnersLeftOnBase() {
        return runnersLeftOnBase;
    }

    public void setRunnersLeftOnBase(int runnersLeftOnBase) {
        this.runnersLeftOnBase = runnersLeftOnBase;
    }

    @Column(name="runs")
    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    @Column(name="runs_allowed")
    public int getRunsAllowed() {
        return runsAllowed;
    }

    public void setRunsAllowed(int runsAllowed) {
        this.runsAllowed = runsAllowed;
    }

    @Column(name="sacrifice_flies")
    public int getSacrificeFlies() {
        return sacrificeFlies;
    }

    public void setSacrificeFlies(int sacrificeFlies) {
        this.sacrificeFlies = sacrificeFlies;
    }

    @Column(name="sacrifice_flies_allowed")
    public int getSacrificeFliesAllowed() {
        return sacrificeFliesAllowed;
    }

    public void setSacrificeFliesAllowed(int sacrificeFliesAllowed) {
        this.sacrificeFliesAllowed = sacrificeFliesAllowed;
    }

    @Column(name="sacrifice_hits")
    public int getSacrificeHits() {
        return sacrificeHits;
    }

    public void setSacrificeHits(int sacrificeHits) {
        this.sacrificeHits = sacrificeHits;
    }

    @Column(name="sacrifice_hits_allowed")
    public int getSacrificeHitsAllowed() {
        return sacrificeHitsAllowed;
    }

    public void setSacrificeHitsAllowed(int sacrificeHitsAllowed) {
        this.sacrificeHitsAllowed = sacrificeHitsAllowed;
    }

    @Column(name="save_opportunities")
    public int getSaveOpportunities() {
        return saveOpportunities;
    }

    public void setSaveOpportunities(int saveOpportunities) {
        this.saveOpportunities = saveOpportunities;
    }

    @Column(name="saves")
    public int getSaves() {
        return saves;
    }

    public void setSaves(int saves) {
        this.saves = saves;
    }

    @Column(name="shutouts")
    public int getShutouts() {
        return shutouts;
    }

    public void setShutouts(int shutouts) {
        this.shutouts = shutouts;
    }

    @Column(name="singles")
    public int getSingles() {
        return singles;
    }

    public void setSingles(int singles) {
        this.singles = singles;
    }

    @Column(name="singles_allowed")
    public int getSinglesAllowed() {
        return singlesAllowed;
    }

    public void setSinglesAllowed(int singlesAllowed) {
        this.singlesAllowed = singlesAllowed;
    }

    @Column(name="slugging_pct")
    public double getSluggingPct() {
        return sluggingPct;
    }

    public void setSluggingPct(double sluggingPct) {
        this.sluggingPct = sluggingPct;
    }

    @Column(name="stolen_base_pct")
    public double getStolenBasePct() {
        return stolenBasePct;
    }

    public void setStolenBasePct(double stolenBasePct) {
        this.stolenBasePct = stolenBasePct;
    }

    @Column(name="stolen_bases")
    public int getStolenBases() {
        return stolenBases;
    }

    public void setStolenBases(int stolenBases) {
        this.stolenBases = stolenBases;
    }

    @Column(name="stolen_bases_allowed")
    public int getStolenBasesAllowed() {
        return stolenBasesAllowed;
    }

    public void setStolenBasesAllowed(int stolenBasesAllowed) {
        this.stolenBasesAllowed = stolenBasesAllowed;
    }

    @Column(name="strikeouts")
    public int getStrikeouts() {
        return strikeouts;
    }

    public void setStrikeouts(int strikeouts) {
        this.strikeouts = strikeouts;
    }

    @Column(name="strikeouts_allowed")
    public int getStrikeoutsAllowed() {
        return strikeoutsAllowed;
    }

    public void setStrikeoutsAllowed(int strikeoutsAllowed) {
        this.strikeoutsAllowed = strikeoutsAllowed;
    }

    @Column(name="strikeouts_per_9_innings")
    public double getStrikeoutsPer9Innings() {
        return strikeoutsPer9Innings;
    }

    public void setStrikeoutsPer9Innings(double strikeoutsPer9Innings) {
        this.strikeoutsPer9Innings = strikeoutsPer9Innings;
    }

    @Column(name="strikes")
    public int getStrikes() {
        return strikes;
    }

    public void setStrikes(int strikes) {
        this.strikes = strikes;
    }

    @Column(name="strikes_thrown")
    public int getStrikesThrown() {
        return strikesThrown;
    }

    public void setStrikesThrown(int strikesThrown) {
        this.strikesThrown = strikesThrown;
    }

    @Column(name="team_shutouts")
    public int getTeamShutouts() {
        return teamShutouts;
    }

    public void setTeamShutouts(int teamShutouts) {
        this.teamShutouts = teamShutouts;
    }

    @Column(name="total_bases")
    public int getTotalBases() {
        return totalBases;
    }

    public void setTotalBases(int totalBases) {
        this.totalBases = totalBases;
    }

    @Column(name="total_bases_allowed")
    public int getTotalBasesAllowed() {
        return totalBasesAllowed;
    }

    public void setTotalBasesAllowed(int totalBasesAllowed) {
        this.totalBasesAllowed = totalBasesAllowed;
    }

    @Column(name="triple_plays")
    public int getTriplePlays() {
        return triplePlays;
    }

    public void setTriplePlays(int triplePlays) {
        this.triplePlays = triplePlays;
    }

    @Column(name="triples")
    public int getTriples() {
        return triples;
    }

    public void setTriples(int triples) {
        this.triples = triples;
    }

    @Column(name="triples_allowed")
    public int getTriplesAllowed() {
        return triplesAllowed;
    }

    public void setTriplesAllowed(int triplesAllowed) {
        this.triplesAllowed = triplesAllowed;
    }

    @Column(name="unearned_runs")
    public int getUnearnedRuns() {
        return unearnedRuns;
    }

    public void setUnearnedRuns(int unearnedRuns) {
        this.unearnedRuns = unearnedRuns;
    }

    @Column(name="unearned_runs_allowed")
    public int getUnearnedRunsAllowed() {
        return unearnedRunsAllowed;
    }

    public void setUnearnedRunsAllowed(int unearnedRunsAllowed) {
        this.unearnedRunsAllowed = unearnedRunsAllowed;
    }

    @Column(name="walks")
    public int getWalks() {
        return walks;
    }

    public void setWalks(int walks) {
        this.walks = walks;
    }

    @Column(name="walks_allowed")
    public int getWalksAllowed() {
        return walksAllowed;
    }

    public void setWalksAllowed(int walksAllowed) {
        this.walksAllowed = walksAllowed;
    }

    @Column(name="whip")
    public double getWhip() {
        return whip;
    }

    public void setWhip(double whip) {
        this.whip = whip;
    }

    @Column(name="wins")
    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    @Column(name="season_id", nullable = false)
    public String getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(String seasonId) {
        this.seasonId = seasonId;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "team_id", nullable = false)
    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }
}
