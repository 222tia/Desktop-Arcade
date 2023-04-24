package edu.bsu.cs222;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class GUITTTMultiplayerChoice {
    @FXML
    Button singleplayerTTT;
    @FXML
    Button multiplayerTTT;

    @FXML
    public void onTTTSinglePlayerClick() throws IOException {
        FXMLLoader TTTLoader = new FXMLLoader(getClass().getResource("TTTS-play.fxml"));
        Parent TTTroot = TTTLoader.load();
        Stage Singleplayerstage = new Stage();
        Singleplayerstage.setScene(new Scene(TTTroot));
        Singleplayerstage.show();
    }

    @FXML
    public void onTTTMultiPlayerClick() throws IOException {
        FXMLLoader TTTLoader = new FXMLLoader(getClass().getResource("TTTM-play.fxml"));
        Parent TTTroot = TTTLoader.load();
        Stage Multiplayerstage = new Stage();
        Multiplayerstage.setScene(new Scene(TTTroot));
        Multiplayerstage.show();
    }
}
