package com.magnetika.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage extends BasePage {

    By inventoryList = By.className("inventory_list");

    public InventoryPage(WebDriver driver){
        super(driver);
    }

    public boolean isInventoryVisible(){
        return wait.waitForElement(inventoryList).isDisplayed();
    }
}