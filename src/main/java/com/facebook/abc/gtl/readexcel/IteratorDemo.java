package com.facebook.abc.gtl.readexcel;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(45);
        numbers.add(66);
        numbers.add(23);
        numbers.add(89);
        numbers.add(22);
        // Create collection with some data in it.

        // Iterating through the numbers
//        for(int number : numbers) {
//            System.out.println(number);
//        }

        Iterator<Integer> iterator = numbers.iterator();

        while(iterator.hasNext()) {
            int value = iterator.next();
            System.out.println(value);
        }

//        System.out.println(iterator.next());

    }
}
