package edu.bsu.cs222;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;


import java.net.URL;
import java.util.ResourceBundle;

import static edu.bsu.cs222.RPSResultDecider.winCondition;

public class GUIRPSPlay implements Initializable {

    @FXML
    private ChoiceBox<String> userPlayChoice;
    @FXML
    private TextArea scoreTextArea;
    @FXML
    private TextArea gameTextArea;
    @FXML
    private Button playButton;

    private final String[] playChoices = {"rock", " paper", "scissors"};

    public void initialize(URL location, ResourceBundle resources) {
        userPlayChoice.getItems().addAll(playChoices);
        gameTextArea.setText("put rules here");
        scoreTextArea.setText("Play to begin!");
        playButton.setOnAction(event -> onPlayClick());
    }

    @FXML
    public void onPlayClick() {
       gameTextArea.setText("test");
       scoreTextArea.setText("second");
    }
}
