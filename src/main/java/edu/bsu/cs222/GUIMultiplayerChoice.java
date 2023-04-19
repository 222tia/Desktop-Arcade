package edu.bsu.cs222;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class GUIMultiplayerChoice {
    @FXML
    public AnchorPane hubBuncoMultiplayer;
    public AnchorPane hubTTTMultiplayer;

    @FXML
    public void multiBuncoPlay(){

    }

    @FXML
    public void singleBuncoPlay() throws IOException {
        FXMLLoader BuncoLoader = new FXMLLoader(getClass().getResource("Bunco-play.fxml"));
        Parent Buncoroot = BuncoLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(Buncoroot));
        stage.show();
    }

    @FXML
    public void multiTTTPlay() throws IOException {
        FXMLLoader TTTLoader = new FXMLLoader(getClass().getResource("TTT-play-single.fxml"));
        Parent TTTroot = TTTLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(TTTroot));
        stage.show();
    }

    @FXML
    public void singleTTTPlay() throws IOException {
        FXMLLoader TTTLoader = new FXMLLoader(getClass().getResource("TTT-play-single.fxml"));
        Parent TTTroot = TTTLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(TTTroot));
        stage.show();
    }
}
