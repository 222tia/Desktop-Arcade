package RockPaperScissorsGame;

public class RPSResultDecider {
    public static boolean winCondition(String winningPlay, String losingPlay) {
        return (winningPlay.equals("rock") && losingPlay.equals("scissors")) ||
                (winningPlay.equals("scissors") && losingPlay.equals("paper")) ||
                (winningPlay.equals("paper") && losingPlay.equals("rock"));
    }

    public static void getRoundResult(String userPlay, String computerPlay){
        if (winCondition(computerPlay, userPlay)) {
            System.out.println("Computer played " + computerPlay + ", computer score + 1");
        } else if (winCondition(userPlay, computerPlay)) {
            System.out.println("Computer played " + computerPlay + ", your score + 1");
        } else {
            System.out.println("Computer played " + computerPlay + ", tie. no score added.");
        }
    }

    public static void getGameResult(int userScore, int computerScore){
        if (RPSScoreKeeper.checkScore(userScore, computerScore)){
            System.out.println("\nGame over, you won!");
            System.exit(0);
        } else if (RPSScoreKeeper.checkScore(computerScore, userScore)){
            System.out.println("\nGame over, you lost!");
            System.exit(0);
        }
    }


}
