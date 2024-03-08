package com.facebook.abc.gtl.threads;

public class MultipleThreads {

    public static void main(String[] args) {
        Thread thread1 = new MyThread("Thread 1");
        Thread thread2 = new MyThread("Thread 2");
        Thread thread3 = new MyThread("Thread 3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
