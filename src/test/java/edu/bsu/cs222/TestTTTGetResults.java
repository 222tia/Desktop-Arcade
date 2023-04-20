package edu.bsu.cs222;

import edu.bsu.cs222.TTT.TTTGetResults;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestTTTGetResults {

    @Test
    public void testFirstRowWinX(){
        ArrayList<String> gameBoard = new ArrayList<>(Arrays.asList("X", "X", "X", " ", " ", " ", " ", " ", " "));
        String letter = "X";
        Assertions.assertTrue(TTTGetResults.checkBoard(letter, gameBoard));
    }

    @Test
    public void testFirstRowWinO(){
        ArrayList<String> gameBoard = new ArrayList<>(Arrays.asList("O", "O", "O", " ", " ", " ", " ", " ", " "));
        String letter = "O";
        Assertions.assertTrue(TTTGetResults.checkBoard(letter, gameBoard));
    }

    @Test
    public void testFirstRowWinFalse(){
        ArrayList<String> gameBoard = new ArrayList<>(Arrays.asList("O", " ", "O", " ", "X", " ", " ", " ", "X"));
        String letter = "O";
        Assertions.assertFalse(TTTGetResults.checkBoard(letter, gameBoard));
    }

    @Test
    public void testDiagonalWinX(){
        ArrayList<String> gameBoard = new ArrayList<>(Arrays.asList("X", " ", " ", " ", "X", " ", " ", " ", "X"));
        String letter = "X";
        Assertions.assertTrue(TTTGetResults.checkBoard(letter, gameBoard));
    }

    @Test
    public void testDiagonalWinO(){
        ArrayList<String> gameBoard = new ArrayList<>(Arrays.asList(" ", " ", "O", " ", "O", " ", "O", " ", " "));
        String letter = "O";
        Assertions.assertTrue(TTTGetResults.checkBoard(letter, gameBoard));
    }

    @Test
    public void testDiagonalWinFalse(){
        ArrayList<String> gameBoard = new ArrayList<>(Arrays.asList(" ", " ", "X", " ", "O", " ", "O", "X", " "));
        String letter = "O";
        Assertions.assertFalse(TTTGetResults.checkBoard(letter, gameBoard));
    }

    @Test
    public void testDrawTrue(){
        ArrayList<String> gameBoard = new ArrayList<>(Arrays.asList("X", "X", "O", "O", "O", "X", "X", "O", "X"));
        Assertions.assertTrue(TTTGetResults.checkDraw(gameBoard));
    }

    @Test
    public void testDrawFalse(){
        ArrayList<String> gameBoard = new ArrayList<>(Arrays.asList("X", " ", "X", "O", "O", "X", "X", "O", "X"));
        Assertions.assertFalse(TTTGetResults.checkDraw(gameBoard));
    }
}

