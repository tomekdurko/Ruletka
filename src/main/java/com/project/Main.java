package com.project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/Okno.fxml"));
        Parent content = loader.load();
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(content, 1400, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
