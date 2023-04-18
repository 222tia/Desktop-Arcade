package edu.bsu.cs222;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GUIMultiplayerChoice {
    @FXML
    public void onBuncoMultiplayerClick(){

    }

    @FXML
    public void onBuncoSingleplayerClick() throws IOException {
        FXMLLoader BuncoLoader = new FXMLLoader(getClass().getResource("Bunco-play.fxml"));
        Parent Buncoroot = BuncoLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(Buncoroot));
        stage.show();
    }

    @FXML
    public void onTTTMultiplayerClick(){

    }

    @FXML
    public void  onTTTSingleplayerClick() throws IOException {
        FXMLLoader TTTLoader = new FXMLLoader(getClass().getResource("TTT-play.fxml"));
        Parent TTTroot = TTTLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(TTTroot));
        stage.show();
    }
}
