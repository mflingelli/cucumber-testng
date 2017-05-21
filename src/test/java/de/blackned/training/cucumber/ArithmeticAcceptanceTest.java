package de.blackned.training.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = "src/test/features/math",
        glue = "de.blackned.training.cucumber",
        plugin = "json:target/cucumber-report.json")
public class ArithmeticAcceptanceTest extends AbstractTestNGCucumberTests {
}
