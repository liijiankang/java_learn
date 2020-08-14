package org.ljk.oneToMuilts;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * @DESCRIPTION:
 * @AUTHOR: Lijiankanglc
 * @DATE: 2020/8/14 14:47
 */
public class Client {
    public static void main(String[] args) {
        String ip = "localhost";
        int port = 18080;
        System.out.println(String.format("connecting to %s on port %s.", ip, port));
        Socket socket = null;
        try {
            socket = new Socket(ip, port);
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedReader sdInput = new BufferedReader(new InputStreamReader(System.in));
            String input = null;
            while ((input = sdInput.readLine()) != null) {
                writer.println(input);
                writer.flush();
                System.out.println(reader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
