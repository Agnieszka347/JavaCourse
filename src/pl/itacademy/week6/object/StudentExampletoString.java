package pl.itacademy.week6.object;

public class StudentExampletoString {

        int rollno;
        String name;
        String city;

        StudentExampletoString(int rollno, String name, String city){
            this.rollno=rollno;
            this.name=name;
            this.city=city;
        }

    @Override //bez zastosowania toString otrzymamy Output:Student@1fee6fc
                                                         //Student@1eed786
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public static void main(String args[]){
            StudentExampletoString s1=new StudentExampletoString(101,"Jan","Krakow");
            StudentExampletoString s2=new StudentExampletoString(102,"Adam","Lublin");

            System.out.println(s1);//compiler writes here s1.toString()
            System.out.println(s2);//compiler writes here s2.toString()
        }
    }

