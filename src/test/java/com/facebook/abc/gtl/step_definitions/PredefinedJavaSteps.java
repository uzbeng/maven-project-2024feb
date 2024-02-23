package com.facebook.abc.gtl.step_definitions;

import io.cucumber.java.en.*;
import org.junit.Assert;

public class PredefinedJavaSteps {

    @Given("^User is running given$")
    public void user_is_running_given() {
        System.out.println("User is running given");
    }

    @When("This is when part")
    public void this_is_when_part() {
        System.out.println("This is when part");
    }

    @Then("This is then part")
    public void this_is_then_part() {
        System.out.println("This is then part");
    }

    @And("This is and part")
    public void this_is_and_part() {
        System.out.println("This is and part");
    }

    @But("This is but part")
    public void this_is_but_part() {
        System.out.println("This is but part");
    }

    @And("validate page title")
    public void some_name() {
        System.out.println("validate page title");
    }

    @Given("^I navigate to website \"([^\"]*)\"$")
    public void i_navigate_to_website(String url) {
        System.out.println("Navigating to website " + url);
    }

    @When("User inserts username {string} and password {string}")
    public void user_inserts_username_and_password(String username, String password) {
        System.out.println("Username is " + username);
        System.out.println("Password is " + password);
    }

    @Then("The result is {int}")
    public void the_result_is(Integer int1) {
        System.out.println("Number is " + int1);
//        Assert.fail();
    }

    @Given("^Username (.+) and Password (.+)$")
    public void givenUsernameAndPassword(String username, String password) {
        System.out.println("Given Username " + username + " and Password " + password);
        // Add code to perform actions based on username and password
    }

    @Given("Driver is initialized")
    public void driver_is_initialized() {
        System.out.println("Webdriver is running");
    }
}
