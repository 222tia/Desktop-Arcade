package TicTacToe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TTTTurnMove {
    private final static List<Integer> possibleMoves = List.of(1, 2, 3, 4, 5, 6, 7 ,8 ,9);

    public static int getUserTurnMove() {


        Scanner userPlayScanner = new Scanner(System.in);
        int userTurn = userPlayScanner.nextInt(); // Scanner.nextInt() might not be testable

        if (!possibleMoves.contains(userTurn)) {
            TTTDialogue.invalidInput();
        }

        return userTurn;

    }

    public static int getCompTurnMove(ArrayList<String> board){
        TTTDialogue.compTurn();
        boolean check;
        int turn;
        do {
            turn = getRandomMove();
            check = TTTGameBoard.emptySpaceCheck(board, turn);
        }while(!check);
            return turn;
    }

    public static int getRandomMove() {
        return (int) (Math.random() * 9);
    }
}

