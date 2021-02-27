package tests;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateGalleryTests extends TestBase {
	@BeforeMethod
	public void setup() throws InterruptedException {
		driver.navigate().to("https://gallery-app.vivifyideas.com/");
		Thread.sleep(2000);
	}
	@Test 
	public void createGallery() throws InterruptedException {
		String title = excelReader.getData("Create gallery tests", 3, 6);
		String description = excelReader.getData("Create gallery tests", 4, 6);
		String imageUrl = excelReader.getData("Create gallery tests", 5, 6);
		
		logIn();
		Thread.sleep(2000);
		homePage.clickCreateGalleryLink();
		createGalleryPage.enterTitle(title);
		createGalleryPage.enterDescription(description);
		createGalleryPage.enterImageUrl(imageUrl);
		createGalleryPage.clickSubmitButton();
		
	}
	@AfterMethod
	public void afterTest() {
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
}
