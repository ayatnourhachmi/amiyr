module com.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.mail;
    requires fontawesomefx;
    requires javafx.graphics;

    opens com.example to javafx.fxml;

    exports com.example;
}
