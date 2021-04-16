package com.company.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

public class SenderThread implements Runnable{

    private DatagramSocket socket;
    private InetAddress inetAddress;
    private int port;
    private ReceiverThread receiverThread;
    public SenderThread(DatagramSocket socket, InetAddress inetAddress, int port,ReceiverThread receiverThread) {
        this.socket = socket;
        this.socket.connect(inetAddress,port);
        this.inetAddress = inetAddress;
        this.port = port;
        this.receiverThread = receiverThread;
        new Thread(this).start();
    }

    @Override
    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            try {
                String line = reader.readLine();
                if(line.equals(".")){
                    receiverThread.stop();
                    break;
                }
                byte [] buffer = line.getBytes(StandardCharsets.UTF_8);
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length,inetAddress,port);
                socket.send(packet);
                Thread.yield();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
