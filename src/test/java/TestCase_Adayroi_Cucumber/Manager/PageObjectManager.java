package TestCase_Adayroi_Cucumber.Manager;

import org.openqa.selenium.WebDriver;

import TestCase_Adayroi_Cucumber.pageObjects.CartPage;
import TestCase_Adayroi_Cucumber.pageObjects.HomePage;
import TestCase_Adayroi_Cucumber.pageObjects.LoginPage;
import TestCase_Adayroi_Cucumber.pageObjects.ProductListingPage;


public class PageObjectManager {
	private WebDriver driver;
	private HomePage home;
	private LoginPage login;
	private ProductListingPage product;
	private CartPage cart;
	//private ComfirmationPage comfirmationPage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public HomePage getHomePage() {
		return (home == null) ? home = new HomePage(driver) : home;
	}
	
	public LoginPage getLoginPage() {
		return (login == null) ? login = new LoginPage(driver) : login;
	}
	
	public ProductListingPage getProductListingPage() {
		return (product == null) ? product = new ProductListingPage(driver) : product;
	}
	
	public CartPage getCartPage() {
		return (cart == null) ? cart = new CartPage(driver) : cart;
	}
}
