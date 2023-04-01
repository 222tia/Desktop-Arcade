package edu.bsu.cs222.finalproject;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class TTTGame {

    public static ArrayList<String> gameBoard = new ArrayList<>(
            Arrays.asList(" "," "," "," "," "," "," "," "," "));

    static int userPlay;
    static int compPlay;
    public static void playTTT() throws IOException {

        boolean userWin;
        boolean compWin;
        String compLetter;
        String userLetter = TTTTurnMove.XorOChoice();
        if (userLetter.equals("O")){
            compLetter="X";
        }
        else{
            compLetter="O";
        }
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

            compPlay = TTTTurnMove.getCompTurnMove(gameBoard, compLetter);
            TTTGameBoard.showUpdatedGameBoard(gameBoard, compPlay, compLetter);
            compWin = TTTGetResults.checkBoard(compLetter, gameBoard);

            if(compWin){
                TTTDialogue.compWinDialogue();
            }

        }while((!userWin)&&(!compWin));

    }
}
