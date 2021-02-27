package tests;


import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase{
	@BeforeMethod
	public void setup() throws InterruptedException {
		driver.navigate().to("https://gallery-app.vivifyideas.com/");
		Thread.sleep(2000);
	}
	@Test 
	public void verifyThatLoginFormElementsAreDisplayed() {

		homePage.clickLoginButton();
		loginPage.verifyThatEmailInputFieldIsDisplayed();
		loginPage.verifyThatPasswordInputFieldIsDisplayed();
		loginPage.verifyThatSubmitButtonIsdisplayed();
	}
	@Test 
	public void verifyThatLoginFormLabelsHaveCorrectText() throws IOException {

		homePage.clickLoginButton();
		loginPage.verifyThatHeadlineHasCorrectText();
		loginPage.verifyThatEmailLabelHasCorrectText();
		loginPage.verifyThatPasswordLabelHasCorrectText();
		loginPage.verifyThatSubmitButtonHasCorrectText();
	}
	@Test 
	public void loginWithValidCredentials() {

		logIn();

	}
	@AfterMethod
	public void afterTest() {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
}
