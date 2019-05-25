package TestCase_Adayroi_Cucumber.stepsDefinitions;

import TestCase_Adayroi_Cucumber.Cucumber.TestContext;
import TestCase_Adayroi_Cucumber.pageObjects.HomePage;
import cucumber.api.java.en.Given;

public class HomePageStep {
	TestContext testContext;
	HomePage home;

	public HomePageStep(TestContext context) {
		// TODO Auto-generated constructor stub
		this.testContext = context;
		home = testContext.getPageObjectManager().getHomePage();
	}

	@Given("^user is on Home Page$")
	public void user_is_on_Home_Page() throws Throwable {
	
		home.naviagteTo_HomePage();
		home.clickDangNhap();
	}
}
