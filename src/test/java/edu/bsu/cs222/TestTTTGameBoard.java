package edu.bsu.cs222;

import edu.bsu.cs222.TTT.TTTGameBoard;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestTTTGameBoard {
    @Test
    public void testEmptySpaceCheckFalse(){
        ArrayList<String> gameBoard = new ArrayList<>(Arrays.asList("X", " ", " ", " ", " ", " ", " ", " ", " "));
        int play = 0;
        Assertions.assertFalse(TTTGameBoard.emptySpaceCheck(gameBoard,play));
    }

    @Test
    public void testEmptySpaceCheckTrue(){
        ArrayList<String> gameBoard = new ArrayList<>(Arrays.asList("X", " ", " ", " ", " ", " ", " ", " ", " "));
        int play = 1;
        Assertions.assertTrue(TTTGameBoard.emptySpaceCheck(gameBoard,play));
    }

    @Test
    public void testUpdateGameBoard(){
        int play = 0;
        String letter = "X";
        ArrayList<String> gameBoard = new ArrayList<>(Arrays.asList(" ", " ", " ", " ", " ", " ", " ", " ", " "));
        ArrayList<String> expectedUpdatedGameBoard = new ArrayList<>(Arrays.asList("X", " ", " ", " ", " ", " ", " ", " ", " "));
        ArrayList<String> updatedGameBoard = TTTGameBoard.updateGameBoard(gameBoard, play, letter);
        Assertions.assertEquals(expectedUpdatedGameBoard, updatedGameBoard);
    }

    @Test
    public void testUpdateFilledGameBoard(){
        int play = 8;
        String letter = "X";
        ArrayList<String> gameBoard = new ArrayList<>(Arrays.asList("O", "X", " ", "X", " ", " ", " ", "0", " "));
        ArrayList<String> expectedUpdatedGameBoard = new ArrayList<>(Arrays.asList("O", "X", " ", "X", " ", " ", " ", "0", "X"));
        ArrayList<String> updatedGameBoard = TTTGameBoard.updateGameBoard(gameBoard, play, letter);
        Assertions.assertEquals(expectedUpdatedGameBoard, updatedGameBoard);
    }
}

