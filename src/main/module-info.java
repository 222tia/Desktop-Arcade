module edu.bsu.cs222 {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.bsu.cs222 to javafx.fxml;
    exports edu.bsu.cs222;
}