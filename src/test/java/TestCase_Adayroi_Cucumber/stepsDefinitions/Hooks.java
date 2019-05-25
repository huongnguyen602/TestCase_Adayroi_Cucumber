package TestCase_Adayroi_Cucumber.stepsDefinitions;

import TestCase_Adayroi_Cucumber.Cucumber.TestContext;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
TestContext testContext;

@Before
public void BeforeSteps()
{
	
}
@After
public void AfterSteps()
{
	//testContext.getWebDriverManager().closeDriver();
}
}
