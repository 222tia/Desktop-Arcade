package edu.bsu.cs222.RPS;

public class RPSGame {
    public static void playRPS() {

        int userScore = 0;
        int computerScore = 0;
        int roundNumber = 0;

        while (userScore< 2 && computerScore < 2) {

            roundNumber+=1;
            System.out.println(RPSDialogue.showRoundNumber(roundNumber));

            System.out.println(RPSDialogue.inputPrompt());

            String userPlay = RPSUserPlayReceiver.getUserPlay();
            String computerPlay = RPSPlayRandomizer.getRandomPlay();

            System.out.println(RPSDialogue.showRoundResult(userPlay, computerPlay));

            userScore = RPSScoreKeeper.addUserScore(computerPlay, userPlay, userScore);
            computerScore = RPSScoreKeeper.addComputerScore(computerPlay, userPlay, computerScore);

            System.out.println(RPSDialogue.showScore(userScore, computerScore));

            if (RPSScoreKeeper.checkScore(computerScore, userScore) || RPSScoreKeeper.checkScore(userScore, computerScore)){
                System.out.println(RPSDialogue.showGameResult(userScore, computerScore));
                System.exit(0);
            }
        }

    }
}
