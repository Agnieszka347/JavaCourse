package pl.itacademy.week8;

import java.time.LocalDate;
import java.util.Objects;

public class Person implements Comparable <Person> {

    private String firstName;
    private String lastName;
    private LocalDate birthDay;

    public Person(String firstName, String lastName, LocalDate birthDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(birthDay, person.birthDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, birthDay);
    }

    @Override
    public int compareTo(Person another) {
        int result = lastName.compareTo(another.lastName);
        if (result != 0) {
            return result;
        }
        result = firstName.compareTo(another.firstName);
        if (result != 0) {
            return result;
        }
        return birthDay.compareTo(another.birthDay);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDay=" + birthDay +
                '}';
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
