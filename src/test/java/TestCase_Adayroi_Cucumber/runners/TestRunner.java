package TestCase_Adayroi_Cucumber.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
	features = "src/test/resources",
	glue = "TestCase_Adayroi_Cucumber.stepsDefinitions"
)
public class TestRunner {

}