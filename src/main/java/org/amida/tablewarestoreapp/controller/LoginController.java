package org.amida.tablewarestoreapp.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    private TextField usernameTextField;

    @FXML
    private TextField passwordTextField;

    @FXML
    private Button loginButton;

    @FXML
    private void loginButtonClicked(ActionEvent event) {
        try {
            // Загрузить FXML файл
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/org/amida/tablewarestoreapp/auth/logged-in.fxml"));

            // Загрузить корневой элемент из FXML файла
            Parent root = loader.load();

            // Получить текущее окно (Stage)
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            // Создать новую сцену с загруженным корневым элементом
            Scene scene = new Scene(root);

            // Установить новую сцену на текущее окно
            stage.setScene(scene);

            // Показать окно
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
