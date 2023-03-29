package edu.bsu.cs222.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class DAController {
    @FXML
    public Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    public void onRPSClick(ActionEvent actionEvent) {
        DesktopArcadeDialogue.RPSRules();
    }

    public void onBuncoClick(ActionEvent actionEvent) {
        DesktopArcadeDialogue.BuncoRules();
    }

    public void onTTTClick(ActionEvent actionEvent) {
        DesktopArcadeDialogue.TTTRules();
    }

}