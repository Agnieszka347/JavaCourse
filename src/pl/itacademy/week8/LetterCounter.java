package pl.itacademy.week8;

import java.util.LinkedHashMap;
import java.util.Map;

public class LetterCounter {

    public static void main(String[] args) {
        printLettersWithCount("Java 11!");
        printLettersWithCount("IT academy - 2019!!!");
    }

    private static void printLettersWithCount(String text) {
        char[] chars = text.toCharArray();
        Map<Character, Integer> lettersWithCount = new LinkedHashMap<>();
        for (char aChar : chars) {
//            Integer currentCount = lettersWithCount.getOrDefault(aChar, 0);
//            lettersWithCount.put(aChar, currentCount + 1);

            lettersWithCount.compute(aChar, (c, count) -> count == null ? 1 : count + 1);

//            if (lettersWithCount.get(aChar) == null) {
//                lettersWithCount.put(aChar, 1);
//            } else {
//                int incrementedCount = lettersWithCount.get(aChar) + 1;
//                lettersWithCount.put(aChar, incrementedCount);
//            }
        }
        System.out.println(lettersWithCount);
    }
}
