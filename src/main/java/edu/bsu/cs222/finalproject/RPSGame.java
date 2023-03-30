package edu.bsu.cs222.finalproject;

public class RPSGame {
    public static void playRPS() {

        int userScore = 0;
        int computerScore = 0;

        while (userScore< 3 || computerScore < 3) {

            System.out.println("\nRock, Paper, or Scissors?: ");
            String userPlay = RPSUserPlayReceiver.getUserPlay();
            String computerPlay = RPSPlayRandomizer.getRandomPlay();

            RPSDialogue.showRoundResult(userPlay, computerPlay);

            userScore = RPSScoreKeeper.addUserScore(computerPlay, userPlay, userScore);
            computerScore = RPSScoreKeeper.addComputerScore(computerPlay, userPlay, computerScore);

            System.out.println("\nYour score is: " + userScore + "\nComputer score is: " + computerScore);

            RPSDialogue.showGameResult(userScore, computerScore);

        }

    }
}
