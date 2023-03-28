package TicTacToe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TTTTurnMove {
    private final static List<Integer> possibleMoves = List.of(1, 2, 3, 4, 5, 6, 7 ,8 ,9);

    public static int getUserTurnMove() {
        Scanner userTurnMoveScanner = new Scanner(System.in);
        int userTurn = userTurnMoveScanner.nextInt();

        if (!possibleMoves.contains(userTurn)) {
            TTTDialogue.invalidInput();
        }

        return userTurn;
    }

    public static int getCompTurnMove(ArrayList<String> board){
        TTTDialogue.compTurn();
        boolean checkEmptySpace;
        int compTurn;
        do {
            compTurn = getRandomMove();
            checkEmptySpace = TTTGameBoard.emptySpaceCheck(board, compTurn);
        } while(!checkEmptySpace);
            return compTurn;
    }

    public static int getRandomMove() {
        return (int) (Math.random() * 9);
    }
}

