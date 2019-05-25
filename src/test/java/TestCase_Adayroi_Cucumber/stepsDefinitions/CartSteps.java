package TestCase_Adayroi_Cucumber.stepsDefinitions;

import TestCase_Adayroi_Cucumber.Cucumber.TestContext;
import TestCase_Adayroi_Cucumber.pageObjects.CartPage;
import cucumber.api.java.en.When;

public class CartSteps {
	CartPage cart;
	TestContext testContext;

	public CartSteps(TestContext context) {
		// TODO Auto-generated constructor stub
		this.testContext = context;
		cart = testContext.getPageObjectManager().getCartPage();
	}

	@When("^move to checkout cart$")
	public void move_to_checkout_cart() throws Throwable {
		cart.clickOnCart();
		cart.clickOnProcess();
	}
}
