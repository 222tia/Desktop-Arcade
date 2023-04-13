package edu.bsu.cs222;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class TTTGame {

    public static final ArrayList<String> gameBoard = new ArrayList<>(
            Arrays.asList(" "," "," "," "," "," "," "," "," "));
    static int userPlay;
    static int compPlay;
    static boolean userWin;
    static boolean compWin;
    static boolean draw;
    static String compLetter;
    public static void playTTT() throws IOException {
        String userLetter = TTTTurnMove.letterChoice();
        if (userLetter.equals("O")){
            compLetter="X";
        }
        else{
            compLetter="O";
        }
        do {
            TTTDialogue.inputInstructions();
            boolean openSpace;
            do {
                userPlay = TTTTurnMove.getUserMove();
                openSpace = TTTGameBoard.emptySpaceCheck(gameBoard, userPlay);
                if (!openSpace) {
                    TTTDialogue.improperSpace();
                }
            } while (!openSpace);

            TTTGameBoard.showUpdatedGameBoard(gameBoard, userPlay, userLetter);
            userWin = TTTGetResults.checkBoard(userLetter, gameBoard);
            if(!userWin){
                draw = TTTGetResults.checkDraw(gameBoard);
            }
            DesktopArcadeDialogue.EnterContinue();

            if(userWin){
                TTTDialogue.userWinDialogue();
            }
            if(draw){
                TTTDialogue.drawOutcomeDialogue();
            }

            TTTDialogue.compTurn();
            compPlay = TTTTurnMove.getCompTurnMove(gameBoard, compLetter, userLetter);
            TTTGameBoard.showUpdatedGameBoard(gameBoard, compPlay, compLetter);
            compWin = TTTGetResults.checkBoard(compLetter, gameBoard);
            if(!compWin){
                draw = TTTGetResults.checkDraw(gameBoard);
            }
            DesktopArcadeDialogue.EnterContinue();

            if(compWin){
                TTTDialogue.compWinDialogue();
            }
            if(draw){
                TTTDialogue.drawOutcomeDialogue();
            }

        }while((!userWin)&&(!compWin));

    }
}
