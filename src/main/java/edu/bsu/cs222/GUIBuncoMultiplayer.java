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
        if (BuncoDice.gameEndCheck(playerScore,player2Score)) {
               buncoScoreArea.setText(BuncoDialogue.MultiScoreDisplay(playerScore, player2Score));
                buncoTextArea.setText(BuncoDialogue.MultiTurnDisplay(turnOrder));
                buncoTextArea.appendText(BuncoDialogue.RoundDisplay(roundNumber));
                diceRollList = BuncoDice.getDiceRolls();

                buncoTextArea.appendText(BuncoDialogue.DiceOutput(diceRollList));

                boolean pointGain = BuncoDice.PointGain(roundNumber, diceRollList);
                boolean DiceTriples = BuncoDice.DiceTriples(diceRollList);
                boolean turnContinue = BuncoDice.turnContinue(pointGain, DiceTriples);
                if (turnOrder == 1) {
                    playerScore = BuncoDice.Scoring(playerScore, roundNumber, diceRollList);
                    buncoTextArea.appendText(BuncoDialogue.MultiContinueCheck(turnContinue, turnOrder,playerScore));
                    buncoTextArea.appendText(BuncoDialogue.MultiWinCondition(playerScore, turnOrder));
                } else {
                    player2Score = BuncoDice.Scoring(player2Score, roundNumber, diceRollList);
                    buncoTextArea.appendText(BuncoDialogue.MultiContinueCheck(turnContinue, turnOrder,player2Score));
                    buncoTextArea.appendText(BuncoDialogue.MultiWinCondition(player2Score, turnOrder));
                }

                buncoScoreArea.setText(BuncoDialogue.MultiScoreDisplay(playerScore, player2Score));
                diceRollList.clear();

                if (!turnContinue) {
                    if (turnOrder==2){
                        roundNumber=BuncoDice.round(roundNumber);}
                    turnOrder=BuncoDice.playerTurnCheck(turnOrder);
                }
            } else {
                buncoTextArea.appendText(BuncoDialogue.RestartDisplay());
            }
        }
    }