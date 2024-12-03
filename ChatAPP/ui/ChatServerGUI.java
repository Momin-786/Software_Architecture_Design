package ui;

import domain.ChatServer;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ChatServerGUI extends Application {
    private ChatServer chatServer;
    private TextArea serverLog;

    @Override
    public void start(Stage primaryStage) {
        Text title = new Text("Chat Server");
        title.setFont(new Font(24));

        serverLog = new TextArea();
        serverLog.setEditable(false);
        serverLog.setPrefHeight(350);
        serverLog.setStyle("-fx-control-inner-background: #2b2b2b; -fx-text-fill: white;");
        serverLog.setFont(Font.font("Consolas", 14));

        VBox root = new VBox(10, title, serverLog);
        root.setPadding(new Insets(15));
        root.setStyle("-fx-background-color: #1e1e1e;");
        Scene scene = new Scene(root, 500, 400);

        primaryStage.setTitle("P2P Chat - Server");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Start the server in a new thread
        new Thread(() -> {
            chatServer = new ChatServer(12345, this);
            chatServer.startServer();
        }).start();
    }

    public void logMessage(String message) {
        javafx.application.Platform.runLater(() -> serverLog.appendText(message + "\n"));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
