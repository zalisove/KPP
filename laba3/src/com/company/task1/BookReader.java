package com.company.task1;

import java.io.Serializable;
import java.util.List;

public class BookReader extends Human implements Serializable {

    private long registerNumber;
    private List<Book> takenBooks;

    public BookReader(String name, String surname, long registerNumber, List<Book> takenBooks) {
        super(name, surname);
        this.registerNumber = registerNumber;
        this.takenBooks = takenBooks;
    }

    @Override
    public String toString() {
        super.toString();
        return "BookReader " +
                "registerNumber=" + registerNumber +
                ", takenBooks=" + takenBooks +
                " \n";
    }
}
