package com.social.appp;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
public class signUp {

    public void start(Stage primaryStage) {

        Label feedLabel = new Label("Create your account now!");
        TextField name = new TextField();
        name.setPromptText("Name...");
        TextField email = new TextField();
        email.setPromptText("email...");
        PasswordField pass = new PasswordField();
        pass.setPromptText("Name...");
        DatePicker date = new DatePicker();
        date.setPromptText("Date of birth");
        Button button = new Button("Create account");
        button.setOnAction(event ->{
            //if(signup(|data|)){ret 1 and go to feed }else{back to sign up with alert}
            feedPage feed = new feedPage();
            feed.start(primaryStage);
        } );
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
