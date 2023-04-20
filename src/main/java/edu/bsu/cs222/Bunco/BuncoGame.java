package edu.bsu.cs222.Bunco;

import edu.bsu.cs222.DesktopArcadeDialogue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BuncoGame {
    static List<Integer> diceRollList = new ArrayList<>();
    public static void playBunco(int playerNumber) throws IOException {

        int playerScore = 0;
        int player2Score = 0;
        int compScore = 0;
        int roundNumber = 1;


        while (true) {
            if (playerNumber==1) {
                System.out.println(BuncoDialogue.PlayerTurnDisplay());
            }else{
                System.out.println(BuncoDialogue.Player1TurnDisplay());
            }
            boolean turnContinue;
            do {
                System.out.println(BuncoDialogue.RoundDisplay(roundNumber));

                diceRollList = BuncoDice.getDiceRolls();

                int dice1Value = diceRollList.get(0);
                int dice2Value = diceRollList.get(1);
                int dice3Value = diceRollList.get(2);
                System.out.println(BuncoDialogue.DiceOutput(dice1Value, dice2Value, dice3Value));

                boolean pointGain = ((dice1Value == roundNumber) || (dice2Value == roundNumber) || (dice3Value == roundNumber));
                boolean DiceTriples = (dice1Value == dice2Value) && (dice2Value == dice3Value);
                playerScore = BuncoDice.Scoring(playerScore, roundNumber, diceRollList);

                turnContinue = pointGain || DiceTriples;

                if (playerNumber==1) {
                    System.out.println(BuncoDialogue.PlayerScoreDisplay(playerScore));
                }else{
                    System.out.println(BuncoDialogue.Player1ScoreDisplay(playerScore));
                }
                diceRollList.clear();

                if (playerScore >= 21) {
                    if (playerNumber==1) {
                        System.out.println(BuncoDialogue.PlayerWinDisplay());
                    }else{
                        System.out.println(BuncoDialogue.Player1WinDisplay());
                    }
                    System.exit(1);
                }

                DesktopArcadeDialogue.EnterContinue();


            } while (turnContinue);
            if (playerNumber==1) {
                compScore = BuncoCompTurn.CompTurn(compScore, roundNumber);
            }
            else{
                player2Score=BuncoMultiplayer.player2Turn(player2Score, roundNumber);
            }
            roundNumber++;
            if (roundNumber > 6) {
                roundNumber = 1;
            }
        }
    }

}
