package edu.bsu.cs222.GUIBunco;

import edu.bsu.cs222.Bunco.BuncoDialogue;
import edu.bsu.cs222.Bunco.BuncoDice;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class GUIBuncoPlay implements Initializable {

    static List<Integer> diceRollList = new ArrayList<>();
    public TextArea buncoRuleArea;
    public TextArea buncoTextArea;
    public TextArea buncoScoreArea;
    public int playerScore = 0;
    public int compScore = 0;
    public int player2Score = 0;
    public int roundNumber = 1;
    public int turnOrder = 1;
    public int playerNumber;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        buncoRuleArea.setText(BuncoDialogue.GUIBuncoRules());

    }

    @FXML
    public void onBuncoDiceClick() {

        if (playerNumber == 1) {
            if (!(BuncoDice.winReturn(playerScore)) && !(BuncoDice.winReturn(player2Score)) || !(BuncoDice.winReturn(playerScore)) && !(BuncoDice.winReturn(compScore))) {
                buncoScoreArea.setText(BuncoDialogue.ScoreDisplay(playerScore, compScore));
                if (turnOrder == 1) {
                    buncoTextArea.setText(BuncoDialogue.PlayerTurnDisplay());
                }
                if (turnOrder == 2) {
                    buncoTextArea.setText(BuncoDialogue.Player2TurnDisplay());
                } else {
                    buncoTextArea.setText(BuncoDialogue.CompTurnDisplay());
                }
                boolean turnContinue;
                buncoTextArea.appendText(BuncoDialogue.RoundDisplay(roundNumber));

                diceRollList = BuncoDice.getDiceRolls();

                buncoTextArea.appendText(BuncoDialogue.DiceOutput(diceRollList));

                boolean pointGain = BuncoDice.PointGain(roundNumber, diceRollList);
                boolean DiceTriples = BuncoDice.DiceTriples(diceRollList);
                if (turnOrder == 1) {
                    playerScore = BuncoDice.Scoring(playerScore, roundNumber, diceRollList);
                } else {
                    compScore = BuncoDice.Scoring(compScore, roundNumber, diceRollList);
                }

                turnContinue = BuncoDice.turnContinue(pointGain, DiceTriples);

                buncoScoreArea.setText(BuncoDialogue.ScoreDisplay(playerScore, compScore));
                diceRollList.clear();

                if (playerScore >= 21) {
                    buncoTextArea.appendText(BuncoDialogue.PlayerWinDisplay());
                }
                if (compScore >= 21) {
                    buncoTextArea.appendText(BuncoDialogue.CompWinDisplay());
                }

                if ((turnContinue) && (turnOrder == 1) && (playerScore < 21)) {
                    buncoTextArea.appendText(BuncoDialogue.PlayerContinueDisplay());
                }
                if ((turnContinue) && (turnOrder == 2) && (compScore < 21)) {
                    buncoTextArea.appendText(BuncoDialogue.CompContinueDisplay());
                }
                if (!turnContinue) {
                    if (turnOrder == 1) {
                        turnOrder = 2;
                    } else {
                        turnOrder = 1;
                        roundNumber=BuncoDice.round(roundNumber);
                    }
                }
            } else {
                buncoTextArea.appendText(BuncoDialogue.RestartDisplay());
            }
        } else {
            if ((playerScore < 21) && (player2Score < 21)) {
                buncoScoreArea.setText(BuncoDialogue.ScoreDisplay(playerScore, player2Score));
                if (turnOrder == 1) {
                    buncoTextArea.setText(BuncoDialogue.Player1TurnDisplay());
                } else {
                    buncoTextArea.setText(BuncoDialogue.Player2TurnDisplay());
                }
                boolean turnContinue;
                buncoTextArea.appendText(BuncoDialogue.RoundDisplay(roundNumber));

                diceRollList = BuncoDice.getDiceRolls();

                buncoTextArea.appendText(BuncoDialogue.DiceOutput(diceRollList));

                boolean pointGain = BuncoDice.PointGain(roundNumber, diceRollList);
                boolean DiceTriples = BuncoDice.DiceTriples(diceRollList);
                if (turnOrder == 1) {
                    playerScore = BuncoDice.Scoring(playerScore, roundNumber, diceRollList);
                } else {
                    player2Score = BuncoDice.Scoring(player2Score, roundNumber, diceRollList);
                }

                turnContinue = pointGain || DiceTriples;

                buncoScoreArea.setText(BuncoDialogue.playerScoreDisplays(playerScore, player2Score));
                diceRollList.clear();

                if (BuncoDice.winReturn(playerScore)) {
                    buncoTextArea.appendText(BuncoDialogue.Player1WinDisplay());
                }
                if (BuncoDice.winReturn(player2Score)) {
                    buncoTextArea.appendText(BuncoDialogue.Player2WinDisplay());
                }

                if ((turnContinue) && (turnOrder == 1) && (!BuncoDice.winReturn(playerScore))) {
                    buncoTextArea.appendText(BuncoDialogue.Player1ContinueDisplay());
                }
                if ((turnContinue) && (turnOrder == 2) && (!BuncoDice.winReturn(player2Score))) {
                    buncoTextArea.appendText(BuncoDialogue.Player2ContinueDisplay());
                }
                if (!turnContinue) {
                    if (turnOrder == 1) {
                        turnOrder = 2;
                    } else {
                        turnOrder = 1;
                        roundNumber=BuncoDice.round(roundNumber);
                    }
                }
            } else {
                buncoTextArea.appendText(BuncoDialogue.RestartDisplay());
            }
        }
    }
}




