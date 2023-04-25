package edu.bsu.cs222;

import edu.bsu.cs222.Bunco.BuncoDialogue;
import edu.bsu.cs222.Bunco.BuncoDice;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class GUIBuncoMultiplayer implements Initializable {

    static List<Integer> diceRollList = new ArrayList<>();
    public TextArea buncoRuleArea;
    public TextArea buncoTextArea;
    public TextArea buncoScoreArea;
    public int playerScore = 0;
    public int player2Score = 0;
    public int roundNumber = 1;
    public int turnOrder = 1;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        buncoRuleArea.setText(BuncoDialogue.GUIBuncoMultiplayerRules());

    }

    @FXML
    public void onBuncoDiceClick() {
            if (!(BuncoDice.winReturn(playerScore)) && !(BuncoDice.winReturn(player2Score))) {
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

                turnContinue = BuncoDice.turnContinue(pointGain, DiceTriples);

                buncoScoreArea.setText(BuncoDialogue.playerScoreDisplays(playerScore, player2Score));
                diceRollList.clear();

                if (BuncoDice.winReturn(playerScore)) {
                    buncoTextArea.appendText(BuncoDialogue.Player1WinDisplay());
                }
                if (BuncoDice.winReturn(player2Score)) {
                    buncoTextArea.appendText(BuncoDialogue.Player2WinDisplay());
                }

                if ((turnContinue) && (turnOrder == 1) && !(BuncoDice.winReturn(playerScore))) {
                    buncoTextArea.appendText(BuncoDialogue.Player1ContinueDisplay());
                }
                if ((turnContinue) && (turnOrder == 2) && !(BuncoDice.winReturn(player2Score))) {
                    buncoTextArea.appendText(BuncoDialogue.Player2ContinueDisplay());
                }
                if (!turnContinue) {
                    turnOrder=BuncoDice.playerTurnCheck(turnOrder);
                    roundNumber=BuncoDice.round(roundNumber);
                }
            } else {
                buncoTextArea.appendText(BuncoDialogue.RestartDisplay());
            }
        }
    }