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
               buncoScoreArea.setText(BuncoDialogue.multiScoreDisplay(playerScore, player2Score));
                buncoTextArea.setText(BuncoDialogue.multiTurnDisplay(turnOrder));
                buncoTextArea.appendText(BuncoDialogue.roundDisplay(roundNumber));
                diceRollList = BuncoDice.getDiceRolls();

                buncoTextArea.appendText(BuncoDialogue.diceOutput(diceRollList));

                boolean pointGain = BuncoDice.PointGain(roundNumber, diceRollList);
                boolean DiceTriples = BuncoDice.DiceTriples(diceRollList);
                boolean turnContinue = BuncoDice.turnContinue(pointGain, DiceTriples);
                if (turnOrder == 1) {
                    playerScore = BuncoDice.Scoring(playerScore, roundNumber, diceRollList);
                    buncoTextArea.appendText(BuncoDialogue.multiContinueCheck(turnContinue, turnOrder,playerScore));
                    buncoTextArea.appendText(BuncoDialogue.multiWinCondition(playerScore, turnOrder));
                } else {
                    player2Score = BuncoDice.Scoring(player2Score, roundNumber, diceRollList);
                    buncoTextArea.appendText(BuncoDialogue.multiContinueCheck(turnContinue, turnOrder,player2Score));
                    buncoTextArea.appendText(BuncoDialogue.multiWinCondition(player2Score, turnOrder));
                }

                buncoScoreArea.setText(BuncoDialogue.multiScoreDisplay(playerScore, player2Score));
                diceRollList.clear();

                if (!turnContinue) {
                    if (turnOrder==2){
                        roundNumber=BuncoDice.round(roundNumber);}
                    turnOrder=BuncoDice.playerTurnCheck(turnOrder);
                }
            } else {
                buncoTextArea.appendText(BuncoDialogue.restartDisplay());
            }
        }
    }