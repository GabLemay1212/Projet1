module com.example.qtc {
    requires javafx.controls;
    requires javafx.fxml;


    opens qc.ca.colval.qtc to javafx.fxml;
    exports qc.ca.colval.qtc;
    exports qc.ca.colval.qtc.FEL;
    opens qc.ca.colval.qtc.FEL to javafx.fxml;
}