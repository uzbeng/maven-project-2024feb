package com.facebook.abc.gtl.step_definitions;

import io.cucumber.java.en.*;

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
}
