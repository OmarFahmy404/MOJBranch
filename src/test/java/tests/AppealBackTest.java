package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.AppealBackPage;
import pages.LoginPage;

public class AppealBackTest extends TestBase
{

	LoginPage loginPage;
	AppealBackPage appealBackPage;
	
	@BeforeMethod
	public void loginAndGetInAppealPart() {
		loginPage = new LoginPage(driver);
		loginPage.loginData("back.es", "Admin123");

	}
	
	@Test
	public void testAddingInfoIntoDivisionCommitteeCase() throws InterruptedException 
	{
		appealBackPage=new AppealBackPage(driver);
		appealBackPage.addingInfoIntoDivisionCommitteeCase("972642","29811111111124");
	}
	
}
