module dev.normanpendzich.taschenrechner {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens dev.normanpendzich.taschenrechner to javafx.fxml;
    exports dev.normanpendzich.taschenrechner;
}