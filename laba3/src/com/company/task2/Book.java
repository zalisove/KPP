package com.company.task2;

import java.util.List;

public class Book {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getEditionNumber() {
        return editionNumber;
    }

    public void setEditionNumber(int editionNumber) {
        this.editionNumber = editionNumber;
    }
}
