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

public class GUIBuncoPlay implements Initializable {

    static List<Integer> diceRollList = new ArrayList<>();
    public TextArea buncoRuleArea;
    public TextArea buncoTextArea;
    public TextArea buncoScoreArea;
    public int playerScore = 0;
    public int compScore = 0;
    public int roundNumber = 1;
    public int turnOrder = 1;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        buncoRuleArea.setText(BuncoDialogue.GUIBuncoRules());
    }
    @FXML
    public void onBuncoDiceClick() {
            if (BuncoDice.gameEndCheck(playerScore,compScore)) {
                buncoScoreArea.setText(BuncoDialogue.ScoreDisplay(playerScore, compScore));
                buncoTextArea.setText(BuncoDialogue.TurnDisplay(turnOrder));
                buncoTextArea.appendText(BuncoDialogue.RoundDisplay(roundNumber));
                diceRollList = BuncoDice.getDiceRolls();

                buncoTextArea.appendText(BuncoDialogue.DiceOutput(diceRollList));

                boolean pointGain = BuncoDice.PointGain(roundNumber, diceRollList);
                boolean DiceTriples = BuncoDice.DiceTriples(diceRollList);
                boolean turnContinue = BuncoDice.turnContinue(pointGain, DiceTriples);
                if (turnOrder == 1) {
                    playerScore = BuncoDice.Scoring(playerScore, roundNumber, diceRollList);
                    buncoTextArea.appendText(BuncoDialogue.ContinueCheck(turnContinue, turnOrder, playerScore));
                    buncoTextArea.appendText(BuncoDialogue.WinCondition(playerScore, turnOrder));
                } else {
                    compScore = BuncoDice.Scoring(compScore, roundNumber, diceRollList);
                    buncoTextArea.appendText(BuncoDialogue.ContinueCheck(turnContinue, turnOrder, compScore));
                    buncoTextArea.appendText(BuncoDialogue.WinCondition(compScore, turnOrder));
                }
                buncoScoreArea.setText(BuncoDialogue.ScoreDisplay(playerScore, compScore));
                diceRollList.clear();

                if (turnOrder==2){
                roundNumber=BuncoDice.round(roundNumber);}
                turnOrder=BuncoDice.playerTurnCheck(turnOrder);
            } else {
                buncoTextArea.appendText(BuncoDialogue.RestartDisplay());
            }
    }
}