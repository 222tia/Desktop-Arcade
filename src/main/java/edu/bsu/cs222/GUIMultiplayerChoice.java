package edu.bsu.cs222;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class GUIMultiplayerChoice {
    @FXML
    public AnchorPane hubMultiplayer;

    @FXML
    public void onBuncoMultiplayerClick(){

    }

    @FXML
    public void onBuncoSingleplayerClick(){
        /**FXMLLoader BuncoLoader = new FXMLLoader(getClass().getResource("Bunco-play.fxml"));
         Parent Buncoroot = BuncoLoader.load();
         Stage stage = new Stage();
         stage.setScene(new Scene(Buncoroot));
         stage.show();**/
    }

    @FXML
    public void onTTTMultiplayerClick(){

    }

    @FXML
    public void  onTTTSingleplayerClick(){
        /**FXMLLoader TTTLoader = new FXMLLoader(getClass().getResource("TTT-play.fxml"));
         Parent TTTroot = TTTLoader.load();
         Stage stage = new Stage();
         stage.setScene(new Scene(TTTroot));
         stage.show();**/
    }
}
