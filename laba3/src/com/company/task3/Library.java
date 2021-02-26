package com.company.task3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Library implements Externalizable {
    private String libraryName;
    private List<BookStore> bookStores;
    private List<BookReader> bookReaders;

    public Library(String libraryName, List<BookStore> bookStores, List<BookReader> bookReaders) {
        this.libraryName = libraryName;
        this.bookStores = bookStores;
        this.bookReaders = bookReaders;
    }

    public Library() {
    }

    @Override
    public String toString() {
        return "Library{" +
                "libraryName='" + libraryName + '\'' +
                ", \n\nbookStores=" + bookStores +
                ", \n\nbookReaders=" + bookReaders +
                '}';
    }


    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(libraryName);
        out.writeInt(bookStores.size());
        for (BookStore bs: bookStores) {
            bs.writeExternal(out);
        }
        out.writeInt(bookReaders.size());
        for (BookReader br: bookReaders) {
            br.writeExternal(out);
        }
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        libraryName = (String) in.readObject();
        bookStores = new ArrayList<>();
        bookReaders = new ArrayList<>();

        int size = in.readInt();
        for (int i = 0; i < size; i++) {
            BookStore bookStore = new BookStore();
            bookStore.readExternal(in);
            bookStores.add(bookStore);
        }
        int sizeR = in.readInt();
        for (int i = 0; i < sizeR; i++) {
            BookReader bookReader = new BookReader();
            bookReader.readExternal(in);
            bookReaders.add(bookReader);
        }
    }
}
