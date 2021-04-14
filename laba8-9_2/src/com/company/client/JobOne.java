package com.company.client;

import com.company.interfase.Executable;

import java.math.BigInteger;

public class JobOne implements Executable, java.io.Serializable {
    private final static long serialVersionUID = -1L;
    private int n;

    public JobOne(int n) {
        this.n = n;
    }

    @Override
    public Object execute() {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
}

