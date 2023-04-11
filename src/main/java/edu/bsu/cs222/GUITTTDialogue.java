package edu.bsu.cs222;

import java.util.ArrayList;

public class GUITTTDialogue {
    public static String Instructions(){
        return """
                  It's your turn!
                  
                              1 | 2 | 3
                             ------------
                              4 | 5 | 6
                             ------------
                              7 | 8 | 9
                  Type the number of your chosen space.
                """;
    }

    public static String showGameBoard(ArrayList<String> board){
        return "              " + board.get(0) + " | " + board.get(1) + " | " + board.get(2) +
                "\n             ------------\n" +
                "              " + board.get(3) + " | " + board.get(4) + " | " + board.get(5) +
                "\n             ------------\n" +
                "              " + board.get(6) + " | " + board.get(7) + " | " + board.get(8);
    }

    @SuppressWarnings("SameReturnValue")
    public static String compTurn(){
        return "It's the Computer's turn!";
    }

    @SuppressWarnings("SameReturnValue")
    public static String improperSpace() {
        return "That space is not empty";
    }

    @SuppressWarnings("SameReturnValue")
    public static String invalidUserInput(){
        return "Invalid input (enter a number 1-9).";
    }

    @SuppressWarnings("SameReturnValue")
    public static String userWinDialogue() {
        return "You win!";
    }

    @SuppressWarnings("SameReturnValue")
    public static String compWinDialogue() {
        return "Sorry, you lose!";
    }

    @SuppressWarnings("SameReturnValue")
    public static String letterChoiceDialogue() {
        return "Do you want to play as Xs or Os?";
    }

    @SuppressWarnings("SameReturnValue")
    public static String invalidLetterChoice() {
        return "Invalid input. Do you want to play as Xs or Os?";
    }

    @SuppressWarnings("SameReturnValue")
    public static String drawOutcomeDialogue() {
        return "The game ends in a draw.";
    }

    @SuppressWarnings("SameReturnValue")
    public static String GUITTTRules(){
        return """
                Tic-Tac-Toe is played by using a 3x3 grid.
                Players take turns to select a spot in the grid to put an X or an O.
                If a player gets 3 in a row vertically, horizontally, or diagonally they win!
                Enter a number 1-9 and press enter to play.""";
    }
}
