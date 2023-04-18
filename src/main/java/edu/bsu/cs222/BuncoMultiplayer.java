package edu.bsu.cs222;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BuncoMultiplayer {
    static List<Integer> diceRollList = new ArrayList<>();
    public static int player2Turn(int player2Score, int roundNumber) throws IOException {
            boolean turnContinue;
            System.out.println(BuncoDialogue.Player2TurnDisplay());
            do {
                System.out.println(BuncoDialogue.RoundDisplay(roundNumber));
                diceRollList = BuncoDice.getDiceRolls();

                int dice1Value = diceRollList.get(0);
                int dice2Value = diceRollList.get(1);
                int dice3Value = diceRollList.get(2);

                System.out.println(BuncoDialogue.DiceOutput(dice1Value, dice2Value, dice3Value));



                boolean pointGain = ((dice1Value== roundNumber) || (dice2Value== roundNumber) || (dice3Value == roundNumber));
                boolean DiceTriples = (dice1Value == dice2Value) && (dice2Value == dice3Value);
                player2Score = BuncoDice.Scoring(player2Score, roundNumber, diceRollList);
                turnContinue = pointGain || DiceTriples;
                System.out.println(BuncoDialogue.Player2ScoreDisplay(player2Score));
                diceRollList.clear();

                if (player2Score >= 21) {
                    System.out.println(BuncoDialogue.Player2WinDisplay());
                    System.exit(1);
                }

                DesktopArcadeDialogue.EnterContinue();


            } while (turnContinue);
            return player2Score;
        }
    }

