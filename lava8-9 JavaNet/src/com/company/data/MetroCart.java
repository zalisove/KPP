package com.company.data;

public class MetroCart implements java.io.Serializable{
    private String serNum;
    private String college;
    private User user;
    private double balance;

    public MetroCart(String serNum, String college, User user, double balance) {
        this.serNum = serNum;
        this.college = college;
        this.user = user;
        this.balance = balance;
    }

    public MetroCart() {}

    public String getSerNum() {
        return serNum;
    }

    public void setSerNum(String serNum) {
        this.serNum = serNum;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public double getBalance() {
        return balance;
    }

    public boolean pay(double money){
        if (balance - money < 0)return false;
        balance -= money;
        return true;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "№" + serNum + '\n' +
                "College'" + college + '\n' +
                "User=" + user +'\n'+
                "Balance=" + balance;
    }
}
