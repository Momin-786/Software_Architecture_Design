package domain;

import java.io.*;
import java.net.*;
import ui.ChatClientGUI;

public class ChatClient {
    private Socket socket;
    private PrintWriter out;
    private BufferedReader in;
    private ChatClientGUI gui;

    public ChatClient(String serverAddress, int serverPort, ChatClientGUI gui) {
        this.gui = gui;
        try {
            socket = new Socket(serverAddress, serverPort);
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            new Thread(() -> {
                try {
                    String message;
                    while ((message = in.readLine()) != null) {
                        gui.displayMessage(message);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendMessage(String message) {
        out.println(message);
    }
}
