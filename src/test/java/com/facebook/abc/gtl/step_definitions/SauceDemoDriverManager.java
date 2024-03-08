package com.facebook.abc.gtl.step_definitions;

import com.facebook.abc.gtl.util.BrowserUtils;
import com.facebook.abc.gtl.util.DriverManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class SauceDemoDriverManager {

//    @Given("I navigate to sauce_labs application")
//    public void i_navigate_to_sauce_labs_application() {
////        DriverManager.getInstance().getDriver().get("https://www.saucedemo.com/");
//        BrowserUtils.openUrl("https://www.saucedemo.com/");
//    }

    @Given("^I navigate to url \"([^\"]*)\"$")
    public void i_navigate_to_sauce_labs_application(String url) {
        BrowserUtils.openUrl(url);
    }

//    @When("I insert username and password")
//    public void i_insert_username_and_password() {
////        DriverManager.getInstance().getDriver().findElement(By.id("user-name")).sendKeys("standard_user");
//        BrowserUtils.sendKeysIntoBox("//*[@id='user-name']", "standard_user");
////        DriverManager.getInstance().getDriver().findElement(By.id("password")).sendKeys("secret_sauce");
//        BrowserUtils.sendKeysIntoBox("//*[@id='password']", "secret_sauce");
//    }

    @When("^I insert value \"([^\"]*)\" into box \"([^\"]*)\"$")
    public void i_insert_username_and_password(String inputValue, String locator) {
        BrowserUtils.sendKeysIntoBox(locator, inputValue);
    }

//    @When("I click login button")
//    public void i_click_login_button() {
////        DriverManager.getInstance().getDriver().findElement(By.id("login-button")).click();
//        BrowserUtils.clickElement("//*[@id='login-button']");
//    }

    @When("^I click element with locator \"([^\"]*)\"$")
    public void i_click_login_button(String locator) {
        BrowserUtils.clickElement(locator);
    }

    @Then("I am on home page")
    public void i_am_on_home_page() {
        List<WebElement> cartElements = DriverManager.getInstance().getDriver().findElements(By.id("shopping_cart_container"));
        Assert.assertTrue(cartElements.size() > 0);
    }
}
