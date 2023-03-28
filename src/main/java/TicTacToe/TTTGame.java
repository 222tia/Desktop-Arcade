package TicTacToe;

import java.util.ArrayList;

public class TTTGame {
    public static void playTTT(){
        ArrayList<String> Board =TTTGameBoard.gameBoard();
        TTTDialogue.Instructions();
        boolean openSpace;
        do {
            int play = TTTTurnMove.getUserTurnMove();
            openSpace = TTTGameBoard.emptySpaceCheck(Board, play);
            if (!openSpace) {
                TTTDialogue.improperSpace();
            }
        }while (!openSpace);
    }
}
