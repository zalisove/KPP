package com.company.operation;

public class AddMoneyOperation extends CartOperation{
    private String  serNum;
    private double  money;

    public AddMoneyOperation(String serNum, double money) {
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
