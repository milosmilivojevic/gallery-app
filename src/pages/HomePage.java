package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	WebElement loginButton;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getLoginButton() {
		return driver.findElement(By.xpath("//*[contains(text(),'Login')]"));
	}
	public void clickLoginButton() {
		this.getLoginButton().click();
	}
	
}
