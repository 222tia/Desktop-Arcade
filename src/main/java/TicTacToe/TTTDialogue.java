package TicTacToe;

import java.lang.reflect.Array;

public class TTTDialogue {
    static char[][] gameBoard = {{' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}};

    public static void Instructions(){
        System.out.println("""
                              1 | 2 | 3
                             ------------
                              4 | 5 | 6
                             ------------
                              7 | 8 | 9
                  Type the number of your chosen space.
                """);

        TTTGameBoard.showGameBoard(gameBoard);
    }

}
