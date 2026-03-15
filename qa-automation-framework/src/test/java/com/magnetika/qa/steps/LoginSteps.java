package com.magnetika.qa.steps;

import io.cucumber.java.en.*;
import com.magnetika.qa.utils.DriverManager;
import com.magnetika.qa.pages.LoginPage;

public class LoginSteps {

    LoginPage loginPage;

    @Given("user is on the login page")
    public void user_is_on_login_page() {

        DriverManager.initDriver();
        DriverManager.driver.get("https://www.saucedemo.com/");

        loginPage = new LoginPage(DriverManager.driver);
    }

    @When("user enters valid username and password")
    public void user_enters_credentials() {

        loginPage.login("standard_user", "secret_sauce");
    }

    @Then("user should see the products page")
    public void user_should_see_products_page() {

        String currentUrl = DriverManager.driver.getCurrentUrl();
        System.out.println("Current URL: " + currentUrl);

        DriverManager.quitDriver();
    }
}