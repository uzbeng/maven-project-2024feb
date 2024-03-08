package com.facebook.abc.gtl.threads;

public class MyThread extends Thread {

    String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for(int i=1; i<=10; i++) {
            System.out.println(name + " " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
