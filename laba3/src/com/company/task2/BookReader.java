package com.company.task2;

import java.util.List;

public class BookReader extends Human {

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

    public long getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(long registerNumber) {
        this.registerNumber = registerNumber;
    }

    public List<Book> getTakenBooks() {
        return takenBooks;
    }

    public void setTakenBooks(List<Book> takenBooks) {
        this.takenBooks = takenBooks;
    }
}
