package TicTacToe;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class TTTGameBoard {
    public static void showGameBoard(ArrayList<String> board){
        System.out.println(board.get(0) + " | " +  board.get(1) + " | " +  board.get(2) );
        System.out.println("------------");
        System.out.println(board.get(3) + " | " +  board.get(4) + " | " +  board.get(5) );
        System.out.println("------------");
        System.out.println(board.get(6) + " | " +  board.get(7) + " | " +  board.get(9) );
    }

    public static boolean emptySpaceCheck(ArrayList<String> gameBoard, int Play){
        String b =gameBoard.get(Play);
        return b.equals(" ");
    }

    public static void updateGameBoard(char[][] board, char userSymbol, int userPlay){
        // takes userPlay and places the respective userSymbol onto board
    }
}
