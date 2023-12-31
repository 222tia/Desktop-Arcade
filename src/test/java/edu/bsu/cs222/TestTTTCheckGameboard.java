package edu.bsu.cs222;

import edu.bsu.cs222.TTT.TTTCheckGameboard;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestTTTCheckGameboard {

    @Test
    public void testFirstRowWinX(){
        ArrayList<String> gameBoard = new ArrayList<>(Arrays.asList("X", "X", "X", " ", " ", " ", " ", " ", " "));
        String letter = "X";
        Assertions.assertTrue(TTTCheckGameboard.checkBoard(letter, gameBoard));
    }

    @Test
    public void testFirstRowWinO(){
        ArrayList<String> gameBoard = new ArrayList<>(Arrays.asList("O", "O", "O", " ", " ", " ", " ", " ", " "));
        String letter = "O";
        Assertions.assertTrue(TTTCheckGameboard.checkBoard(letter, gameBoard));
    }

    @Test
    public void testFirstRowWinFalse(){
        ArrayList<String> gameBoard = new ArrayList<>(Arrays.asList("O", " ", "O", " ", "X", " ", " ", " ", "X"));
        String letter = "O";
        Assertions.assertFalse(TTTCheckGameboard.checkBoard(letter, gameBoard));
    }

    @Test
    public void testDiagonalWinX(){
        ArrayList<String> gameBoard = new ArrayList<>(Arrays.asList("X", " ", " ", " ", "X", " ", " ", " ", "X"));
        String letter = "X";
        Assertions.assertTrue(TTTCheckGameboard.checkBoard(letter, gameBoard));
    }

    @Test
    public void testDiagonalWinO(){
        ArrayList<String> gameBoard = new ArrayList<>(Arrays.asList(" ", " ", "O", " ", "O", " ", "O", " ", " "));
        String letter = "O";
        Assertions.assertTrue(TTTCheckGameboard.checkBoard(letter, gameBoard));
    }

    @Test
    public void testDiagonalWinFalse(){
        ArrayList<String> gameBoard = new ArrayList<>(Arrays.asList(" ", " ", "X", " ", "O", " ", "O", "X", " "));
        String letter = "O";
        Assertions.assertFalse(TTTCheckGameboard.checkBoard(letter, gameBoard));
    }

    @Test
    public void testDrawTrue(){
        ArrayList<String> gameBoard = new ArrayList<>(Arrays.asList("X", "X", "O", "O", "O", "X", "X", "O", "X"));
        Assertions.assertTrue(TTTCheckGameboard.checkDraw(gameBoard));
    }

    @Test
    public void testDrawFalse(){
        ArrayList<String> gameBoard = new ArrayList<>(Arrays.asList("X", " ", "X", "O", "O", "X", "X", "O", "X"));
        Assertions.assertFalse(TTTCheckGameboard.checkDraw(gameBoard));
    }

    @Test
    public void testPlayerOneWin(){
        ArrayList<String> gameBoard = new ArrayList<>(Arrays.asList("X", " ", "O", "O", "X", " ", " ", "O", "X"));
        String playerOneLetter = "X";
        Assertions.assertTrue(TTTCheckGameboard.checkBoard(playerOneLetter, gameBoard));
    }

    @Test
    public void testPlayerTwoWin(){
        ArrayList<String> gameBoard = new ArrayList<>(Arrays.asList(" ", " ", "O", " ", "X", "O", " ", "X", "O"));
        String playerTwoLetter = "O";
        Assertions.assertTrue(TTTCheckGameboard.checkBoard(playerTwoLetter, gameBoard));
    }
}

