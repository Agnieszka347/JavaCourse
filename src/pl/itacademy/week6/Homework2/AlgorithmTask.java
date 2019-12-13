package pl.itacademy.week6.Homework2;
//Algorithm task:
//For given text find the longest and the shortest words:Example: For given text find the longest and the shortest words, result: shortest and For
//Think, how to keep all the shortest and longest words in result? so, for shortest we will get: For, the, the

public class AlgorithmTask {

    public static void main(String[] args) {

        String text = "For given text find the longest and the shortest words";

        String[] strings = text.split(" ");

        String minWord = strings[0];
        String maxWord = strings[0];

        for (String t : strings) {
            if (minWord.length() > t.length()) {
                minWord = t;
            }
            if (maxWord.length() < t.length())
                maxWord = t;
        }
        System.out.println("minWord: " + minWord + ", " + "maxWord: " + maxWord);

        for (String t : strings) {
            int c = t.length();
            System.out.println("Word: " + t + " is " + c + " characters.");
        }

        System.out.println("All shortest and longest word");
        for (String t : strings) {
            if (t.length() == minWord.length()) {
                System.out.println(t);
            } if (t.length() == maxWord.length()) {
                System.out.println(t);
            }
        }

    }
}
