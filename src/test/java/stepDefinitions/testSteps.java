package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import driver.driver;

public class testSteps extends driver {
    @Given("website")
    public void website() {
        setup();
        System.out.println("qweq");
    }

    @And("login")
    public void login() {
        System.out.println("qweq");
        // Write code here that turns the phrase above into concrete actions
    }

    @When("logged in")
    public void logged_in() {
        //driver.get("https:/hakanduygu34.com");
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("go dm")
    public void go_dm() {
        // Write code here that turns the phrase above into concrete actions
    }

}
