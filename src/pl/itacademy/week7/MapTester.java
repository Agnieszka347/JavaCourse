package pl.itacademy.week7;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTester {
    public static void main(String[] args) {
        //Map<Person, String> beerLovers=new HashMap<>();
        //Map<Person, String> beerLovers = new LinkedHashMap<>();
        Map<Person, String> beerLovers = new TreeMap<>();
        Person kowalski =new Person ("Jan", "Nowak");
        Person nowak = new Person ("Piotr", "Kowalski");
        Person sereda = new Person ("Oleg", "Sereda");
        beerLovers.put (kowalski, "Jasne");
        beerLovers.put (nowak, "Ciemne");
        beerLovers.put (sereda, "Bezalkoholowe");

        System.out.println(kowalski +"lubie" + beerLovers.get(kowalski)+ "piwo");// Person{firstName='Jan', lastName='Nowak'}lubieJasnepiwo
        System.out.println(nowak +"lubie" + beerLovers.get(kowalski)+ "piwo"); //Person{firstName='Piotr', lastName='Kowalski'}lubieJasnepiwo
        System.out.println(sereda +"lubie" + beerLovers.get(kowalski)+ "piwo");//Person{firstName='Oleg', lastName='Sereda'}lubieJasnepiwo

        beerLovers.put(kowalski, "Bezalkoholowe");
        System.out.println(kowalski +"lubie" + beerLovers.get(kowalski)+ "piwo"); // Person{firstName='Jan', lastName='Nowak'}lubieBezalkoholowepiwo

        System.out.println("++++++++++++++++");
        System.out.println(beerLovers); // {Person{firstName='Jan', lastName='Nowak'}=Bezalkoholowe, Person{firstName='Oleg', lastName='Sereda'}=Bezalkoholowe, Person{firstName='Piotr', lastName='Kowalski'}=Ciemne}
    }
}
