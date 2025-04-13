package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"hooks","stepDefinitions"},
        plugin = {"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        dryRun = false, monochrome = true
)
public class TestRunner {
}
