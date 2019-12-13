package pl.itacademy.week9.Homework9;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java8Tester {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Anna", "Nowak", Sex.FEMALE, LocalDate.of(2005, 05, 13), 3000, new Address("Kraków")),
                new Person("Marek", "Wojciechowski", Sex.MALE, LocalDate.of(1970, 03, 15), 4500, new Address("Warszawa")),
                new Person("Ewa", "Mazur", Sex.FEMALE, LocalDate.of(1984, 12, 06), 5200, new Address("Wrocław")),
                new Person("Jan", "Kowalski", Sex.MALE, LocalDate.of(1955, 9, 12), 3500, new Address("Kraków")),
                new Person("Adam", "Brzozowski", Sex.MALE, LocalDate.of(1970, 8, 23), 4500, new Address("Lublin")),
                new Person("Beata", "Jarosz", Sex.FEMALE, LocalDate.of(1980, 06, 18), 5000, new Address("Kraków")),
                new Person("Zofia", "Zarzycka", Sex.FEMALE, LocalDate.of(1975, 11, 11), 4500, new Address("Kraków")),
                new Person("Roman", "Romanowski", Sex.MALE, LocalDate.of(1950, 10, 30), 5500, new Address("Warszawa"))

        );



        System.out.println("===================all men under 65 years===================================");

        people.stream()
                .filter(person -> person.sex.equals(Sex.MALE))
                //.filter(person -> person.getBirthDay().isAfter(LocalDate.of(1954, 01, 01)))
                .filter(person->person.getAge()<65)
                .sorted(Comparator.comparing(Person::getFirstName))
                .forEach(System.out::println);

        System.out.println("===============all women with salary less than 5000==========================");

        people.stream()
                .filter(person -> person.sex.equals(Sex.FEMALE))
                 .sorted(Comparator.comparing(Person::getBirthDay))
                .filter(person -> person.salary < 5000)
                .forEach(System.out::println);

        System.out.println("==========all persons younger than 18 years from Krakow=======================");

        List<Person> personList=
        people.stream()
                //.filter(person -> person.getBirthDay().isAfter(LocalDate.of(2002, 1, 1)))
                .filter(person -> person.getAge()<18)
                .filter(person -> person.getAddress().city.equals("Kraków"))
                .collect(Collectors.toList());
        System.out.println(personList);

        System.out.println("================all persons who are not from Krakow========= ===================");

        people.stream()
                .filter(person -> person.getAddress().city != "Kraków")
                .sorted(Comparator.comparing(Person::getLastName).reversed())
                .forEach(System.out::println);

        System.out.println("===============FirstName=======================================");

        people.stream()
                        .map(Person::getFirstName)
                        .sorted()
                        .forEach(System.out::println);

        System.out.println("===============LastName=======================================");

        people.stream ()
                       .map (Person::getLastName)
                       .sorted()
                       .forEach(System.out::println);

        System.out.println("================BirthDay======================================");


        people.stream ()
                .map (Person::getBirthDay)
                .sorted()
                .forEach(System.out::println);

        System.out.println("====================average salary=============================");

        System.out.println (people.stream()
                        .mapToInt(Person::getSalary)
                        .average());

        System.out.println("================number of women in Krakow==========================");


        System.out.println(people.stream()
                .filter(person -> person.sex.equals(Sex.FEMALE) && person.getAddress().city.equals("Kraków"))
                .count());

        System.out.println("===================number of men after 65 years=====================");

        System.out.println(people.stream()
                .filter(person -> person.sex.equals(Sex.MALE)&& person.getBirthDay().isBefore(LocalDate.of(1954, 1, 1)))
                .count());

        System.out.println("=================oldest person=====================================");

        System.out.println(people.stream()
                    .map(Person::getBirthDay)
                    .min(LocalDate::compareTo).get());

        System.out.println("====================youngest person from Krakow=====================");

        System.out.println(people.stream()
                .filter(person -> person.getAddress().city.equals("Kraków"))
                .map(Person::getBirthDay)
                .max(LocalDate::compareTo).get());

        System.out.println("=================TOTAL SALARY=====================================");

        System.out.println(people.stream()
                .mapToInt(Person::getSalary)
                .sum());

        System.out.println("=========does any person has first letter 'A' in firstName================");

        System.out.println(people.stream()
                .map(Person::getFirstName)
                .anyMatch(person -> person.startsWith("A")));

        System.out.println("=================does all persons contains letter 'a' in lastName================");

        System.out.println(people.stream()
                .map(Person::getLastName)
                .allMatch(person->person.contains("a")));

        System.out.println("======================5====================================");
        


        System.out.println(people.stream()
                       .filter (person -> person.getAddress().city.equals("Kraków"))
                      //.map (Person::getUserName)
                      .map(person -> person.getUserName())
                      .collect(Collectors.toList()));




    }
}


