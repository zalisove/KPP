package com.company.task3;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

public class Book implements Externalizable {
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

    public Book() { }

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

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeInt(year);
        out.writeInt(editionNumber);

        out.writeInt(authors.size());
        for (Author e: authors) {
            e.writeExternal(out);
        }
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        year = in.readInt();
        editionNumber = in.readInt();

        authors = new ArrayList<>();

        int size = in.readInt();
        for (int i = 0; i < size; i++) {
            Author author = new Author();
            author.readExternal(in);
            authors.add(author);
        }
    }
}
