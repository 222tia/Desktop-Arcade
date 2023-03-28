package TicTacToe;

import java.util.ArrayList;
import java.util.Arrays;

public class TTTGame {

    public static ArrayList<String> gameBoard = new ArrayList<>(
            Arrays.asList(" "," "," "," "," "," "," "," "," "));
    public static void playTTT(){
//        ArrayList<String> Board =TTTGameBoard.gameBoard();
//        I think we can just declare the arraylist as a variable in the class instead of having a
//        method to return it, but I left it commented out in case I'm wrong
        TTTDialogue.Instructions();
        boolean openSpace;
        do {
            int play = TTTTurnMove.getUserTurnMove();
            openSpace = TTTGameBoard.emptySpaceCheck(gameBoard, play);
            if (!openSpace) {
                TTTDialogue.improperSpace();
            }
        }while (!openSpace);
    }
}
