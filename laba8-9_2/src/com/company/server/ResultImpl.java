package com.company.server;

import com.company.interfase.Result;

public class ResultImpl implements Result, java.io.Serializable {
    Object output;
    double scoreTime;
    public ResultImpl(Object o, double c) {
        output = o;
        scoreTime = c;
    }
    public Object output() {
        return output;
    }
    public double scoreTime() {
        return scoreTime;
    }
}

