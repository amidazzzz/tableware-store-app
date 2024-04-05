module org.amida.tablewarestoreapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.amida.tablewarestoreapp to javafx.fxml;
    opens org.amida.tablewarestoreapp.controller to javafx.fxml;
    exports org.amida.tablewarestoreapp;
}