package com.facebook.abc.gtl.util;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Base {

    // Test execution frameworks:
    // 1. JUnit 5 - is used a lot, mainly developers use it for unit testing.
    // 2. TestNG - is used for testing by testers.
    //
    protected WebDriver driver = null; //Global variables get the null value by default
    protected WebDriverWait wait = null;
    protected Properties properties = null;

    @BeforeMethod // It runs before each test method
    public void setup() {

        try {
            FileInputStream fis = new FileInputStream("src\\main\\resources\\application.properties");
            properties = new Properties();
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String browser = properties.getProperty("browser");

        if(browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--disable-popup-blocking");
            chromeOptions.addArguments("window-size=1920,1080");
            chromeOptions.addArguments("-incognito");
            chromeOptions.addArguments("start-maximized");
            chromeOptions.addArguments("disable-infobars");
            chromeOptions.addArguments("--disable-extensions");
            chromeOptions.addArguments("--disable-gpu");
            chromeOptions.addArguments("--disable-dev-shm-usage");
            chromeOptions.addArguments("--no-sandbox");
            chromeOptions.addArguments("--disable-cookies");
            driver = new ChromeDriver(chromeOptions);
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "C:\\webdrivers\\msedgedriver.exe");
            driver = new EdgeDriver();
        } else if(browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "C:\\webdrivers\\geckodriver.exe");
            driver = new EdgeDriver();
        }

        driver.manage().window().setPosition(new Point(-1800, 0));
        driver.manage().window().maximize();
        // This will wait for 10 seconds before throwing NoSuchElementException
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.valueOf(properties.getProperty("wait.implicit"))));
        wait = new WebDriverWait(driver, Duration.ofSeconds(Long.valueOf(properties.getProperty("wait.explicit"))));

        // Element Not Interactable - learn in syncronization topic
    }

//    @AfterMethod // It runs after each test method
    public void teardown() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }

//    @Test
    public void bookingFlights() throws InterruptedException {
        driver.get("https://www.cheapflights.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("(//div[@class='lNCO-inner'])[1]")).click();
        WebElement box1 = driver.findElement(By.xpath("(//input[@class='k_my-input'])[2]"));
        Thread.sleep(1000);
        box1.sendKeys("Hawaii");
        Thread.sleep(1000);
        for (int i=0; i< 3; i++){
            box1.sendKeys(Keys.ARROW_DOWN);
        }
        box1.sendKeys(Keys.ENTER);
        Thread.sleep(500);
        driver.findElement(By.xpath("(//div[@class='lNCO-inner'])[2]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("(//input[@class='k_my-input'])[2]")).sendKeys("New Zealand");
        Thread.sleep(1000);
        for (int i=0; i<2; i++){
            driver.findElement(By.xpath("(//input[@class='k_my-input'])[2]")).sendKeys(Keys.ARROW_DOWN);
        }
        driver.findElement(By.xpath("(//input[@class='k_my-input'])[2]")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);

        driver.findElement(By.xpath("(//span[@class='cQtq-value'])[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@aria-label='Friday January 19, 2024']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("(//span[@class='cQtq-value'])[2]")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//div[@aria-label='Wednesday February 7, 2024']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//div[@class='S9tW S9tW-pres-default S9tW-mod-spacing-medium S9tW-mod-stretch']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//label[@for='id-f']")).click();
        Thread.sleep(1000);


        driver.findElement(By.xpath("(//button[@class='bCGf-mod-theme-default'])[4]")).click();

        driver.findElement(By.xpath("(//button[@class='bCGf-mod-theme-default'])[8]")).click();
        for (int i=0; i<4; i++) {
            driver.findElement(By.xpath("(//button[@class='bCGf-mod-theme-default'])")).click();
        }
        for (int i=0; i<4; i++) {
            driver.findElement(By.xpath("(//button[@class='bCGf-mod-theme-default'])[2]")).click();
        }
        driver.findElement(By.xpath("(//button[@class='bCGf-mod-theme-default'])[3]")).click();
        driver.findElement(By.xpath("(//button[@class='bCGf-mod-theme-default'])[4]")).click();

        Thread.sleep(1000);

        driver.findElement(By.xpath("//div[@class='zEiP-formBody']")).click();



    }

}
