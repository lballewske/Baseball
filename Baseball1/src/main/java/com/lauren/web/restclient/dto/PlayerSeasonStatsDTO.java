package com.lauren.web.restclient.dto;

import org.codehaus.jackson.annotate.JsonProperty;
import java.util.Date;

public class PlayerSeasonStatsDTO {
    @JsonProperty("id")
    private String id;
    @JsonProperty("created_at")
    private Date createdAt;
    @JsonProperty("updated_at")
    private Date updatedAt;
    @JsonProperty("interval_type")
    private String intervalType;
    @JsonProperty("statistics_on")
    private Date statisticsOn; //"2018-06-15"
    @JsonProperty("hitter_games_completed")
    private int hitterGamesCompleted;
    @JsonProperty("hitter_games_finished")
    private int hitterGamesFinished;
    @JsonProperty("hitter_games_played")
    private int hitterGamesPlayed;
    @JsonProperty("hitter_games_started")
    private int hitterGamesStarted;
    @JsonProperty("assists")
    private int assists;
    @JsonProperty("wild_pitches_while_catching")
    private int wildPitchesWhileCatching;
    @JsonProperty("double_plays")
    private int doublePlays;
    @JsonProperty("fielding_errors")
    private int filedingErrors;
    @JsonProperty("fielding_pct")
    private double fieldingPct;
    @JsonProperty("passed_balls")
    private int passedBalls;
    @JsonProperty("putouts")
    private int putouts;
    @JsonProperty("total_chances") /*: null,*/
    private int totalChances;
    @JsonProperty("triple_plays") /*: null,*/
    private int triplePlays;
    @JsonProperty("at_bats")
    private int atBats;
    @JsonProperty("at_bats_risp")
    private int atBatsRisp;
    @JsonProperty("at_bats_per_home_run")
    private int atBatsPerHomeRun;
    @JsonProperty("at_bats_per_strike_out")
    private double atBatsPerStrikeOut;
    @JsonProperty("plate_appearances")
    private int plateAppearances;
    @JsonProperty("batting_average")
    private double battingAverage;
    @JsonProperty("babip")
    private double babip;
    @JsonProperty("walks_per_strike_out")
    private double walksPerStrikeOut;
    @JsonProperty("walks_per_plate_appearance")
    private double walksPerPlateAppearance;
    @JsonProperty("balls_in_play")
    private int ballsInPlay;
    @JsonProperty("gofo")
    private double gofo;
    @JsonProperty("hits_risp") /*: null,*/
    private int hitsRisp;
    @JsonProperty("iso")
    private double iso;
    @JsonProperty("runners_left_on_base")
    private int runnersLeftOnBase;
    @JsonProperty("lob_risp_2out")
    private int lobRisp2out;
    @JsonProperty("on_base_percentage")
    private double onBasePercentage;
    @JsonProperty("walks")
    private int walks;
    @JsonProperty("doubles")
    private int doubles;
    @JsonProperty("fielders_choice")
    private int fieldersChoice;
    @JsonProperty("hits")
    private int hits;
    @JsonProperty("hit_by_pitches")
    private int hitByPitches;
    @JsonProperty("home_runs")
    private int homeRuns;
    @JsonProperty("intentional_walks")
    private int intentionalWalks;
    @JsonProperty("reached_on_error")
    private int reachedOnError;
    @JsonProperty("singles")
    private int singles;
    @JsonProperty("triples")
    private int triples;
    @JsonProperty("total_bases")
    private int totalBases;
    @JsonProperty("ops")
    private double ops;
    @JsonProperty("balls")
    private int balls;
    @JsonProperty("dirtballs")
    private int dirtballs;
    @JsonProperty("foul_balls")
    private int foulBalls;
    @JsonProperty("intentional_balls")
    private int intentionalBalls;
    @JsonProperty("strikes_looking")
    private int strikesLooking;
    @JsonProperty("strikes_swinging")
    private int strikesSwinging;
    @JsonProperty("strikes")
    private int strikes;
    @JsonProperty("fly_outs_into_double_plays")
    private int flyOutsIntoDoublePlays;
    @JsonProperty("fly_outs")
    private int flyOuts;
    @JsonProperty("ground_outs_into_double_plays")
    private int groundOutsIntoDoublePlays;
    @JsonProperty("ground_outs")
    private int groundOuts;
    @JsonProperty("strikeouts_looking")
    private int strikeoutsLooking;
    @JsonProperty("strikeouts_swinging")
    private int strikeoutsSwinging;
    @JsonProperty("strikeouts")
    private int strikeouts;
    @JsonProperty("line_outs_into_double_plays")
    private int lineOutsIntoDoublePlays;
    @JsonProperty("line_outs")
    private int lineOuts;
    @JsonProperty("pop_outs")
    private int popOuts;
    @JsonProperty("sacrifice_flies")
    private int sacrificeFlies;
    @JsonProperty("sacrifice_hits")
    private int sacrificeHits;
    @JsonProperty("pitches_faced")
    private int pitchesFaced;
    @JsonProperty("rbi")
    private int rbi;
    @JsonProperty("earned_runs")
    private int earnedRuns;
    @JsonProperty("runs")
    private int runs;
    @JsonProperty("unearned_runs")
    private int unearnedRuns;
    @JsonProperty("secondary_average")
    private double secondaryAverage;
    @JsonProperty("slugging_pct")
    private double sluggingPct;
    @JsonProperty("caught_stealing")
    private int caughtStealing;
    @JsonProperty("stolen_base_pct")
    private double stolenBasePct;
    @JsonProperty("stolen_bases")
    private int stolenBases;
    @JsonProperty("team_left_on_base") /*: null,*/
    private int teamLeftOnBase;
    @JsonProperty("extra_base_hits")
    private int extraBaseHits;
    @JsonProperty("batters_faced")
    private int battersFaced;
    @JsonProperty("era")
    private double era;
    @JsonProperty("pitching_errors") /*: null,*/
    private int pitchingErrors;
    @JsonProperty("blown_save")
    private int blownSave;
    @JsonProperty("complete_games")
    private int completeGames;
    @JsonProperty("holds")
    private int holds;
    @JsonProperty("losses")
    private int losses;
    @JsonProperty("quality_starts")
    private int qualityStarts;
    @JsonProperty("saves")
    private int saves;
    @JsonProperty("shutouts")
    private int shutouts;
    @JsonProperty("save_opportunities")
    private int saveOpportunities;
    @JsonProperty("team_shutouts") /*: null,*/
    private int teamShutouts;
    @JsonProperty("wins") /*: null,*/
    private int wins;
    @JsonProperty("ground_ball_to_fly_ball_ratio")
    private double groundBallToFlyBallRatio;
    @JsonProperty("innings_pitched_total_outs") /*: null,*/
    private double inningsPitchedTotalOuts;
    @JsonProperty("innings_pitched") /*: null,*/
    private double inningsPitched;
    @JsonProperty("strikeouts_per_9_innings")
    private double strikeoutsPer9Innings;
    @JsonProperty("strikeouts_per_walk")
    private double strikeoutsPerWalk;
    @JsonProperty("pitcher_runners_left_on_base")
    private int pitcherRunnersLeftOnBase;
    @JsonProperty("opponents_batting_average")
    private double opponentsBattingAverage;
    @JsonProperty("walks_allowed")
    private int walksAllowed;
    @JsonProperty("doubles_allowed")
    private int doublesAllowed;
    @JsonProperty("fielders_choice_allowed")
    private int fieldersChoiceAllowed;
    @JsonProperty("hits_allowed")
    private int hitsAllowed;
    @JsonProperty("hit_batters")
    private int hitBatters;
    @JsonProperty("home_runs_allowed")
    private int homeRunsAllowed;
    @JsonProperty("intentional_walks_allowed")
    private int intentionalWalksAllowed;
    @JsonProperty("reached_on_error_allowed") /*: null,*/
    private int reachedOnErrorAllowed;
    @JsonProperty("singles_allowed")
    private int singlesAllowed;
    @JsonProperty("triples_allowed")
    private int triplesAllowed;
    @JsonProperty("total_bases_allowed")
    private int totalBasesAllowed;
    @JsonProperty("balls_throwns")
    private int ballsThrowns;
    @JsonProperty("dirtballs_throwns")
    private int dirtballsThrowns;
    @JsonProperty("foul_balls_throwns")
    private int foulBallsThrowns;
    @JsonProperty("intentional_balls_throwns")
    private int intentionalBallsThrowns;
    @JsonProperty("strikes_thrown_looking")
    private int strikesThrownLooking;
    @JsonProperty("strikes_thrown_swinging")
    private int strikesThrownSwinging;
    @JsonProperty("strikes_thrown")
    private int strikesThrown;
    @JsonProperty("fly_outs_into_double_plays_allowed")
    private int flyOutsIntoDoublePlaysAllowed;
    @JsonProperty("fly_outs_allowed")
    private int flyOutsAllowed;
    @JsonProperty("ground_outs_into_double_plays_allowed")
    private int groundOutsIntoDoublePlaysAllowed;
    @JsonProperty("ground_outs_allowed")
    private int groundOutsAllowed;
    @JsonProperty("strikeouts_looking_allowed")
    private int strikeoutsLookingAllowed;
    @JsonProperty("strikeouts_swinging_allowed")
    private int strikeoutsSwingingAllowed;
    @JsonProperty("strikeouts_allowed")
    private int strikeoutsAllowed;
    @JsonProperty("line_outs_into_double_plays_allowed")
    private int lineOutsIntoDoublePlaysAllowed;
    @JsonProperty("line_outs_allowed")
    private int lineOutsAllowed;
    @JsonProperty("pop_outs_allowed")
    private int popOutsAllowed;
    @JsonProperty("sacrifice_flies_allowed")
    private int sacrificeFliesAllowed;
    @JsonProperty("sacrifice_hits_allowed")
    private int sacrificeHitsAllowed;
    @JsonProperty("pitches_thrown")
    private int pitchesThrown;
    @JsonProperty("earned_runs_allowed")
    private int earnedRunsAllowed;
    @JsonProperty("runs_allowed")
    private int runsAllowed;
    @JsonProperty("unearned_runs_allowed")
    private int unearnedRunsAllowed;
    @JsonProperty("runners_caught_stealing")
    private int runnersCaughtStealing;
    @JsonProperty("stolen_bases_allowed")
    private int stolenBasesAllowed;
    @JsonProperty("whip")
    private double whip;
    @JsonProperty("wild_pitches")
    private int wildPitches;
    @JsonProperty("range_factor")
    private double rangeFactor;
    @JsonProperty("fielder_games_completed")
    private int fielderGamesCompleted;
    @JsonProperty("fielder_games_finished")
    private int fielderGamesFinished;
    @JsonProperty("fielder_games_played")
    private int fielderGamesPlayed;
    @JsonProperty("fielder_games_started")
    private int fielderGamesStarted;
    @JsonProperty("pitcher_games_finished")
    private int pitcherGamesFinished;
    @JsonProperty("pitcher_games_played")
    private int pitcherGamesPlayed;
    @JsonProperty("pitcher_games_started")
    private int pitcherGamesStarted;
    @JsonProperty("season_id")
    private String seasonId;
    @JsonProperty("player_id")
    private String playerId;
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

