package edu.bsu.cs222;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class GUIRPSPlay implements Initializable {

    @FXML
    private Label userPlayPrompt;
    @FXML
    private ChoiceBox<String> userPlayChoice;

    private final String[] playChoices = {"rock", " paper", "scissors"};

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        userPlayChoice.getItems().addAll(playChoices);
    }

    @FXML
    public void onPlayClick() throws IOException {

    }
}
