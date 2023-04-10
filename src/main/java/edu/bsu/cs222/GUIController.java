package edu.bsu.cs222;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class GUIController {
    @FXML
    public Label homeName;


    @FXML
    public void onRPSClick() throws IOException {
        FXMLLoader RPSLoader = new FXMLLoader(getClass().getResource("RPS-play.fxml"));
        Parent RPSroot = RPSLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(RPSroot));
        stage.show();
    }

    @FXML
    public void onBuncoClick() throws IOException {
        FXMLLoader BuncoLoader = new FXMLLoader(getClass().getResource("Bunco-play.fxml"));
        Parent Buncoroot = BuncoLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(Buncoroot));
        stage.show();
    }

    @FXML
    public void onTTTClick() throws IOException {
        FXMLLoader TTTLoader = new FXMLLoader(getClass().getResource("TTT-play.fxml"));
        Parent TTTroot = TTTLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(TTTroot));
        stage.show();

    }

}