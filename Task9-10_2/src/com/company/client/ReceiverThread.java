package com.company.client;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketTimeoutException;
import java.nio.charset.StandardCharsets;

public class ReceiverThread implements Runnable{

    private static final int BUFFER_SIZE = 512;
    private boolean isWork;
    private DatagramSocket socket;

    public ReceiverThread(DatagramSocket socket) {
        this.socket = socket;
        isWork = true;
        new Thread(this).start();
    }

    @Override
    public void run() {
        byte[] buffer = new byte[BUFFER_SIZE];
        while (isWork){
            DatagramPacket packet = new DatagramPacket(buffer,buffer.length);
            try {
                socket.setSoTimeout(10000);
                socket.receive(packet);
                String s = new String(packet.getData(),0, packet.getLength(), StandardCharsets.UTF_8);
                System.out.println(s);
                Thread.yield();
            } catch (SocketTimeoutException e){
                System.out.println("Ну, довго я ждатиму пока ти шото напишеш?");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public void stop(){
        isWork = false;
    }
}
