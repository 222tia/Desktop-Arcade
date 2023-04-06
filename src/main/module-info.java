module edu.bsu.cs222.finalretribution {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.bsu.cs222.finalretribution to javafx.fxml;
    exports edu.bsu.cs222.finalretribution;
}