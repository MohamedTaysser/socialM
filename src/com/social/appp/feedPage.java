package com.social.appp;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class feedPage {

    public void start(Stage primaryStage) {
        // Create a label for the feed page
        Label feedLabel = new Label("Welcome to the Feed Page!");

        // Set up the layout
        StackPane feedRoot = new StackPane();
        feedRoot.getChildren().add(feedLabel);

        // Create a scene for the feed page
        Scene feedScene = new Scene(feedRoot, 400, 300);

        // Change the scene to the feed page
        primaryStage.setTitle("Feed Page");
        primaryStage.setScene(feedScene);
        primaryStage.show();
    }
}
