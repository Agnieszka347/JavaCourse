package pl.itacademy.week7;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTester {
    public static void main(String[] args) {
        Set<String> strings = new HashSet<>();
        strings.add("first");
        strings.add("second");
        strings.add("third");
        strings.add("fourth");

        System.out.println(strings); // [third, fourth, first, second]

        Set<String> linkedStrings = new LinkedHashSet<>();
        linkedStrings.add("first");
        linkedStrings.add("second");
        linkedStrings.add("third");
        linkedStrings.add("fourth");
        linkedStrings.add("first");

        System.out.println(linkedStrings); // [first, second, third, fourth]

        Set<Person> people = new HashSet<>();
        Person nowak = new Person("Jan", "Nowak");
        people.add(nowak);
        System.out.println(people); // [Person{firstName='Jan', lastName='Nowak'}]
        Person jan = new Person("Jan", "Nowak");
        people.add(jan);
        System.out.println(people); // [Person{firstName='Jan', lastName='Nowak'}]

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("first");
        treeSet.add("second");
        treeSet.add("third");
        treeSet.add("fourth");
        System.out.println(treeSet); // [first, fourth, second, third]

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(7);
        numbers.add(9);
        numbers.add(11);
        numbers.add(13);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Ceiling for 15: " + numbers.ceiling(15));                            // Ceiling for 15: 20
        System.out.println("Floor for 15: " + numbers.floor(15));                               // Floor for 15: 13
        System.out.println("Head subset for 15:" + numbers.headSet(15));                 //Head subset for 15:[1, 3, 7, 9, 11, 13]
        System.out.println("Tail subset for 15:" + numbers.tailSet(15));              //Tail subset for 15:[20, 30, 40]
        System.out.println("Head subset for 20:" + numbers.headSet(20, true)); // Head subset for 20:[1, 3, 7, 9, 11, 13, 20]
        System.out.println("Tail subset for 20:" + numbers.tailSet(20));             //Tail subset for 20:[20, 30, 40]


    }
}

