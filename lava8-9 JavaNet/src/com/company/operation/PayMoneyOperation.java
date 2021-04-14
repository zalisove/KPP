package com.company.operation;

public class PayMoneyOperation extends CartOperation{
    private String serNum;
    private double money;


    public PayMoneyOperation(String serNum, double money) {
        this.serNum = serNum;
        this.money = money;
    }

    public String getSerNum() {
        return serNum;
    }

    public double getMoney() {
        return money;
    }
}
