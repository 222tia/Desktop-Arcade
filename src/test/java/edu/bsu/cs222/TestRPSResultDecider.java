package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRPSResultDecider {
    @Test
    public void testUserWinConditionPaper() {
        final String userPlay = "paper";
        final String computerPlay = "rock";
        Assertions.assertTrue(RPSResultDecider.winCondition(userPlay,computerPlay));
    }

    @Test
    public void testUserWinConditionRock() {
        final String userPlay = "rock";
        final String computerPlay = "scissors";
        Assertions.assertTrue(RPSResultDecider.winCondition(userPlay,computerPlay));
    }

    @Test
    public void testUserWinConditionScissors() {
        final String userPlay = "scissors";
        final String computerPlay = "paper";
        Assertions.assertTrue(RPSResultDecider.winCondition(userPlay,computerPlay));
    }

    @Test
    public void testUserLoseConditionPaper() {
        final String userPlay = "paper";
        final String computerPlay = "scissors";
        Assertions.assertFalse(RPSResultDecider.winCondition(userPlay,computerPlay));
    }

    @Test
    public void testUserLoseConditionRock() {
        final String userPlay = "rock";
        final String computerPlay = "paper";
        Assertions.assertFalse(RPSResultDecider.winCondition(userPlay,computerPlay));
    }

    @Test
    public void testUserLoseConditionScissors() {
        final String userPlay = "scissors";
        final String computerPlay = "rock";
        Assertions.assertFalse(RPSResultDecider.winCondition(userPlay,computerPlay));
    }

}
