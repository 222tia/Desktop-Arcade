package edu.bsu.cs222.finalproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TTTTurnMove {
    private final static List<Integer> possibleMoves = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
    private final static List<String> possibleMovesString = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9");

    public static int getUserTurnMove() {

        Scanner userTurnMoveScanner = new Scanner(System.in);
        boolean isNotInteger = true;
        int userTurn = -1;

        while (isNotInteger) {
            if (userTurnMoveScanner.hasNextInt()){
                if (possibleMoves.contains(userTurnMoveScanner.nextInt())){
                    userTurn = userTurnMoveScanner.nextInt();
                    isNotInteger = false;
                }
            } else {
                TTTDialogue.invalidUserInput();
                userTurnMoveScanner.next();
            }
        }

        return userTurn - 1;
    }

    public static int getUserMove() {
        boolean isNotInteger = true;
        int userTurn = 0;
        Scanner userTurnMoveScanner = new Scanner(System.in);
        String userTurnString = userTurnMoveScanner.nextLine();
        do {
            if (possibleMovesString.contains(userTurnString)) {
                userTurn = Integer.parseInt(userTurnString);
                isNotInteger = false;
            } else {
                TTTDialogue.invalidUserInput();
                userTurnString = userTurnMoveScanner.nextLine();
            }
        }while(isNotInteger);
        return userTurn - 1;
    }

    public static int getCompTurnMove(ArrayList<String> board, String CompLetter, String UserLetter){
        boolean checkEmptySpace;
        int compTurn = TTTTurnLogic.TurnLogicCheck(board, CompLetter);
        if (compTurn==9) {
            compTurn = TTTTurnLogic.TurnLogicCheck(board, UserLetter);
            if (compTurn == 9) {
                do {
                    compTurn = getRandomMove();
                    checkEmptySpace = TTTGameBoard.emptySpaceCheck(board, compTurn);
                } while (!checkEmptySpace);
            }
        }
            return compTurn;
    }

    public static int getRandomMove() {
        return (int) (Math.random() * 9);
    }

    public static String letterChoice() {
        TTTDialogue.letterChoiceDialogue();
        String letter;
        do{
            Scanner userLetterScanner = new Scanner(System.in);
            letter = userLetterScanner.nextLine().toUpperCase();
            if (!(letter.equals("O"))&&!(letter.equals("X"))){
                TTTDialogue.invalidLetterChoice();
            }
        } while (!letter.equals("O") && !letter.equals("X"));
        return letter;
    }

}

