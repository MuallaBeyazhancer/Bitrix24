package com.britix24.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/default-cucumber-reports",
                "json:target/cucumber.json"},
        features = "src/test/resources/com/bitrix24/features/Login.feature",
        glue = "/com/britix24/step_definitions",
        tags = "@login",
        dryRun = false
)
public class CukesRunner {

}
