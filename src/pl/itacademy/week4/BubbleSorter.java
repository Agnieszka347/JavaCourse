package pl.itacademy.week4;

import java.util.Arrays;

public class BubbleSorter {
    public static void main(String[] args) {

        /*int[] numbers = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }*/


        int[] numbers = {7, 20, 5, -2, 13, 3}; //w pętli przestawiamy liczby na podstawie if, zachowując większą liczbę jako tmp (temporary)
        boolean isSorted = true;
        int i = 0;
        do {
            isSorted = true;
            for (int j = 1; j < numbers.length - i; j++) {
                if (numbers[j - 1] > numbers[j]) {
                    int tmp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = tmp;
                    isSorted = false;
                }
            }
            i++;
        } while (!isSorted);
        System.out.println(Arrays.toString(numbers));


        /*int[] numbers = {7, 20, 5, -2, 13, 3};
        boolean isSorted = true;
        int i = 0;
        do {
            isSorted = true;
            for (int j = 1; j < numbers.length - i; j++) {
                if (numbers[j - 1] < numbers[j]) {
                    int tmp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = tmp;
                    isSorted = false;
                }
            }
            i++;
        } while (!isSorted);
        System.out.println(Arrays.toString(numbers));


        int[] numbers = {7, 5, 3, 9, 1};
        int min = numbers[0];
        for (int number : numbers) {
            if (min > number) {
                min = number;
            }
        }
        System.out.println(min);*/


    }
}



