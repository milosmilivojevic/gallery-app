package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateGalleryPage {
	WebDriver driver;
	WebElement titleInputField;
	WebElement descriptionsInputField;
	WebElement imagesInputField;
	WebElement addImageButton;
	WebElement submitButton;
	WebElement cancelButton;
	
	
	public CreateGalleryPage(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getTitleInputField() {
		return driver.findElement(By.id("title"));
	}
	public WebElement getDescriptionsInputField() {
		return driver.findElement(By.id("description"));
	}
	public WebElement getImagesInputField() {
		return driver.findElement(By.xpath("//input[@type='url']"));
	}
	public WebElement getAddImageButton() {
		return driver.findElement(By.xpath("//*[contains(text(),'Add image')]"));
	}
	public WebElement getSubmitButton() {
		return driver.findElement(By.xpath("//*[contains(text(),'Submit')]"));
	}
	public WebElement getCancelButton() {
		return driver.findElement(By.xpath("//*[contains(text(),'Cancel')]"));
	}
	
	public void enterTitle(String title) {
		this.getTitleInputField().sendKeys(title);
	}
	public void enterDescription(String description) {
		this.getDescriptionsInputField().sendKeys(description);
	}
	public void enterImageUrl(String imageUrl) {
		this.getImagesInputField().sendKeys(imageUrl);
	}
	public void clickAddImageButton() {
		this.getAddImageButton().click();
	}
	public void clickSubmitButton() {
		this.getSubmitButton().click();
	}
	public void clickCancelButton() {
		this.getCancelButton().click();
	}
}
