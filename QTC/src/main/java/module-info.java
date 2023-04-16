module com.example.qtc {
    requires javafx.controls;
    requires javafx.fxml;


    opens qc.ca.colval.qtc to javafx.fxml;
    exports qc.ca.colval.qtc;
}