package com.company.operation;

public class RemoveCartOperation extends CartOperation{
    String serNum;

    public RemoveCartOperation(String serNum) {
        this.serNum = serNum;
    }

    public String getSerNum() {
        return serNum;
    }
}
