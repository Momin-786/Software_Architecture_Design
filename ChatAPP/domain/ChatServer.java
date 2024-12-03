package domain;

import java.io.*;
import java.net.*;
import java.util.ArrayList;
import java.util.List;
import ui.ChatServerGUI;

public class ChatServer {
    private int port;
    private List<ClientHandler> clients;
    private ChatServerGUI gui;

    public ChatServer(int port, ChatServerGUI gui) {
        this.port = port;
        this.clients = new ArrayList<>();
        this.gui = gui;
    }

    public void startServer() {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            gui.logMessage("Server started on port " + port);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                gui.logMessage("New client connected: " + clientSocket.getInetAddress());

                ClientHandler clientHandler = new ClientHandler(clientSocket, this);
                clients.add(clientHandler);

                new Thread(clientHandler).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public synchronized void broadcastMessage(String message, ClientHandler sender) {
        for (ClientHandler client : clients) {
            if (client != sender) {
                client.sendMessage(message);
            }
        }
        gui.logMessage("Broadcast: " + message);
    }

    public synchronized void removeClient(ClientHandler clientHandler) {
        clients.remove(clientHandler);
        gui.logMessage("Client disconnected.");
    }
}
