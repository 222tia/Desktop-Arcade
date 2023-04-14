package edu.bsu.cs222;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class TTTGame {

    public static final ArrayList<String> gameBoard = new ArrayList<>(
            Arrays.asList(" "," "," "," "," "," "," "," "," "));
    static int userPlay;
    static int compPlay;
    static boolean userWin=false;
    static boolean compWin=false;
    static boolean draw=false;
    static boolean Continue=true;
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
            System.out.println(TTTDialogue.inputInstructions());
            boolean openSpace;
            do {
                userPlay = TTTTurnMove.getUserMove();
                openSpace = TTTGameBoard.emptySpaceCheck(gameBoard, userPlay);
                if (!openSpace) {
                    System.out.println(TTTDialogue.improperSpace());
                }
            } while (!openSpace);

            TTTGameBoard.showUpdatedGameBoard(gameBoard, userPlay, userLetter);
            userWin = TTTGetResults.checkBoard(userLetter, gameBoard);
            if(!userWin){
                draw = TTTGetResults.checkDraw(gameBoard);
            }
            DesktopArcadeDialogue.EnterContinue();

            if(userWin){
                System.out.println(TTTDialogue.userWinDialogue());
                System.exit(0);
            }
            if(draw){
                System.out.println(TTTDialogue.drawOutcomeDialogue());
                System.exit(0);
            }

            System.out.println(TTTDialogue.compTurn());
            compPlay = TTTTurnMove.getCompTurnMove(gameBoard, compLetter, userLetter);
            TTTGameBoard.showUpdatedGameBoard(gameBoard, compPlay, compLetter);
            compWin = TTTGetResults.checkBoard(compLetter, gameBoard);
            if(!compWin){
                draw = TTTGetResults.checkDraw(gameBoard);
            }

            if(compWin){
                System.out.println(TTTDialogue.compWinDialogue());
                System.exit(0);
            }
            if(draw){
                System.out.println(TTTDialogue.drawOutcomeDialogue());
                System.exit(0);
            }
            DesktopArcadeDialogue.EnterContinue();
        }while(Continue);

    }
}
