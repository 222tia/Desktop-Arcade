package edu.bsu.cs222;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;


import java.net.URL;
import java.util.ResourceBundle;

public class GUIRPSPlay implements Initializable {

    @FXML
    private ChoiceBox<String> userPlayChoice;
    @FXML
    private TextArea scoreTextArea;
    @FXML
    private TextArea gameTextArea;
    @FXML
    private Button playButton;

    private final String[] playChoices = {"rock", "paper", "scissors"};
    public int userScore = 0;
    public int computerScore = 0;
    public int roundNumber = 0;

    public void initialize(URL location, ResourceBundle resources) {
        userPlayChoice.getItems().addAll(playChoices);
        gameTextArea.setText(DesktopArcadeDialogue.GUIRPSRules());
        scoreTextArea.setText("Play to begin!");
        playButton.setOnAction(event -> onPlayClick());
    }

    @FXML
    public void onPlayClick() {

        if (userScore< 3 || computerScore < 3) {

            roundNumber+=1;

            String userPlay = userPlayChoice.getValue();
            String computerPlay = RPSPlayRandomizer.getRandomPlay();

            gameTextArea.setText("Round " + roundNumber + "\n\n" +
                    RPSDialogue.showRoundResult(userPlay, computerPlay));

            userScore = RPSScoreKeeper.addUserScore(computerPlay, userPlay, userScore);
            computerScore = RPSScoreKeeper.addComputerScore(computerPlay, userPlay, computerScore);

            scoreTextArea.setText(RPSDialogue.showScore(userScore, computerScore));

            if (RPSScoreKeeper.checkScore(computerScore, userScore) || RPSScoreKeeper.checkScore(userScore, computerScore)){
                gameTextArea.setText(RPSDialogue.showGameResult(userScore, computerScore));
            }

        }
    }
}
