package com.company.server;

import com.company.data.MetroCart;
import com.company.data.MetroCartBlank;
import com.company.operation.*;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ClientHandler implements Runnable {
    private ObjectInputStream ois;
    private ObjectOutputStream oos;
    private boolean work;
    private MetroCartBlank cartBlank;
    private Socket socket;

    public ClientHandler(MetroCartBlank cartBlank, Socket socket) {
        try {
            this.ois = new ObjectInputStream(socket.getInputStream());
            this.oos = new ObjectOutputStream(socket.getOutputStream());
            this.work = true;
            this.cartBlank = cartBlank;
            this.socket = socket;
            Thread thread = new Thread(this);
            thread.setDaemon(true);
            thread.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        System.out.println("Client handler started for:" + socket);
        while (work) {
            try {
                Object obj = ois.readObject();
                processOptional(obj);
            } catch (IOException | ClassNotFoundException e) {
                System.out.println(e.getMessage());
                work = false;
            }
        }
        try {
            System.out.println("Client handler stopped for :" + socket);
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void processOptional(Object obj) throws IOException {
        if (obj instanceof StopOperation) {
            finish();
        } else if (obj instanceof AddMoneyOperation) {
            addMoney((AddMoneyOperation) obj);
        } else if (obj instanceof PayMoneyOperation) {
            pay((PayMoneyOperation) obj);
        } else if (obj instanceof ShowBalanceOperation) {
            showBalance((ShowBalanceOperation) obj);
        } else if (obj instanceof AddMetroCardOperation) {
            addCart((AddMetroCardOperation) obj);
        } else if (obj instanceof RemoveCartOperation) {
            removeCart((RemoveCartOperation) obj);
        } else if (obj instanceof CartInfoOperation) {
            cartInfo((CartInfoOperation) obj);
        }else if (obj instanceof ShowUserInfoOperation) {
            userInfo((ShowUserInfoOperation) obj);
        } else {
            error();
        }
    }

    private void cartInfo(CartInfoOperation operation) throws IOException {
        MetroCart cart = cartBlank.getStore().get(operation.getSurNum());
        if (cart == null) {
            oos.writeObject("Cannot find cart:" + operation.getSurNum());
        } else {
            oos.writeObject(cart);
        }
        oos.flush();
    }

    private void userInfo(ShowUserInfoOperation operation) throws IOException {
        MetroCart cart = cartBlank.getStore().get(operation.getSurNum());
        if (cart == null) {
            oos.writeObject("Cannot find cart:" + operation.getSurNum());
        } else {
            oos.writeObject(cart.getUser());
        }
        oos.flush();
    }

    private void finish() throws IOException {
        work = false;
        oos.writeObject("Finish work " + socket);
        oos.flush();
    }

    private void addCart(AddMetroCardOperation operation) throws IOException {
        boolean isAdded = cartBlank.add(operation.getMetroCart());
        if (isAdded){
            oos.writeObject("Cart add");
        }else oos.writeObject("Cannot cart add");
        oos.flush();
    }

    private void addMoney(AddMoneyOperation operation) throws IOException {
        boolean res = cartBlank.addMoney(operation.getSerNum(), operation.getMoney());
        if (res) {
            oos.writeObject("Balance added");
        } else oos.writeObject("Cannot balance added");
        oos.flush();
    }

    private void pay(PayMoneyOperation operation) throws IOException {
        boolean res = cartBlank.pay(operation.getSerNum(), operation.getMoney());
        if (res) {
            oos.writeObject("Money payed");
        } else oos.writeObject("Cannot pay money");
        oos.flush();
    }

    private void removeCart(RemoveCartOperation operation) throws IOException {
        boolean res = cartBlank.remove(operation.getSerNum());
        if (res) {
            oos.writeObject("Card removed");
        } else oos.writeObject("Cannot removed cart");
        oos.flush();
    }

    private void showBalance(ShowBalanceOperation operation) throws IOException {
        MetroCart cart = cartBlank.getStore().get(operation.getSurName());
        if (cart == null) {
            oos.writeObject("Cannot show balance for cart: " + operation.getSurName());
        } else {
            oos.writeObject("Cart: " + operation.getSurName() + " balance:" + cart.getBalance());
        }
        oos.flush();
    }

    private void error() throws IOException {
        oos.writeObject("No fount operation");
        oos.flush();
    }

}
