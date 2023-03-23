package TicTacToe;

import java.util.List;
import java.util.Scanner;

public class TTTGetUserPlay {
    private final static List<Integer> possibleInputs = List.of(1, 2, 3, 4, 5, 6, 7 ,8 ,9);

    public static int getUserPlay() {

        System.out.println("\nEnter a number 1-9 to play on the board: ");

        Scanner userPlayScanner = new Scanner(System.in);
        int userPlay = userPlayScanner.nextInt(); // Scanner.nextInt() might not be testable

        if (!possibleInputs.contains(userPlay)) {
            System.err.println("Invalid input (check spelling).");
        }

        return userPlay;

    }
}

