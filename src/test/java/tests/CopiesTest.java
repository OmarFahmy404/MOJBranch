package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.CertificatesAndCopiesHomePage;
import pages.CertificatesPage;
import pages.CopiesPage;
import pages.LoginPage;
import pages.PageBase;

public class CopiesTest extends TestBase
{
	LoginPage loginPage;
	CertificatesAndCopiesHomePage certAndCopyPage;
	CertificatesPage certPage;
	CopiesPage copiesPage;
	
	@BeforeMethod
	public void getInCertificatesPage() throws InterruptedException 
	{
		loginPage=new LoginPage(driver);
		certAndCopyPage=new CertificatesAndCopiesHomePage(driver);
		copiesPage= new CopiesPage(driver);
		certPage=new CertificatesPage(driver);
		PageBase.fluentWait(loginPage.userNameField);
		loginPage.loginData("abdo.cer", "Admin123");
		PageBase.fluentWait(certAndCopyPage.copyTab);
		certAndCopyPage.getIntoCopySection();
		PageBase.fluentWait(certPage.addBtn);
	}
	
	@Test(priority = 1)
	public void recordCaseCopyTest() throws InterruptedException
	{
		copiesPage.recordeCase("12541");
		PageBase.fluentWait(copiesPage.deliverTheCopy);
		SoftAssert sAssert=new SoftAssert();
		Thread.sleep(2000);

		sAssert.assertFalse(copiesPage.deliverTheCopy.isEnabled(),"The Copy Deliver Button is Not Enabled");
		sAssert.assertTrue(CopiesPage.theCopy.isDisplayed(),"The Copy Button is Displayed");
		sAssert.assertAll();
		Thread.sleep(2000);
	}
	
	@Test(priority = 2)
	public void memorialCopyTest() throws InterruptedException
	{
		copiesPage.memorialCopy("12541", "28711111111111");
		PageBase.fluentWait(copiesPage.deliverTheCopy);
		SoftAssert sAssert=new SoftAssert();
		Thread.sleep(2000);
		sAssert.assertFalse(copiesPage.deliverTheCopy.isEnabled(),"The Copy Deliver Button is Not Enabled");
		sAssert.assertTrue(CopiesPage.theCopy.isDisplayed(),"The Copy Button is Displayed");
		sAssert.assertAll();
		Thread.sleep(2000);
	}
	
	
	@Test(priority = 3)
	public void officialJudCopyTest() throws InterruptedException
	{
		copiesPage.theOfficialJudgementCopy("12542");
		PageBase.fluentWait(copiesPage.deliverTheCopy);
		SoftAssert sAssert=new SoftAssert();
		sAssert.assertFalse(copiesPage.deliverTheCopy.isEnabled(),"The Copy Deliver Button is Not Enabled");
		sAssert.assertTrue(CopiesPage.theCopy.isDisplayed(),"The Copy Button is Displayed");
		sAssert.assertAll();
		Thread.sleep(2000);
	}
	
	
	@Test(priority = 4)
	public void copyFromTheFrontOfTheCaseTest() throws InterruptedException
	{
		copiesPage.copyFromTheFrontOfTheCase("12541");
		PageBase.fluentWait(copiesPage.deliverTheCopy);
		SoftAssert sAssert=new SoftAssert();
		sAssert.assertFalse(copiesPage.deliverTheCopy.isEnabled(),"The Copy Deliver Button is Not Enabled");
		sAssert.assertTrue(CopiesPage.theCopy.isDisplayed(),"The Copy Button is Displayed");
		sAssert.assertAll();
		Thread.sleep(2000);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
