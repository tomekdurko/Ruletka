package com.project;

import javafx.event.ActionEvent;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.shape.Circle;
import com.project.constants;
import javafx.scene.text.Text;

import java.time.Duration;
import java.time.Instant;

import static com.project.constants.ZETON_W;

public class OknoController {
    public Canvas canvas;
    public TextField wynikTextField;
    public Text timerText;
    Instant czasStart, czasStop;

    void rysujZeton(int x, int y) {
        double wspX = x * constants.TABLE_X + constants.TABLE_X_0;
        double wspY = y * constants.TABLE_Y + constants.TABLE_Y_0;
        GraphicsContext gc;
        gc = canvas.getGraphicsContext2D();
        Image zeton = new Image("zeton.png");
        gc.drawImage(zeton, wspX,wspY,ZETON_W,ZETON_W);
    }

    public void rysujPrzycisk(ActionEvent actionEvent) {
        GraphicsContext gc;
        gc = canvas.getGraphicsContext2D();
        Image zeton = new Image("zeton.png");
        gc.drawImage(zeton, 80,85,50,50);
        czasStart = Instant.now();

    }



    public void sprawdzWynik(ActionEvent actionEvent) {

        System.out.println(wynikTextField.getText());
        czasStop = Instant.now();
        long czasLiczenia = Duration.between(czasStart,czasStop).toMillis();
        double czasWSekundach=(double)czasLiczenia/1000;
        timerText.setText("Czas: "+czasWSekundach+" sekund");
    }
}

