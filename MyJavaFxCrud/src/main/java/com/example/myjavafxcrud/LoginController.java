package com.example.myjavafxcrud;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;



public class LoginController implements Initializable {
    @FXML
    private Button cancelButton;

    @FXML
    private Label loginMessageLabel;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        File loginFile = File("@../../../../../../images/LoginImage.jpg");

    }

    public void loginButtonAction(ActionEvent event){
        loginMessageLabel.setText("You try to login");

    }

    public void setCancelButtonAction(ActionEvent event){
      Stage stage = (Stage) cancelButton.getScene().getWindow();
      stage.close();

    }


}