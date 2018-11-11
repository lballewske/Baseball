package com.lauren.web.restclient.dto;

import org.codehaus.jackson.annotate.JsonProperty;
import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class LogDTO extends BaseDTO {
    @JsonProperty("id")
    private String id;
    @JsonProperty("created at")
    private Date createdAt;
    @JsonProperty("updated_at")
    private Date updatedAt;
    @JsonProperty("game_played")
    private boolean gamePlayed;
    @JsonProperty("game_started")
    private boolean gameStarted;
    @JsonProperty("game_finished")
    private boolean gameFinished;
    @JsonProperty("home_team_outcome")
    private String homeTeamOutcome;
    @JsonProperty("home_team_score")
    private int homeTeamScore;
    @JsonProperty("away_team_outcome")
    private String awayTeamOutcome;
    @JsonProperty("away_team_score")
    private int awayTeamScore;
    @JsonProperty("team_outcome")
    private String teamOutcome;
    @JsonProperty("team_score")
    private int teamScore;
    @JsonProperty("opponent_outcome")
    private String opponentOutcome;
    @JsonProperty("opponent_score")
    private int opponentScore;
    @JsonProperty("is_home_team")
    private boolean isHomeTeam;
    @JsonProperty("is_away_team")
    private boolean isAwayTeam;
    @JsonProperty("catcher_interferences")
    private int catcherInterferences;
    @JsonProperty("catcher_stealers_allowed")
    private int catcherStealersAllowed;
    @JsonProperty("catcher_stealers_caught")
    private int catcherStealersCaught;
    @JsonProperty("extra_base_hits")
    private int extraBaseHits;
    @JsonProperty("fielding_errors")
    private int fieldingErrors;
    @JsonProperty("outfield_assists")
    private int outfieldAssists;
    @JsonProperty("passed_balls")
    private int passedBalls;
    @JsonProperty("at_bats")
    private int atBats;
    @JsonProperty("batting_average")
    private double battingAverage;
    @JsonProperty("caught_stealing")
    private int caughtStealing;
    @JsonProperty("doubles")
    private int doubles;
    @JsonProperty("grounded_into_double_plays")
    private int groundedIntoDoublePlays;
    @JsonProperty("hit_by_pitch")
    private int hitByPitch;
    @JsonProperty("hits")
    private int hits;
    @JsonProperty("home_runs")
    private int homeRuns;
    @JsonProperty("innings_pitched")  //null,
    private double inningsPitched;
    @JsonProperty("intentional_walks")
    private int intentionalWalks;
    @JsonProperty("intentional_walks_against")
    private int intentionalWalksAgainst;
    @JsonProperty("left_on_base")
    private int leftOnBase;
    @JsonProperty("on_base_percentage")
    private double onBasePercentage;
    @JsonProperty("on_base_plus_slugging")
    private double onBasePlusSugging;
    @JsonProperty("rlisp_two_out")
    private int rlispTwoOut;
    @JsonProperty("runs")
    private int runs;
    @JsonProperty("runs_batted_in")
    private int runsBattedIn;
    @JsonProperty("sacrifice_flys")
    private int sacrificeFlys;
    @JsonProperty("sacrifice_hits")
    private int sacrificeHits;
    @JsonProperty("singles")
    private int singles;
    @JsonProperty("slugging_percentage")
    private double sluggingPercentage;
    @JsonProperty("stolen_bases")
    private int stolenBases;
    @JsonProperty("strikeouts")
    private int strikeouts;
    @JsonProperty("total_bases")
    private int totalBases;
    @JsonProperty("triples")
    private int triples;
    @JsonProperty("two_out_rbi")
    private int twoOutRbi;
    @JsonProperty("walks")
    private int walks;
    @JsonProperty("balks")
    private int balks;
    @JsonProperty("balls_thrown")
    private int ballsThrown;
    @JsonProperty("batters_faced")
    private int battersFaced;
    @JsonProperty("blown_saves")
    private int blownSaves;
    @JsonProperty("complete_games")
    private int completeGames;
    @JsonProperty("earned_run_average")
    private double earnedRunAverage;
    @JsonProperty("pitcher_fielding_errors")
    private int pitcherFieldingErrors;
    @JsonProperty("fly_ball_outs")
    private int flyBallOuts;
    @JsonProperty("ground_ball_outs")
    private int groundBallOuts;
    @JsonProperty("holds")
    private int holds;
    @JsonProperty("inherited_runners")
    private int inheritedRunners;
    @JsonProperty("inherited_runners_scored")
    private int inheritedRunnersScored;
    @JsonProperty("inherited_runner_scoring_percentage")
    private double inheritedRunnerScoringPercentage;
    @JsonProperty("losses")
    private int losses;
    @JsonProperty("no_decisions")
    private int noDecisions;
    @JsonProperty("outs_pitched")
    private int outsPitched;
    @JsonProperty("pickoffs")
    private int pickoffs;
    @JsonProperty("pitcher_caught_stealing")
    private int pitcherCaughtStealing;
    @JsonProperty("pitcher_earned_runs")
    private int pitcherEarnedRuns;
    @JsonProperty("pitcher_games_played")
    private int pitcherGamesPlayed;
    @JsonProperty("pitcher_games_started")
    private int pitcherGamesStarted;
    @JsonProperty("pitcher_hit_by_pitch")
    private int pitcherHitByPitch;
    @JsonProperty("pitcher_hits")
    private int pitcherHits;
    @JsonProperty("pitcher_home_runs")
    private int pitcherHomeRuns;
    @JsonProperty("pitcher_intentional_walks")
    private int pitcherIntentionalWalks;
    @JsonProperty("pitcher_runs")
    private int pitcherRuns;
    @JsonProperty("pitcher_sacrifice_flys")
    private int pitcherSacrificeFlys;
    @JsonProperty("pitcher_sacrifice_hits")
    private int pitcherSacrificeHits;
    @JsonProperty("pitcher_stolen_bases")
    private int pitcherStolenBases;
    @JsonProperty("pitcher_strikeouts")
    private int pitcherStrikeouts;
    @JsonProperty("pitcher_walks")
    private int pitcherWalks;
    @JsonProperty("pitches_thrown")
    private int pitchesThrown;
    @JsonProperty("quality_starts")
    private int qualityStarts;
    @JsonProperty("saves")
    private int saves;
    @JsonProperty("shutouts")
    private int shutouts;
    @JsonProperty("starting_pitches_thrown")
    private int startingPitchesThrown;
    @JsonProperty("strikes_thrown")
    private int strikesThrown;
    @JsonProperty("strike_percentage")
    private double strikePercentage;
    @JsonProperty("whip")
    private double whip;
    @JsonProperty("wild_pitches")
    private int wildPitches;
    @JsonProperty("wins")
    private int wins;
    @JsonProperty("game_id")
    private String gameId;
    @JsonProperty("player_id")
    private String playerId;
    @JsonProperty("team_id")
    private String teamId;
    @JsonProperty("opponent_id")
    private String opponentId;

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

    public boolean isGamePlayed() {
        return gamePlayed;
    }

    public void setGamePlayed(boolean gamePlayed) {
        this.gamePlayed = gamePlayed;
    }

    public boolean isGameStarted() {
        return gameStarted;
    }

    public void setGameStarted(boolean gameStarted) {
        this.gameStarted = gameStarted;
    }

    public boolean isGameFinished() {
        return gameFinished;
    }

    public void setGameFinished(boolean gameFinished) {
        this.gameFinished = gameFinished;
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

    public String getTeamOutcome() {
        return teamOutcome;
    }

    public void setTeamOutcome(String teamOutcome) {
        this.teamOutcome = teamOutcome;
    }

    public int getTeamScore() {
        return teamScore;
    }

    public void setTeamScore(int teamScore) {
        this.teamScore = teamScore;
    }

    public String getOpponentOutcome() {
        return opponentOutcome;
    }

    public void setOpponentOutcome(String opponentOutcome) {
        this.opponentOutcome = opponentOutcome;
    }

    public int getOpponentScore() {
        return opponentScore;
    }

    public void setOpponentScore(int opponentScore) {
        this.opponentScore = opponentScore;
    }

    public boolean isHomeTeam() {
        return isHomeTeam;
    }

    public void setHomeTeam(boolean homeTeam) {
        isHomeTeam = homeTeam;
    }

    public boolean isAwayTeam() {
        return isAwayTeam;
    }

    public void setAwayTeam(boolean awayTeam) {
        isAwayTeam = awayTeam;
    }

    public int getCatcherInterferences() {
        return catcherInterferences;
    }

    public void setCatcherInterferences(int catcherInterferences) {
        this.catcherInterferences = catcherInterferences;
    }

    public int getCatcherStealersAllowed() {
        return catcherStealersAllowed;
    }

    public void setCatcherStealersAllowed(int catcherStealersAllowed) {
        this.catcherStealersAllowed = catcherStealersAllowed;
    }

    public int getCatcherStealersCaught() {
        return catcherStealersCaught;
    }

    public void setCatcherStealersCaught(int catcherStealersCaught) {
        this.catcherStealersCaught = catcherStealersCaught;
    }

    public int getExtraBaseHits() {
        return extraBaseHits;
    }

    public void setExtraBaseHits(int extraBaseHits) {
        this.extraBaseHits = extraBaseHits;
    }

    public int getFieldingErrors() {
        return fieldingErrors;
    }

    public void setFieldingErrors(int fieldingErrors) {
        this.fieldingErrors = fieldingErrors;
    }

    public int getOutfieldAssists() {
        return outfieldAssists;
    }

    public void setOutfieldAssists(int outfieldAssists) {
        this.outfieldAssists = outfieldAssists;
    }

    public int getPassedBalls() {
        return passedBalls;
    }

    public void setPassedBalls(int passedBalls) {
        this.passedBalls = passedBalls;
    }

    public int getAtBats() {
        return atBats;
    }

    public void setAtBats(int atBats) {
        this.atBats = atBats;
    }

    public double getBattingAverage() {
        return battingAverage;
    }

    public void setBattingAverage(double battingAverage) {
        this.battingAverage = battingAverage;
    }

    public int getCaughtStealing() {
        return caughtStealing;
    }

    public void setCaughtStealing(int caughtStealing) {
        this.caughtStealing = caughtStealing;
    }

    public int getDoubles() {
        return doubles;
    }

    public void setDoubles(int doubles) {
        this.doubles = doubles;
    }

    public int getGroundedIntoDoublePlays() {
        return groundedIntoDoublePlays;
    }

    public void setGroundedIntoDoublePlays(int groundedIntoDoublePlays) {
        this.groundedIntoDoublePlays = groundedIntoDoublePlays;
    }

    public int getHitByPitch() {
        return hitByPitch;
    }

    public void setHitByPitch(int hitByPitch) {
        this.hitByPitch = hitByPitch;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public int getHomeRuns() {
        return homeRuns;
    }

    public void setHomeRuns(int homeRuns) {
        this.homeRuns = homeRuns;
    }

    public double getInningsPitched() {
        return inningsPitched;
    }

    public void setInningsPitched(double inningsPitched) {
        this.inningsPitched = inningsPitched;
    }

    public int getIntentionalWalks() {
        return intentionalWalks;
    }

    public void setIntentionalWalks(int intentionalWalks) {
        this.intentionalWalks = intentionalWalks;
    }

    public int getIntentionalWalksAgainst() {
        return intentionalWalksAgainst;
    }

    public void setIntentionalWalksAgainst(int intentionalWalksAgainst) {
        this.intentionalWalksAgainst = intentionalWalksAgainst;
    }

    public int getLeftOnBase() {
        return leftOnBase;
    }

    public void setLeftOnBase(int leftOnBase) {
        this.leftOnBase = leftOnBase;
    }

    public double getOnBasePercentage() {
        return onBasePercentage;
    }

    public void setOnBasePercentage(double onBasePercentage) {
        this.onBasePercentage = onBasePercentage;
    }

    public double getOnBasePlusSugging() {
        return onBasePlusSugging;
    }

    public void setOnBasePlusSugging(double onBasePlusSugging) {
        this.onBasePlusSugging = onBasePlusSugging;
    }

    public int getRlispTwoOut() {
        return rlispTwoOut;
    }

    public void setRlispTwoOut(int rlispTwoOut) {
        this.rlispTwoOut = rlispTwoOut;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getRunsBattedIn() {
        return runsBattedIn;
    }

    public void setRunsBattedIn(int runsBattedIn) {
        this.runsBattedIn = runsBattedIn;
    }

    public int getSacrificeFlys() {
        return sacrificeFlys;
    }

    public void setSacrificeFlys(int sacrificeFlys) {
        this.sacrificeFlys = sacrificeFlys;
    }

    public int getSacrificeHits() {
        return sacrificeHits;
    }

    public void setSacrificeHits(int sacrificeHits) {
        this.sacrificeHits = sacrificeHits;
    }

    public int getSingles() {
        return singles;
    }

    public void setSingles(int singles) {
        this.singles = singles;
    }

    public double getSluggingPercentage() {
        return sluggingPercentage;
    }

    public void setSluggingPercentage(double sluggingPercentage) {
        this.sluggingPercentage = sluggingPercentage;
    }

    public int getStolenBases() {
        return stolenBases;
    }

    public void setStolenBases(int stolenBases) {
        this.stolenBases = stolenBases;
    }

    public int getStrikeouts() {
        return strikeouts;
    }

    public void setStrikeouts(int strikeouts) {
        this.strikeouts = strikeouts;
    }

    public int getTotalBases() {
        return totalBases;
    }

    public void setTotalBases(int totalBases) {
        this.totalBases = totalBases;
    }

    public int getTriples() {
        return triples;
    }

    public void setTriples(int triples) {
        this.triples = triples;
    }

    public int getTwoOutRbi() {
        return twoOutRbi;
    }

    public void setTwoOutRbi(int twoOutRbi) {
        this.twoOutRbi = twoOutRbi;
    }

    public int getWalks() {
        return walks;
    }

    public void setWalks(int walks) {
        this.walks = walks;
    }

    public int getBalks() {
        return balks;
    }

    public void setBalks(int balks) {
        this.balks = balks;
    }

    public int getBallsThrown() {
        return ballsThrown;
    }

    public void setBallsThrown(int ballsThrown) {
        this.ballsThrown = ballsThrown;
    }

    public int getBattersFaced() {
        return battersFaced;
    }

    public void setBattersFaced(int battersFaced) {
        this.battersFaced = battersFaced;
    }

    public int getBlownSaves() {
        return blownSaves;
    }

    public void setBlownSaves(int blownSaves) {
        this.blownSaves = blownSaves;
    }

    public int getCompleteGames() {
        return completeGames;
    }

    public void setCompleteGames(int completeGames) {
        this.completeGames = completeGames;
    }

    public double getEarnedRunAverage() {
        return earnedRunAverage;
    }

    public void setEarnedRunAverage(double earnedRunAverage) {
        this.earnedRunAverage = earnedRunAverage;
    }

    public int getPitcherFieldingErrors() {
        return pitcherFieldingErrors;
    }

    public void setPitcherFieldingErrors(int pitcherFieldingErrors) {
        this.pitcherFieldingErrors = pitcherFieldingErrors;
    }

    public int getFlyBallOuts() {
        return flyBallOuts;
    }

    public void setFlyBallOuts(int flyBallOuts) {
        this.flyBallOuts = flyBallOuts;
    }

    public int getGroundBallOuts() {
        return groundBallOuts;
    }

    public void setGroundBallOuts(int groundBallOuts) {
        this.groundBallOuts = groundBallOuts;
    }

    public int getHolds() {
        return holds;
    }

    public void setHolds(int holds) {
        this.holds = holds;
    }

    public int getInheritedRunners() {
        return inheritedRunners;
    }

    public void setInheritedRunners(int inheritedRunners) {
        this.inheritedRunners = inheritedRunners;
    }

    public int getInheritedRunnersScored() {
        return inheritedRunnersScored;
    }

    public void setInheritedRunnersScored(int inheritedRunnersScored) {
        this.inheritedRunnersScored = inheritedRunnersScored;
    }

    public double getInheritedRunnerScoringPercentage() {
        return inheritedRunnerScoringPercentage;
    }

    public void setInheritedRunnerScoringPercentage(double inheritedRunnerScoringPercentage) {
        this.inheritedRunnerScoringPercentage = inheritedRunnerScoringPercentage;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getNoDecisions() {
        return noDecisions;
    }

    public void setNoDecisions(int noDecisions) {
        this.noDecisions = noDecisions;
    }

    public int getOutsPitched() {
        return outsPitched;
    }

    public void setOutsPitched(int outsPitched) {
        this.outsPitched = outsPitched;
    }

    public int getPickoffs() {
        return pickoffs;
    }

    public void setPickoffs(int pickoffs) {
        this.pickoffs = pickoffs;
    }

    public int getPitcherCaughtStealing() {
        return pitcherCaughtStealing;
    }

    public void setPitcherCaughtStealing(int pitcherCaughtStealing) {
        this.pitcherCaughtStealing = pitcherCaughtStealing;
    }

    public int getPitcherEarnedRuns() {
        return pitcherEarnedRuns;
    }

    public void setPitcherEarnedRuns(int pitcherEarnedRuns) {
        this.pitcherEarnedRuns = pitcherEarnedRuns;
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

    public int getPitcherHitByPitch() {
        return pitcherHitByPitch;
    }

    public void setPitcherHitByPitch(int pitcherHitByPitch) {
        this.pitcherHitByPitch = pitcherHitByPitch;
    }

    public int getPitcherHits() {
        return pitcherHits;
    }

    public void setPitcherHits(int pitcherHits) {
        this.pitcherHits = pitcherHits;
    }

    public int getPitcherHomeRuns() {
        return pitcherHomeRuns;
    }

    public void setPitcherHomeRuns(int pitcherHomeRuns) {
        this.pitcherHomeRuns = pitcherHomeRuns;
    }

    public int getPitcherIntentionalWalks() {
        return pitcherIntentionalWalks;
    }

    public void setPitcherIntentionalWalks(int pitcherIntentionalWalks) {
        this.pitcherIntentionalWalks = pitcherIntentionalWalks;
    }

    public int getPitcherRuns() {
        return pitcherRuns;
    }

    public void setPitcherRuns(int pitcherRuns) {
        this.pitcherRuns = pitcherRuns;
    }

    public int getPitcherSacrificeFlys() {
        return pitcherSacrificeFlys;
    }

    public void setPitcherSacrificeFlys(int pitcherSacrificeFlys) {
        this.pitcherSacrificeFlys = pitcherSacrificeFlys;
    }

    public int getPitcherSacrificeHits() {
        return pitcherSacrificeHits;
    }

    public void setPitcherSacrificeHits(int pitcherSacrificeHits) {
        this.pitcherSacrificeHits = pitcherSacrificeHits;
    }

    public int getPitcherStolenBases() {
        return pitcherStolenBases;
    }

    public void setPitcherStolenBases(int pitcherStolenBases) {
        this.pitcherStolenBases = pitcherStolenBases;
    }

    public int getPitcherStrikeouts() {
        return pitcherStrikeouts;
    }

    public void setPitcherStrikeouts(int pitcherStrikeouts) {
        this.pitcherStrikeouts = pitcherStrikeouts;
    }

    public int getPitcherWalks() {
        return pitcherWalks;
    }

    public void setPitcherWalks(int pitcherWalks) {
        this.pitcherWalks = pitcherWalks;
    }

    public int getPitchesThrown() {
        return pitchesThrown;
    }

    public void setPitchesThrown(int pitchesThrown) {
        this.pitchesThrown = pitchesThrown;
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

    public int getStartingPitchesThrown() {
        return startingPitchesThrown;
    }

    public void setStartingPitchesThrown(int startingPitchesThrown) {
        this.startingPitchesThrown = startingPitchesThrown;
    }

    public int getStrikesThrown() {
        return strikesThrown;
    }

    public void setStrikesThrown(int strikesThrown) {
        this.strikesThrown = strikesThrown;
    }

    public double getStrikePercentage() {
        return strikePercentage;
    }

    public void setStrikePercentage(double strikePercentage) {
        this.strikePercentage = strikePercentage;
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

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
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

    public String getOpponentId() {
        return opponentId;
    }

    public void setOpponentId(String opponentId) {
        this.opponentId = opponentId;
    }
}
