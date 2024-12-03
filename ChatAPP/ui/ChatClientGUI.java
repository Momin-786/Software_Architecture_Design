package ui;

import domain.ChatClient;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage; /

public class ChatClientGUI extends Application {
    private ChatClient chatClient;
    private TextArea chatArea;
    private TextField messageField;

    @Override
    public void start(Stage primaryStage) {
        Text title = new Text("Chat Client");
        title.setFont(new Font(24));

        chatArea = new TextArea();
        chatArea.setEditable(false);
        chatArea.setPrefHeight(300);
        chatArea.setStyle("-fx-control-inner-background: #2b2b2b; -fx-text-fill: white;");
        chatArea.setFont(Font.font("Consolas", 14));

        messageField = new TextField();
        messageField.setPromptText("Type your message...");
        messageField.setFont(Font.font("Arial", 14));

        Button sendButton = new Button("Send");
        sendButton.setStyle("-fx-background-color: #2f8fdf; -fx-text-fill: white; -fx-font-size: 14;");
        sendButton.setOnAction(e -> {
            String message = messageField.getText();
            if (!message.isEmpty()) {
                chatClient.sendMessage(message);
                messageField.clear();
            }
        });

        VBox root = new VBox(10, title, chatArea, messageField, sendButton);
        root.setPadding(new Insets(15));
        root.setStyle("-fx-background-color: #1e1e1e;");
        Scene scene = new Scene(root, 500, 400);

        primaryStage.setTitle("P2P Chat - Client");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Start client connection
        chatClient = new ChatClient("localhost", 12345, this);
    }

    public void displayMessage(String message) {
        javafx.application.Platform.runLater(() -> chatArea.appendText(message + "\n"));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
