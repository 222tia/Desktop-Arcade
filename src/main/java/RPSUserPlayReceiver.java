import java.util.Scanner;

public class RPSUserPlayReceiver {
    public static String getUserPlay() {

        Scanner userPlayScanner = new Scanner(System.in);
        String userPlay = userPlayScanner.nextLine().toLowerCase();

        if (!userPlay.matches("rock|paper|scissors")) {
            System.err.println("Invalid input (check spelling).");
        }

        return userPlay;
    }
}

