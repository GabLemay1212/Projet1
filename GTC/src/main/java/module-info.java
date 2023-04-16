module com.example.gtc {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens qc.ca.colval.gtc to javafx.fxml;
    exports qc.ca.colval.gtc;
}