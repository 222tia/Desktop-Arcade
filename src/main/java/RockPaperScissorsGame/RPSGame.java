package RockPaperScissorsGame;

public class RPSGame {
    public static void playRPS() {

        int userScore = 0;
        int computerScore = 0;

        while (userScore< 3 || computerScore < 3) {

            String userPlay = RPSUserPlayReceiver.getUserPlay();
            String computerPlay = RPSPlayRandomizer.getRandomPlay();

            RPSResultDecider.getResult(userPlay, computerPlay);

            userScore = RPSScoreKeeper.addUserScore(computerPlay, userPlay, userScore);
            computerScore = RPSScoreKeeper.addComputerScore(computerPlay, userPlay, computerScore);

            System.out.println("\nYour score is: " + userScore + "\nComputer score is: " + computerScore);

            // TODO move this to it's own method in ResultDecider
            if (userScore == 3) {
                System.out.println("\n You win!");
                System.exit(0);
            } else if (computerScore == 3){
                System.out.println("\n You lose!");
                System.exit(0);
            }
        }

    }
}
