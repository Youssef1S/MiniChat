package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    private static Stage stage;
    @Override
    public void start(Stage loginStage) throws IOException {
        this.stage = loginStage;
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("login-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        loginStage.setTitle("Welcome Back");
        loginStage.setScene(scene);
        loginStage.show();
    }

    public void isLoggedIn() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("chat-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        this.stage.setScene(scene);
    }
    public static void main(String[] args) {
        launch();
    }
}