package TicTacToe;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

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
        System.out.println(board.get(0) + " | " +  board.get(1) + " | " +  board.get(2) );
        System.out.println("------------");
        System.out.println(board.get(3) + " | " +  board.get(4) + " | " +  board.get(5) );
        System.out.println("------------");
        System.out.println(board.get(6) + " | " +  board.get(7) + " | " +  board.get(9) );
    }

    public static void CompTurn(){
        System.out.println("It's the Computer's turn!");
    }

    public static void inproperSpace() {
        System.out.println("That space is not empty");
    }
}
