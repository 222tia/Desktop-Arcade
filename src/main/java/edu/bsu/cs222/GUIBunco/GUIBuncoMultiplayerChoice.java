package edu.bsu.cs222.GUIBunco;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GUIBuncoMultiplayerChoice {

    @FXML
    public void onBuncoSinglePlayerClick() throws IOException {
        FXMLLoader BuncoLoader = new FXMLLoader(getClass().getResource("Bunco-Singleplayer-play.fxml"));
        Parent Buncoroot = BuncoLoader.load();
        Stage BuncoStage = new Stage();
        BuncoStage.setScene(new Scene(Buncoroot));
        BuncoStage.show();
    }

    @FXML
    public void onBuncoMultiPlayerClick() throws IOException{
        FXMLLoader BuncoLoader = new FXMLLoader(getClass().getResource("Bunco-Multiplayer-play.fxml"));
        Parent Buncoroot = BuncoLoader.load();
        Stage BuncoStage = new Stage();
        BuncoStage.setScene(new Scene(Buncoroot));
        BuncoStage.show();
    }

}
