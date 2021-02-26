package com.company.task1;

import java.io.Serializable;
import java.util.List;

public class Library implements Serializable {
    private String libraryName;
    private List<BookStore> bookStores;
    private List<BookReader> bookReaders;

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
}
