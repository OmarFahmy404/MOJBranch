package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.AdministrativeAnnFeesPage;
import pages.LoginPage;
import pages.PageBase;
import pages.SecAdminAnnStatusPage;
import pages.SecretaryPage;

public class AdministrativeAnnTest extends TestBase
{
	SecretaryPage secPage;
	LoginPage loginPage;
	AdministrativeAnnFeesPage admAnnPage;
	SecAdminAnnStatusPage adminAnnStatusPage;
	
	@BeforeTest
	public void LoginAndGetInThePage()
	{
		loginPage=new LoginPage(driver);
		loginPage.fluentWait(loginPage.userNameField);
		loginPage.loginData("secretary","Admin123");
		
		secPage=new SecretaryPage(driver);
		loginPage.fluentWait(secPage.feesAdmAnnTab);
		secPage.getInFeesAdvAnnTab();
		
	}
	
	@Test(priority = 1)
	public void adminsitrartiveAnnProcessTest() throws InterruptedException 
	{
		admAnnPage=new AdministrativeAnnFeesPage(driver);
		admAnnPage.caseAdmAnnFeesProcess("12541");
		SoftAssert sAssert= new SoftAssert();
		sAssert.assertTrue(driver.getCurrentUrl().equals("http://10.0.10.58:9091/#/adminstrative-announcements"));
		sAssert.assertTrue(admAnnPage.annTypeTxt.getText().contains("قرار إعادة للمرافعة"));
		
		
		adminAnnStatusPage=new SecAdminAnnStatusPage(driver);
		secPage=new SecretaryPage(driver);
		secPage.getInAdmAnnStatusTab();
		Thread.sleep(2000);
		adminAnnStatusPage.annSearch();
		//sAssert.assertTrue();
		
		sAssert.assertAll();
	}
	
	@Test(priority = 2)
	public void adminsitrartiveOrderProcessTest() throws InterruptedException 
	{
		admAnnPage=new AdministrativeAnnFeesPage(driver);
		admAnnPage.orderAdmAnnFeesProcess("19");
		SoftAssert sAssert= new SoftAssert();
		sAssert.assertTrue(driver.getCurrentUrl().equals("http://10.0.10.58:9091/#/adminstrative-announcements"));
		sAssert.assertTrue(admAnnPage.annTypeTxt.getText().contains("اعادة اعلان"));
		
		
		adminAnnStatusPage=new SecAdminAnnStatusPage(driver);
		secPage=new SecretaryPage(driver);
		secPage.getInAdmAnnStatusTab();
		Thread.sleep(2000);
		adminAnnStatusPage.annSearch();
		//sAssert.assertTrue();
		
		sAssert.assertAll();
	}

}
