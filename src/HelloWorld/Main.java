package HelloWorld;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;



public class Main extends Application {



    @Override
    public void start(Stage primaryStage) {
        //complete application here based on instructions in README.md

        //sets title of window
        primaryStage.setTitle("Assignment #1");

        //initializes a label and sets its alignment to CENTER
        Label label = new Label("Default Message");
        BorderPane.setAlignment(label,Pos.CENTER);

        //initializes a button, tell it to search this class for the event handler, and set its alignment to TOP_LEFT
        Button button = new Button("Say Hello World!");
        button.setOnAction(e -> label.setText("Hello 3035!"));
        BorderPane.setAlignment(button, Pos.TOP_LEFT);

        //initialize the borderpane as "layout" and set its size to 400 x 400
        BorderPane layout = new BorderPane();
        layout.setPrefSize(450,500);
        //Set the position of the button and the label in the borderpane
        layout.setTop(button);
        layout.setCenter(label);

        //create a new scene
        Scene scene = new Scene(layout);

        //set the window to show the scene
        primaryStage.setScene(scene);

        //show the stage w/ the scene in it
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
