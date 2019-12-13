package pl.itacademy.week5;

import java.time.LocalDate;

public class Person {

    private String firstName;
    private String lastName;
    private LocalDate birthDay;

    public Person(String firstName, String lastName,LocalDate birthDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;

    }

    public void setFirstName() {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName() {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setBirth() {
        this.birthDay = birthDay;
    }

    public LocalDate getBirthDay() { return birthDay;}
}






