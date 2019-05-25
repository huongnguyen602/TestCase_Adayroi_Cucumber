package TestCase_Adayroi_Cucumber.stepsDefinitions;

import TestCase_Adayroi_Cucumber.Cucumber.TestContext;
import TestCase_Adayroi_Cucumber.Manager.PageObjectManager;
import TestCase_Adayroi_Cucumber.pageObjects.LoginPage;
import cucumber.api.java.en.Then;

public class LoginStep {
	TestContext testContext;
	LoginPage login;
	PageObjectManager manager;

	public LoginStep(TestContext context) {
		// TODO Auto-generated constructor stub
		this.testContext = context;
		login = testContext.getPageObjectManager().getLoginPage();
	}

	@Then("^he login to page with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void he_login_to_page_with_username_and_password(String arg1, String arg2) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		login.LoginAccount(arg1, arg2);

	}
}
