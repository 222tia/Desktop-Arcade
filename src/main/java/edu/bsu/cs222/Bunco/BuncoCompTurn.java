package edu.bsu.cs222.Bunco;

import edu.bsu.cs222.DesktopArcadeDialogue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BuncoCompTurn {
    static List<Integer> diceRollList = new ArrayList<>();
    public static Integer compTurn(int compScore, int roundNumber) throws IOException {
        boolean turnContinue;
        System.out.println(BuncoDialogue.singleTurnDisplay(2));
        do {
            System.out.println(BuncoDialogue.roundDisplay(roundNumber));
            diceRollList = BuncoDice.getDiceRolls();

            System.out.println(BuncoDialogue.diceOutput(diceRollList));



            boolean pointGain = BuncoDice.pointGain(roundNumber, diceRollList);
            boolean DiceTriples = BuncoDice.diceTriples(diceRollList);
            compScore = BuncoDice.scoring(compScore, roundNumber, diceRollList);
            turnContinue = BuncoDice.turnContinue(pointGain, DiceTriples);
            System.out.println(BuncoDialogue.compScoreDisplay(compScore));
            diceRollList.clear();

            if (BuncoDice.winReturn(compScore)) {
                System.out.println(BuncoDialogue.compWinDisplay());
                System.exit(1);
            }

            DesktopArcadeDialogue.enterContinue();


        } while (turnContinue);
        return compScore;
    }
}
