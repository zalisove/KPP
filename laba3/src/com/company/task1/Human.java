package com.company.task1;

import java.io.Serializable;

public abstract class Human implements Serializable {
    private String name;
    private String surname;

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", surname='" + surname + '\'';
    }
}
