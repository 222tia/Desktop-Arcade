package TicTacToe;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class TTTDialogue {
    private static final ArrayList<String> gameBoard = new ArrayList<>(
            Arrays.asList(" "," "," "," "," "," "," "," "," "));

    public static void Instructions(){
        System.out.println("""
                              1 | 2 | 3
                             ------------
                              4 | 5 | 6
                             ------------
                              7 | 8 | 9
                  Type the number of your chosen space.
                """);

        //TTTGameBoard.showGameBoard(gameBoard);
    }

}
