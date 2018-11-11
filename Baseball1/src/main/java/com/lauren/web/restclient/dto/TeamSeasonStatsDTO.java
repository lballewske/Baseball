package com.lauren.web.restclient.dto;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.Date;

public class TeamSeasonStatsDTO extends BaseDTO {

    @JsonProperty("id")
    private String id;
    @JsonProperty("created_at")
    private Date createdAt;
    @JsonProperty("updated_at")
    private Date updatedAt;
    @JsonProperty("interval_type")
    private String intervalType;
    @JsonProperty("statistics_on")
    private Date statisticsOn;
    @JsonProperty("assists")
    private int assists;
    @JsonProperty("at_bats")
    private int atBats;
    @JsonProperty("at_bats_per_home_run")
    private double atBatsPerHomeRun;
    @JsonProperty("at_bats_per_strike_out")
    private double atBatsPerStrikeOut;
    @JsonProperty("at_bats_risp")
    private double atBatsRisp;
    @JsonProperty("babip")
    private double babip;
    @JsonProperty("balls")
    private int balls;
    @JsonProperty("balls_in_play")
    private int ballsInPlay;
    @JsonProperty("balls_throwns")
    private int ballsThrowns;
    @JsonProperty("batters_faced")
    private int battersFaced;
    @JsonProperty("batting_average")
    private double battingAverage;
    @JsonProperty("blown_save")
    private int blownSave;
    @JsonProperty("caught_stealing")
    private int caughtStealing;
    @JsonProperty("complete_games")
    private int completeGames;
    @JsonProperty("dirtballs")
    private int dirtballs;
    @JsonProperty("dirtballs_throwns")
    private int dirtballsThrowns;
    @JsonProperty("double_plays")
    private int doublePlays;
    @JsonProperty("doubles")
    private int doubles;
    @JsonProperty("doubles_allowed")
    private int doublesAllowed;
    @JsonProperty("earned_runs")
    private int earnedRuns;
    @JsonProperty("earned_runs_allowed")
    private int earnedRunsAllowed;
    @JsonProperty("era")
    private double era;
    @JsonProperty("extra_base_hits")
    private int extraBaseHits;
    @JsonProperty("fielders_choice")
    private int fieldersChoice;
    @JsonProperty("fielders_choice_allowed")
    private int fieldersChoiceAllowed;
    @JsonProperty("fielding_errors")
    private int fieldingErrors;
    @JsonProperty("fielding_pct")
    private double fieldingPct;
    @JsonProperty("fly_outs")
    private int flyOuts;
    @JsonProperty("fly_outs_allowed")
    private int flyOutsAllowed;
    @JsonProperty("fly_outs_into_double_plays")
    private int flyOutsIntoDoublePlays;
    @JsonProperty("fly_outs_into_double_plays_allowed")
    private int FlyOutsIntoDoublePlaysAllowed;
    @JsonProperty("foul_balls")
    private int foulBalls;
    @JsonProperty("foul_balls_throwns")
    private int foulBallsThrowns;
    @JsonProperty("gofo")
    private double gofo;
    @JsonProperty("ground_ball_to_fly_ball_ratio")
    private double groundBallToFlyBallRatio;
    @JsonProperty("ground_outs")
    private int groundOuts;
    @JsonProperty("ground_outs_allowed")
    private int groundOutsAllowed;
    @JsonProperty("ground_outs_into_double_plays")
    private int groundOutsIntoDoublePlays;
    @JsonProperty("ground_outs_into_double_plays_allowed")
    private int GroundOutsIntoDoublePlaysAllowed;
    @JsonProperty("hit_batters")
    private int hitBatters;
    @JsonProperty("hit_by_pitches")
    private int hitByPitches;
    @JsonProperty("hits")
    private int hits;
    @JsonProperty("hits_allowed")
    private int hitsAllowed;
    @JsonProperty("hits_risp")
    private int hitsRisp;
    @JsonProperty("holds")
    private int holds;
    @JsonProperty("home_runs")
    private int homeRuns;
    @JsonProperty("home_runs_allowed")
    private int homeRunsAllowed;
    @JsonProperty("innings_pitched")
    private double inningsPitched;
    @JsonProperty("innings_pitched_total_outs")
    private double InningsPitchedTotalOuts;
    @JsonProperty("intentional_balls")
    private int intentionalBalls;
    @JsonProperty("intentional_balls_throwns")
    private int IntentionalBallsThrowns;
    @JsonProperty("intentional_walks")
    private int intentionalWalks;
    @JsonProperty("intentional_walks_allowed")
    private int intentionalWalksAllowed;
    @JsonProperty("iso")
    private double iso;
    @JsonProperty("line_outs")
    private int lineOuts;
    @JsonProperty("line_outs_allowed")
    private int lineOutsAllowed;
    @JsonProperty("line_outs_into_double_plays")
    private int lineOutsIntoDoublePlays;
    @JsonProperty("line_outs_into_double_plays_allowed")
    private int lineOutsIntoDoublePlaysAllowed;
    @JsonProperty("lob_risp_2out")
    private int lobRisp2Out;
    @JsonProperty("losses")
    private int losses;
    @JsonProperty("on_base_percentage")
    private double onBasePercentage;
    @JsonProperty("opponents_batting_average")
    private double opponentsBattingAverage;
    @JsonProperty("ops")
    private double ops;
    @JsonProperty("passed_balls")
    private int passedBalls;
    @JsonProperty("pitcher_runners_left_on_base")
    private int pitcherRunnersLeftOnBase;
    @JsonProperty("pitches_faced")
    private int pitchesFaced;
    @JsonProperty("pitches_thrown")
    private int pitchesThrown;
    @JsonProperty("pitching_errors")
    private int pitchingErrors;
    @JsonProperty("plate_appearances")
    private int plateAppearances;
    @JsonProperty("pop_outs")
    private int popOuts;
    @JsonProperty("pop_outs_allowed")
    private int popOutsAllowed;
    @JsonProperty("putouts")
    private int putouts;
    @JsonProperty("quality_starts")
    private int quialityStarts;
    @JsonProperty("rbi")
    private int rbi;
    @JsonProperty("reached_on_error")
    private int reachedOnError;
    @JsonProperty("reached_on_error_allowed")
    private int reachedOnErrorAllowed;
    @JsonProperty("runners_caught_stealing")
    private int runnersCaughtStealing;
    @JsonProperty("runners_left_on_base")
    private int runnersLeftOnBase;
    @JsonProperty("runs")
    private int runs;
    @JsonProperty("runs_allowed")
    private int runsAllowed;
    @JsonProperty("sacrifice_flies")
    private int sacrificeFlies;
    @JsonProperty("sacrifice_flies_allowed")
    private int sacrificeFliesAllowed;
    @JsonProperty("sacrifice_hits")
    private int sacrificeHits;
    @JsonProperty("sacrifice_hits_allowed")
    private int sacrificeHitsAllowed;
    @JsonProperty("save_opportunities")
    private int saveOpportunities;
    @JsonProperty("saves")
    private int saves;
    @JsonProperty("secondary_average")
    private double secondaryAverage;
    @JsonProperty("shutouts")
    private int shutouts;
    @JsonProperty("singles")
    private int singles;
    @JsonProperty("singles_allowed")
    private int singlesAllowed;
    @JsonProperty("slugging_pct")
    private double sluggingPct;
    @JsonProperty("stolen_base_pct")
    private double stolenBasePct;
    @JsonProperty("stolen_bases")
    private int stolenBases;
    @JsonProperty("stolen_bases_allowed")
    private int stolenBasesAllowed;
    @JsonProperty("strikeouts")
    private int strikeouts;
    @JsonProperty("strikeouts_allowed")
    private int strikeoutsAllowed;
    @JsonProperty("strikeouts_looking")
    private int strikeoutsLooking;
    @JsonProperty("strikeouts_looking_allowed")
    private int strikeoutsLookingAllowed;
    @JsonProperty("strikeouts_per_9_innings")
    private double strikeoutsPer9Innings;
    @JsonProperty("strikeouts_per_walk")
    private double strikeoutsPerWalk;
    @JsonProperty("strikeouts_swinging")
    private int strikeoutsSwinging;
    @JsonProperty("strikeouts_swinging_allowed")
    private int strikeoutsSwingingAllowed;
    @JsonProperty("strikes")
    private int strikes;
    @JsonProperty("strikes_looking")
    private int strikesLooking;
    @JsonProperty("strikes_swinging")
    private int strikesSwinging;
    @JsonProperty("strikes_thrown")
    private int strikesThrown;
    @JsonProperty("strikes_thrown_looking")
    private int strikesThrownLooking;
    @JsonProperty("strikes_thrown_swinging")
    private int strikesThrownSwinging;
    @JsonProperty("team_left_on_base")
    private int teamLeftOnBase;
    @JsonProperty("team_shutouts")
    private int teamShutouts;
    @JsonProperty("total_bases")
    private int totalBases;
    @JsonProperty("total_bases_allowed")
    private int totalBasesAllowed;
    @JsonProperty("total_chances")
    private int totalChances;
    @JsonProperty("triple_plays")
    private int triplePlays;
    @JsonProperty("triples")
    private int triples;
    @JsonProperty("triples_allowed")
    private int triplesAllowed;
    @JsonProperty("unearned_runs")
    private int unearnedRuns;
    @JsonProperty("unearned_runs_allowed")
    private int unearnedRunsAllowed;
    @JsonProperty("walks")
    private int walks;
    @JsonProperty("walks_allowed")
    private int walksAllowed;
    @JsonProperty("walks_per_plate_appearance")
    private double walksPerPlateAppearance;
    @JsonProperty("walks_per_strike_out")
    private double walksPerStrikeOut;
    @JsonProperty("whip")
    private double whip;
    @JsonProperty("wild_pitches")
    private int wildPitches;
    @JsonProperty("wild_pitches_while_catching")
    private int wildPitchesWhileCatching;
    @JsonProperty("wins")
    private int wins;
    @JsonProperty("season_id")
    private String seasonId;
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

