package edu.bsu.cs222.finalproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TTTTurnMove {
    private final static List<Integer> possibleMoves = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

    public static int getUserTurnMove() {

        Scanner userTurnMoveScanner = new Scanner(System.in);
        int userTurn = userTurnMoveScanner.nextInt();

        if (!possibleMoves.contains(userTurn)) {
            TTTDialogue.invalidUserInput();
        }

        return userTurn - 1;
    }

    public static int getCompTurnMove(ArrayList<String> board, String letter){
        TTTDialogue.compTurn();
        boolean checkEmptySpace;
        int compTurn = TTTTurnLogic.TurnLogicCheck(board, letter);
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

    public static String letterChoice() {
        TTTDialogue.LetterChoiceDialogue();
        String letter;
        do{
            Scanner userLetterScanner = new Scanner(System.in);
            letter = userLetterScanner.nextLine().toUpperCase();
            if ((letter.equals("O"))||(letter.equals("X"))){
                return letter;
            }
            else{
                TTTDialogue.invalidLetterChoice();
            }
        } while (!letter.equals("O") && !letter.equals("X"));
        return letter;
    }

}

