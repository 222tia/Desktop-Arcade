package edu.bsu.cs222.TTT;

import edu.bsu.cs222.DesktopArcadeDialogue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings("LoopConditionNotUpdatedInsideLoop")
public class TTTSingleplayer {

    public static final ArrayList<String> gameBoard = new ArrayList<>(
            Arrays.asList(" "," "," "," "," "," "," "," "," "));
    static int playerOnePlay;
    static int playerTwoPlay;
    static boolean playerOneWin = false;
    static boolean playerTwoWin = false;
    static boolean draw = false;
    static final boolean Continue = true;
    static String playerTwoLetter;
    static int playerNumber = 1;
    public static void playTTTSingle() throws IOException {

        System.out.println(TTTDialogue.letterChoiceDialogueSingle());
        String userLetter = TTTTurnMove.letterChoice();

        playerTwoLetter = TTTTurnMove.getLetter(userLetter);

        do {

            System.out.println(TTTDialogue.inputInstructions(playerNumber, "You"));

            playerOnePlay = TTTTurnMove.getUserMove(gameBoard);
            TTTGameBoard.showUpdatedGameBoard(gameBoard, playerOnePlay, userLetter);

            playerOneWin = TTTCheckGameboard.checkBoard(userLetter, gameBoard);
            draw = TTTCheckGameboard.checkDraw(gameBoard);

            System.out.println(TTTDialogue.gameOutcomeDialogue(draw, playerOneWin, "You"));
            if (draw || playerOneWin) {
                System.exit(0);
            }

            DesktopArcadeDialogue.EnterContinue();

            System.out.println(TTTDialogue.inputInstructions(playerNumber, "Computer"));

            playerTwoPlay = TTTTurnMove.getCompTurnMove(gameBoard, playerTwoLetter, userLetter);
            TTTGameBoard.showUpdatedGameBoard(gameBoard, playerTwoPlay, playerTwoLetter);

            playerTwoWin = TTTCheckGameboard.checkBoard(playerTwoLetter, gameBoard);
            draw = TTTCheckGameboard.checkDraw(gameBoard);

            System.out.println(TTTDialogue.gameOutcomeDialogue(draw, playerTwoWin, "Computer"));
            if (draw || playerTwoWin) {
                System.exit(0);
            }

            DesktopArcadeDialogue.EnterContinue();

        } while (Continue);

    }


}
