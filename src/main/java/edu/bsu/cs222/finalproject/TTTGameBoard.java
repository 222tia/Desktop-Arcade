package edu.bsu.cs222.finalproject;

import java.util.ArrayList;

public class TTTGameBoard {

    public static boolean emptySpaceCheck(ArrayList<String> gameBoard, int play){
        String b = gameBoard.get(play);
        return b.equals(" ");
    }

    public static ArrayList<String> updateGameBoard(ArrayList<String> gameBoard, int play, String letter){
        gameBoard.set(play, letter);
        return gameBoard;
    }

    public static void showUpdatedGameBoard(ArrayList<String> gameBoard, int play, String letter){
        ArrayList<String> updatedGameBoard = updateGameBoard(gameBoard, play, letter);
        TTTDialogue.showGameBoard(updatedGameBoard);
    }

}
