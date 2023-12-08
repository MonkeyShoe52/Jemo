module com.example.jemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.jemo to javafx.fxml;
    exports com.example.jemo;
}