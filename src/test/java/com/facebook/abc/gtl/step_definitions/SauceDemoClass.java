//package com.facebook.abc.gtl.step_definitions;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Point;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//
//import java.time.Duration;
//import java.util.List;
//
//public class SauceDemoClass {
//    private WebDriver driver;
//
//    @Given("I navigate to sauce_labs application")
//    public void i_navigate_to_sauce_labs_application() {
//        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().window().setPosition(new Point(-1800, 0));
//        driver.manage().window().maximize();
//        // This will wait for 10 seconds before throwing NoSuchElementException
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.get("https://www.saucedemo.com/");
//    }
//
//    @When("I insert username and password")
//    public void i_insert_username_and_password() {
//        driver.findElement(By.id("user-name")).sendKeys("standard_user");
//        driver.findElement(By.id("password")).sendKeys("secret_sauce");
//    }
//
//    @When("I click login button")
//    public void i_click_login_button() {
//        driver.findElement(By.id("login-button")).click();
//    }
//
//    @Then("I am on home page")
//    public void i_am_on_home_page() {
//        List<WebElement> cartElements = driver.findElements(By.id("shopping_cart_container"));
//        Assert.assertTrue(cartElements.size() > 0);
//    }
//}
