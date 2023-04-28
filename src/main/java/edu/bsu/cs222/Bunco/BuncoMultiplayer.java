package edu.bsu.cs222.Bunco;

import edu.bsu.cs222.DesktopArcadeDialogue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BuncoMultiplayer {
    static List<Integer> diceRollList = new ArrayList<>();
    public static int player2Turn(int player2Score, int roundNumber) throws IOException {
            boolean turnContinue;
            System.out.println(BuncoDialogue.multiTurnDisplay(2));
            do {
                System.out.println(BuncoDialogue.roundDisplay(roundNumber));
                diceRollList = BuncoDice.getDiceRolls();

                System.out.println(BuncoDialogue.diceOutput(diceRollList));



                boolean pointGain = BuncoDice.PointGain(roundNumber, diceRollList);
                boolean DiceTriples = BuncoDice.DiceTriples(diceRollList);
                player2Score = BuncoDice.Scoring(player2Score, roundNumber, diceRollList);
                turnContinue = BuncoDice.turnContinue(pointGain, DiceTriples);
                System.out.println(BuncoDialogue.player2ScoreDisplay(player2Score));
                diceRollList.clear();

                if (BuncoDice.winReturn(player2Score)) {
                    System.out.println(BuncoDialogue.player2WinDisplay());
                    System.exit(1);
                }

                DesktopArcadeDialogue.EnterContinue();


            } while (turnContinue);
            return player2Score;
        }
    }