    public String getIntervalType() {
        return intervalType;
    }

    public void setIntervalType(String intervalType) {
        this.intervalType = intervalType;
    }

    public Date getStatisticsOn() {
        return statisticsOn;
    }

    public void setStatisticsOn(Date statisticsOn) {
        this.statisticsOn = statisticsOn;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getAtBats() {
        return atBats;
    }

    public void setAtBats(int atBats) {
        this.atBats = atBats;
    }

    public double getAtBatsPerHomeRun() {
        return atBatsPerHomeRun;
    }

    public void setAtBatsPerHomeRun(double atBatsPerHomeRun) {
        this.atBatsPerHomeRun = atBatsPerHomeRun;
    }

    public double getAtBatsPerStrikeOut() {
        return atBatsPerStrikeOut;
    }

    public void setAtBatsPerStrikeOut(double atBatsPerStrikeOut) {
        this.atBatsPerStrikeOut = atBatsPerStrikeOut;
    }

    public double getAtBatsRisp() {
        return atBatsRisp;
    }

    public void setAtBatsRisp(double atBatsRisp) {
        this.atBatsRisp = atBatsRisp;
    }

    public double getBabip() {
        return babip;
    }

    public void setBabip(double babip) {
        this.babip = babip;
    }

    public int getBalls() {
        return balls;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }

    public int getBallsInPlay() {
        return ballsInPlay;
    }

    public void setBallsInPlay(int ballsInPlay) {
        this.ballsInPlay = ballsInPlay;
    }

    public int getBallsThrowns() {
        return ballsThrowns;
    }

    public void setBallsThrowns(int ballsThrowns) {
        this.ballsThrowns = ballsThrowns;
    }

    public int getBattersFaced() {
        return battersFaced;
    }

    public void setBattersFaced(int battersFaced) {
        this.battersFaced = battersFaced;
    }

    public double getBattingAverage() {
        return battingAverage;
    }

    public void setBattingAverage(double battingAverage) {
        this.battingAverage = battingAverage;
    }

    public int getBlownSave() {
        return blownSave;
    }

    public void setBlownSave(int blownSave) {
        this.blownSave = blownSave;
    }

    public int getCaughtStealing() {
        return caughtStealing;
    }

    public void setCaughtStealing(int caughtStealing) {
        this.caughtStealing = caughtStealing;
    }

    public int getCompleteGames() {
        return completeGames;
    }

    public void setCompleteGames(int completeGames) {
        this.completeGames = completeGames;
    }

    public int getDirtballs() {
        return dirtballs;
    }

    public void setDirtballs(int dirtballs) {
        this.dirtballs = dirtballs;
    }

    public int getDirtballsThrowns() {
        return dirtballsThrowns;
    }

    public void setDirtballsThrowns(int dirtballsThrowns) {
        this.dirtballsThrowns = dirtballsThrowns;
    }

    public int getDoublePlays() {
        return doublePlays;
    }

    public void setDoublePlays(int doublePlays) {
        this.doublePlays = doublePlays;
    }

    public int getDoubles() {
        return doubles;
    }

    public void setDoubles(int doubles) {
        this.doubles = doubles;
    }

    public int getDoublesAllowed() {
        return doublesAllowed;
    }

    public void setDoublesAllowed(int doublesAllowed) {
        this.doublesAllowed = doublesAllowed;
    }

    public int getEarnedRuns() {
        return earnedRuns;
    }

    public void setEarnedRuns(int earnedRuns) {
        this.earnedRuns = earnedRuns;
    }

    public int getEarnedRunsAllowed() {
        return earnedRunsAllowed;
    }

    public void setEarnedRunsAllowed(int earnedRunsAllowed) {
        this.earnedRunsAllowed = earnedRunsAllowed;
    }

    public double getEra() {
        return era;
    }

    public void setEra(double era) {
        this.era = era;
    }

    public int getExtraBaseHits() {
        return extraBaseHits;
    }

    public void setExtraBaseHits(int extraBaseHits) {
        this.extraBaseHits = extraBaseHits;
    }

    public int getFieldersChoice() {
        return fieldersChoice;
    }

    public void setFieldersChoice(int fieldersChoice) {
        this.fieldersChoice = fieldersChoice;
    }

    public int getFieldersChoiceAllowed() {
        return fieldersChoiceAllowed;
    }

    public void setFieldersChoiceAllowed(int fieldersChoiceAllowed) {
        this.fieldersChoiceAllowed = fieldersChoiceAllowed;
    }

    public int getFieldingErrors() {
        return fieldingErrors;
    }

    public void setFieldingErrors(int fieldingErrors) {
        this.fieldingErrors = fieldingErrors;
    }

    public double getFieldingPct() {
        return fieldingPct;
    }

    public void setFieldingPct(double fieldingPct) {
        this.fieldingPct = fieldingPct;
    }

    public int getFlyOuts() {
        return flyOuts;
    }

    public void setFlyOuts(int flyOuts) {
        this.flyOuts = flyOuts;
    }

    public int getFlyOutsAllowed() {
        return flyOutsAllowed;
    }

    public void setFlyOutsAllowed(int flyOutsAllowed) {
        this.flyOutsAllowed = flyOutsAllowed;
    }

    public int getFlyOutsIntoDoublePlays() {
        return flyOutsIntoDoublePlays;
    }

    public void setFlyOutsIntoDoublePlays(int flyOutsIntoDoublePlays) {
        this.flyOutsIntoDoublePlays = flyOutsIntoDoublePlays;
    }

    public int getFlyOutsIntoDoublePlaysAllowed() {
        return FlyOutsIntoDoublePlaysAllowed;
    }

    public void setFlyOutsIntoDoublePlaysAllowed(int flyOutsIntoDoublePlaysAllowed) {
        FlyOutsIntoDoublePlaysAllowed = flyOutsIntoDoublePlaysAllowed;
    }

    public int getFoulBalls() {
        return foulBalls;
    }

    public void setFoulBalls(int foulBalls) {
        this.foulBalls = foulBalls;
    }

    public int getFoulBallsThrowns() {
        return foulBallsThrowns;
    }

    public void setFoulBallsThrowns(int foulBallsThrowns) {
        this.foulBallsThrowns = foulBallsThrowns;
    }

    public double getGofo() {
        return gofo;
    }

    public void setGofo(double gofo) {
        this.gofo = gofo;
    }

    public double getGroundBallToFlyBallRatio() {
        return groundBallToFlyBallRatio;
    }

    public void setGroundBallToFlyBallRatio(double groundBallToFlyBallRatio) {
        this.groundBallToFlyBallRatio = groundBallToFlyBallRatio;
    }

    public int getGroundOuts() {
        return groundOuts;
    }

    public void setGroundOuts(int groundOuts) {
        this.groundOuts = groundOuts;
    }

    public int getGroundOutsAllowed() {
        return groundOutsAllowed;
    }

    public void setGroundOutsAllowed(int groundOutsAllowed) {
        this.groundOutsAllowed = groundOutsAllowed;
    }

    public int getGroundOutsIntoDoublePlays() {
        return groundOutsIntoDoublePlays;
    }

    public void setGroundOutsIntoDoublePlays(int groundOutsIntoDoublePlays) {
        this.groundOutsIntoDoublePlays = groundOutsIntoDoublePlays;
    }

    public int getGroundOutsIntoDoublePlaysAllowed() {
        return GroundOutsIntoDoublePlaysAllowed;
    }

    public void setGroundOutsIntoDoublePlaysAllowed(int groundOutsIntoDoublePlaysAllowed) {
        GroundOutsIntoDoublePlaysAllowed = groundOutsIntoDoublePlaysAllowed;
    }

    public int getHitBatters() {
        return hitBatters;
    }

    public void setHitBatters(int hitBatters) {
        this.hitBatters = hitBatters;
    }

    public int getHitByPitches() {
        return hitByPitches;
    }

    public void setHitByPitches(int hitByPitches) {
        this.hitByPitches = hitByPitches;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public int getHitsAllowed() {
        return hitsAllowed;
    }

    public void setHitsAllowed(int hitsAllowed) {
        this.hitsAllowed = hitsAllowed;
    }

    public int getHitsRisp() {
        return hitsRisp;
    }

    public void setHitsRisp(int hitsRisp) {
        this.hitsRisp = hitsRisp;
    }

    public int getHolds() {
        return holds;
    }

    public void setHolds(int holds) {
        this.holds = holds;
    }

    public int getHomeRuns() {
        return homeRuns;
    }

    public void setHomeRuns(int homeRuns) {
        this.homeRuns = homeRuns;
    }

    public int getHomeRunsAllowed() {
        return homeRunsAllowed;
    }

    public void setHomeRunsAllowed(int homeRunsAllowed) {
        this.homeRunsAllowed = homeRunsAllowed;
    }

    public double getInningsPitched() {
        return inningsPitched;
    }

    public void setInningsPitched(double inningsPitched) {
        this.inningsPitched = inningsPitched;
    }

    public double getInningsPitchedTotalOuts() {
        return InningsPitchedTotalOuts;
    }

    public void setInningsPitchedTotalOuts(double inningsPitchedTotalOuts) {
        InningsPitchedTotalOuts = inningsPitchedTotalOuts;
    }

    public int getIntentionalBalls() {
        return intentionalBalls;
    }

    public void setIntentionalBalls(int intentionalBalls) {
        this.intentionalBalls = intentionalBalls;
    }

    public int getIntentionalBallsThrowns() {
        return IntentionalBallsThrowns;
    }

    public void setIntentionalBallsThrowns(int intentionalBallsThrowns) {
        IntentionalBallsThrowns = intentionalBallsThrowns;
    }

    public int getIntentionalWalks() {
        return intentionalWalks;
    }

    public void setIntentionalWalks(int intentionalWalks) {
        this.intentionalWalks = intentionalWalks;
    }

    public int getIntentionalWalksAllowed() {
        return intentionalWalksAllowed;
    }

    public void setIntentionalWalksAllowed(int intentionalWalksAllowed) {
        this.intentionalWalksAllowed = intentionalWalksAllowed;
    }

    public double getIso() {
        return iso;
    }

    public void setIso(double iso) {
        this.iso = iso;
    }

    public int getLineOuts() {
        return lineOuts;
    }

    public void setLineOuts(int lineOuts) {
        this.lineOuts = lineOuts;
    }

    public int getLineOutsAllowed() {
        return lineOutsAllowed;
    }

    public void setLineOutsAllowed(int lineOutsAllowed) {
        this.lineOutsAllowed = lineOutsAllowed;
    }

    public int getLineOutsIntoDoublePlays() {
        return lineOutsIntoDoublePlays;
    }

    public void setLineOutsIntoDoublePlays(int lineOutsIntoDoublePlays) {
        this.lineOutsIntoDoublePlays = lineOutsIntoDoublePlays;
    }

    public int getLineOutsIntoDoublePlaysAllowed() {
        return lineOutsIntoDoublePlaysAllowed;
    }

    public void setLineOutsIntoDoublePlaysAllowed(int lineOutsIntoDoublePlaysAllowed) {
        this.lineOutsIntoDoublePlaysAllowed = lineOutsIntoDoublePlaysAllowed;
    }

    public int getLobRisp2Out() {
        return lobRisp2Out;
    }

    public void setLobRisp2Out(int lobRisp2Out) {
        this.lobRisp2Out = lobRisp2Out;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public double getOnBasePercentage() {
        return onBasePercentage;
    }

    public void setOnBasePercentage(double onBasePercentage) {
        this.onBasePercentage = onBasePercentage;
    }

    public double getOpponentsBattingAverage() {
        return opponentsBattingAverage;
    }

    public void setOpponentsBattingAverage(double opponentsBattingAverage) {
        this.opponentsBattingAverage = opponentsBattingAverage;
    }

    public double getOps() {
        return ops;
    }

    public void setOps(double ops) {
        this.ops = ops;
    }

    public int getPassedBalls() {
        return passedBalls;
    }

    public void setPassedBalls(int passedBalls) {
        this.passedBalls = passedBalls;
    }

    public int getPitcherRunnersLeftOnBase() {
        return pitcherRunnersLeftOnBase;
    }

    public void setPitcherRunnersLeftOnBase(int pitcherRunnersLeftOnBase) {
        this.pitcherRunnersLeftOnBase = pitcherRunnersLeftOnBase;
    }

    public int getPitchesFaced() {
        return pitchesFaced;
    }

    public void setPitchesFaced(int pitchesFaced) {
        this.pitchesFaced = pitchesFaced;
    }

    public int getPitchesThrown() {
        return pitchesThrown;
    }

    public void setPitchesThrown(int pitchesThrown) {
        this.pitchesThrown = pitchesThrown;
    }

    public int getPitchingErrors() {
        return pitchingErrors;
    }

    public void setPitchingErrors(int pitchingErrors) {
        this.pitchingErrors = pitchingErrors;
    }

    public int getPlateAppearances() {
        return plateAppearances;
    }

    public void setPlateAppearances(int plateAppearances) {
        this.plateAppearances = plateAppearances;
    }

    public int getPopOuts() {
        return popOuts;
    }

    public void setPopOuts(int popOuts) {
        this.popOuts = popOuts;
    }

    public int getPopOutsAllowed() {
        return popOutsAllowed;
    }

    public void setPopOutsAllowed(int popOutsAllowed) {
        this.popOutsAllowed = popOutsAllowed;
    }

    public int getPutouts() {
        return putouts;
    }

    public void setPutouts(int putouts) {
        this.putouts = putouts;
    }

    public int getQuialityStarts() {
        return quialityStarts;
    }

    public void setQuialityStarts(int quialityStarts) {
        this.quialityStarts = quialityStarts;
    }

    public int getRbi() {
        return rbi;
    }

    public void setRbi(int rbi) {
        this.rbi = rbi;
    }

    public int getReachedOnError() {
        return reachedOnError;
    }

    public void setReachedOnError(int reachedOnError) {
        this.reachedOnError = reachedOnError;
    }

    public int getReachedOnErrorAllowed() {
        return reachedOnErrorAllowed;
    }

    public void setReachedOnErrorAllowed(int reachedOnErrorAllowed) {
        this.reachedOnErrorAllowed = reachedOnErrorAllowed;
    }

    public int getRunnersCaughtStealing() {
        return runnersCaughtStealing;
    }

    public void setRunnersCaughtStealing(int runnersCaughtStealing) {
        this.runnersCaughtStealing = runnersCaughtStealing;
    }

    public int getRunnersLeftOnBase() {
        return runnersLeftOnBase;
    }

    public void setRunnersLeftOnBase(int runnersLeftOnBase) {
        this.runnersLeftOnBase = runnersLeftOnBase;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getRunsAllowed() {
        return runsAllowed;
    }

    public void setRunsAllowed(int runsAllowed) {
        this.runsAllowed = runsAllowed;
    }

    public int getSacrificeFlies() {
        return sacrificeFlies;
    }

    public void setSacrificeFlies(int sacrificeFlies) {
        this.sacrificeFlies = sacrificeFlies;
    }

    public int getSacrificeFliesAllowed() {
        return sacrificeFliesAllowed;
    }

    public void setSacrificeFliesAllowed(int sacrificeFliesAllowed) {
        this.sacrificeFliesAllowed = sacrificeFliesAllowed;
    }

    public int getSacrificeHits() {
        return sacrificeHits;
    }

    public void setSacrificeHits(int sacrificeHits) {
        this.sacrificeHits = sacrificeHits;
    }

    public int getSacrificeHitsAllowed() {
        return sacrificeHitsAllowed;
    }

    public void setSacrificeHitsAllowed(int sacrificeHitsAllowed) {
        this.sacrificeHitsAllowed = sacrificeHitsAllowed;
    }

    public int getSaveOpportunities() {
        return saveOpportunities;
    }

    public void setSaveOpportunities(int saveOpportunities) {
        this.saveOpportunities = saveOpportunities;
    }

    public int getSaves() {
        return saves;
    }

    public void setSaves(int saves) {
        this.saves = saves;
    }

    public double getSecondaryAverage() {
        return secondaryAverage;
    }

    public void setSecondaryAverage(double secondaryAverage) {
        this.secondaryAverage = secondaryAverage;
    }

    public int getShutouts() {
        return shutouts;
    }

    public void setShutouts(int shutouts) {
        this.shutouts = shutouts;
    }

    public int getSingles() {
        return singles;
    }

    public void setSingles(int singles) {
        this.singles = singles;
    }

    public int getSinglesAllowed() {
        return singlesAllowed;
    }

    public void setSinglesAllowed(int singlesAllowed) {
        this.singlesAllowed = singlesAllowed;
    }

    public double getSluggingPct() {
        return sluggingPct;
    }

    public void setSluggingPct(double sluggingPct) {
        this.sluggingPct = sluggingPct;
    }

    public double getStolenBasePct() {
        return stolenBasePct;
    }

    public void setStolenBasePct(double stolenBasePct) {
        this.stolenBasePct = stolenBasePct;
    }

    public int getStolenBases() {
        return stolenBases;
    }

    public void setStolenBases(int stolenBases) {
        this.stolenBases = stolenBases;
    }

    public int getStolenBasesAllowed() {
        return stolenBasesAllowed;
    }

    public void setStolenBasesAllowed(int stolenBasesAllowed) {
        this.stolenBasesAllowed = stolenBasesAllowed;
    }

    public int getStrikeouts() {
        return strikeouts;
    }

    public void setStrikeouts(int strikeouts) {
        this.strikeouts = strikeouts;
    }

    public int getStrikeoutsAllowed() {
        return strikeoutsAllowed;
    }

    public void setStrikeoutsAllowed(int strikeoutsAllowed) {
        this.strikeoutsAllowed = strikeoutsAllowed;
    }

    public int getStrikeoutsLooking() {
        return strikeoutsLooking;
    }

    public void setStrikeoutsLooking(int strikeoutsLooking) {
        this.strikeoutsLooking = strikeoutsLooking;
    }

    public int getStrikeoutsLookingAllowed() {
        return strikeoutsLookingAllowed;
    }

    public void setStrikeoutsLookingAllowed(int strikeoutsLookingAllowed) {
        this.strikeoutsLookingAllowed = strikeoutsLookingAllowed;
    }

    public double getStrikeoutsPer9Innings() {
        return strikeoutsPer9Innings;
    }

    public void setStrikeoutsPer9Innings(double strikeoutsPer9Innings) {
        this.strikeoutsPer9Innings = strikeoutsPer9Innings;
    }

    public double getStrikeoutsPerWalk() {
        return strikeoutsPerWalk;
    }

    public void setStrikeoutsPerWalk(double strikeoutsPerWalk) {
        this.strikeoutsPerWalk = strikeoutsPerWalk;
    }

    public int getStrikeoutsSwinging() {
        return strikeoutsSwinging;
    }

    public void setStrikeoutsSwinging(int strikeoutsSwinging) {
        this.strikeoutsSwinging = strikeoutsSwinging;
    }

    public int getStrikeoutsSwingingAllowed() {
        return strikeoutsSwingingAllowed;
    }

    public void setStrikeoutsSwingingAllowed(int strikeoutsSwingingAllowed) {
        this.strikeoutsSwingingAllowed = strikeoutsSwingingAllowed;
    }

    public int getStrikes() {
        return strikes;
    }

    public void setStrikes(int strikes) {
        this.strikes = strikes;
    }

    public int getStrikesLooking() {
        return strikesLooking;
    }

    public void setStrikesLooking(int strikesLooking) {
        this.strikesLooking = strikesLooking;
    }

    public int getStrikesSwinging() {
        return strikesSwinging;
    }

    public void setStrikesSwinging(int strikesSwinging) {
        this.strikesSwinging = strikesSwinging;
    }

    public int getStrikesThrown() {
        return strikesThrown;
    }

    public void setStrikesThrown(int strikesThrown) {
        this.strikesThrown = strikesThrown;
    }

    public int getStrikesThrownLooking() {
        return strikesThrownLooking;
    }

    public void setStrikesThrownLooking(int strikesThrownLooking) {
        this.strikesThrownLooking = strikesThrownLooking;
    }

    public int getStrikesThrownSwinging() {
        return strikesThrownSwinging;
    }

    public void setStrikesThrownSwinging(int strikesThrownSwinging) {
        this.strikesThrownSwinging = strikesThrownSwinging;
    }

    public int getTeamLeftOnBase() {
        return teamLeftOnBase;
    }

    public void setTeamLeftOnBase(int teamLeftOnBase) {
        this.teamLeftOnBase = teamLeftOnBase;
    }

    public int getTeamShutouts() {
        return teamShutouts;
    }

    public void setTeamShutouts(int teamShutouts) {
        this.teamShutouts = teamShutouts;
    }

    public int getTotalBases() {
        return totalBases;
    }

    public void setTotalBases(int totalBases) {
        this.totalBases = totalBases;
    }

    public int getTotalBasesAllowed() {
        return totalBasesAllowed;
    }

    public void setTotalBasesAllowed(int totalBasesAllowed) {
        this.totalBasesAllowed = totalBasesAllowed;
    }

    public int getTotalChances() {
        return totalChances;
    }

    public void setTotalChances(int totalChances) {
        this.totalChances = totalChances;
    }

    public int getTriplePlays() {
        return triplePlays;
    }

    public void setTriplePlays(int triplePlays) {
        this.triplePlays = triplePlays;
    }

    public int getTriples() {
        return triples;
    }

    public void setTriples(int triples) {
        this.triples = triples;
    }

    public int getTriplesAllowed() {
        return triplesAllowed;
    }

    public void setTriplesAllowed(int triplesAllowed) {
        this.triplesAllowed = triplesAllowed;
    }

    public int getUnearnedRuns() {
        return unearnedRuns;
    }

    public void setUnearnedRuns(int unearnedRuns) {
        this.unearnedRuns = unearnedRuns;
    }

    public int getUnearnedRunsAllowed() {
        return unearnedRunsAllowed;
    }

    public void setUnearnedRunsAllowed(int unearnedRunsAllowed) {
        this.unearnedRunsAllowed = unearnedRunsAllowed;
    }

    public int getWalks() {
        return walks;
    }

    public void setWalks(int walks) {
        this.walks = walks;
    }

    public int getWalksAllowed() {
        return walksAllowed;
    }

    public void setWalksAllowed(int walksAllowed) {
        this.walksAllowed = walksAllowed;
    }

    public double getWalksPerPlateAppearance() {
        return walksPerPlateAppearance;
    }

    public void setWalksPerPlateAppearance(double walksPerPlateAppearance) {
        this.walksPerPlateAppearance = walksPerPlateAppearance;
    }

    public double getWalksPerStrikeOut() {
        return walksPerStrikeOut;
    }

    public void setWalksPerStrikeOut(double walksPerStrikeOut) {
        this.walksPerStrikeOut = walksPerStrikeOut;
    }

    public double getWhip() {
        return whip;
    }

    public void setWhip(double whip) {
        this.whip = whip;
    }

    public int getWildPitches() {
        return wildPitches;
    }

    public void setWildPitches(int wildPitches) {
        this.wildPitches = wildPitches;
    }

    public int getWildPitchesWhileCatching() {
        return wildPitchesWhileCatching;
    }

    public void setWildPitchesWhileCatching(int wildPitchesWhileCatching) {
        this.wildPitchesWhileCatching = wildPitchesWhileCatching;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public String getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(String seasonId) {
        this.seasonId = seasonId;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }
}
