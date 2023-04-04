package edu.bsu.cs222.finalproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestTTTTurnMove {
    private final static List<Integer> possibleMoves = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8);

    @Test
    public void testGetRandomMove() {
        final int randomMove = TTTTurnMove.getRandomMove();
        Assertions.assertTrue(possibleMoves.contains(randomMove));
    }

    @Test
    public void testGetRandomMoveFails() {
        final int randomMove = 9;
        Assertions.assertFalse(possibleMoves.contains(randomMove));
    }

    @Test
    public void testGetCompTurnMove(){
        ArrayList<String> gameBoard = new ArrayList<>(Arrays.asList("X", " ", " ", " ", " ", " ", " ", " ", " "));
        final String compLetter = "O";
        final String userLetter = "X";
        final int compTurn = TTTTurnMove.getCompTurnMove(gameBoard, compLetter, userLetter);
        Assertions.assertTrue(possibleMoves.contains(compTurn));
    }

    @Test
    public void testUserInput2() {
        final String input = "2";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        final int output = 1;
        Assertions.assertEquals(output, TTTTurnMove.getUserMove());
    }

    @Test
    public void testUserInput9() {
        final String input = "9";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        final int output = 8;
        Assertions.assertEquals(output, TTTTurnMove.getUserMove());
    }

    @Test
    public void testLetterChoiceX(){
        final String input = "x";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        final String letter = "X";
        Assertions.assertEquals(letter, TTTTurnMove.letterChoice());
    }

    @Test
    public void testLetterChoice0(){
        final String input = "o";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        final String letter = "O";
        Assertions.assertEquals(letter, TTTTurnMove.letterChoice());
    }
}
