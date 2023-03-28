package TicTacToe;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TTTTurnMove {
    private final static List<Integer> possibleInputs = List.of(1, 2, 3, 4, 5, 6, 7 ,8 ,9);

    public static int getUserTurnMove() {

        Scanner userPlayScanner = new Scanner(System.in);
        int userPlay = userPlayScanner.nextInt(); // Scanner.nextInt() might not be testable

        if (!possibleInputs.contains(userPlay)) {
            System.err.println("Invalid input (enter a number 1-9).");
        }

        return userPlay;

    }

    public static int getCompTurnMove(ArrayList<String> board){
        TTTDialogue.CompTurn();
        boolean check;
        int turn;
        do {
            turn = getRandomPlay();
            check = TTTGameBoard.emptySpaceCheck(board, turn);
        }while(!check);
            return turn;
    }

    public static int getRandomPlay() {
        return (int) (Math.random() * 9);
    }
}

