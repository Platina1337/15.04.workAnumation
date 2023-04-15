module com.example.application_ {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.application_ to javafx.fxml;
    exports com.example.application_;
}