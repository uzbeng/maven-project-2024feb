package com.facebook.abc.gtl.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheapFlightSearchPOs {

    private WebDriver driver;

    // Locators:
    private By fromSearchBoxDeleteBtn = By.xpath("(//a[@aria-label='clear field'])[1]");
    private By fromSearchBox = By.xpath("//input[@id='from0']");
    private By toSearchBoxDeleteBtn = By.xpath("(//a[@aria-label='clear field'])[2]");
    private By toSearchBox = By.xpath("//input[@id='to0']");

    // Constructor:
    public CheapFlightSearchPOs(WebDriver driver) {
        this.driver = driver;
    }

    // Methods:
    private void cleanDepartureBox() {
        driver.findElement(fromSearchBoxDeleteBtn).click();
    }

    private void cleanArrivalBox() {
        driver.findElement(toSearchBoxDeleteBtn).click();
    }

    public void insertDepartureCity(String city) {
        cleanDepartureBox();
       driver.findElement(fromSearchBox).sendKeys(city);
    }

    public void insertDestinationCity(String city) {
        cleanArrivalBox();
        driver.findElement(toSearchBox).sendKeys(city);
    }

    public void selectOptionNumberDeparture(int number) throws InterruptedException {
        WebElement box1 = driver.findElement(fromSearchBox);
        for(int i = 1; i<number; i++) {
            box1.sendKeys(Keys.ARROW_DOWN);
        }
        box1.sendKeys(Keys.ENTER);
    }

    public void selectOptionNumberArrival(int number) throws InterruptedException {
        WebElement box1 = driver.findElement(toSearchBox);
        for(int i = 1; i<number; i++) {
            box1.sendKeys(Keys.ARROW_DOWN);
        }
        box1.sendKeys(Keys.ENTER);
    }
}
