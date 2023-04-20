package edu.bsu.cs222.TTT;

import java.util.ArrayList;


@SuppressWarnings("SameReturnValue")
public class TTTDialogue {

    public static String inputInstructions(){
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
    public static String multiplayerInputInstructions(String player){
        return "\n       " + player + ", it's your turn!" +
                """
                  
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

    public static String compTurn(){
        return "It's the Computer's turn!";
    }

    public static String improperSpace() {
        return "\nThat space is not empty";
    }

    public static String invalidUserInput(){
        return "\nInvalid input (enter a number 1-9).";
    }

    public static String userWinDialogue() {return("\n\n\nYou win!");}

    public static String compWinDialogue() {return("\n\n\nSorry, you lose!");}

    public static String userOneWinDialogue() {return("\n\n\nPlayer 1 wins!");}
    public static String userTwoWinDialogue() {return("\n\n\nPlayer 2 wins!");}

    public static String EndDialogue() {
        return "The game is over. Please restart.";
    }

    public static String letterChoiceDialogue() {
        return "Do you want to play as Xs or Os?";
    }

    public static String multiplayerLetterChoiceDialogue() { return "Player 1, do you want to play as Xs or Os?";}

    public static String showMultiplayerLetterChoice(String userOneLetter, String userTwoLetter) {
        return "\nPlayer 1, you will play as " + userOneLetter + "\nPlayer 2, you will play as " + userTwoLetter; }
    public static String invalidLetterChoice() {
        return "Invalid input. Do you want to play as Xs or Os?";
    }

    public static String drawOutcomeDialogue() {return("\n\n\nThe game ends in a draw.");}

    public static String GUITTTRules(){
        return """
                Tic-Tac-Toe is played by using a 3x3 grid.
                Players take turns to select a spot in the grid to put an X or an O.
                If a player gets 3 in a row vertically, horizontally, or diagonally they win!
                Enter a number 1-9 to choose your space.
                
                                             1 | 2 | 3
                                           ------------
                                             4 | 5 | 6
                                           ------------
                                             7 | 8 | 9""";
    }
}
