package com.company.operation;

public class ShowUserInfoOperation extends CartOperation{
    private String surNum;

    public ShowUserInfoOperation(String surNum) {
        this.surNum = surNum;
    }

    public String getSurNum() {
        return surNum;
    }
}
