module com.example.ctc {
    requires javafx.controls;
    requires javafx.fxml;


    opens qc.ca.colval.ctc to javafx.fxml;
    exports qc.ca.colval.ctc;
}