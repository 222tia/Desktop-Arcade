package TicTacToe;

import java.util.ArrayList;

public class TTTGameBoard {

    public static boolean emptySpaceCheck(ArrayList<String> gameBoard, int Play){
        String b = gameBoard.get(Play);
        return b.equals(" ");
    }

    public static ArrayList<String> updateGameBoard(ArrayList<String> gameBoard, int Play, String letter){
        gameBoard.set(Play, letter);
        return gameBoard;
    }

//    public static ArrayList<String>gameBoard() {
//        final ArrayList<String> gameBoard = new ArrayList<>(
//                Arrays.asList(" "," "," "," "," "," "," "," "," "));
//        return gameBoard;
//    }
}
