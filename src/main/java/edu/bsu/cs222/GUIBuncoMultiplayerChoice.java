package edu.bsu.cs222;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class GUIBuncoMultiplayerChoice {
    @FXML
    Button singleplayerBunco;
    @FXML
    Button multiplayerBunco;

    @FXML
    public void onBuncoSinglePlayerClick() throws IOException {
        FXMLLoader BuncoLoader = new FXMLLoader(getClass().getResource("BuncoSingle-play.fxml"));
        Parent Buncoroot = BuncoLoader.load();
        Stage BuncoStage = new Stage();
        BuncoStage.setScene(new Scene(Buncoroot));
        BuncoStage.show();
    }

    @FXML
    public void onBuncoMultiPlayerClick() throws IOException{
        FXMLLoader BuncoLoader = new FXMLLoader(getClass().getResource("BuncoMulti-play.fxml"));
        Parent Buncoroot = BuncoLoader.load();
        Stage BuncoStage = new Stage();
        BuncoStage.setScene(new Scene(Buncoroot));
        BuncoStage.show();
    }

}
