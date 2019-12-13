package pl.itacademy.week10;

@RegisteredUser(userName = "student", defaultPassword = "P@$$w0rd!")
public class Student extends Person {
    private String schoolName;

    public Student(String firstName, String schoolName) {
        super(firstName);
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "schoolName='" + schoolName + '\'' +
                '}';
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
}
