package TestCase_Adayroi_Cucumber.Cucumber;

import TestCase_Adayroi_Cucumber.Manager.PageObjectManager;
import TestCase_Adayroi_Cucumber.Manager.WebDriverManager;

public class TestContext {
	private WebDriverManager webDriverManager;
	private PageObjectManager pageObjectManager;
	public ScenarioContext scenarioContext;
	public TestContext() {
		webDriverManager = new WebDriverManager();
		pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
	}
	
	public WebDriverManager getWebDriverManager() {
		return webDriverManager;
	}
	
	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}
	public ScenarioContext getSscenarioContext()
	{
		return scenarioContext;
	}
}
