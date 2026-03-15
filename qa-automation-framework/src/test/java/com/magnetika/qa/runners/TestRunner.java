package com.magnetika.qa.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.magnetika.qa.steps",
        plugin = {"pretty"}
)

public class TestRunner {
}