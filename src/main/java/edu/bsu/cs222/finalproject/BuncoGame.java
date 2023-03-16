package edu.bsu.cs222.finalproject;

public class BuncoGame {
    public static void main(String[] args) throws IOException {
        int dice1Value = 0;
        int dice2Value = 0;
        int dice3Value = 0;
        int playerScore = 0;
        int opps = 0;
        int mykey = 0;
        int roundNumber = 1;


        while (playerScore < 21) {
            for (roundNumber++;){

                do {
                    System.out.println("\nRound #" + roundNumber);
                    dice1Value = (int) (Math.random() * 6) + 1;
                    dice2Value = (int) (Math.random() * 6) + 1;
                    dice3Value = (int) (Math.random() * 6) + 1;
                    System.out.println("Roll 1 = " + dice1Value);
                    System.out.println("Roll 2 = " + dice2Value);
                    System.out.println("Roll 3 = " + dice3Value);


                    if (dice1Value == roundNumber) {
                        playerScore = playerScore + 1;
                    }
                    if (dice2Value == roundNumber) {
                        playerScore = playerScore + 1;
                    }
                    if (dice3Value == roundNumber) {
                        playerScore = playerScore + 1;
                    }
                    if ((dice1Value == dice2Value) && (dice2Value == dice3Value)) {
                        playerScore = playerScore + 5;
                    }

                    if ((dice1Value == dice2Value) && (dice2Value == dice3Value) && (dice1Value == roundNumber)) {
                        playerScore = playerScore + 21;
                        System.out.println("Bunco!! You Win!");
                        System.exit(0);
                    }

                    System.out.println("Your score is " + playerScore);

                    if (playerScore >= 21) {
                        System.out.println("Bunco! You win!");
                        System.exit(0);
                    }

                    mykey = (int) System.in.read();
                    mykey = (int) System.in.read();


                } while ((dice1Value == roundNumber) || (dice2Value == roundNumber) || (dice3Value == roundNumber) || ((dice1Value == dice2Value) && (dice2Value == dice3Value)));
                if (roundNumber == 6) {
                    roundNumber = 0;
                }
            }
        }

    }
}
