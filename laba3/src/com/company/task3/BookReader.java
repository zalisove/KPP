package com.company.task3;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

public class BookReader extends Human implements Externalizable {

    private long registerNumber;
    private List<Book> takenBooks;

    public BookReader(String name, String surname, long registerNumber, List<Book> takenBooks) {
        super(name, surname);
        this.registerNumber = registerNumber;
        this.takenBooks = takenBooks;
    }

    public BookReader() { }

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

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

        out.writeObject(getName());
        out.writeObject(getSurname());
        out.writeLong(registerNumber);

        out.writeInt(takenBooks.size());
        for (Book b:takenBooks) {
            b.writeExternal(out);
        }
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        setName((String) in.readObject());
        setSurname((String) in.readObject());
        setRegisterNumber(in.readLong());

        takenBooks = new ArrayList<>();

        int size = in.readInt();

        for (int i = 0; i < size; i++) {
            Book book = new Book();
            book.readExternal(in);
            takenBooks.add(book);
        }
    }
}
