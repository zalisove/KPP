package com.company.client;

import com.company.data.MetroCart;
import com.company.data.User;
import com.company.operation.*;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {
    private int post;
    private String host;
    private Socket socket;
    private ObjectInputStream ois;
    private ObjectOutputStream oos;

    public Client(String host,int post) {
        try {
            this.post = post;
            this.host = host;
            socket = new Socket(host, post);
            socket.setSoTimeout(1000);
            oos = new ObjectOutputStream(socket.getOutputStream());
            ois = new ObjectInputStream(socket.getInputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void applyOperation(CartOperation operation){
        try {
            oos.writeObject(operation);
            oos.flush();
            System.out.println(ois.readObject());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Client client = new Client("localhost",8080);

        MetroCart metroCart = new MetroCart();
        metroCart.setBalance(1000);
        metroCart.setCollege("KhNY");
        metroCart.setUser(new User("Sasha","Kuruchenko","M","14.11.2001"));
        metroCart.setSerNum("0001");

        AddMetroCardOperation operation = new AddMetroCardOperation(metroCart);
        ShowUserInfoOperation operation2 = new ShowUserInfoOperation("0001");
        AddMoneyOperation operation3 = new AddMoneyOperation("0001",1000);
        PayMoneyOperation operation4 = new PayMoneyOperation("0001",100);
        ShowBalanceOperation operation5 = new ShowBalanceOperation("0001");

        client.applyOperation(operation);
        System.out.println();
        client.applyOperation(operation2);
        System.out.println();
        client.applyOperation(operation3);
        System.out.println();
        client.applyOperation(operation4);
        System.out.println();
        client.applyOperation(operation5);
        System.out.println();
        client.applyOperation(new StopOperation());
    }
}
