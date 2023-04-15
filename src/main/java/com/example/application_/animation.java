package com.example.application_;

import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.FileInputStream;

public class animation  extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Image image = new Image(new FileInputStream("C:\\Users\\PC-WIN10-004\\IdeaProjects\\application_\\src\\main\\java\\com\\example\\application_\\images.jpg"));
                ImageView imageView = new ImageView(image);
        imageView.setFitHeight(00);
        imageView.setFitWidth(500);

        FadeTransition fadeout = new FadeTransition(Duration.millis(1000), imageView);
        fadeout.setFromValue(1.0);
        fadeout.setToValue(0.0);
        fadeout.setCycleCount(Timeline.INDEFINITE);
        fadeout.setAutoReverse(true);
        fadeout.play();


        Group group = new Group();
        Scene scene = new Scene(group, 500,500);
        group.getChildren().addAll(imageView);
        stage.setTitle("Animation amigo");
        stage.setScene(scene);
        stage.show();


    }
}
