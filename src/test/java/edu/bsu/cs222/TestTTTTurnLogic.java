package edu.bsu.cs222;

import edu.bsu.cs222.TTT.TTTTurnLogic;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestTTTTurnLogic {
    @Test
    public void testRowLogicFirstRow() {
        ArrayList<String> gameBoard = new ArrayList<>(Arrays.asList("X", "X", " ", " ", " ", " ", " ", " ", " "));
        String letter = "X";
        int expectedComPlay = 2;
        Assertions.assertEquals(expectedComPlay, TTTTurnLogic.turnLogicCheck(gameBoard, letter));
    }

    @Test
    public void testRowLogicSecondRow() {
        ArrayList<String> gameBoard = new ArrayList<>(Arrays.asList(" ", " ", " ", "X", "X", " ", " ", " ", " "));
        String letter = "X";
        int expectedComPlay = 5;
        Assertions.assertEquals(expectedComPlay, TTTTurnLogic.turnLogicCheck(gameBoard, letter));
    }

    @Test
    public void testRowLogicThirdRow() {
        ArrayList<String> gameBoard = new ArrayList<>(Arrays.asList(" ", " ", " ", " ", " ", " ", "X", "X", " "));
        String letter = "X";
        int expectedComPlay = 8;
        Assertions.assertEquals(expectedComPlay, TTTTurnLogic.turnLogicCheck(gameBoard, letter));
    }

    @Test
    public void testDiagonalLogicLeft() {
        ArrayList<String> gameBoard = new ArrayList<>(Arrays.asList("X", " ", " ", " ", "X", " ", " ", " ", " "));
        String letter = "X";
        int expectedComPlay = 8;
        Assertions.assertEquals(expectedComPlay, TTTTurnLogic.turnLogicCheck(gameBoard, letter));
    }

    @Test
    public void testDiagonalLogicRight() {
        ArrayList<String> gameBoard = new ArrayList<>(Arrays.asList(" ", " ", " ", " ", "X", " ", " ", " ", "X"));
        String letter = "X";
        int expectedComPlay = 0;
        Assertions.assertEquals(expectedComPlay, TTTTurnLogic.turnLogicCheck(gameBoard, letter));
    }

    @Test
    public void testColumnLogicLeft() {
        ArrayList<String> gameBoard = new ArrayList<>(Arrays.asList("X", " ", " ", "X", " ", " ", " ", " ", " "));
        String letter = "X";
        int expectedComPlay = 6;
        Assertions.assertEquals(expectedComPlay, TTTTurnLogic.turnLogicCheck(gameBoard, letter));
    }

    @Test
    public void testColumnLogicCenter() {
        ArrayList<String> gameBoard = new ArrayList<>(Arrays.asList(" ", "X", " ", " ", "X", " ", " ", " ", " "));
        String letter = "X";
        int expectedComPlay = 7;
        Assertions.assertEquals(expectedComPlay, TTTTurnLogic.turnLogicCheck(gameBoard, letter));
    }

    @Test
    public void testColumnLogicRight() {
        ArrayList<String> gameBoard = new ArrayList<>(Arrays.asList(" ", " ", "X", " ", " ", "X", " ", " ", " "));
        String letter = "X";
        int expectedComPlay = 8;
        Assertions.assertEquals(expectedComPlay, TTTTurnLogic.turnLogicCheck(gameBoard, letter));
    }

    @Test
    public void testRandomLogic(){
        ArrayList<String> gameBoard = new ArrayList<>(Arrays.asList("X", " ", " ", " ", " ", " ", " ", "X", " "));
        String letter = "X";
        int expectedComPlay = 9;
        Assertions.assertEquals(expectedComPlay, TTTTurnLogic.rowsAILogic(letter, gameBoard));
    }

}