package edu.bsu.cs222.TTT;

import edu.bsu.cs222.DesktopArcadeDialogue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings("LoopConditionNotUpdatedInsideLoop")
public class TTTGame {

    public static final ArrayList<String> gameBoard = new ArrayList<>(
            Arrays.asList(" "," "," "," "," "," "," "," "," "));
    static int playerOnePlay;
    static int playerTwoPlay;
    static boolean playerOneWin = false;
    static boolean playerTwoWin = false;
    static boolean draw = false;
    static final boolean Continue = true;
    static String playerTwoLetter;
    public static void playTTTSingle() throws IOException {

        System.out.println(TTTDialogue.letterChoiceDialogue());
        String userLetter = TTTTurnMove.letterChoice();

        if (userLetter.equals("O")){
            playerTwoLetter ="X";
        }
        else{
            playerTwoLetter ="O";
        }

        do {

            System.out.println(TTTDialogue.inputInstructions());

            boolean openSpace;
            do {
                playerOnePlay = TTTTurnMove.getUserMove();
                openSpace = TTTGameBoard.emptySpaceCheck(gameBoard, playerOnePlay);
                if (!openSpace) {
                    System.out.println(TTTDialogue.improperSpace());
                }
            } while (!openSpace);

            TTTGameBoard.showUpdatedGameBoard(gameBoard, playerOnePlay, userLetter);
            playerOneWin = TTTGetResults.checkBoard(userLetter, gameBoard);
            if(!playerOneWin){
                draw = TTTGetResults.checkDraw(gameBoard);
            }

            DesktopArcadeDialogue.EnterContinue();

            if(playerOneWin){
                System.out.println(TTTDialogue.userWinDialogue());
                System.exit(0);
            }
            if(draw){
                System.out.println(TTTDialogue.drawOutcomeDialogue());
                System.exit(0);
            }

            System.out.println(TTTDialogue.compTurn());
            playerTwoPlay = TTTTurnMove.getCompTurnMove(gameBoard, playerTwoLetter, userLetter);
            TTTGameBoard.showUpdatedGameBoard(gameBoard, playerTwoPlay, playerTwoLetter);
            playerTwoWin = TTTGetResults.checkBoard(playerTwoLetter, gameBoard);

            if(!playerTwoWin){
                draw = TTTGetResults.checkDraw(gameBoard);
            }
            if(playerTwoWin){
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

    public static void playTTTMulti() throws IOException {

        System.out.println(TTTDialogue.multiplayerLetterChoiceDialogue());
        String userOneLetter = TTTTurnMove.letterChoice();

        if (userOneLetter.equals("O")) {
            playerTwoLetter = "X";
        } else {
            playerTwoLetter = "O";
        }

        System.out.println(TTTDialogue.showMultiplayerLetterChoice(userOneLetter, playerTwoLetter));

        do {

            System.out.println(TTTDialogue.multiplayerInputInstructions("Player 1"));

            boolean openSpace;
            do {
                playerOnePlay = TTTTurnMove.getUserMove();
                openSpace = TTTGameBoard.emptySpaceCheck(gameBoard, playerOnePlay);
                if (!openSpace) {
                    System.out.println(TTTDialogue.improperSpace());
                }
            } while (!openSpace);

            TTTGameBoard.showUpdatedGameBoard(gameBoard, playerOnePlay, userOneLetter);
            playerOneWin = TTTGetResults.checkBoard(userOneLetter, gameBoard);
            if (!playerOneWin) {
                draw = TTTGetResults.checkDraw(gameBoard);
            }

            DesktopArcadeDialogue.EnterContinue();

            if (playerOneWin) {
                System.out.println(TTTDialogue.userOneWinDialogue());
                System.exit(0);
            }
            if (draw) {
                System.out.println(TTTDialogue.drawOutcomeDialogue());
                System.exit(0);
            }

            System.out.println(TTTDialogue.multiplayerInputInstructions("Player 2"));
            do {
                playerTwoPlay = TTTTurnMove.getUserMove();
                openSpace = TTTGameBoard.emptySpaceCheck(gameBoard, playerTwoPlay);
                if (!openSpace) {
                    System.out.println(TTTDialogue.improperSpace());
                }
            } while (!openSpace);

            TTTGameBoard.showUpdatedGameBoard(gameBoard, playerTwoPlay, playerTwoLetter);
            playerTwoWin = TTTGetResults.checkBoard(playerTwoLetter, gameBoard);

            if (!playerTwoWin) {
                draw = TTTGetResults.checkDraw(gameBoard);
            }
            if (playerTwoWin) {
                System.out.println(TTTDialogue.userTwoWinDialogue());
                System.exit(0);
            }
            if (draw) {
                System.out.println(TTTDialogue.drawOutcomeDialogue());
                System.exit(0);
            }

            DesktopArcadeDialogue.EnterContinue();

        } while (Continue);

    }


}
