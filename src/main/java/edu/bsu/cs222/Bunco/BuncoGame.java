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

                System.out.println(BuncoDialogue.DiceOutput(diceRollList));

                boolean pointGain = BuncoDice.PointGain(roundNumber, diceRollList);
                boolean DiceTriples = BuncoDice.DiceTriples(diceRollList);
                playerScore = BuncoDice.Scoring(playerScore, roundNumber, diceRollList);

                turnContinue = BuncoDice.turnContinue(pointGain, DiceTriples);

                if (playerNumber==1) {
                    System.out.println(BuncoDialogue.PlayerScoreDisplay(playerScore));
                }else{
                    System.out.println(BuncoDialogue.Player1ScoreDisplay(playerScore));
                }
                diceRollList.clear();

                if (BuncoDice.winReturn(playerScore)) {
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
            roundNumber=BuncoDice.round(roundNumber);
        }
    }

}
