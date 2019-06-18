package com.lauren.prediction;

import com.lauren.db.TeamSeasonStats;
import org.junit.Test;
import static org.junit.Assert.*;

public class PredictionEngineTest {
    @Test
    public void testWinProbability() {
        TeamSeasonStats homeTeamSeasonStats = new TeamSeasonStats();
        TeamSeasonStats awayTeamSeasonStats = new TeamSeasonStats();
        PredictionEngine predictionEngine = new PredictionEngine();
        assertEquals(0, predictionEngine.winProbability(homeTeamSeasonStats, awayTeamSeasonStats), 0.00000001d);
    }
}
