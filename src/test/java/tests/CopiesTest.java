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
		loginPage.CertificatesAndCopiesLogin("abdo.cer", "Admin123");
		PageBase.fluentWait(certAndCopyPage.copyTab);
		certAndCopyPage.getIntoCopySection();
		PageBase.fluentWait(certPage.addBtn);
	}
	
	@Test
	public void recordCaseCopyTest() throws InterruptedException
	{
		copiesPage.recordeCase("1280");
		SoftAssert sAssert=new SoftAssert();
		sAssert.assertTrue(copiesPage.displayCopy.isEnabled(),"The Certification Button is Displayed");
		sAssert.assertAll();
		Thread.sleep(5000);
	}

}
