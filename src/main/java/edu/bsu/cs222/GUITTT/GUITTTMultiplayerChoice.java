package edu.bsu.cs222.GUITTT;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class GUITTTMultiplayerChoice {

    @FXML
    public void onTTTSinglePlayerClick() throws IOException {
        FXMLLoader TTTLoader = new FXMLLoader(getClass().getResource("TTT-Singleplayer-play.fxml"));
        Parent TTTroot = TTTLoader.load();
        Stage Singleplayerstage = new Stage();
        Singleplayerstage.setScene(new Scene(TTTroot));
        Singleplayerstage.show();
    }

    @FXML
    public void onTTTMultiPlayerClick() throws IOException {
        FXMLLoader TTTLoader = new FXMLLoader(getClass().getResource("TTT-Multiplayer-play.fxml"));
        Parent TTTroot = TTTLoader.load();
        Stage Multiplayerstage = new Stage();
        Multiplayerstage.setScene(new Scene(TTTroot));
        Multiplayerstage.show();
    }
}
