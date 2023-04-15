module com.example.qtc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.qtc to javafx.fxml;
    exports com.example.qtc;
}