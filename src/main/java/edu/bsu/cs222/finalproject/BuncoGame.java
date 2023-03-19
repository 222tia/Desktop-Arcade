package edu.bsu.cs222.finalproject;

import java.io.IOException;

public class BuncoGame {

    public static void main(String[] args) throws IOException {
        int playerScore = 0;
        int compScore = 0;
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

                boolean pointGain = false;
                boolean dice1PointGain = (dice1Value == roundNumber);
                boolean dice2PointGain = (dice2Value == roundNumber);
                boolean dice3PointGain = (dice3Value == roundNumber);
                if (dice1PointGain) playerScore = playerScore + 1;
                if (dice2PointGain) playerScore = playerScore + 1;
                if (dice3PointGain) playerScore = playerScore + 1;
                if (dice1PointGain || dice2PointGain || dice3PointGain){
                    pointGain = true;
                }
                boolean DiceTriples = false;
                if ((dice1Value == dice2Value) && (dice2Value == dice3Value)) {
                    DiceTriples = true;
                    playerScore = playerScore + 5;
                    if (dice1PointGain) {
                        playerScore = playerScore + 21;
                    }
                }
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
