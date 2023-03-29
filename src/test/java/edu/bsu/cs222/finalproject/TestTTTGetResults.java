package edu.bsu.cs222.finalproject;

import TicTacToe.TTTGetResults;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestTTTGetResults {

    @Test
    public void testFirstRowWin(){
        ArrayList<String> gameBoard = new ArrayList<>(Arrays.asList("X", "X", "X", " ", " ", " ", " ", " ", " "));
        String letter = "X";
        Assertions.assertTrue(TTTGetResults.checkBoard(letter, gameBoard));
    }
}
