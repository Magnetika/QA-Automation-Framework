package com.magnetika.qa.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class ScreenshotUtil {

    public static void takeScreenshot(WebDriver driver, String name){

        try{

            File screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.FILE);

            Path destination = Path.of("screenshots/" + name + ".png");

            Files.createDirectories(destination.getParent());
            Files.copy(screenshot.toPath(), destination);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}