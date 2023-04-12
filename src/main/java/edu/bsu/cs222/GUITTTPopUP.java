package edu.bsu.cs222;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class GUITTTPopUP implements Initializable{

        private final String[] letterChoice = {"X", "O"};



        @FXML
        public void onTTTInput() throws IOException {

        }

        @Override
        public void initialize(URL location, ResourceBundle resources) {
            ChoiceBox.getItems().addAll(letterChoice);
        }
}
