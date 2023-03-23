package TicTacToe;

import java.lang.reflect.Array;

public class TTTDialogue {
    public static void Instructions(){
        System.out.println("""
                              1 | 2 | 3
                             ------------
                              4 | 5 | 6
                             ------------
                              7 | 8 | 9
                  Type the number of your chosen space.
                """);
    }

    /*public static void BoardDisplay(Array board){
        System.out.println("\n "+board[0]+" | "+board[1]+" | \"++\"\n------------\n   |   |\n------------\n   |   |");
    }*/
}
