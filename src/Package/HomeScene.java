package Package;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HomeScene {

    private Stage stage;

    public HomeScene(Stage primaryStage) {
        this.stage = primaryStage;
    }

    public void show() {
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 1200, 800);
        NavigationBar navBar = new NavigationBar(this.stage);

        root.setTop(navBar);
        root.setStyle("-fx-background-color: #1b212c;");

        // XL size text
        Text xlText = new Text("Let your Data do more for you!");
        xlText.setFont(Font.font("Arial", 36)); // Set font size
        xlText.setStyle("-fx-fill: white;"); // Set text color to white

        // MD size text
        Text mdText = new Text("Our products allow individuals to monetize their footprint on the internet.");
        mdText.setFont(Font.font("Arial", 22)); // Set font size
        mdText.setStyle("-fx-fill: gray;"); // Set text color to white

        // Create a VBox to hold the text and button
        VBox contentBox = new VBox(20); // Set spacing between elements
        contentBox.setAlignment(Pos.CENTER); // Align elements to the center
        contentBox.getChildren().addAll(xlText, mdText);

        // Create a button
        Button learnMoreButton = new Button("Learn More");
        learnMoreButton.getStyleClass().add("learn-more-button"); // Apply CSS class if needed
        learnMoreButton.setOnAction(e -> {
            // Add action for the button if needed
        });

        // Add the button to the VBox
        contentBox.getChildren().add(learnMoreButton);

        // Set the VBox in the center of the BorderPane
        root.setCenter(contentBox);

        // Load the CSS file
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

        stage.setScene(scene);
        stage.setTitle("Home Page");
        stage.show();
    }
}
