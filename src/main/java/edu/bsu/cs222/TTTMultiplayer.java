package edu.bsu.cs222;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

@SuppressWarnings("LoopConditionNotUpdatedInsideLoop")

public class TTTMultiplayer {

    public static final ArrayList<String> gameBoard = new ArrayList<>(
            Arrays.asList(" ", " ", " ", " ", " ", " ", " ", " ", " "));
    static int userOnePlay;
    static int userTwoPlay;
    static boolean userOneWin = false;
    static boolean userTwoWin = false;
    static boolean draw = false;
    static final boolean Continue = true;
    static String userTwoLetter;

    public static void playTTTMultiplayer() throws IOException {
        System.out.println(TTTDialogue.multiplayerLetterChoiceDialogue());
        String userOneLetter = TTTTurnMove.letterChoice();
        if (userOneLetter.equals("O")) {
            userTwoLetter = "X";
        } else {
            userTwoLetter = "O";
        }

        System.out.println(TTTDialogue.showMultiplayerLetterChoice(userOneLetter, userTwoLetter));

        do {
            System.out.println(TTTDialogue.inputInstructions());
            boolean openSpace;
            do {
                userOnePlay = TTTTurnMove.getUserMove();
                openSpace = TTTGameBoard.emptySpaceCheck(gameBoard, userOnePlay);
                if (!openSpace) {
                    System.out.println(TTTDialogue.improperSpace());
                }
            } while (!openSpace);

            TTTGameBoard.showUpdatedGameBoard(gameBoard, userOnePlay, userOneLetter);
            userOneWin = TTTGetResults.checkBoard(userOneLetter, gameBoard);
            if (!userOneWin) {
                draw = TTTGetResults.checkDraw(gameBoard);
            }
            DesktopArcadeDialogue.EnterContinue();

            if (userOneWin) {
                System.out.println(TTTDialogue.userWinDialogue());
                System.exit(0);
            }
            if (draw) {
                System.out.println(TTTDialogue.drawOutcomeDialogue());
                System.exit(0);
            }

            // #TODO add player two turn message
            do {
                userTwoPlay = TTTTurnMove.getUserMove();
                openSpace = TTTGameBoard.emptySpaceCheck(gameBoard, userTwoPlay);
                if (!openSpace) {
                    System.out.println(TTTDialogue.improperSpace());
                }
            } while (!openSpace);

            TTTGameBoard.showUpdatedGameBoard(gameBoard, userTwoPlay, userTwoLetter);
            userTwoWin = TTTGetResults.checkBoard(userTwoLetter, gameBoard);

            if (!userTwoWin) {
                draw = TTTGetResults.checkDraw(gameBoard);
            }
            if (userTwoWin) {
                System.out.println(TTTDialogue.compWinDialogue());
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
