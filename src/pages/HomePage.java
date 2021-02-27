package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	WebElement loginButton;
	WebElement createGalleryLink;
	WebElement myGalleriesLink;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getLoginButton() {
		return driver.findElement(By.xpath("//*[contains(text(),'Login')]"));
	}
	public WebElement getCreateGalleryLink() {
		return driver.findElement(By.xpath("//a[contains(@href,'/create')]"));
	}
	public WebElement getMyGalleriesLink() {
		return driver.findElement(By.xpath("//a[contains(@href,'/my-galleries')]"));
	}

	public void clickLoginButton() {
		this.getLoginButton().click();
	}
	public void clickCreateGalleryLink() {
		this.getCreateGalleryLink().click();
	}
	public void clickMyGalleriesLink() {
		this.getMyGalleriesLink().click();
	}
	
}
