package TestCase_Adayroi_Cucumber.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
	WebDriverWait wait;

	@FindBy(xpath = "//*[@class = 'mini-cart-link js-mini-cart-link']")
	WebElement viewCart;

	@FindBy(xpath = "//div[@class = 'cart-submit']")
	WebElement btnexcutePayment;

	public CartPage(WebDriver driver) {
		wait = new WebDriverWait(driver, 20);
		PageFactory.initElements(driver, this);
	}

	public void clickOnCart() throws InterruptedException {
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(viewCart)).click();
		//viewCart.click();
	}

	public void clickOnProcess() {
		btnexcutePayment.click();
	}
}
