package edu.bsu.cs222;

public class RPSDialogue extends RPSResultDecider{
    public static String showRoundResult(String userPlay, String computerPlay){
        String roundResultMessage;
        if (winCondition(computerPlay, userPlay)) {
            roundResultMessage = "Computer played " + computerPlay + ", computer score + 1";
        } else if (winCondition(userPlay, computerPlay)) {
            roundResultMessage = "Computer played " + computerPlay + ", your score + 1";
        } else {
            roundResultMessage = "Computer played " + computerPlay + ", tie. no score added.";
        }
        return roundResultMessage;
    }

    public static String showGameResult(int userScore, int computerScore){
        String gameResultMessage;
        if (RPSScoreKeeper.checkScore(userScore, computerScore)){
            gameResultMessage = "\n\nGame over, you won!";
        } else if (RPSScoreKeeper.checkScore(computerScore, userScore)){
            gameResultMessage = "\n\nGame over, you lost!";
        } else {
            gameResultMessage = "";
        }
        return gameResultMessage;
    }

    public static String inputPrompt() {
        return "\nRock, Paper, or Scissors?: ";
    }

    public static String showScore(int userScore, int computerScore) {
        return "\nYour score is: " + userScore + "\nComputer score is: " + computerScore;
    }

    public static String showRoundNumber(int roundNumber){
        return "\n\n/// Round " + roundNumber + " ///";
    }

    public static String RestartDisplay() {return"\n\nPlease restart the game";}
}
