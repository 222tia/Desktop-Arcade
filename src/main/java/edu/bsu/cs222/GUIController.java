package edu.bsu.cs222;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class GUIController implements Initializable {
    @FXML
    public Label homeName;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    public void onRPSClick() throws IOException {
            FXMLLoader RPSLoader = new FXMLLoader(getClass().getResource("RPS-play.fxml"));
            Parent root1 = RPSLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
    }

    @FXML
    protected void onBuncoClick() throws IOException {
        FXMLLoader BuncoLoader = new FXMLLoader(getClass().getResource("Bunco-play.fxml"));
        Parent root1 = BuncoLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();
    }

    @FXML
    protected void onTTTClick() throws IOException {
        FXMLLoader TTTLoader = new FXMLLoader(getClass().getResource("TTT-play.fxml"));
        Parent root1 = TTTLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root1));
        stage.show();

    }

}