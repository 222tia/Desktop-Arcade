package edu.bsu.cs222;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class GUIApplication extends Application {
    @Override
    public void start(Stage hubStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(GUIApplication.class.getResource("Hub-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        hubStage.setScene(scene);
        hubStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}