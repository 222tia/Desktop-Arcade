package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

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
        List<Integer> diceRollList = List.of(1, 2, 2);
        score = BuncoDice.Scoring(score, round, diceRollList);
        Assertions.assertEquals(1, score);
    }

    @Test
    public void testScore2Point(){
        int score =0;
        int round = 1;
        List<Integer> diceRollList = List.of(1, 1, 2);
        score = BuncoDice.Scoring(score, round, diceRollList);
        Assertions.assertEquals(2, score);
    }

    @Test
    public void testScoreTriples(){
        int score =0;
        int round = 1;
        List<Integer> diceRollList = List.of(2, 2, 2);
        score = BuncoDice.Scoring(score, round, diceRollList);
        Assertions.assertEquals(5, score);
    }

    @Test
    public void testScoreBunco(){
        int score =0;
        int round = 2;
        List<Integer> diceRollList = List.of(2, 2, 2);
        score = BuncoDice.Scoring(score, round, diceRollList);
        Assertions.assertEquals(21, score);
    }

    @Test
    public void testGetDiceRolls(){
        List<Integer> diceRollList = BuncoDice.getDiceRolls();

        for (int i = 0; i < 3; i++){
            Assertions.assertTrue(diceRollList.get(i) <= 6);
        }
    }
}
