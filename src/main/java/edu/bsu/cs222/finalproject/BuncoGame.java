package edu.bsu.cs222.finalproject;

import java.io.IOException;

public class BuncoGame {

    public static void main(String[] args) throws IOException {
        int playerScore = 0;
        int compScore = 0;
        int roundNumber = 1;


        while (true) {

            boolean turnContinue;
            do {
                System.out.println("\nRound #" + roundNumber);
                int dice1Value = BuncoDice.DiceRoll();
                int dice2Value = BuncoDice.DiceRoll();
                int dice3Value = BuncoDice.DiceRoll();
                System.out.println("Roll 1 = " + dice1Value);
                System.out.println("Roll 2 = " + dice2Value);
                System.out.println("Roll 3 = " + dice3Value);

                boolean pointGain = ((dice1Value== roundNumber) || (dice2Value== roundNumber) || (dice3Value == roundNumber));
                boolean DiceTriples = (dice1Value == dice2Value) && (dice2Value == dice3Value);
                playerScore = BuncoDice.Scoring(playerScore, roundNumber, dice1Value, dice2Value, dice3Value);
                turnContinue = pointGain || DiceTriples;
                System.out.println("Your score is " + playerScore);

                if (playerScore >= 21) {
                    System.out.println("Bunco! You win!");
                    System.exit(0);
                }

                int mykey = System.in.read();


            } while (turnContinue);
            compScore = BuncoCompTurn.CompTurn(compScore, roundNumber);
            roundNumber++;
            if (roundNumber > 6) {
                roundNumber = 1;
            }
        }
        }

    }
