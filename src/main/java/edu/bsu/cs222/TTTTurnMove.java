package edu.bsu.cs222;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TTTTurnMove {
    private final static List<String> possibleMovesString = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9");


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

    public static int checkUserMove(String userTurnString){
        int userTurn;
            if (possibleMovesString.contains(userTurnString)) {
                userTurn = Integer.parseInt(userTurnString);
                return userTurn - 1;
            } else {
                return 9;
            }
    }

    public static int getCompTurnMove(ArrayList<String> gameBoard, String compLetter, String userLetter){
        boolean checkEmptySpace;
        int compTurn = TTTTurnLogic.TurnLogicCheck(gameBoard, compLetter);
        if (compTurn==9) {
            compTurn = TTTTurnLogic.TurnLogicCheck(gameBoard, userLetter);
            if (compTurn == 9) {
                do {
                    compTurn = getRandomMove();
                    checkEmptySpace = TTTGameBoard.emptySpaceCheck(gameBoard, compTurn);
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

