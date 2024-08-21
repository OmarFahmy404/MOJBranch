package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.CertificatesAndCopiesHomePage;
import pages.CertificatesPage;
import pages.LoginPage;
import pages.PageBase;

public class CertificatesTest extends TestBase
{
	LoginPage loginPage;
	CertificatesAndCopiesHomePage certAndCopyPage;
	CertificatesPage certPage;
	
	@BeforeMethod
	public void getInCertificatesPage() throws InterruptedException 
	{
		loginPage=new LoginPage(driver);
		certAndCopyPage=new CertificatesAndCopiesHomePage(driver);
		certPage=new CertificatesPage(driver);
		PageBase.fluentWait(loginPage.userNameField);
		loginPage.loginData("abdo.cer", "Admin123");
		PageBase.fluentWait(certAndCopyPage.certificateTab);
		certAndCopyPage.getIntoCertifitcateSection();
		PageBase.fluentWait(certPage.addBtn);
	}
	@Test(priority = 1)
	public void completeSessionCasesCertProcess() throws InterruptedException
	{
		certPage.sessionCaseType("3170", "سبب الاعفاء");
		SoftAssert sAssert=new SoftAssert();
		sAssert.assertTrue(CertificatesPage.displayTheCertificateBtn.isEnabled(),"The Certification Button is Displayed");
		sAssert.assertAll();
		Thread.sleep(2000);
	}
	@Test(priority = 2)
	public void completeBrotestoCase() throws InterruptedException  
	{
		certPage.constraintNonConstraintBrotesto("28711111111111","يناير", "محتوي اضافي" ,"سبب الاعفاء");
		SoftAssert sAssert=new SoftAssert();
		sAssert.assertTrue(CertificatesPage.displayTheCertificateBtn.isEnabled(),"The Certification Button is Displayed");
		sAssert.assertAll();
		Thread.sleep(2000);
	}
	@Test(priority = 3 )
	public void terroristGroupsCase() throws InterruptedException
	{
		certPage.terroristGroups("28711111111111", "محتوي اضافي" ,"سبب الاعفاء");
		SoftAssert sAssert=new SoftAssert();
		sAssert.assertTrue(CertificatesPage.displayTheCertificateBtn.isEnabled(),"The Certification Button is Displayed");
		sAssert.assertAll();

	}
	@Test(priority = 4)
	public void caseNoExist() throws InterruptedException
	{
		certPage.caseDoesNotExist("28711111111111", "يحي","يناير" , "محتوى اضافي جديد", "سبب الاعفاء");
		SoftAssert sAssert=new SoftAssert();
		sAssert.assertTrue(CertificatesPage.dDisplayTheCertificateBtn.isEnabled(),"The Certification Button is Displayed");
		sAssert.assertAll();
	}
	@Test(priority = 5,enabled = false)
	public void negativeAppealCase() throws InterruptedException
	{
		certPage.appealCase("1280", "سبب الاعفاء");
		SoftAssert sAssert=new SoftAssert();
		sAssert.assertTrue(CertificatesPage.dDisplayTheCertificateBtn.isEnabled(),"The Certification Button is Displayed");
		sAssert.assertAll();
	}
}
