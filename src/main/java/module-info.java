module org.amida.tablewarestoreapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.amida.tablewarestoreapp to javafx.fxml;
    exports org.amida.tablewarestoreapp;
}