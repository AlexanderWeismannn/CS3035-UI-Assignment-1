package HelloWorldFXML;

import java.io.IOException;
import javafx.scene.Parent;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("HelloWorld.fxml"));
        //complete application here based on instructions in README.md
        //use FXML for interface

        //Sets the Window Title to "HelloWorldFXML"
        primaryStage.setTitle("HelloWorldFXML");
        //Creates a scene inside the window
        Scene scene = new Scene(root, 300,300);
        //sets the scene to be "scene" defined above
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }


}
