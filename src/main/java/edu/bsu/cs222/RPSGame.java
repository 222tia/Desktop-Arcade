package edu.bsu.cs222;

public class RPSGame {
    public static void playRPS() {

        int userScore = 0;
        int computerScore = 0;

        while (userScore< 3 || computerScore < 3) {

            RPSDialogue.inputPrompt();
            String userPlay = RPSUserPlayReceiver.getUserPlay();
            String computerPlay = RPSPlayRandomizer.getRandomPlay();

            RPSDialogue.showRoundResult(userPlay, computerPlay);

            userScore = RPSScoreKeeper.addUserScore(computerPlay, userPlay, userScore);
            computerScore = RPSScoreKeeper.addComputerScore(computerPlay, userPlay, computerScore);

            RPSDialogue.showScore(userScore, computerScore);

            RPSDialogue.showGameResult(userScore, computerScore);

        }

    }
}
