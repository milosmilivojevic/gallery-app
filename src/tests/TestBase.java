package tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.HomePage;
import pages.LoginPage;


public class TestBase {
	
	WebDriver driver;
	
	//Pages
	
	HomePage homePage;
	LoginPage loginPage;
	ExcelReader excelReader;


	@BeforeClass
	public void beforeClass() throws IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"driver-lib\\chromedriver.exe");
		
		this.driver = new ChromeDriver();
		
		this.homePage = new HomePage(driver);
		this.loginPage = new LoginPage(driver);
		this.excelReader = new ExcelReader("data\\testData.xlsx");
		
		driver.manage().window().maximize();
	}
	@AfterClass
	public void afterClass() {
		driver.close();
	}
	public void logIn() {
		homePage.clickLoginButton();
		loginPage.enterEmail(excelReader.getData("Login tests", 5, 6));
		loginPage.enterPassword(excelReader.getData("Login tests", 6, 6));
		loginPage.clickSubmitButton();
	}
}
