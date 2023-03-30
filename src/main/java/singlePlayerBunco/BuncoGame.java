package singlePlayerBunco;

import edu.bsu.cs222.finalproject.DesktopArcadeDialogue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BuncoGame {
    static List<Integer> diceRollList = new ArrayList<>();
    @SuppressWarnings("InfiniteLoopStatement")
    public static void playBunco() throws IOException {

        int playerScore = 0;
        int compScore = 0;
        int roundNumber = 1;


        while (true) {
            BuncoDialogue.PlayerTurnDisplay();
            boolean turnContinue;
            do {
                BuncoDialogue.RoundDisplay(roundNumber);

                diceRollList = BuncoDice.getDiceRolls();

                int dice1Value = diceRollList.get(0);
                int dice2Value = diceRollList.get(1);
                int dice3Value = diceRollList.get(2);
                BuncoDialogue.DiceOutput(dice1Value, dice2Value, dice3Value);

                boolean pointGain = ((dice1Value == roundNumber) || (dice2Value == roundNumber) || (dice3Value == roundNumber));
                boolean DiceTriples = (dice1Value == dice2Value) && (dice2Value == dice3Value);
                playerScore = BuncoDice.Scoring(playerScore, roundNumber, diceRollList);

                turnContinue = pointGain || DiceTriples;

                BuncoDialogue.PlayerScoreDisplay(playerScore);
                diceRollList.clear();

                if (playerScore >= 21) {
                    BuncoDialogue.PlayerWinDisplay();
                }

                DesktopArcadeDialogue.EnterContinue();


            } while (turnContinue);
            compScore = BuncoCompTurn.CompTurn(compScore, roundNumber);
            roundNumber++;
            if (roundNumber > 6) {
                roundNumber = 1;
            }
        }
        }

    }
