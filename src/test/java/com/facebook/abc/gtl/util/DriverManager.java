package com.facebook.abc.gtl.util;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class DriverManager {

    private static DriverManager instance;
    private static ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();

    // Hidden constructor
    private DriverManager() {}

    public static DriverManager getInstance() {
        if(instance == null) {
            instance = new DriverManager();
            return instance;
        }
        return instance;
    }

    public WebDriver getDriver() {
        if(threadLocalDriver.get() == null) {
            threadLocalDriver.set(createDriver());
            return threadLocalDriver.get();
        }
        return threadLocalDriver.get();
    }

    public void tearDown() {
        if(threadLocalDriver.get() != null) {
            threadLocalDriver.get().quit();
            threadLocalDriver.remove();
        }
    }

    private WebDriver createDriver() {
        WebDriver driver;

        Properties properties = new Properties();
        try {
            FileInputStream fis = new FileInputStream("src/main/resources/application.properties");
            properties.load(fis);
        } catch (Exception e) {
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
        } else {
            System.setProperty("webdriver.gecko.driver", "C:\\webdrivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        }

        driver.manage().window().setPosition(new Point(-1800, 0));
        driver.manage().window().maximize();
        // This will wait for 10 seconds before throwing NoSuchElementException
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.valueOf(properties.getProperty("wait.implicit"))));

        return driver;
    }



}
