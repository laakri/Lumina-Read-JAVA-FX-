package Package;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class NavigationBar extends HBox {

    public NavigationBar(Stage primaryStage) {
        this.getStyleClass().add("nav-bar"); // Apply CSS class to the navigation bar
        this.setPrefHeight(50); // Set preferred height
        this.setAlignment(Pos.CENTER); // Align items in the HBox to the center

        // Text on the left
        Text appName = new Text("Lumina Read");
        appName.getStyleClass().add("app-name"); // Apply CSS class to the text
        appName.setOnMouseClicked(e -> {
            // Navigate to home page
            navigateToHome(primaryStage);
        });

        // Text for the marketplace
        Button market = new Button("Marketplace");
        market.getStyleClass().add("nav-button"); 
        
        Button profileButton = new Button("Profile");
        profileButton.getStyleClass().add("nav-button"); 
        

        // Buttons on the right
        Button loginButton = new Button("Login");
        loginButton.getStyleClass().add("nav-button"); 
        loginButton.setOnAction(e -> {
            // Navigate to login page
            navigateToLogin(primaryStage);
        });
        Button websiteButton = new Button("Website");
        websiteButton.getStyleClass().add("nav-button"); // Apply CSS class to the button

        // Add nodes to the navigation bar with gaps
        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS); // Allow spacer to grow horizontally
        this.getChildren().addAll(appName, market,profileButton, spacer, loginButton, websiteButton);
    }

    private void navigateToLogin(Stage primaryStage) {
        // Create and show the login page
        LoginScene loginScene = new LoginScene(primaryStage);
        loginScene.show();
    }

    private void navigateToHome(Stage primaryStage) {
        // Create and show the home page
        HomeScene homeScene = new HomeScene(primaryStage);
        homeScene.show();
    }
   
   
}
