package edu.bsu.cs222.finalproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.List;

public class TestTTTTurnMove {
    private final static List<Integer> possibleMoves = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

    @Test
    public void testGetRandomMove() {
        final int randomMove = TTTTurnMove.getRandomMove();
        Assertions.assertTrue(possibleMoves.contains(randomMove));
    }

    @Test
    public void testGetRandomMoveFails() {
        final int randomMove = 10;
        Assertions.assertFalse(possibleMoves.contains(randomMove));
    }

    @Test
    public void testUserInput2() {
        final String input = "2";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        final int expectedOutput = 1;
        Assertions.assertEquals(expectedOutput, TTTTurnMove.getUserMove());
    }

    @Test
    public void testUserInput9() {
        final String input = "9";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        final int expectedOutput = 8;
        Assertions.assertEquals(expectedOutput, TTTTurnMove.getUserMove());
    }
}
