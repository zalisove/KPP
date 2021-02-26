package com.company.task3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BookStore implements Externalizable {
    private String storeName;
    private List<Book> books;

    public BookStore(String storeName, List<Book> books) {
        this.storeName = storeName;
        this.books = books;
    }
    public BookStore() {
    }

    @Override
    public String toString() {
        return "BookStore " +
                "storeName='" + storeName + "'\n" +
                ", books=" + books +
                " \n";
    }


    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(storeName);
        out.writeInt(books.size());

        for (Book b: books) {
            b.writeExternal(out);
        }
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        storeName = (String) in.readObject();
        int size = in.readInt();

        books = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            Book book = new Book();
            book.readExternal(in);
            books.add(book);
        }
    }
}
