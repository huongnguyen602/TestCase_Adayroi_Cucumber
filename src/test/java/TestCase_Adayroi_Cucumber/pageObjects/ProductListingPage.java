package TestCase_Adayroi_Cucumber.pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductListingPage {
	WebDriver driver;
	WebDriverWait wait;

	@FindBy(xpath = "//input[@class ='form-control js-site-search-input  ui-autocomplete-input']")
	WebElement txt_search;
	@FindBy(xpath = "//*[@class='polish-version-icon-search' ]")
	WebElement btn_Submitsearch;
	@FindBy(xpath = "//div[@class ='product-list__container']/div/div")
	List<WebElement> listProduct;
	@FindBy(xpath = "//*[@id='addToCartButton']/span")
	WebElement btn_AddToCart;
	@FindBy(xpath = "//*[@class = 'mini-cart-link js-mini-cart-link']")
	WebElement viewCart;
	@FindBy(xpath = "//div[@class = 'cart-submit']")
	WebElement btnexcutePayment;

	public ProductListingPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 30);
		PageFactory.initElements(driver, this);
	}

	public void searchProduct(String proName) throws InterruptedException {
		wait.until(ExpectedConditions.not(ExpectedConditions.stalenessOf(txt_search)));
		Thread.sleep(3000);
		txt_search.sendKeys(proName);
		btn_Submitsearch.click();
	}

	public void SelectProduct(String proName) throws InterruptedException {
		for (int i = 0; i < listProduct.size(); i++) {
			if (listProduct.get(i).getText().contains(proName)) {
				listProduct.get(i).click();
				break;
			}
		}
		for (String handle1 : driver.getWindowHandles()) {
			driver.switchTo().window(handle1);
		}
		btn_AddToCart.click();
	}

	public String getProductName(String productName) {
		return productName;

	}
}
