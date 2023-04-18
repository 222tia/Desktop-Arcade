package edu.bsu.cs222;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BuncoCompTurn {
    static List<Integer> diceRollList = new ArrayList<>();
    public static Integer CompTurn(int compScore, int roundNumber) throws IOException {
        boolean turnContinue;
        System.out.println(BuncoDialogue.CompTurnDisplay());
        do {
            System.out.println(BuncoDialogue.RoundDisplay(roundNumber));
            diceRollList = BuncoDice.getDiceRolls();

            int dice1Value = diceRollList.get(0);
            int dice2Value = diceRollList.get(1);
            int dice3Value = diceRollList.get(2);

            System.out.println(BuncoDialogue.DiceOutput(dice1Value, dice2Value, dice3Value));



            boolean pointGain = ((dice1Value== roundNumber) || (dice2Value== roundNumber) || (dice3Value == roundNumber));
            boolean DiceTriples = (dice1Value == dice2Value) && (dice2Value == dice3Value);
            compScore = BuncoDice.Scoring(compScore, roundNumber, diceRollList);
            turnContinue = pointGain || DiceTriples;
            System.out.println(BuncoDialogue.CompScoreDisplay(compScore));
            diceRollList.clear();

            if (compScore >= 21) {
                System.out.println(BuncoDialogue.CompWinDisplay());
                System.exit(1);
            }

            DesktopArcadeDialogue.EnterContinue();


        } while (turnContinue);
        return compScore;
    }
}
