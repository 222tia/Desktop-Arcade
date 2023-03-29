package edu.bsu.cs222.finalproject;

import TicTacToe.TTTGameBoard;
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
}
