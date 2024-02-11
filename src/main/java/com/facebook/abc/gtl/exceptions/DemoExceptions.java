package com.facebook.abc.gtl.exceptions;

public class DemoExceptions {

    public static void main(String[] args) {

        // Unchecked exception
        int[] numbers = {1,2,3,4,5,6};

//        System.out.println(numbers[8]); // stops

        try {
            // connect to DB
            System.out.println(numbers[4]);
            // some other code
        } catch (ArrayIndexOutOfBoundsException e) {
            // handle exception
            e.printStackTrace();
        } catch (ArithmeticException e) {
            // do something else
        } finally {
            // no matter exception happens or not,
            // do this at the end
            // close DB connection
            System.out.println("Finally always runs");
        }

        System.out.println("This is the next line in the code");


    }
}
