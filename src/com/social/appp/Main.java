package com.social.appp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import userLogin.userLogin;
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create the UI elements
        Label heading = new Label("Welcome Back ...");
        heading.setFont(new Font("Arial", 24));
        Label spc1 = new Label("");
        Label spc2 = new Label("");
        Label spc3 = new Label("");

        TextField textField = new TextField();
        textField.setPromptText("Enter your name");

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Enter your password");

        Button login = new Button("Login...");

        login.setOnAction(event -> {
            // Placeholder logic for login
            userLogin user = new userLogin(textField.getText() , passwordField.getText());

            if (user.login()) {
                feedPage feed = new feedPage();
                feed.start(primaryStage);
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Login error");
                alert.setHeaderText("Login error encountered");
                alert.setContentText("Wrong email or password, please try again");
                alert.showAndWait();
            }
        });

        // Create the layout (VBox)
        VBox layout = new VBox(4);
        layout.setStyle("-fx-padding: 20px; -fx-end-margin: 30px;");
        heading.setStyle("-fx-text-fill: white;");
        layout.setPrefSize(400, 400); // Optional: set preferred size

        // Load the image (ensure the path is correct)
        Image image = new Image("file:C:\\Users\\dell\\Downloads\\Java-OOP-Ass-main\\All\\Social\\src\\com\\social\\appp\\image.jpg");  // Update this path if necessary

        // Create a BackgroundImage with the loaded image
        BackgroundImage backgroundImage = new BackgroundImage(
                image,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                new BackgroundSize(100, 100, true, true, true, true)  // Stretch the image in both directions
        );

        // Set the background of the layout to the background image
        layout.setBackground(new Background(backgroundImage));

        // Add the UI elements to the layout
        layout.getChildren().addAll(heading,spc1, textField,spc2, passwordField,spc3, login);

        // Ensure VBox stretches with the scene size
        layout.setFillWidth(true);

        // Create the scene and set it on the stage
        Scene scene = new Scene(layout, 400, 400);
        primaryStage.setTitle("Welcome Back...");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
