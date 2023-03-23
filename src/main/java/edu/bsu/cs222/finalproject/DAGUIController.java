package edu.bsu.cs222.finalproject;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class DAGUIController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}