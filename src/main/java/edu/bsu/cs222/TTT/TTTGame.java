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

            playerOnePlay = TTTTurnMove.getUserMove(gameBoard);
            TTTGameBoard.showUpdatedGameBoard(gameBoard, playerOnePlay, userLetter);

            playerOneWin = TTTCheckGameboard.checkBoard(userLetter, gameBoard);
            draw = TTTCheckGameboard.checkDraw(gameBoard);

            TTTDialogue.gameOutcomeDialogue(draw, playerOneWin);
            if (draw || playerOneWin) {
                System.exit(0);
            }

            DesktopArcadeDialogue.EnterContinue();

            System.out.println(TTTDialogue.compTurn());

            playerTwoPlay = TTTTurnMove.getCompTurnMove(gameBoard, playerTwoLetter, userLetter);
            TTTGameBoard.showUpdatedGameBoard(gameBoard, playerTwoPlay, playerTwoLetter);

            playerTwoWin = TTTCheckGameboard.checkBoard(playerTwoLetter, gameBoard);
            draw = TTTCheckGameboard.checkDraw(gameBoard);

            TTTDialogue.gameOutcomeDialogue(draw, playerTwoWin);
            if (draw || playerTwoWin) {
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
            playerOnePlay = TTTTurnMove.getUserMove(gameBoard);
            TTTGameBoard.showUpdatedGameBoard(gameBoard, playerOnePlay, userOneLetter);

            playerOneWin = TTTCheckGameboard.checkBoard(userOneLetter, gameBoard);
            draw = TTTCheckGameboard.checkDraw(gameBoard);

            TTTDialogue.gameOutcomeDialogue(draw, playerOneWin);
            if (draw || playerOneWin) {
                System.exit(0);
            }

            DesktopArcadeDialogue.EnterContinue();

            System.out.println(TTTDialogue.multiplayerInputInstructions("Player 2"));
            playerTwoPlay = TTTTurnMove.getUserMove(gameBoard);
            TTTGameBoard.showUpdatedGameBoard(gameBoard, playerTwoPlay, playerTwoLetter);

            playerTwoWin = TTTCheckGameboard.checkBoard(playerTwoLetter, gameBoard);
            draw = TTTCheckGameboard.checkDraw(gameBoard);

            TTTDialogue.gameOutcomeDialogue(draw, playerTwoWin);
            if (draw || playerTwoWin) {
                System.exit(0);
            }

            DesktopArcadeDialogue.EnterContinue();

        } while (Continue);

    }


}
