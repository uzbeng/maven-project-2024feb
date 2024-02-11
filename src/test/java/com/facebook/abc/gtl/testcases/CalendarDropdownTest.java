package com.facebook.abc.gtl.testcases;


import com.facebook.abc.gtl.pageobjects.CheapFlightSearchPOs;
import com.facebook.abc.gtl.pageobjects.CheapFlightSearchPageFactoryPOs;
import com.facebook.abc.gtl.util.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CalendarDropdownTest extends Base {

    @Test
    public void testCheapOair() throws InterruptedException {
//        CheapFlightSearchPOs homePage = new CheapFlightSearchPOs(driver);
        CheapFlightSearchPageFactoryPOs homePage = new CheapFlightSearchPageFactoryPOs(driver);
        driver.get(properties.getProperty("cheapOAirUrl.production"));

        // Select your departure airport:
        Thread.sleep(3000);
        // Click on x button to clean the box
//        homePage.cleanDepartureBox();
        homePage.insertDepartureCity("New York");
        Thread.sleep(1000);
        homePage.selectOptionNumberDeparture(4);

        // Select your destination airport: 8:51
//        homePage.cleanArrivalBox();
        homePage.insertDestinationCity("Miami");
        Thread.sleep(1000);
        homePage.selectOptionNumberArrival(1);

        // Select departure date:
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class=' month-date is--today']")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[@class=' month-date'])[6]")).click();

        // Select travellers
        driver.findElement(By.id("travellerButton")).click();
        Thread.sleep(500);

        // add child
        driver.findElement(By.id("addchild")).click();

        Select childAgeDrpDown = new Select(driver.findElement(By.name("ChildrenAge")));
//        childAgeDrpDown.selectByIndex(1);
        childAgeDrpDown.selectByValue("6");
    }

//    @Test
    public void testCheapOair2() throws InterruptedException {
        CheapFlightSearchPOs homePage = new CheapFlightSearchPOs(driver);
        driver.get("https://www.cheapoair.com/");

        // Select your departure airport:
        Thread.sleep(3000);
        // Click on x button to clean the box
//        homePage.cleanDepartureBox();
        homePage.insertDepartureCity("Los Angeles");
        Thread.sleep(1000);
        homePage.selectOptionNumberDeparture(2);

        // Select your destination airport: 8:51
//        homePage.cleanArrivalBox();
        homePage.insertDestinationCity("London");
        Thread.sleep(1000);
        homePage.selectOptionNumberArrival(3);

        // Select departure date:
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class=' month-date is--today']")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("(//a[@class=' month-date'])[6]")).click();

        // Select travellers
        driver.findElement(By.id("travellerButton")).click();
        Thread.sleep(500);

        // add child
        driver.findElement(By.id("addchild")).click();

        Select childAgeDrpDown = new Select(driver.findElement(By.name("ChildrenAge")));
//        childAgeDrpDown.selectByIndex(1);
        childAgeDrpDown.selectByValue("6");
    }

    @Test
    public void testKayak() {
        driver.get("https://kayak.com");
        driver.findElement(By.xpath("//input[@class='k_my-input']")).sendKeys("New York");
        driver.findElement(By.xpath("//div[@aria-label='Remove']")).click();
    }

    @Test
    public void testExpedia() throws InterruptedException {
        driver.get("https://expedia.com");
        Thread.sleep(5000);
        driver.findElement(By.xpath("(//button[@data-stid='open-room-picker'])")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[3]/div/div[2]/div/div/section/div[1]/div[1]/div/div/button[2]")).click();
    }
}
