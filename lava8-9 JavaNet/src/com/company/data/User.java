package com.company.data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class User implements java.io.Serializable {
    private String name;
    private String surname;
    private String sex;
    private LocalDate birthday;

    public User(String name, String surname, String sex, String birthday) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.birthday = LocalDate.parse(birthday, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    @Override
    public String toString() {
        return name + ' ' + surname + ' ' + sex + ' ' + birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getSex() {
        return sex;
    }

    public String  getBirthday() {
        return birthday.toString();
    }
}
