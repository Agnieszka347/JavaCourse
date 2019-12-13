package pl.itacademy.week6.object;

import java.util.Objects;

public class Person implements Cloneable {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
//        Person cloned = (Person) super.clone();
//        cloned.lastName = "cloned_" + lastName;
//        cloned.firstName = "cloned_" + firstName;
        return (Person) super.clone();
    }

    //    manually created method
//    @Override
//    public String toString() {
//        return firstName + " " + lastName;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return firstName.equals(person.firstName) &&
                lastName.equals(person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    //    manually created method
//    @Override
//    public boolean equals(Object object) {
//        if (object == null) {
//            return false;
//        }
//        if (this == object) {
//            return true;
//        }
//        if(!(object instanceof Person)) {
//            return false;
//        }
//        Person person = (Person) object;
//        if(this.firstName.equals(person.firstName) &&
//           this.lastName.equals(person.lastName)) {
//            return true;
//        }
//        return false;
//    }
}