package edu.bsu.cs222;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class GUITTTPlay implements Initializable {
    @FXML
    private TextArea ruleBox;
    private final String[] letterChoice = {"X", "O"};
    @FXML
    private ChoiceBox<String> letterChoiceBox;
    @FXML
    private TextField userInput;
    @FXML
    private TextArea space1, space2, space3, space4, space5, space6, space7, space8, space9;

    public GUITTTPlay() {
    }

    @FXML
    public void onTTTInput() throws IOException {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ruleBox.appendText(GUITTTDialogue.GUITTTRules());
        letterChoiceBox.getItems().addAll(letterChoice);
        }
}
