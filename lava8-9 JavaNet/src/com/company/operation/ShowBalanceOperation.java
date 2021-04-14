package com.company.operation;

public class ShowBalanceOperation extends CartOperation{
    private String surName;

    public ShowBalanceOperation(String surName) {
        this.surName = surName;
    }

    public String getSurName() {
        return surName;
    }
}
