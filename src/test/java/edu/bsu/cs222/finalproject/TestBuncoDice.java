package edu.bsu.cs222.finalproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBuncoDice {
    @Test
    public void testDiceRollOutput(){
        final int randomDiceRoll = BuncoDice.DiceRoll();
        Assertions.assertTrue(randomDiceRoll <= 6);
    }

    @Test
    public void testScore1Point(){
        int score =0;
        int round = 1;
        int die1 = 1;
        int die2 = 2;
        int die3 = 2;
        score = BuncoDice.Scoring(score, round, die1, die2, die3);
        Assertions.assertEquals(1, score);
    }

    @Test
    public void testScore2Point(){
        int score =0;
        int round = 1;
        int die1 = 1;
        int die2 = 1;
        int die3 = 2;
        score = BuncoDice.Scoring(score, round, die1, die2, die3);
        Assertions.assertEquals(2, score);
    }

    @Test
    public void testScoreTriples(){
        int score =0;
        int round = 1;
        int die1 = 2;
        int die2 = 2;
        int die3 = 2;
        score = BuncoDice.Scoring(score, round, die1, die2, die3);
        Assertions.assertEquals(5, score);
    }

    @Test
    public void testScoreBunco(){
        int score =0;
        int round = 2;
        int die1 = 2;
        int die2 = 2;
        int die3 = 2;
        score = BuncoDice.Scoring(score, round, die1, die2, die3);
        Assertions.assertEquals(21, score);
    }
}
