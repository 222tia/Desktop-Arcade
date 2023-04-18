package edu.bsu.cs222;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class GUIController {
    @FXML
    public Label homeName;
    public VBox hubView;

    @FXML
    public void onRPSClick() throws IOException {
        FXMLLoader RPSLoader = new FXMLLoader(getClass().getResource("RPS-play.fxml"));
        Parent RPSroot = RPSLoader.load();
        Stage RPSStage = new Stage();
        RPSStage.setScene(new Scene(RPSroot));
        RPSStage.show();
    }

    @FXML
    public void onBuncoClick() throws IOException {
            FXMLLoader MultiplayerLoader = new FXMLLoader(getClass().getResource("Hub-Multiplayer-view.fxml"));
            Parent Multiplayerroot = MultiplayerLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(Multiplayerroot));
            stage.show();
        }


    @FXML
    public void onTTTClick() throws IOException {
        FXMLLoader MultiplayerLoader = new FXMLLoader(getClass().getResource("Hub-Multiplayer-view.fxml"));
        Parent Multiplayerroot = MultiplayerLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(Multiplayerroot));
        stage.show();
    }

}