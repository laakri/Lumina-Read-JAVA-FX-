package Package;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginScene {

    private Stage stage;

    public LoginScene(Stage primaryStage) {
        this.stage = primaryStage;
    }

    public void show() {
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 1200, 800);
        
        NavigationBar navBar = new NavigationBar(this.stage);

        root.setTop(navBar);
        root.setStyle("-fx-background-color: #1b212c;");

        // Load the CSS file
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        // Load the CSS file
        scene.getStylesheets().add(getClass().getResource("style-login.css").toExternalForm());

        // Create a VBox for the login form
        VBox loginForm = new VBox(10);
        
        loginForm.getStyleClass().add("login-form"); // Apply CSS class to the login form
        loginForm.setAlignment(Pos.CENTER);
        loginForm.setPadding(new Insets(20));     
               
        
        
        Label usernameLabel = new Label("Username:");
        usernameLabel.getStyleClass().add("login-label"); // Apply CSS class to the label
        TextField usernameField = new TextField();
        usernameField.getStyleClass().add("login-textfield"); // Apply CSS class to the text field
        
        Label passwordLabel = new Label("Password:");
        passwordLabel.getStyleClass().add("login-label"); // Apply CSS class to the label
        PasswordField passwordField = new PasswordField();
        passwordField.getStyleClass().add("login-passwordfield"); // Apply CSS class to the password field
        
        // Create a login button
        Button loginButton = new Button("Login");
        loginButton.getStyleClass().add("login-button"); // Apply CSS class to the button
        loginButton.setOnAction(e -> {
            // Add logic to validate login credentials
            // For now, simply close the login window
            stage.close();
        });
        
        // Add components to the login form
        loginForm.getChildren().addAll(usernameLabel, usernameField, passwordLabel, passwordField, loginButton);
        
        // Set the login form in the center of the BorderPane
        root.setCenter(loginForm);

        stage.setScene(scene);
        stage.setTitle("Login Page");
        stage.show();
    }
}
