package pl.itacademy.week8;

import java.time.LocalDate;
import java.util.*;

public class ComparableTester {

    public static void main(String[] args) {
        Person kowalski = new Person("Jan", "Kowalski", LocalDate.of(1970, 1, 1));
        Person nowak = new Person("Janusz", "Nowak", LocalDate.of(1980, 6, 15));
        //System.out.println(kowalski.compareTo(nowak));

        Set<Person> persons = new TreeSet<>();
        persons.add(kowalski);
        persons.add(nowak);
        System.out.println(persons);

        Room firstRoom = new Room(10);
        Room secondRoom = new Room(15);
        Room thirdRoom = new Room(5);
        Set<Room> rooms = new TreeSet<>(new RoomComparator());
        rooms.add(firstRoom);
        rooms.add(secondRoom);
        rooms.add(thirdRoom);
        System.out.println(rooms);

        Map<Room, String> roomMap = new TreeMap<>(Comparator.nullsLast(new RoomComparator()));
        roomMap.put(null, "test");
        roomMap.put(firstRoom, "Nowak's room");
        roomMap.put(secondRoom, "Kowalski's room");
        System.out.println(roomMap);

        Person sereda = new Person("Oleg", "Sereda", LocalDate.of(1900, 1, 1));
        PriorityQueue<Person> goodLoodQueue = new PriorityQueue<>(Comparator.reverseOrder());
        goodLoodQueue.add(nowak);
        goodLoodQueue.add(kowalski);
        goodLoodQueue.add(sereda);
        System.out.println(goodLoodQueue);

    }
}
