package com.company.operation;

import com.company.data.MetroCart;

public class AddMetroCardOperation extends CartOperation{
    private MetroCart metroCart;

    public AddMetroCardOperation(MetroCart metroCart) {
        this.metroCart = metroCart;
    }

    public MetroCart getMetroCart() {
        return metroCart;
    }
}
