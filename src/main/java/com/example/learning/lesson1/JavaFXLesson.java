package com.example.learning.lesson1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;


public class JavaFXLesson extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Pane pane = new Pane();

        Label label = new Label();
        label.setLayoutX(50);
        label.setLayoutY(60);
        pane.getChildren().add(label);

        Button button = new Button("1111 Apasa Butonul");
        button.setLayoutX(51);
        button.setLayoutY(30);
        //button.setTextFill(Color.RED);
        // button.setStyle("-fx-background-color: #00ff00");
        pane.getChildren().add(button);

        button.setOnAction(ActionEvent -> {
            label.setText("Felicitari ati apasat butonul!!!");
        });

        Scene scene = new Scene(pane, 500, 300);
        stage.setTitle("Fereastra de testare!");
        stage.setScene(scene);
        stage.show();

    }
}
