package com.magnetika.qa.pages;

import com.magnetika.qa.utils.WaitHelper;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;
    protected WaitHelper wait;

    public BasePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WaitHelper(driver);
    }
}