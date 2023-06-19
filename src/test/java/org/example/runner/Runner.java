package org.example.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.example.steps.SearchSteps;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "org/example/steps",
        tags = "@Search"
)
public class Runner {
}
