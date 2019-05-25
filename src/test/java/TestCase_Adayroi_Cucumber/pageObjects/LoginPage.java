package TestCase_Adayroi_Cucumber.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriverWait wait;

	@FindBy(id = "j_username")
	WebElement txtEmail;
	@FindBy(id = "j_password")
	WebElement txtPass;
	@FindBy(xpath = "//*[@class='btn btn-primary btn-block js-login-btn']")
	WebElement bntLogin;

	public LoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, 20);
	}

	public void LoginAccount(String email, String password) throws InterruptedException {
		Thread.sleep(3000);
		txtEmail.sendKeys(email);
		txtPass.sendKeys(password);
		bntLogin.click();
	}
}
