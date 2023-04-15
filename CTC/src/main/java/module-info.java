module com.example.ctc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ctc to javafx.fxml;
    exports com.example.ctc;
}