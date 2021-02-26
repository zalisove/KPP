package com.company.task1;

import java.io.Serializable;

public class Author extends Human implements Serializable {

    public Author(String name, String surname) {
        super(name, surname);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
