package com.company.task1;

import java.io.Serializable;
import java.util.List;

public class BookStore implements Serializable {
    private String storeName;
    private List<Book> books;

    public BookStore(String storeName, List<Book> books) {
        this.storeName = storeName;
        this.books = books;
    }

    @Override
    public String toString() {
        return "BookStore " +
                "storeName='" + storeName + "'\n" +
                ", books=" + books +
                " \n";
    }
}
