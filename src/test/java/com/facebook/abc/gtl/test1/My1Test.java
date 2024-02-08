package com.facebook.abc.gtl.test1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class My1Test {

    @Test
    public void test1() {
        System.out.println("Test1");
        Assert.fail();
    }

    @Test
    public void test2() {
        System.out.println("Test2");
    }

    @Test(dependsOnMethods = "test1")
    public void test3() {
        System.out.println("Test3");
    }
}
