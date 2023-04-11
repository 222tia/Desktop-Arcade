package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestTTTTurnLogic {
    @Test
    public void testRowLogic() {
        ArrayList<String> gameBoard = new ArrayList<>(Arrays.asList("X", "X", " ", " ", " ", " ", " ", " ", " "));
        String letter = "X";
        int expectedComPlay = 2;
        Assertions.assertEquals(expectedComPlay, TTTTurnLogic.TurnLogicCheck(gameBoard, letter));
    }

    @Test
    public void testDiagonalLogic() {
        ArrayList<String> gameBoard = new ArrayList<>(Arrays.asList("X", " ", " ", " ", "X", " ", " ", " ", " "));
        String letter = "X";
        int expectedComPlay = 8;
        Assertions.assertEquals(expectedComPlay, TTTTurnLogic.TurnLogicCheck(gameBoard, letter));
    }

    @Test
    public void testColumnLogic() {
        ArrayList<String> gameBoard = new ArrayList<>(Arrays.asList("X", " ", " ", "X", " ", " ", " ", " ", " "));
        String letter = "X";
        int expectedComPlay = 6;
        Assertions.assertEquals(expectedComPlay, TTTTurnLogic.TurnLogicCheck(gameBoard, letter));
    }

}