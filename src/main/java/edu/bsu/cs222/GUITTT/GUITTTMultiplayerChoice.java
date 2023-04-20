package edu.bsu.cs222.GUITTT;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GUITTTMultiplayerChoice {

    @FXML
    public void onTTTSinglePlayerClick() throws IOException {
        FXMLLoader TTTLoader = new FXMLLoader(getClass().getResource("TTT-play.fxml"));
        Parent TTTroot = TTTLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(TTTroot));
        stage.show();
    }

    @FXML
    public void onTTTMultiPlayerClick() throws IOException {
        FXMLLoader TTTLoader = new FXMLLoader(getClass().getResource("TTT-play.fxml"));
        Parent TTTroot = TTTLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(TTTroot));
        stage.show();
    }
}
