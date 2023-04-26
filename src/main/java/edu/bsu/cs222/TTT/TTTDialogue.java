package edu.bsu.cs222.TTT;

import java.util.ArrayList;


@SuppressWarnings("SameReturnValue")
public class TTTDialogue {

    public static String showGameBoard(ArrayList<String> board){
        return "              " + board.get(0) + " | " + board.get(1) + " | " + board.get(2) +
                "\n             ------------\n" +
                "              " + board.get(3) + " | " + board.get(4) + " | " + board.get(5) +
                "\n             ------------\n" +
                "              " + board.get(6) + " | " + board.get(7) + " | " + board.get(8);
    }

    public static String inputInstructions(int playerNumber, String player){
        if (playerNumber == 1) {
            return "It's " + player + "'s turn!";
        } else {
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
    }

    public static String improperSpace() {
        return "\nThat space is not empty";
    }

    public static String invalidUserInput(){
        return "\nInvalid input (enter a number 1-9).";
    }

    public static String userWinDialogue() {return("\n\n\nYou win!");}

    public static String compWinDialogue() {return("\n\n\nSorry, you lose!");}


    public static String endDialogue() {
        return "The game is over. Please restart.";
    }

    public static String letterChoiceDialogueSingle() {
        return "Do you want to play as Xs or Os?";
    }

    public static String letterChoiceDialogueMulti() { return "Player 1, do you want to play as Xs or Os?";}

    public static String showMultiplayerLetterChoice(String userOneLetter, String userTwoLetter) {
        return "\nPlayer 1, you will play as " + userOneLetter + "\nPlayer 2, you will play as " + userTwoLetter; }
    public static String invalidLetterChoice() {
        return "Invalid input. Do you want to play as Xs or Os?";
    }

    public static String drawOutcomeDialogue() {return("\n\n\nThe game ends in a draw.");}

    public static String gameOutcomeDialogue(boolean draw, boolean playerWin, String player){
        if(playerWin){
            return ("\n\n\n" + player + " Wins!");
        } else if(draw){
            return (TTTDialogue.drawOutcomeDialogue());
        } else {
            return "";
        }
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

    public static String GUITTTMultiplayerRules(){
        return """
                Tic-Tac-Toe is played by using a 3x3 grid.
                
                Player 1 will select their letter in the drop-down box, while player 2 will be assigned the opposite to player 1's choice.
                Player 1 will then begin the game by selecting a spot to put an X or an O, depending on what letter they chose.
                Then, players will take turns passing the controls over to one another on their respective turns!
                
                If a player gets 3 in a row vertically, horizontally, or diagonally they win!
                Enter a number 1-9 to choose your space.
                
                                             1 | 2 | 3
                                           ------------
                                             4 | 5 | 6
                                           ------------
                                             7 | 8 | 9""";
    }

    public static String player1Turn() {return("Player 1, enter your selection and hit enter");}

    public static String player2Turn() {return("Player 2, enter your selection and hit enter");}
}
