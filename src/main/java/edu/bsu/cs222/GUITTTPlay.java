package edu.bsu.cs222;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

public class GUITTTPlay implements Initializable {
    @FXML
    private TextArea ruleBox;
    @FXML
    private TextField userInput;
    @FXML
    private TextArea space1, space2, space3, space4, space5, space6, space7, space8, space9;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
            ruleBox.appendText(DesktopArcadeDialogue.GUITTTRules());
        }
}
