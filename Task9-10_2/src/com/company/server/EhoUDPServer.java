package com.company.server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class EhoUDPServer implements Runnable {

    private static final int DEFAULT_PORT = 7;
    private static final int BUFFER_SIZE = 512;

    private boolean isWork;

    public EhoUDPServer() {
        this.isWork = true;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println("Server started ...");
        byte[] buffer = new byte[BUFFER_SIZE];
        try (DatagramSocket socket = new DatagramSocket(DEFAULT_PORT)){
        while(isWork){
            DatagramPacket request = new DatagramPacket(buffer,buffer.length);
            try {
                socket.receive(request);
                DatagramPacket response = new DatagramPacket(request.getData(),request.getLength(),request.getAddress(), request.getPort());
                socket.send(response);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Server Finished ...");
    } catch (SocketException e) {
            e.printStackTrace();
        }

    }


    public void stop() {
        isWork = false;
    }

    public static void main(String[] args) {
        new EhoUDPServer();
    }
}
