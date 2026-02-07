module com.example.myjavafxcrud {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphicsEmpty;
    requires java.sql;
//    requires mysql.connector.java;

    requires com.dlsc.formsfx;

    opens com.example.myjavafxcrud to javafx.fxml;
    exports com.example.myjavafxcrud;
}