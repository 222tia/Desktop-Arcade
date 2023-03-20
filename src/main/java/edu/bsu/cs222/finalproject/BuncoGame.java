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
                BuncoDialogue.PlayerTurnDisplay();
                BuncoDialogue.RoundDisplay(roundNumber);

                diceRollList = BuncoDice.getDiceRolls();

                int dice1Value = diceRollList.get(0);
                int dice2Value = diceRollList.get(1);
                int dice3Value = diceRollList.get(2);
                BuncoDialogue.DiceOutput(dice1Value, dice2Value, dice3Value);


                boolean pointGain = ((dice1Value == roundNumber) || (dice2Value == roundNumber) || (dice3Value == roundNumber));
                boolean DiceTriples = (dice1Value == dice2Value) && (dice2Value == dice3Value);
                playerScore = BuncoDice.Scoring(playerScore, roundNumber, dice1Value, dice2Value, dice3Value);

                turnContinue = pointGain || DiceTriples;

                BuncoDialogue.PlayerScoreDisplay(playerScore);

                if (playerScore >= 21) {
                    BuncoDialogue.PlayerWinDisplay();
                }

                BuncoDice.EnterContinue();


            } while (turnContinue);
            compScore = BuncoCompTurn.CompTurn(compScore, roundNumber);
            roundNumber++;
            if (roundNumber > 6) {
                roundNumber = 1;
            }
        }
        }

    }
