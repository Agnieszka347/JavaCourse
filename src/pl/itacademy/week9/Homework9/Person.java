package pl.itacademy.week9.Homework9;

import java.time.LocalDate;
import java.time.Period;

public class Person {


        public String firstName;
        public String lastName;
        public Sex sex;
        public LocalDate birthDay;
        public int salary;
        public Address address;
        public String userName;


    public Person(String firstName, String lastName, Sex sex, LocalDate birthDay, int salary, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.birthDay = birthDay;
        this.salary = salary;
        this.address = address;
    }

    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public LocalDate getBirthDay() {

        return birthDay;
    }

    public int getSalary() {

        return salary;
    }

    public Address getAddress() {

        return address;
    }

    public String getUserName() {

        return userName;
    }

    public void setUserName(String userName) {

        this.userName = userName;
    }

    public int getAge(){
        LocalDate now = LocalDate.now();
        Period p = Period.between(birthDay, now);
        return p.getYears();
    }

    public static String userName(Person p) {
        String userName = p.getFirstName().charAt(0) + p.getLastName() + p.getBirthDay();
        return userName;

    }

    public Person(String userName) {
        this.userName = userName;
    }


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex=" + sex +
                ", birthDay=" + birthDay +
                ", salary=" + salary +
                ", address=" + address +
                ", userName='" + userName + '\'' +
                '}';
    }

}
