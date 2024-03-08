package com.facebook.abc.gtl.hooks;

import com.facebook.abc.gtl.util.DriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class CucumberHooks {

    @Before(order = 1)
    public void before1() {
        System.out.println("This is before hook1");
    }

    @Before(order = 2)
    public void before2() {
        System.out.println("This is before hook2");
    }

    @BeforeStep
    public void beforeEachStep() {
        System.out.println("Take screenshot before test");
    }

    @After
    public void after() {
        System.out.println("This is after hook");
        DriverManager.getInstance().tearDown();
    }
}
