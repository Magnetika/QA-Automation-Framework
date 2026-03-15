package com.magnetika.qa.pages;

import com.magnetika.qa.utils.WaitHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
    WaitHelper wait;

    By username = By.id("user-name");
    By password = By.id("password");
    By loginButton = By.id("login-button");

    public LoginPage(WebDriver driver){
        this.driver = driver;
        wait = new WaitHelper(driver);
    }

    public void login(String user, String pass){

        wait.waitForElement(username).sendKeys(user);
        wait.waitForElement(password).sendKeys(pass);
        wait.waitForElement(loginButton).click();
    }
}