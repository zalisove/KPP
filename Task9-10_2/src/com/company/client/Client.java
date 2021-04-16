package com.company.client;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Client {

    public static final int PORT = 7;

    public static void main(String[] args) {
        try {
            InetAddress ia =InetAddress.getByName("localhost");
            DatagramSocket socket = new DatagramSocket();
            ReceiverThread receiverThread = new ReceiverThread(socket);
            new SenderThread(socket,ia,PORT,receiverThread);

        } catch (UnknownHostException | SocketException e) {
            e.printStackTrace();
        }
    }

}
