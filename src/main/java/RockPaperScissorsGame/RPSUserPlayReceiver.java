package RockPaperScissorsGame;

import java.util.Scanner;

public class RPSUserPlayReceiver {
    public static String getUserPlay() {

        System.out.println("\nrock, paper, or scissors?: ");

        Scanner userPlayScanner = new Scanner(System.in);
        String userPlay = userPlayScanner.nextLine().toLowerCase();

        if (!userPlay.matches("rock|paper|scissors")) {
            System.err.println("invalid input (check spelling)");
        }
        return userPlay;
    }
}

