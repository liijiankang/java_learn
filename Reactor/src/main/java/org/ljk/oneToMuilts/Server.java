package org.ljk.oneToMuilts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/14 14:26
 */
public class Server {
    private ServerSocket serverSocket;

    public Server(int port) {
        try {
            serverSocket = new ServerSocket(port);
            serverSocket.setSoTimeout(0);
            System.out.println(String.format("waiting for connect on port %s ...", port));
            while (true) {
                Socket socket = serverSocket.accept();
                new ClientThread(socket).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Server server = new Server(18080);
    }
}

class ClientThread extends Thread {
    private Socket socket;

    public ClientThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        System.out.println(String.format("%s connected!", socket.getInetAddress()));
        BufferedReader bufferedReader = null;
        PrintWriter writer = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new PrintWriter(socket.getOutputStream());
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(String.format("receive:%s", line));
                writer.println("message has been received!");
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("connect to be closed!");
            try {
                if (bufferedReader != null && writer != null) {
                    bufferedReader.close();
                    writer.close();
                }
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
