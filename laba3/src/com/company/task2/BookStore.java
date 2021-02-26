package com.company.task2;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class BookStore implements Serializable {
    private String storeName;
    private transient List<Book> books;

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

    private void writeObject(ObjectOutputStream out)throws IOException{
        out.defaultWriteObject();
        out.writeInt(books.size());
        for (Book b: books) {

            out.writeInt(b.getAuthors().size());

            for (Author a:b.getAuthors()) {
                out.writeObject(a.getName());
                out.writeObject(a.getSurname());
            }

            out.writeObject(b.getName());
            out.writeInt(b.getEditionNumber());
            out.writeInt(b.getYear());
        }
    }

    private void readObject(ObjectInputStream in)throws IOException ,ClassNotFoundException{
        in.defaultReadObject();
        books = new ArrayList<>();

        int size = in.readInt();
        for (int i = 0; i < size; i++) {
            int authorSize = in.readInt();

            List<Author> authors = new ArrayList<>();

            for (int j = 0; j < authorSize; j++) {
                authors.add(new Author((String) in.readObject(),(String) in.readObject()));
            }

            books.add(new Book((String) in.readObject(),authors,in.readInt(),in.readInt()));
        }
    }



}
