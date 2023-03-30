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

    public static void showUpdatedGameBoard(ArrayList<String> gameBoard, int play, String letter){
        ArrayList<String> updatedGameBoard = updateGameBoard(gameBoard, play, letter);
        //TTTDialogue.showGameBoard(updatedGameBoard);
        System.out.println(" " + updatedGameBoard.get(0) + " | " + updatedGameBoard.get(1) + " | " + updatedGameBoard.get(2) +
                "\n------------\n" +
                " " + updatedGameBoard.get(3) + " | " + updatedGameBoard.get(4) + " | " + updatedGameBoard.get(5) +
                "\n------------\n" +
                " " + updatedGameBoard.get(6) + " | " + updatedGameBoard.get(7) + " | " + updatedGameBoard.get(8));
    }


//    public static ArrayList<String>gameBoard() {
//        final ArrayList<String> gameBoard = new ArrayList<>(
//                Arrays.asList(" "," "," "," "," "," "," "," "," "));
//        return gameBoard;
//    }
}
