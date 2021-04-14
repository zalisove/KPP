package com.company.operation;

public class CartInfoOperation extends CartOperation{
    private String surNum;

    public CartInfoOperation(String surNum) {
        this.surNum = surNum;
    }

    public String getSurNum() {
        return surNum;
    }
}
