package edu.bsu.cs222;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;


import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GUIBuncoPlay {

    static List<Integer> diceRollList = new ArrayList<>();
    public TextArea buncoTextArea;
    public TextArea buncoScoreArea;
    public int playerScore = 0;
    public int compScore = 0;
    public int roundNumber = 1;
    public int turnOrder = 1;

    @FXML
    public void onBuncoDiceClick() throws IOException {


        if((playerScore<21)&&(compScore<21)) {
            buncoScoreArea.setText(GUIBuncoDialogue.ScoreDisplay(playerScore, compScore));
            if (turnOrder == 1) {
                buncoTextArea.setText(GUIBuncoDialogue.PlayerTurnDisplay());
            } else {
                buncoTextArea.setText(GUIBuncoDialogue.CompTurnDisplay());
            }
            boolean turnContinue;
            buncoTextArea.appendText(GUIBuncoDialogue.GUIRoundDisplay(roundNumber));

            diceRollList = BuncoDice.getDiceRolls();

            int dice1Value = diceRollList.get(0);
            int dice2Value = diceRollList.get(1);
            int dice3Value = diceRollList.get(2);
            buncoTextArea.appendText(GUIBuncoDialogue.RollOutput(dice1Value, dice2Value, dice3Value));

            boolean pointGain = ((dice1Value == roundNumber) || (dice2Value == roundNumber) || (dice3Value == roundNumber));
            boolean DiceTriples = (dice1Value == dice2Value) && (dice2Value == dice3Value);
            playerScore = BuncoDice.Scoring(playerScore, roundNumber, diceRollList);

            turnContinue = pointGain || DiceTriples;

            buncoScoreArea.setText(GUIBuncoDialogue.ScoreDisplay(playerScore, compScore));
            diceRollList.clear();

            if (playerScore >= 21) {
                buncoTextArea.appendText(GUIBuncoDialogue.PlayerWinDisplay());
            }
            if (compScore >= 21) {
                buncoTextArea.appendText(GUIBuncoDialogue.CompWinDisplay());
            }

            if ((turnContinue) && (turnOrder == 1)) {
                buncoTextArea.appendText(GUIBuncoDialogue.PlayerContinueDisplay());
            }
            if ((turnContinue) && (turnOrder == 2)) {
                buncoTextArea.appendText(GUIBuncoDialogue.CompContinueDisplay());
            } else {
                if (turnOrder == 1) {
                    turnOrder = 2;
                } else {
                    turnOrder = 1;
                }
            }

            roundNumber++;
            if (roundNumber > 6) {
                roundNumber = 1;
            }
        }
        else{
            buncoTextArea.appendText(GUIBuncoDialogue.RestartDisplay());
        }
            }
        }


