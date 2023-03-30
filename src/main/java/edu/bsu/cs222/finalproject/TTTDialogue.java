package edu.bsu.cs222.finalproject;

import java.util.ArrayList;

import static java.lang.System.exit;

public class TTTDialogue {

    public static void Instructions(){
        System.out.println("""
                  It's your turn!
                  
                              1 | 2 | 3
                             ------------
                              4 | 5 | 6
                             ------------
                              7 | 8 | 9
                  Type the number of your chosen space.
                """);

        //TTTGameBoard.showGameBoard(gameBoard);
    }

    public static void showGameBoard(ArrayList<String> board){
        System.out.println(" " + board.get(0) + " | " + board.get(1) + " | " + board.get(2) +
                "\n------------\n" +
                " " + board.get(3) + " | " + board.get(4) + " | " + board.get(5) +
                "\n------------\n" +
                " " + board.get(6) + " | " + board.get(7) + " | " + board.get(8));
    }

    public static void compTurn(){
        System.out.println("It's the Computer's turn!");
    }

    public static void improperSpace() {
        System.out.println("That space is not empty");
    }

    public static void invalidInput(){
        System.out.println("Invalid input (enter a number 1-9).");
    }

    public static void userWinDialogue() {
        System.out.println("You win!");
        exit(1);
    }

    public static void compWinDialogue() {
        System.out.println("Sorry, you lose!");
        exit(1);
    }
}
