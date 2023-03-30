package edu.bsu.cs222.finalproject;

import java.util.ArrayList;
import java.util.Arrays;

public class TTTGame {

    public static ArrayList<String> gameBoard = new ArrayList<>(
            Arrays.asList(" "," "," "," "," "," "," "," "," "));
    public static final String userLetter = "X";
    public static final String compLetter = "O";
    static int userPlay;
    static int compPlay;
    public static void playTTT(){
//        ArrayList<String> Board =TTTGameBoard.gameBoard();
//        I think we can just declare the arraylist as a variable in the class instead of having a
//        method to return it, but I left it commented out in case I'm wrong
        TTTDialogue.Instructions();
        boolean openSpace;
        do {
            userPlay = TTTTurnMove.getUserTurnMove();
            openSpace = TTTGameBoard.emptySpaceCheck(gameBoard, userPlay);
            if (!openSpace) {
                TTTDialogue.improperSpace();
            }
        }while (!openSpace);

        TTTGameBoard.showUpdatedGameBoard(gameBoard, userPlay, userLetter);

        compPlay = TTTTurnMove.getCompTurnMove(gameBoard);
        TTTGameBoard.showUpdatedGameBoard(gameBoard, compPlay, compLetter);

    }
}
