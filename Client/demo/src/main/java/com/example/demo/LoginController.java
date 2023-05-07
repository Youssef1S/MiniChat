package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginController {
    @FXML
    private TextField username__tf;
    @FXML TextField password__tf;
    @FXML
    private Label wrongUsername__lbl;
    @FXML
    private Label wrongPassword__lbl;
    @FXML
    private Button login__btn;


    @FXML
    protected void onLoginButtonClick() throws IOException {
        if(!UsersInformation.isUser(username__tf.getText())){
            wrongUsername__lbl.setText("Username is not correct");
        } else if(!UsersInformation.isPassword(password__tf.getText())) {
            wrongPassword__lbl.setText("Password is not correct");
        } else {
            wrongUsername__lbl.setText("");
            wrongPassword__lbl.setText("");

            new Main().isLoggedIn();
        }
    }
}
