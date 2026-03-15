package com.magnetika.qa.steps;

import io.cucumber.java.en.*;
import com.magnetika.qa.utils.DriverManager;
import com.magnetika.qa.pages.LoginPage;
import static org.junit.Assert.assertTrue;
import com.magnetika.qa.pages.InventoryPage;

public class LoginSteps {

    LoginPage loginPage;
    InventoryPage inventoryPage;

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

    inventoryPage = new InventoryPage(DriverManager.driver);

    boolean inventoryVisible = inventoryPage.isInventoryVisible();

    System.out.println("Inventory visible: " + inventoryVisible);

    assertTrue(inventoryVisible);

    DriverManager.quitDriver();
}
}