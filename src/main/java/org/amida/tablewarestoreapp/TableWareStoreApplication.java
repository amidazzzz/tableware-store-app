package org.amida.tablewarestoreapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class TableWareStoreApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/amida/tablewarestoreapp/auth/login.fxml"));
        AnchorPane root = loader.load();
        Scene scene = new Scene(root, 600, 400);
        stage.setTitle("TableWare Store Login");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
