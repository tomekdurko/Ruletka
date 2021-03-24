package com.project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.*;

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
        Zeton z1 = new Zeton(15,1);
        System.out.println(z1.wygrana(15));
        Zeton z2 = new Zeton(12,3);
        System.out.println(z2.wygrana(15));
        Zeton z3 = new Zeton(10,2);
        System.out.println(z3.wygrana(15));
        Zeton z4 = new Zeton(8,5);
        System.out.println(z4.wygrana(15));
        Zeton z5 = new Zeton(11,5);
        System.out.println(z5.wygrana(15));
        launch(args);


    }
}
