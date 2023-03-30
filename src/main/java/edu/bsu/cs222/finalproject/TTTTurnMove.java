package edu.bsu.cs222.finalproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TTTTurnMove {
    private final static List<String> possibleMoves = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9");

    public static int getUserTurnMove() {
        Scanner userTurnMoveScanner = new Scanner(System.in);
        String userInput = userTurnMoveScanner.nextLine();

        if (!possibleMoves.contains(userInput)) {
            TTTDialogue.invalidInput();
        }
        int userTurn = Integer.parseInt(userInput);

        return userTurn - 1;
    }

    public static int getCompTurnMove(ArrayList<String> board){
        TTTDialogue.compTurn();
        boolean checkEmptySpace;
        int compTurn = TTTTurnLogic.TurnLogicCheck(board);
        if (compTurn==9) {
            do {
                compTurn = getRandomMove();
                checkEmptySpace = TTTGameBoard.emptySpaceCheck(board, compTurn);
            } while (!checkEmptySpace);
        }
            return compTurn;
    }

    public static int getRandomMove() {
        return (int) (Math.random() * 9);
    }

}

