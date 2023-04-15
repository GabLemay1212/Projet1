module com.example.gtc {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.gtc to javafx.fxml;
    exports com.example.gtc;
}