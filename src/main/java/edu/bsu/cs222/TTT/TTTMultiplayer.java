package edu.bsu.cs222.TTT;

import edu.bsu.cs222.DesktopArcadeDialogue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings("LoopConditionNotUpdatedInsideLoop")

public class TTTMultiplayer {

    public static final ArrayList<String> gameBoard = new ArrayList<>(
            Arrays.asList(" "," "," "," "," "," "," "," "," "));
    static int playerOnePlay;
    static int playerTwoPlay;
    static boolean playerOneWin = false;
    static boolean playerTwoWin = false;
    static boolean draw = false;
    static final boolean Continue = true;
    static String playerTwoLetter;
    static final int playerNumber = 2;
    public static void playTTTMulti() throws IOException {

        System.out.println(TTTDialogue.letterChoiceDialogue(playerNumber));
        String userOneLetter = TTTTurnMove.letterChoice();

        playerTwoLetter=TTTTurnMove.getLetter(userOneLetter);

        System.out.println(TTTDialogue.showMultiplayerLetterChoice(userOneLetter, playerTwoLetter));

        do {

            System.out.println(TTTDialogue.inputInstructions(playerNumber, "Player 1"));
            playerOnePlay = TTTTurnMove.getUserMove(gameBoard);
            TTTGameBoard.showUpdatedGameBoard(gameBoard, playerOnePlay, userOneLetter);

            playerOneWin = TTTCheckGameboard.checkBoard(userOneLetter, gameBoard);
            draw = TTTCheckGameboard.checkDraw(gameBoard);

            System.out.println(TTTDialogue.gameOutcomeDialogue(draw, playerOneWin, "Player 1"));
            if (draw || playerOneWin) {
                System.exit(0);
            }

            DesktopArcadeDialogue.enterContinue();

            System.out.println(TTTDialogue.inputInstructions(playerNumber, "Player 2"));
            playerTwoPlay = TTTTurnMove.getUserMove(gameBoard);
            TTTGameBoard.showUpdatedGameBoard(gameBoard, playerTwoPlay, playerTwoLetter);

            playerTwoWin = TTTCheckGameboard.checkBoard(playerTwoLetter, gameBoard);
            draw = TTTCheckGameboard.checkDraw(gameBoard);

            System.out.println(TTTDialogue.gameOutcomeDialogue(draw, playerTwoWin, "Player 2"));
            if (draw || playerTwoWin) {
                System.exit(0);
            }

            DesktopArcadeDialogue.enterContinue();

        } while (Continue);

    }
}
