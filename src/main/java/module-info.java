module com.example.lgsharepointbackup {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lgsharepointbackup to javafx.fxml;
    exports com.example.lgsharepointbackup;
}