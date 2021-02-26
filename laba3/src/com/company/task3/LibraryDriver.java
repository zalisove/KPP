package com.company.task3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LibraryDriver {

    public static void serializableObject(String fileName, Externalizable ex){
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
            ex.writeExternal(outputStream);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Library deSerializableObject(String fileName){
        Library library = new Library();
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName));
            library.readExternal(inputStream);
            inputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        return library;
    }

    public static void main(String[] args) {


        List<Author> authors = new ArrayList();
        authors.add(new Author("authot_1","sername_1"));
        authors.add(new Author("authot_2","sername_2"));


        List<Book> books = new ArrayList();
        books.add(new Book("book_1",authors,1,1));
        books.add(new Book("book_2",authors,2,2));



        List<BookStore> bookStores = new ArrayList<>();

        bookStores.add(new BookStore("store_1",books));
        bookStores.add(new BookStore("store_2",books));

        List<BookReader> bookReaders = new ArrayList<>();
        bookReaders.add(new BookReader("name_1","surname_1",1,books));
        bookReaders.add(new BookReader("name_2","surname_2",2,books));


        Library library = new Library("Library",bookStores,bookReaders);

        serializableObject("task3.ser",library);

        System.out.println(deSerializableObject("task3.ser"));


    }
}
