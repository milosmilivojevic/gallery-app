package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import tests.ExcelReader;

public class LoginPage {
	WebDriver driver;
	WebElement emailInputField;
	WebElement passwordInputField;
	WebElement submitButton;
	WebElement headline;
	WebElement emailLabel;
	WebElement passwordLabel;
	ExcelReader excelReader;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	
	public ExcelReader getExcelReader() throws IOException {
		return this.excelReader = new ExcelReader("data\\testData.xlsx");
	}
	public WebElement getEmailInputField() {
		return driver.findElement(By.id("email"));
	}
	public WebElement getPasswordInputField() {
		return driver.findElement(By.id("password"));
	}
	public WebElement getSubmitButton() {
		return driver.findElement(By.xpath("//*[contains(text(),'Submit')]"));
	}
	public WebElement getHeadline() {
		return driver.findElement(By.xpath("//*[contains(text(),'Please login')]"));
	}
	public WebElement getEmailLabel() {
		return driver.findElement(By.xpath("//*[contains(text(),'Email')]"));
	}
	public WebElement getPasswordLabel() {
		return driver.findElement(By.xpath("//*[contains(text(),'Password')]"));
	}
	


	public void enterEmail(String email) {
		this.getEmailInputField().sendKeys(email);
	}
	public void enterPassword(String password) {
		this.getPasswordInputField().sendKeys(password);
	}
	public void clickSubmitButton() {
		this.getSubmitButton().click();
	}
	public void verifyThatEmailInputFieldIsDisplayed() {
		Assert.assertTrue(this.getEmailInputField().isDisplayed());
	}
	public void verifyThatPasswordInputFieldIsDisplayed() {
		Assert.assertTrue(this.getPasswordInputField().isDisplayed());
	}
	public void verifyThatSubmitButtonIsdisplayed() {
		Assert.assertTrue(this.getSubmitButton().isDisplayed());
	}
	public void verifyThatHeadlineHasCorrectText() throws IOException {
		String actualHeadline = this.getHeadline().getText();
		String expectedHeadline = this.getExcelReader().getData("Login tests", 21, 6);
		Assert.assertEquals(actualHeadline, expectedHeadline);
	}
	public void verifyThatEmailLabelHasCorrectText() throws IOException {
		String actualEmailLabelText = this.getEmailLabel().getText();
		String expectedEmailLabelText = this.getExcelReader().getData("Login tests", 22, 6);
		Assert.assertEquals(actualEmailLabelText, expectedEmailLabelText);
	}
	public void verifyThatPasswordLabelHasCorrectText() throws IOException {
		String actualPasswordLabelText = this.getPasswordLabel().getText();
		String expectedPasswordLabelText = this.getExcelReader().getData("Login tests", 23, 6);
		Assert.assertEquals(actualPasswordLabelText, expectedPasswordLabelText);
	}
	public void verifyThatSubmitButtonHasCorrectText() throws IOException {
		String actualButtonText = this.getSubmitButton().getText();
		String expectedButtonText = this.getExcelReader().getData("Login tests", 24, 6);
		Assert.assertEquals(actualButtonText, expectedButtonText);
	}
}
