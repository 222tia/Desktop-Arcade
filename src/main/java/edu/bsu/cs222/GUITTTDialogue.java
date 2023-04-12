package edu.bsu.cs222;



public class GUITTTDialogue {
    public static String improperSpace() {
        return "\nThat space is not empty";
    }

    public static String invalidUserInput(){
        return "\nInvalid input (enter a number 1-9).";
    }

    public static String userWinDialogue() {
        return "\n\n\nYou win!";
    }

    public static String compWinDialogue() {
        return "\n\n\nSorry, you lose!";
    }


    public static String drawOutcomeDialogue() {
        return "\n\n\nThe game ends in a draw.";
    }

    public static String EndDialogue() {
        return "The game is over. Please restart.";
    }

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
