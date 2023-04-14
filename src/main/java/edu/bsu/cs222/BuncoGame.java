package edu.bsu.cs222;

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
            System.out.println(BuncoDialogue.PlayerTurnDisplay());
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

                System.out.println(BuncoDialogue.PlayerScoreDisplay(playerScore));
                diceRollList.clear();

                if (playerScore >= 21) {
                    System.out.println(BuncoDialogue.PlayerWinDisplay());
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
