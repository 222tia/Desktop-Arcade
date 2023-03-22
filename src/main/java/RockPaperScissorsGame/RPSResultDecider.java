package RockPaperScissorsGame;

public class RPSResultDecider {
    public static boolean winCondition(String winningPlay, String losingPlay) {
        return (winningPlay.equals("rock") && losingPlay.equals("scissors")) ||
                (winningPlay.equals("scissors") && losingPlay.equals("paper")) ||
                (winningPlay.equals("paper") && losingPlay.equals("rock"));
    }

    public static void getResult(String userPlay, String computerPlay){
        if (winCondition(computerPlay, userPlay)) {
            System.out.println("computer played " + computerPlay + ", you lose!");
        } else if (winCondition(userPlay, computerPlay)) {
            System.out.println("computer played " + computerPlay + ", you win!");
        } else {
            System.out.println("computer played " + computerPlay + ", tie!");
        }
        System.exit(0);
    }
}
