package TestCase_Adayroi_Cucumber.stepsDefinitions;

import TestCase_Adayroi_Cucumber.Cucumber.TestContext;
import TestCase_Adayroi_Cucumber.pageObjects.ProductListingPage;
import cucumber.api.java.en.When;


public class ProductListingStep {
	TestContext testContext;
	ProductListingPage productList;
	
	public ProductListingStep(TestContext context) {
		// TODO Auto-generated constructor stub
		this.testContext = context;
		productList = testContext.getPageObjectManager().getProductListingPage();
	}
	
	@When("^search for \"([^\"]*)\"$")
	public void search_for(String arg1) throws Throwable {
		productList.searchProduct(arg1);
	    
	}

	@When("^choose to buy \"([^\"]*)\"$")
	public void choose_to_buy(String arg1) throws Throwable {
		productList.SelectProduct(arg1);
		productList.getProductName(arg1);
	}
	
}
