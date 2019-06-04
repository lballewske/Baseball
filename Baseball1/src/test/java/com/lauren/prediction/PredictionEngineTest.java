package com.lauren.prediction;

import com.lauren.db.TeamStatistics;
import org.junit.Test;
import static org.junit.Assert.*;

public class PredictionEngineTest {
    @Test
    public void testWinProbability() {
        TeamStatistics homeTeamStatistics = new TeamStatistics();
        TeamStatistics awayTeamStatistics = new TeamStatistics();
        PredictionEngine predictionEngine = new PredictionEngine();
        assertEquals(0, predictionEngine.winProbability(homeTeamStatistics, awayTeamStatistics), 0.00000001d);
    }
}
