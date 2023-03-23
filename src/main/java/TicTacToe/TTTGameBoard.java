package TicTacToe;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class TTTGameBoard {
    /*public static void showGameBoard(char[][] board){
        System.out.println(board[0][0] + "|" +  board[0][1] + "|" +  board[0][2] );
        System.out.println("-+-+-");
        System.out.println(board[1][0] + "|" +  board[1][1] + "|" +  board[1][2] );
        System.out.println("-+-+-");
        System.out.println(board[2][0] + "|" +  board[2][1] + "|" +  board[2][2] );
    }*/

    public static boolean emptySpaceCheck(ArrayList<String> gameBoard, int Play){
        String b =gameBoard.get(Play);
        return b.equals(" ");
    }

    public static void updateGameBoard(char[][] board, char userSymbol, int userPlay){
        // takes userPlay and places the respective userSymbol onto board
    }
}
