package edu.bsu.cs222.finalproject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BuncoGame {
    static List<Integer> diceRollList = new ArrayList<>();
    public static void playBunco() throws IOException {

        int playerScore = 0;
        int compScore = 0;
        int roundNumber = 1;


        while (true) {

            boolean turnContinue;
            do {
                System.out.println("\nRound #" + roundNumber);

                diceRollList = BuncoDice.getDiceRolls();

                int dice1Value = diceRollList.get(0);
                int dice2Value = diceRollList.get(1);
                int dice3Value = diceRollList.get(2);

                System.out.println("Roll 1 = " + dice1Value +
                        "\n Roll 2 = " + dice2Value +
                        "\n Roll 3 = " + dice3Value );

                boolean pointGain = ((dice1Value== roundNumber) || (dice2Value== roundNumber) || (dice3Value == roundNumber));
                boolean DiceTriples = (dice1Value == dice2Value) && (dice2Value == dice3Value);
                playerScore = BuncoDice.Scoring(playerScore, roundNumber, dice1Value, dice2Value, dice3Value);

                turnContinue = pointGain || DiceTriples;

                System.out.println("Your score is " + playerScore);

                if (playerScore >= 21) {
                    System.out.println("Bunco! You win!");
                    System.exit(0);
                }

                System.in.read();


            } while (turnContinue);
            compScore = BuncoCompTurn.CompTurn(compScore, roundNumber);
            roundNumber++;
            if (roundNumber > 6) {
                roundNumber = 1;
            }
        }
        }

    }
