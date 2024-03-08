package com.facebook.abc.gtl.threads;

import org.apache.commons.math3.analysis.function.Sin;

public class SingletonClass {

    private static SingletonClass instance;

    // Purpose of it is to limit the number of objects only to one

    private SingletonClass() {}

    public static SingletonClass getInstance() {
        if(instance == null) {
            instance = new SingletonClass();
            return instance;
        }
        return instance;
    }

}
