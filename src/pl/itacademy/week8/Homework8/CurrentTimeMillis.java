package pl.itacademy.week8.Homework8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class CurrentTimeMillis {

    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<Integer>(100000);

        long startTime1 = System.currentTimeMillis();

         for (int i =0; i< 100000; i++) {
             numbers.add (0, i);

         }
         long endTime1 = System.currentTimeMillis();
         long result1 =endTime1 - startTime1 ;
         System.out.println("Result1 " +result1);
         //System.out.println(numbers);

        System.out.println("================================================");

        LinkedList <Integer> integers = new LinkedList<> ();

        long startTime2 = System.currentTimeMillis();

        for (int i = 0; i<100000; i ++) {
            integers.add (0, i);
        }
        long endTime2 = System.currentTimeMillis();
        long result2 =endTime2 - startTime2 ;

        System.out.println("Result2 " +result2);
        //System.out.println(integers);

        System.out.println("================================================");

        long startTime3 = System.currentTimeMillis();

        for (int i =0; i<100000; i++) {
            numbers.get (i);
        }
        long endTime3 = System.currentTimeMillis();
        long result3 =endTime3 - startTime3 ;

        System.out.println("Result3 " +result3);
       // System.out.println(numbers.get(i));

        System.out.println("================================================");

        long startTime4 = System.currentTimeMillis();

        for (int i = 0; i<100000; i ++) {
            integers.get(i);
        }
        long endTime4 = System.currentTimeMillis();
        long result4 =endTime2 - startTime2 ;

        System.out.println("Result4 " +result4);
        //System.out.println(integers.get(i));


    }
}
