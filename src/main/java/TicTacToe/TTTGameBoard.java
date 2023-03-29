package TicTacToe;

import java.util.ArrayList;

public class TTTGameBoard {

    public static boolean emptySpaceCheck(ArrayList<String> gameBoard, int play){
        String b = gameBoard.get(play);
        return b.equals(" ");
    }

    public static ArrayList<String> updateGameBoard(ArrayList<String> gameBoard, int play, String letter){
        gameBoard.set(play, letter);
        return gameBoard;
    }

//    public static ArrayList<String>gameBoard() {
//        final ArrayList<String> gameBoard = new ArrayList<>(
//                Arrays.asList(" "," "," "," "," "," "," "," "," "));
//        return gameBoard;
//    }
}
