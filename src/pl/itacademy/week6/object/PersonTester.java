package pl.itacademy.week6.object;

public class PersonTester {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person first = new Person("Jan", "Kowalski");
        Person second = new Person("Jan", "Kowalski");

        //first = second;

        if(first == second) {
            System.out.println("Persons are the same by object reference");
        }

        if(first.equals(second)) {
            System.out.println("Persons are equal by equals() method");
        }

        System.out.println(first.hashCode());
        System.out.println(second.hashCode());

        System.out.println(first.getFirstName() + " " + first.getLastName());
        System.out.println(first);

        Person third = new Person("Marcin", "Nowak");
        Person[] people = new Person[3];
        people[0] = first;
        people[1] = second;
        people[2] = third;
        for (Person person : people) {
            System.out.println(person);
        }

        System.out.println("===Before cloning===");
        Person clonedMarcin = third.clone();
        System.out.println(clonedMarcin);

        for (int i = 0; i < 1_000_000; i++) {
            Kenny kenny = new Kenny("Kenny", null, i);
        }
    }
}
