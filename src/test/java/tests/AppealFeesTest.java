package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.AppealFeesPage;
import pages.LoginPage;
import pages.WarningsPage;

public class AppealFeesTest extends TestBase
{

	
	LoginPage loginPage;
	AppealFeesPage appealFeesPage;

	@BeforeMethod
	public void loginAndGetInAnnPart() {
		loginPage = new LoginPage(driver);
		//loginPage.fluentWait(loginPage.userNameField);
		loginPage.loginData("fees.es", "Admin123");

	}
	
	
	@Test
	public void createAppealCase() throws InterruptedException
	{
		appealFeesPage=new AppealFeesPage(driver);
		appealFeesPage.createObjectionCase("1", "اي كلام", "1");
	}
	
	
}
