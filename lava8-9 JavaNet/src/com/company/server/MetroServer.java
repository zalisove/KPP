package com.company.server;

import com.company.data.MetroCartBlank;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MetroServer implements Runnable{
    private MetroCartBlank blank;
    private ServerSocket server;
    private int port;

    public MetroServer(int port) {
        this.blank = new MetroCartBlank();
        this.port = port;
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        try {
            server = new ServerSocket(port);
            System.out.println("Server is started");

            while (true){
                System.out.println("Waiting new client...");
                Socket client = server.accept();
                System.out.println("New client:" + client);
                new ClientHandler(blank,client);

                System.out.println(blank);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MetroServer server = new MetroServer(8080);
    }
}
