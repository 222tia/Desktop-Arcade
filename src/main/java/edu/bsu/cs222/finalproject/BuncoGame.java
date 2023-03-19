package edu.bsu.cs222.finalproject;

import java.io.IOException;

public class BuncoGame {

    public static void main(String[] args) throws IOException {
        int playerScore = 0;
        int opps = 0;
        int mykey = 0;
        int roundNumber = 1;


        while (playerScore < 21) {

            boolean turnContinue;
            do {
                System.out.println("\nRound #" + roundNumber);
                int dice1Value = BuncoClasses.DiceRoll();
                int dice2Value = BuncoClasses.DiceRoll();
                int dice3Value = BuncoClasses.DiceRoll();
                System.out.println("Roll 1 = " + dice1Value);
                System.out.println("Roll 2 = " + dice2Value);
                System.out.println("Roll 3 = " + dice3Value);


                boolean pointGain = (dice1Value == roundNumber) || (dice2Value == roundNumber) || (dice3Value == roundNumber);
                if (pointGain) playerScore = playerScore + 1;
                boolean DiceTriples = false;
                if ((dice1Value == dice2Value) && (dice2Value == dice3Value)) {
                    DiceTriples = true;
                    playerScore = playerScore + 5;
                    if (pointGain) {
                        playerScore = playerScore + 21;
                    }
                }
                turnContinue = false;
                if (pointGain || DiceTriples) {
                    turnContinue = true;
                }
                System.out.println("Your score is " + playerScore);

                if (playerScore >= 21) {
                    System.out.println("Bunco! You win!");
                    System.exit(0);
                }

                mykey = (int) System.in.read();


            } while (turnContinue);
            roundNumber++;
            if (roundNumber > 6) {
                roundNumber = 1;
            }
        }
        }

    }