    public int getHitterGamesCompleted() {
        return hitterGamesCompleted;
    }

    public void setHitterGamesCompleted(int hitterGamesCompleted) {
        this.hitterGamesCompleted = hitterGamesCompleted;
    }

    public int getHitterGamesFinished() {
        return hitterGamesFinished;
    }

    public void setHitterGamesFinished(int hitterGamesFinished) {
        this.hitterGamesFinished = hitterGamesFinished;
    }

    public int getHitterGamesPlayed() {
        return hitterGamesPlayed;
    }

    public void setHitterGamesPlayed(int hitterGamesPlayed) {
        this.hitterGamesPlayed = hitterGamesPlayed;
    }

    public int getHitterGamesStarted() {
        return hitterGamesStarted;
    }

    public void setHitterGamesStarted(int hitterGamesStarted) {
        this.hitterGamesStarted = hitterGamesStarted;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getWildPitchesWhileCatching() {
        return wildPitchesWhileCatching;
    }

    public void setWildPitchesWhileCatching(int wildPitchesWhileCatching) {
        this.wildPitchesWhileCatching = wildPitchesWhileCatching;
    }

    public int getDoublePlays() {
        return doublePlays;
    }

    public void setDoublePlays(int doublePlays) {
        this.doublePlays = doublePlays;
    }

    public int getFiledingErrors() {
        return filedingErrors;
    }

    public void setFiledingErrors(int filedingErrors) {
        this.filedingErrors = filedingErrors;
    }

    public double getFieldingPct() {
        return fieldingPct;
    }

    public void setFieldingPct(double fieldingPct) {
        this.fieldingPct = fieldingPct;
    }

    public int getPassedBalls() {
        return passedBalls;
    }

    public void setPassedBalls(int passedBalls) {
        this.passedBalls = passedBalls;
    }

    public int getPutouts() {
        return putouts;
    }

    public void setPutouts(int putouts) {
        this.putouts = putouts;
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

    public int getAtBats() {
        return atBats;
    }

    public void setAtBats(int atBats) {
        this.atBats = atBats;
    }

    public int getAtBatsRisp() {
        return atBatsRisp;
    }

    public void setAtBatsRisp(int atBatsRisp) {
        this.atBatsRisp = atBatsRisp;
    }

    public int getAtBatsPerHomeRun() {
        return atBatsPerHomeRun;
    }

    public void setAtBatsPerHomeRun(int atBatsPerHomeRun) {
        this.atBatsPerHomeRun = atBatsPerHomeRun;
    }

    public double getAtBatsPerStrikeOut() {
        return atBatsPerStrikeOut;
    }

    public void setAtBatsPerStrikeOut(double atBatsPerStrikeOut) {
        this.atBatsPerStrikeOut = atBatsPerStrikeOut;
    }

    public int getPlateAppearances() {
        return plateAppearances;
    }

    public void setPlateAppearances(int plateAppearances) {
        this.plateAppearances = plateAppearances;
    }

    public double getBattingAverage() {
        return battingAverage;
    }

    public void setBattingAverage(double battingAverage) {
        this.battingAverage = battingAverage;
    }

    public double getBabip() {
        return babip;
    }

    public void setBabip(double babip) {
        this.babip = babip;
    }

    public double getWalksPerStrikeOut() {
        return walksPerStrikeOut;
    }

    public void setWalksPerStrikeOut(double walksPerStrikeOut) {
        this.walksPerStrikeOut = walksPerStrikeOut;
    }

    public double getWalksPerPlateAppearance() {
        return walksPerPlateAppearance;
    }

    public void setWalksPerPlateAppearance(double walksPerPlateAppearance) {
        this.walksPerPlateAppearance = walksPerPlateAppearance;
    }

    public int getBallsInPlay() {
        return ballsInPlay;
    }

    public void setBallsInPlay(int ballsInPlay) {
        this.ballsInPlay = ballsInPlay;
    }

    public double getGofo() {
        return gofo;
    }

    public void setGofo(double gofo) {
        this.gofo = gofo;
    }

    public int getHitsRisp() {
        return hitsRisp;
    }

    public void setHitsRisp(int hitsRisp) {
        this.hitsRisp = hitsRisp;
    }

    public double getIso() {
        return iso;
    }

    public void setIso(double iso) {
        this.iso = iso;
    }

    public int getRunnersLeftOnBase() {
        return runnersLeftOnBase;
    }

    public void setRunnersLeftOnBase(int runnersLeftOnBase) {
        this.runnersLeftOnBase = runnersLeftOnBase;
    }

    public int getLobRisp2out() {
        return lobRisp2out;
    }

    public void setLobRisp2out(int lobRisp2out) {
        this.lobRisp2out = lobRisp2out;
    }

    public double getOnBasePercentage() {
        return onBasePercentage;
    }

    public void setOnBasePercentage(double onBasePercentage) {
        this.onBasePercentage = onBasePercentage;
    }

    public int getWalks() {
        return walks;
    }

    public void setWalks(int walks) {
        this.walks = walks;
    }

    public int getDoubles() {
        return doubles;
    }

    public void setDoubles(int doubles) {
        this.doubles = doubles;
    }

    public int getFieldersChoice() {
        return fieldersChoice;
    }

    public void setFieldersChoice(int fieldersChoice) {
        this.fieldersChoice = fieldersChoice;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public int getHitByPitches() {
        return hitByPitches;
    }

    public void setHitByPitches(int hitByPitches) {
        this.hitByPitches = hitByPitches;
    }

    public int getHomeRuns() {
        return homeRuns;
    }

    public void setHomeRuns(int homeRuns) {
        this.homeRuns = homeRuns;
    }

    public int getIntentionalWalks() {
        return intentionalWalks;
    }

    public void setIntentionalWalks(int intentionalWalks) {
        this.intentionalWalks = intentionalWalks;
    }

    public int getReachedOnError() {
        return reachedOnError;
    }

    public void setReachedOnError(int reachedOnError) {
        this.reachedOnError = reachedOnError;
    }

    public int getSingles() {
        return singles;
    }

    public void setSingles(int singles) {
        this.singles = singles;
    }

    public int getTriples() {
        return triples;
    }

    public void setTriples(int triples) {
        this.triples = triples;
    }

    public int getTotalBases() {
        return totalBases;
    }

    public void setTotalBases(int totalBases) {
        this.totalBases = totalBases;
    }

    public double getOps() {
        return ops;
    }

    public void setOps(double ops) {
        this.ops = ops;
    }

    public int getBalls() {
        return balls;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }

    public int getDirtballs() {
        return dirtballs;
    }

    public void setDirtballs(int dirtballs) {
        this.dirtballs = dirtballs;
    }

    public int getFoulBalls() {
        return foulBalls;
    }

    public void setFoulBalls(int foulBalls) {
        this.foulBalls = foulBalls;
    }

    public int getIntentionalBalls() {
        return intentionalBalls;
    }

    public void setIntentionalBalls(int intentionalBalls) {
        this.intentionalBalls = intentionalBalls;
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

    public int getStrikes() {
        return strikes;
    }

    public void setStrikes(int strikes) {
        this.strikes = strikes;
    }

    public int getFlyOutsIntoDoublePlays() {
        return flyOutsIntoDoublePlays;
    }

    public void setFlyOutsIntoDoublePlays(int flyOutsIntoDoublePlays) {
        this.flyOutsIntoDoublePlays = flyOutsIntoDoublePlays;
    }

    public int getFlyOuts() {
        return flyOuts;
    }

    public void setFlyOuts(int flyOuts) {
        this.flyOuts = flyOuts;
    }

    public int getGroundOutsIntoDoublePlays() {
        return groundOutsIntoDoublePlays;
    }

    public void setGroundOutsIntoDoublePlays(int groundOutsIntoDoublePlays) {
        this.groundOutsIntoDoublePlays = groundOutsIntoDoublePlays;
    }

    public int getGroundOuts() {
        return groundOuts;
    }

    public void setGroundOuts(int groundOuts) {
        this.groundOuts = groundOuts;
    }

    public int getStrikeoutsLooking() {
        return strikeoutsLooking;
    }

    public void setStrikeoutsLooking(int strikeoutsLooking) {
        this.strikeoutsLooking = strikeoutsLooking;
    }

    public int getStrikeoutsSwinging() {
        return strikeoutsSwinging;
    }

    public void setStrikeoutsSwinging(int strikeoutsSwinging) {
        this.strikeoutsSwinging = strikeoutsSwinging;
    }

    public int getStrikeouts() {
        return strikeouts;
    }

    public void setStrikeouts(int strikeouts) {
        this.strikeouts = strikeouts;
    }

    public int getLineOutsIntoDoublePlays() {
        return lineOutsIntoDoublePlays;
    }

    public void setLineOutsIntoDoublePlays(int lineOutsIntoDoublePlays) {
        this.lineOutsIntoDoublePlays = lineOutsIntoDoublePlays;
    }

    public int getLineOuts() {
        return lineOuts;
    }

    public void setLineOuts(int lineOuts) {
        this.lineOuts = lineOuts;
    }

    public int getPopOuts() {
        return popOuts;
    }

    public void setPopOuts(int popOuts) {
        this.popOuts = popOuts;
    }

    public int getSacrificeFlies() {
        return sacrificeFlies;
    }

    public void setSacrificeFlies(int sacrificeFlies) {
        this.sacrificeFlies = sacrificeFlies;
    }

    public int getSacrificeHits() {
        return sacrificeHits;
    }

    public void setSacrificeHits(int sacrificeHits) {
        this.sacrificeHits = sacrificeHits;
    }

    public int getPitchesFaced() {
        return pitchesFaced;
    }

    public void setPitchesFaced(int pitchesFaced) {
        this.pitchesFaced = pitchesFaced;
    }

    public int getRbi() {
        return rbi;
    }

    public void setRbi(int rbi) {
        this.rbi = rbi;
    }

    public int getEarnedRuns() {
        return earnedRuns;
    }

    public void setEarnedRuns(int earnedRuns) {
        this.earnedRuns = earnedRuns;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getUnearnedRuns() {
        return unearnedRuns;
    }

    public void setUnearnedRuns(int unearnedRuns) {
        this.unearnedRuns = unearnedRuns;
    }

    public double getSecondaryAverage() {
        return secondaryAverage;
    }

    public void setSecondaryAverage(double secondaryAverage) {
        this.secondaryAverage = secondaryAverage;
    }

    public double getSluggingPct() {
        return sluggingPct;
    }

    public void setSluggingPct(double sluggingPct) {
        this.sluggingPct = sluggingPct;
    }

    public int getCaughtStealing() {
        return caughtStealing;
    }

    public void setCaughtStealing(int caughtStealing) {
        this.caughtStealing = caughtStealing;
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

    public int getTeamLeftOnBase() {
        return teamLeftOnBase;
    }

    public void setTeamLeftOnBase(int teamLeftOnBase) {
        this.teamLeftOnBase = teamLeftOnBase;
    }

    public int getExtraBaseHits() {
        return extraBaseHits;
    }

    public void setExtraBaseHits(int extraBaseHits) {
        this.extraBaseHits = extraBaseHits;
    }

    public int getBattersFaced() {
        return battersFaced;
    }

    public void setBattersFaced(int battersFaced) {
        this.battersFaced = battersFaced;
    }

    public double getEra() {
        return era;
    }

    public void setEra(double era) {
        this.era = era;
    }

    public int getPitchingErrors() {
        return pitchingErrors;
    }

    public void setPitchingErrors(int pitchingErrors) {
        this.pitchingErrors = pitchingErrors;
    }

    public int getBlownSave() {
        return blownSave;
    }

    public void setBlownSave(int blownSave) {
        this.blownSave = blownSave;
    }

    public int getCompleteGames() {
        return completeGames;
    }

    public void setCompleteGames(int completeGames) {
        this.completeGames = completeGames;
    }

    public int getHolds() {
        return holds;
    }

    public void setHolds(int holds) {
        this.holds = holds;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getQualityStarts() {
        return qualityStarts;
    }

    public void setQualityStarts(int qualityStarts) {
        this.qualityStarts = qualityStarts;
    }

    public int getSaves() {
        return saves;
    }

    public void setSaves(int saves) {
        this.saves = saves;
    }

    public int getShutouts() {
        return shutouts;
    }

    public void setShutouts(int shutouts) {
        this.shutouts = shutouts;
    }

    public int getSaveOpportunities() {
        return saveOpportunities;
    }

    public void setSaveOpportunities(int saveOpportunities) {
        this.saveOpportunities = saveOpportunities;
    }

    public int getTeamShutouts() {
        return teamShutouts;
    }

    public void setTeamShutouts(int teamShutouts) {
        this.teamShutouts = teamShutouts;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public double getGroundBallToFlyBallRatio() {
        return groundBallToFlyBallRatio;
    }

    public void setGroundBallToFlyBallRatio(double groundBallToFlyBallRatio) {
        this.groundBallToFlyBallRatio = groundBallToFlyBallRatio;
    }

    public double getInningsPitchedTotalOuts() {
        return inningsPitchedTotalOuts;
    }

    public void setInningsPitchedTotalOuts(double inningsPitchedTotalOuts) {
        this.inningsPitchedTotalOuts = inningsPitchedTotalOuts;
    }

    public double getInningsPitched() {
        return inningsPitched;
    }

    public void setInningsPitched(double inningsPitched) {
        this.inningsPitched = inningsPitched;
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

    public int getPitcherRunnersLeftOnBase() {
        return pitcherRunnersLeftOnBase;
    }

    public void setPitcherRunnersLeftOnBase(int pitcherRunnersLeftOnBase) {
        this.pitcherRunnersLeftOnBase = pitcherRunnersLeftOnBase;
    }

    public double getOpponentsBattingAverage() {
        return opponentsBattingAverage;
    }

    public void setOpponentsBattingAverage(double opponentsBattingAverage) {
        this.opponentsBattingAverage = opponentsBattingAverage;
    }

    public int getWalksAllowed() {
        return walksAllowed;
    }

    public void setWalksAllowed(int walksAllowed) {
        this.walksAllowed = walksAllowed;
    }

    public int getDoublesAllowed() {
        return doublesAllowed;
    }

    public void setDoublesAllowed(int doublesAllowed) {
        this.doublesAllowed = doublesAllowed;
    }

    public int getFieldersChoiceAllowed() {
        return fieldersChoiceAllowed;
    }

    public void setFieldersChoiceAllowed(int fieldersChoiceAllowed) {
        this.fieldersChoiceAllowed = fieldersChoiceAllowed;
    }

    public int getHitsAllowed() {
        return hitsAllowed;
    }

    public void setHitsAllowed(int hitsAllowed) {
        this.hitsAllowed = hitsAllowed;
    }

    public int getHitBatters() {
        return hitBatters;
    }

    public void setHitBatters(int hitBatters) {
        this.hitBatters = hitBatters;
    }

    public int getHomeRunsAllowed() {
        return homeRunsAllowed;
    }

    public void setHomeRunsAllowed(int homeRunsAllowed) {
        this.homeRunsAllowed = homeRunsAllowed;
    }

    public int getIntentionalWalksAllowed() {
        return intentionalWalksAllowed;
    }

    public void setIntentionalWalksAllowed(int intentionalWalksAllowed) {
        this.intentionalWalksAllowed = intentionalWalksAllowed;
    }

    public int getReachedOnErrorAllowed() {
        return reachedOnErrorAllowed;
    }

    public void setReachedOnErrorAllowed(int reachedOnErrorAllowed) {
        this.reachedOnErrorAllowed = reachedOnErrorAllowed;
    }

    public int getSinglesAllowed() {
        return singlesAllowed;
    }

    public void setSinglesAllowed(int singlesAllowed) {
        this.singlesAllowed = singlesAllowed;
    }

    public int getTriplesAllowed() {
        return triplesAllowed;
    }

    public void setTriplesAllowed(int triplesAllowed) {
        this.triplesAllowed = triplesAllowed;
    }

    public int getTotalBasesAllowed() {
        return totalBasesAllowed;
    }

    public void setTotalBasesAllowed(int totalBasesAllowed) {
        this.totalBasesAllowed = totalBasesAllowed;
    }

    public int getBallsThrowns() {
        return ballsThrowns;
    }

    public void setBallsThrowns(int ballsThrowns) {
        this.ballsThrowns = ballsThrowns;
    }

    public int getDirtballsThrowns() {
        return dirtballsThrowns;
    }

    public void setDirtballsThrowns(int dirtballsThrowns) {
        this.dirtballsThrowns = dirtballsThrowns;
    }

    public int getFoulBallsThrowns() {
        return foulBallsThrowns;
    }

    public void setFoulBallsThrowns(int foulBallsThrowns) {
        this.foulBallsThrowns = foulBallsThrowns;
    }

    public int getIntentionalBallsThrowns() {
        return intentionalBallsThrowns;
    }

    public void setIntentionalBallsThrowns(int intentionalBallsThrowns) {
        this.intentionalBallsThrowns = intentionalBallsThrowns;
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

    public int getStrikesThrown() {
        return strikesThrown;
    }

    public void setStrikesThrown(int strikesThrown) {
        this.strikesThrown = strikesThrown;
    }

    public int getFlyOutsIntoDoublePlaysAllowed() {
        return flyOutsIntoDoublePlaysAllowed;
    }

    public void setFlyOutsIntoDoublePlaysAllowed(int flyOutsIntoDoublePlaysAllowed) {
        this.flyOutsIntoDoublePlaysAllowed = flyOutsIntoDoublePlaysAllowed;
    }

    public int getFlyOutsAllowed() {
        return flyOutsAllowed;
    }

    public void setFlyOutsAllowed(int flyOutsAllowed) {
        this.flyOutsAllowed = flyOutsAllowed;
    }

    public int getGroundOutsIntoDoublePlaysAllowed() {
        return groundOutsIntoDoublePlaysAllowed;
    }

    public void setGroundOutsIntoDoublePlaysAllowed(int groundOutsIntoDoublePlaysAllowed) {
        this.groundOutsIntoDoublePlaysAllowed = groundOutsIntoDoublePlaysAllowed;
    }

    public int getGroundOutsAllowed() {
        return groundOutsAllowed;
    }

    public void setGroundOutsAllowed(int groundOutsAllowed) {
        this.groundOutsAllowed = groundOutsAllowed;
    }

    public int getStrikeoutsLookingAllowed() {
        return strikeoutsLookingAllowed;
    }

    public void setStrikeoutsLookingAllowed(int strikeoutsLookingAllowed) {
        this.strikeoutsLookingAllowed = strikeoutsLookingAllowed;
    }

    public int getStrikeoutsSwingingAllowed() {
        return strikeoutsSwingingAllowed;
    }

    public void setStrikeoutsSwingingAllowed(int strikeoutsSwingingAllowed) {
        this.strikeoutsSwingingAllowed = strikeoutsSwingingAllowed;
    }

    public int getStrikeoutsAllowed() {
        return strikeoutsAllowed;
    }

    public void setStrikeoutsAllowed(int strikeoutsAllowed) {
        this.strikeoutsAllowed = strikeoutsAllowed;
    }

    public int getLineOutsIntoDoublePlaysAllowed() {
        return lineOutsIntoDoublePlaysAllowed;
    }

    public void setLineOutsIntoDoublePlaysAllowed(int lineOutsIntoDoublePlaysAllowed) {
        this.lineOutsIntoDoublePlaysAllowed = lineOutsIntoDoublePlaysAllowed;
    }

    public int getLineOutsAllowed() {
        return lineOutsAllowed;
    }

    public void setLineOutsAllowed(int lineOutsAllowed) {
        this.lineOutsAllowed = lineOutsAllowed;
    }

    public int getPopOutsAllowed() {
        return popOutsAllowed;
    }

    public void setPopOutsAllowed(int popOutsAllowed) {
        this.popOutsAllowed = popOutsAllowed;
    }

    public int getSacrificeFliesAllowed() {
        return sacrificeFliesAllowed;
    }

    public void setSacrificeFliesAllowed(int sacrificeFliesAllowed) {
        this.sacrificeFliesAllowed = sacrificeFliesAllowed;
    }

    public int getSacrificeHitsAllowed() {
        return sacrificeHitsAllowed;
    }

    public void setSacrificeHitsAllowed(int sacrificeHitsAllowed) {
        this.sacrificeHitsAllowed = sacrificeHitsAllowed;
    }

    public int getPitchesThrown() {
        return pitchesThrown;
    }

    public void setPitchesThrown(int pitchesThrown) {
        this.pitchesThrown = pitchesThrown;
    }

    public int getEarnedRunsAllowed() {
        return earnedRunsAllowed;
    }

    public void setEarnedRunsAllowed(int earnedRunsAllowed) {
        this.earnedRunsAllowed = earnedRunsAllowed;
    }

    public int getRunsAllowed() {
        return runsAllowed;
    }

    public void setRunsAllowed(int runsAllowed) {
        this.runsAllowed = runsAllowed;
    }

    public int getUnearnedRunsAllowed() {
        return unearnedRunsAllowed;
    }

    public void setUnearnedRunsAllowed(int unearnedRunsAllowed) {
        this.unearnedRunsAllowed = unearnedRunsAllowed;
    }

    public int getRunnersCaughtStealing() {
        return runnersCaughtStealing;
    }

    public void setRunnersCaughtStealing(int runnersCaughtStealing) {
        this.runnersCaughtStealing = runnersCaughtStealing;
    }

    public int getStolenBasesAllowed() {
        return stolenBasesAllowed;
    }

    public void setStolenBasesAllowed(int stolenBasesAllowed) {
        this.stolenBasesAllowed = stolenBasesAllowed;
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

    public double getRangeFactor() {
        return rangeFactor;
    }

    public void setRangeFactor(double rangeFactor) {
        this.rangeFactor = rangeFactor;
    }

    public int getFielderGamesCompleted() {
        return fielderGamesCompleted;
    }

    public void setFielderGamesCompleted(int fielderGamesCompleted) {
        this.fielderGamesCompleted = fielderGamesCompleted;
    }

    public int getFielderGamesFinished() {
        return fielderGamesFinished;
    }

    public void setFielderGamesFinished(int fielderGamesFinished) {
        this.fielderGamesFinished = fielderGamesFinished;
    }

    public int getFielderGamesPlayed() {
        return fielderGamesPlayed;
    }

    public void setFielderGamesPlayed(int fielderGamesPlayed) {
        this.fielderGamesPlayed = fielderGamesPlayed;
    }

    public int getFielderGamesStarted() {
        return fielderGamesStarted;
    }

    public void setFielderGamesStarted(int fielderGamesStarted) {
        this.fielderGamesStarted = fielderGamesStarted;
    }

    public int getPitcherGamesFinished() {
        return pitcherGamesFinished;
    }

    public void setPitcherGamesFinished(int pitcherGamesFinished) {
        this.pitcherGamesFinished = pitcherGamesFinished;
    }

    public int getPitcherGamesPlayed() {
        return pitcherGamesPlayed;
    }

    public void setPitcherGamesPlayed(int pitcherGamesPlayed) {
        this.pitcherGamesPlayed = pitcherGamesPlayed;
    }

    public int getPitcherGamesStarted() {
        return pitcherGamesStarted;
    }

    public void setPitcherGamesStarted(int pitcherGamesStarted) {
        this.pitcherGamesStarted = pitcherGamesStarted;
    }

    public String getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(String seasonId) {
        this.seasonId = seasonId;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }
}
