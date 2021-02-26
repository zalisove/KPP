package com.company.task1;

import java.io.Serializable;
import java.util.List;

public class Book implements Serializable {
    private String name;
    private List<Author> authors;
    private int year;
    private int editionNumber;

    public Book(String name, List<Author> authors, int year, int editionNumber) {
        this.name = name;
        this.authors = authors;
        this.year = year;
        this.editionNumber = editionNumber;
    }

    @Override
    public String toString() {
        return "Book " +
                "name='" + name + '\'' +
                ", authors=" + authors +
                ", year=" + year +
                ", editionNumber=" + editionNumber +
                "\n";
    }
}
