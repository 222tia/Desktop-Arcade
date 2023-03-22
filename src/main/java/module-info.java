module finalproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.bsu.cs222.finalproject to javafx.fxml;
    exports edu.bsu.cs222.finalproject;
    exports RockPaperScissorsGame;
    opens RockPaperScissorsGame to javafx.fxml;
}