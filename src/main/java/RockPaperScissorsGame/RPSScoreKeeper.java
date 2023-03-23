package RockPaperScissorsGame;

public class RPSScoreKeeper {
    public static int addUserScore(String computerPlay, String userPlay, int score){
        if (RPSResultDecider.winCondition(userPlay, computerPlay)) {
            score+=1;
        }
        return score;
    }

    public static int addComputerScore(String computerPlay, String userPlay, int score){
        if (RPSResultDecider.winCondition(computerPlay, userPlay)) {
            score+=1;
        }
        return score;
    }

    public static void checkScore(int userScore, int computerScore){
        if (userScore == 3) {
            System.out.println("\nYou win!");
            System.exit(0);
        } else if (computerScore == 3){
            System.out.println("\nYou lose!");
            System.exit(0);
        }
    }
}
