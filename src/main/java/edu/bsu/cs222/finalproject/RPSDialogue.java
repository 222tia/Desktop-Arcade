package edu.bsu.cs222.finalproject;

public class RPSDialogue extends RPSResultDecider{
    public static void showRoundResult(String userPlay, String computerPlay){
        if (winCondition(computerPlay, userPlay)) {
            System.out.println("Computer played " + computerPlay + ", computer score + 1");
        } else if (winCondition(userPlay, computerPlay)) {
            System.out.println("Computer played " + computerPlay + ", your score + 1");
        } else {
            System.out.println("Computer played " + computerPlay + ", tie. no score added.");
        }
    }

    public static void showGameResult(int userScore, int computerScore){
        if (RPSScoreKeeper.checkScore(userScore, computerScore)){
            System.out.println("\nGame over, you won!");
            System.exit(0);
        } else if (RPSScoreKeeper.checkScore(computerScore, userScore)){
            System.out.println("\nGame over, you lost!");
            System.exit(0);
        }
    }

    public static void inputPrompt() {
        System.out.println("\nRock, Paper, or Scissors?: ");
    }

    public static void showScore(int userScore, int computerScore) {
        System.out.println("\nYour score is: " + userScore + "\nComputer score is: " + computerScore);
    }
}
