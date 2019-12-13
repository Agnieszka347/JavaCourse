package pl.itacademy.week5;

import java.time.LocalDate;

public class Student extends Person {

    private String faculty;
    private int graduateYear;

    public Student(String firstName, String lastName, LocalDate birthDay, String faculty, int graduateYear) {
        super(firstName, lastName, birthDay);
        this.faculty = faculty;
        this.graduateYear = graduateYear;
    }

    public void setFaculty() {
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setGraduateYear() {
        this.graduateYear = graduateYear;
    }

    public int getGraduateYear() {
        return graduateYear;
    }
}
