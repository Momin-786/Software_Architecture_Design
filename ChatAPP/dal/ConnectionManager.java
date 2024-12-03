package dal;

import java.io.*;
import java.net.*;

public class ConnectionManager {
    public static Socket createConnection(String host, int port) throws IOException {
        return new Socket(host, port);
    }
}
