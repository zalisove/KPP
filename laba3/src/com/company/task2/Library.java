package com.company.task2;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Library implements Serializable {
    private String libraryName;
    private List<BookStore> bookStores;
    private transient List<BookReader> bookReaders;

    public Library(String libraryName, List<BookStore> bookStores, List<BookReader> bookReaders) {
        this.libraryName = libraryName;
        this.bookStores = bookStores;
        this.bookReaders = bookReaders;
    }

    @Override
    public String toString() {
        return "Library{" +
                "libraryName='" + libraryName + '\'' +
                ", \n\nbookStores=" + bookStores +
                ", \n\nbookReaders=" + bookReaders +
                '}';
    }

    private void writeObject(ObjectOutputStream out)throws IOException {
        out.defaultWriteObject();

        out.writeInt(bookReaders.size());

        for (BookReader br: bookReaders) {

            out.writeInt(br.getTakenBooks().size());

            for (Book b: br.getTakenBooks()) {

                out.writeInt(b.getAuthors().size());

                for (Author a:b.getAuthors()) {
                    out.writeObject(a.getName());
                    out.writeObject(a.getSurname());
                }

                out.writeObject(b.getName());
                out.writeInt(b.getEditionNumber());
                out.writeInt(b.getYear());
            }



            out.writeObject(br.getName());
            out.writeObject(br.getSurname());
            out.writeLong(br.getRegisterNumber());
        }
    }

    private void readObject(ObjectInputStream in)throws IOException ,ClassNotFoundException{
        in.defaultReadObject();
        bookReaders = new ArrayList<>();

        int size = in.readInt();

        for (int i = 0; i < size; i++) {
            ArrayList<Book> books = new ArrayList<>();

            int sizeBooks = in.readInt();

            for (int j = 0; j < sizeBooks; j++) {

                int authorSize = in.readInt();

                List<Author> authors = new ArrayList<>();

                for (int k = 0; k < authorSize; k++) {
                    authors.add(new Author((String) in.readObject(),(String) in.readObject()));
                }

                books.add(new Book((String) in.readObject(),authors,in.readInt(),in.readInt()));
            }

            bookReaders.add(new BookReader((String) in.readObject(),(String) in.readObject(),in.readLong(),books));

        }
    }
}
