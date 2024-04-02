package Package;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a HomeScene instance
        HomeScene homeScene = new HomeScene(primaryStage);

        // Show the home scene
        homeScene.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
