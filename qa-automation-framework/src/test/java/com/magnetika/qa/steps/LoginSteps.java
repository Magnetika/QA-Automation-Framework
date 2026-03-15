package com.magnetika.qa.steps;

import io.cucumber.java.en.*;
import com.magnetika.qa.utils.DriverManager;

public class LoginSteps {

  @Given("user is on the login page")
public void user_is_on_login_page() {

    DriverManager.initDriver();
    DriverManager.driver.get("https://www.saucedemo.com/");
}

    @When("user enters valid username and password")
    public void user_enters_credentials() {
        System.out.println("Entering credentials");
    }

  @Then("user should see the products page")
public void user_should_see_products_page() {

    DriverManager.quitDriver();
}

}