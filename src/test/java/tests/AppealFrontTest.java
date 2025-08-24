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
	public void testAddingInfoIntoObjectionCase() throws InterruptedException
	{
		appealFrontPage = new AppealFrontPage(driver);
		appealFrontPage.addInfoToObjectionCase("29911111111111", "28811111111111");
		
	}
	
	@Test
	public void testAddingInfoIntoLaborArbitrationCase() throws InterruptedException
	{
		appealFrontPage = new AppealFrontPage(driver);
		appealFrontPage.addInfoToLaborArbitrationCase("29911111111111", "28811111111111");
		
	}
	
	@Test
	public void testAddingInfoIntoQuarrelCase() throws InterruptedException
	{
		appealFrontPage = new AppealFrontPage(driver);
		appealFrontPage.addInfoToQuarrelCase("29911111111111", "28811111111111");
		
	}
	
}
