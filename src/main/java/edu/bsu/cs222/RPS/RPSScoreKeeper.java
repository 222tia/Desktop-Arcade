package edu.bsu.cs222.RPS;

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

    public static Boolean checkScore(int winningScore, int losingScore){
        return (winningScore == 2) && (losingScore <= 1);
    }
}
