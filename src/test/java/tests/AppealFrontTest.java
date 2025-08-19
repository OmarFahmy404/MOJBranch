package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.AppealCaseInfoPage;
import pages.AppealFeesPage;
import pages.AppealFrontPage;
import pages.LoginPage;

public class AppealFrontTest extends TestBase
{

	LoginPage loginPage;
	AppealFrontPage appealFrontPage;

	@BeforeMethod
	public void loginAndGetInAppealFrontPart() {
		loginPage = new LoginPage(driver);
		loginPage.loginData("front.es", "Admin123");

	}
	@Test
	public void testAddingInfoIntoAppealCase() throws InterruptedException
	{
		appealFrontPage = new AppealFrontPage(driver);
		appealFrontPage.addInfoToCase("29911111111111", "28811111111111");
		
	}
	
}
