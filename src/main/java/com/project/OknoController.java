package com.project;

import javafx.event.ActionEvent;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.shape.Circle;
import com.project.constants;

import static com.project.constants.ZETON_W;

public class OknoController {
    public Canvas canvas;

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


    }
}

