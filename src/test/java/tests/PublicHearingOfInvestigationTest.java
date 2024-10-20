package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.SecPublicHearingOfInvestigationPage;
import pages.SecretaryPage;

public class PublicHearingOfInvestigationTest extends TestBase
{
	SecretaryPage secPage;
	LoginPage loginPage;
	SecPublicHearingOfInvestigationPage investigationPage;
	
	@BeforeTest
	public void LoginAndGetInThePage()
	{
		loginPage=new LoginPage(driver);
		loginPage.fluentWait(loginPage.userNameField);
		loginPage.loginData("secretary","Admin123");
		
		secPage=new SecretaryPage(driver);
	//	secPage.getInHearingMangementTab();
	}
	
	@Test
	public void finishTheHearingOfInvestigationProcessTest() throws InterruptedException
	{
		investigationPage=new SecPublicHearingOfInvestigationPage(driver);
		Thread.sleep(7000);
		investigationPage.compeletInvestigationHearingProcess("6344");
	}
	
}
