package TicTacToe;

import java.util.List;

public class TTTPlayRandomizer {
    private final static List<Integer> possibleInputs = List.of(0, 1, 2, 3, 4, 5, 6, 7 ,8);

    public static int getRandomPlay() {

        System.out.println("\nComputer's turn.");
        return (int) (Math.random() * 9);

    }


}
