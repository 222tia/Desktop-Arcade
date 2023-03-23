package edu.bsu.cs222.finalproject;

import RockPaperScissorsGame.RPSScoreKeeper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRPSScoreKeeper {

    @Test
    public void testUserScoreGainFrom0() {
        final String userPlay = "paper";
        final String computerPlay = "rock";
        final int userScore = 0;
        Assertions.assertEquals(1, RPSScoreKeeper.addUserScore(computerPlay, userPlay, userScore));
    }

    @Test
    public void testUserScoreGainFrom1() {
        final String userPlay = "scissors";
        final String computerPlay = "paper";
        final int userScore = 1;
        Assertions.assertEquals(2, RPSScoreKeeper.addUserScore(computerPlay, userPlay, userScore));
    }

    @Test
    public void testUserScoreGainFrom2() {
        final String userPlay = "rock";
        final String computerPlay = "scissors";
        final int userScore = 2;
        Assertions.assertEquals(3, RPSScoreKeeper.addUserScore(computerPlay, userPlay, userScore));
    }

    @Test
    public void testNoUserScoreRock() {
        final String userPlay = "rock";
        final String computerPlay = "paper";
        final int userScore = 0;
        Assertions.assertEquals(0, RPSScoreKeeper.addUserScore(computerPlay, userPlay, userScore));
    }

    @Test
    public void testNoUserScoreGainPaper() {
        final String userPlay = "paper";
        final String computerPlay = "scissors";
        final int userScore = 0;
        Assertions.assertEquals(0, RPSScoreKeeper.addUserScore(computerPlay, userPlay, userScore));
    }

    @Test
    public void testNoUserScoreGainScissors() {
        final String userPlay = "scissors";
        final String computerPlay = "rock";
        final int userScore = 0;
        Assertions.assertEquals(0, RPSScoreKeeper.addUserScore(computerPlay, userPlay, userScore));
    }

    @Test
    public void testComputerScoreGainFrom0() {
        final String userPlay = "rock";
        final String computerPlay = "paper";
        final int computerScore = 0;
        Assertions.assertEquals(1, RPSScoreKeeper.addComputerScore(computerPlay, userPlay, computerScore));
    }

    @Test
    public void testComputerScoreGainFrom1() {
        final String userPlay = "paper";
        final String computerPlay = "scissors";
        final int computerScore = 1;
        Assertions.assertEquals(2, RPSScoreKeeper.addComputerScore(computerPlay, userPlay, computerScore));
    }

    @Test
    public void testComputerScoreGainFrom2() {
        final String userPlay = "scissors";
        final String computerPlay = "rock";
        final int computerScore = 2;
        Assertions.assertEquals(3, RPSScoreKeeper.addComputerScore(computerPlay, userPlay, computerScore));
    }

    @Test
    public void testComputerScoreRock() {
        final String userPlay = "paper";
        final String computerPlay = "rock";
        final int computerScore = 0;
        Assertions.assertEquals(0, RPSScoreKeeper.addComputerScore(computerPlay, userPlay, computerScore));
    }

    @Test
    public void testComputerScoreGainPaper() {
        final String userPlay = "scissors";
        final String computerPlay = "paper";
        final int computerScore = 0;
        Assertions.assertEquals(0, RPSScoreKeeper.addComputerScore(computerPlay, userPlay, computerScore));
    }

    @Test
    public void testNoComputerScoreGainScissors() {
        final String userPlay = "rock";
        final String computerPlay = "scissors";
        final int computerScore = 0;
        Assertions.assertEquals(0, RPSScoreKeeper.addComputerScore(computerPlay, userPlay, computerScore));
    }

    @Test
    public void testUserWinsBy2(){
        final int computerScore = 0;
        final int userScore = 2;
        Assertions.assertTrue(RPSScoreKeeper.checkScore(userScore, computerScore));
    }

    @Test
    public void testUserWinsBy1(){
        final int computerScore = 2;
        final int userScore = 3;
        Assertions.assertTrue(RPSScoreKeeper.checkScore(userScore, computerScore));
    }
    @Test
    public void testComputerWinsBy2(){
        final int computerScore = 2;
        final int userScore = 0;
        Assertions.assertTrue(RPSScoreKeeper.checkScore(computerScore, userScore));
    }

    @Test
    public void testComputerWinsBy1(){
        final int computerScore = 3;
        final int userScore = 2;
        Assertions.assertTrue(RPSScoreKeeper.checkScore(computerScore, userScore));
    }
    @Test
    public void testNoWinnerEvenScore_ComputerScoreFirst(){
        final int computerScore = 2;
        final int userScore = 2;
        Assertions.assertFalse(RPSScoreKeeper.checkScore(computerScore, userScore));
    }

    @Test
    public void testNoWinnerEvenScore_UserScoreFirst(){
        final int computerScore = 2;
        final int userScore = 2;
        Assertions.assertFalse(RPSScoreKeeper.checkScore(userScore, computerScore));
    }

    @Test
    public void testNoWinnerUserScore1(){
        final int computerScore = 0;
        final int userScore = 1;
        Assertions.assertFalse(RPSScoreKeeper.checkScore(userScore, computerScore));
    }

    @Test
    public void testNoWinnerComputerScore1(){
        final int computerScore = 0;
        final int userScore = 1;
        Assertions.assertFalse(RPSScoreKeeper.checkScore(computerScore, userScore));
    }
}
