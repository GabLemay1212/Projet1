module com.example.gtc {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens qc.ca.colval.gtc to javafx.fxml;
    exports qc.ca.colval.gtc;
    exports qc.ca.colval.gtc.FEL;
    opens qc.ca.colval.gtc.FEL to javafx.fxml;
}