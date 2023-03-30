package edu.bsu.cs222.finalproject;

import edu.bsu.cs222.finalproject.DesktopArcadeDialogue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class TTTGame {

    public static ArrayList<String> gameBoard = new ArrayList<>(
            Arrays.asList(" "," "," "," "," "," "," "," "," "));
    public static final String userLetter = "X";
    public static final String compLetter = "O";
    static int userPlay;
    static int compPlay;
    public static void playTTT() throws IOException {
//        ArrayList<String> Board =TTTGameBoard.gameBoard();
//        I think we can just declare the arraylist as a variable in the class instead of having a
//        method to return it, but I left it commented out in case I'm wrong
        boolean userWin;
        boolean compWin;
        do {
            TTTDialogue.Instructions();
            boolean openSpace;
            do {
                userPlay = TTTTurnMove.getUserTurnMove();
                openSpace = TTTGameBoard.emptySpaceCheck(gameBoard, userPlay);
                if (!openSpace) {
                    TTTDialogue.improperSpace();
                }
            } while (!openSpace);

            TTTGameBoard.showUpdatedGameBoard(gameBoard, userPlay, userLetter);
            userWin = TTTGetResults.checkBoard(userLetter, gameBoard);
            DesktopArcadeDialogue.EnterContinue();
            if(userWin){
                TTTDialogue.userWinDialogue();
            }
            compPlay = TTTTurnMove.getCompTurnMove(gameBoard);
            TTTGameBoard.showUpdatedGameBoard(gameBoard, compPlay, compLetter);
            compWin = TTTGetResults.checkBoard(compLetter, gameBoard);
            if(compWin){
                TTTDialogue.compWinDialogue();
            }
        }while((!userWin)&&(!compWin));

    }
}
