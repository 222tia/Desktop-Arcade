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
    public static void playTTTMulti() throws IOException {

        System.out.println(TTTDialogue.letterChoiceDialogueMulti());
        String userOneLetter = TTTTurnMove.letterChoice();

        playerTwoLetter=TTTTurnMove.getLetter(userOneLetter);

        System.out.println(TTTDialogue.showMultiplayerLetterChoice(userOneLetter, playerTwoLetter));

        do {

            System.out.println(TTTDialogue.inputInstructionsMulti("Player 1"));
            playerOnePlay = TTTTurnMove.getUserMove(gameBoard);
            TTTGameBoard.showUpdatedGameBoard(gameBoard, playerOnePlay, userOneLetter);

            playerOneWin = TTTCheckGameboard.checkBoard(userOneLetter, gameBoard);
            draw = TTTCheckGameboard.checkDraw(gameBoard);

            TTTDialogue.gameOutcomeDialogueMulti(draw, playerOneWin, "Player 1");
            if (draw || playerOneWin) {
                System.exit(0);
            }

            DesktopArcadeDialogue.EnterContinue();

            System.out.println(TTTDialogue.inputInstructionsMulti("Player 2"));
            playerTwoPlay = TTTTurnMove.getUserMove(gameBoard);
            TTTGameBoard.showUpdatedGameBoard(gameBoard, playerTwoPlay, playerTwoLetter);

            playerTwoWin = TTTCheckGameboard.checkBoard(playerTwoLetter, gameBoard);
            draw = TTTCheckGameboard.checkDraw(gameBoard);

            TTTDialogue.gameOutcomeDialogueMulti(draw, playerTwoWin, "Player 2");
            if (draw || playerTwoWin) {
                System.exit(0);
            }

            DesktopArcadeDialogue.EnterContinue();

        } while (Continue);

    }
}
