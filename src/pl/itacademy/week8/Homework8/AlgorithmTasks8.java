package pl.itacademy.week8.Homework8;

import java.util.*;

public class AlgorithmTasks8 {

    public static void main(String[] args) {

        String text = "This is a test text";
        LinkedHashSet<String> strings = new LinkedHashSet ();


        strings.add("T");
        strings.add("h");
        strings.add("i");
        strings.add("s");
        strings.add("i");
        strings.add("s");
        strings.add("a");
        strings.add("t");
        strings.add("e");
        strings.add("s");
        strings.add("t");
        strings.add("t");
        strings.add("e");
        strings.add("x");
        strings.add("t");

        System.out.println(strings);

        System.out.println("====================================");

        printLettersWithCount("This is a test text");
    }

    private static void printLettersWithCount(String text) {
        char[] chars = text.toCharArray();
        Map<Character, Integer> lettersWithCount = new LinkedHashMap<>();
        for (char aChar : chars) {
            lettersWithCount.compute(aChar, (c, count) -> count == null ? 1 : count + 1);

            System.out.println(lettersWithCount);


        }
    }


}