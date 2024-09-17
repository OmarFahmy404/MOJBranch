package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.AnnBackPage;
import pages.AnnFeesPage;
import pages.AnnFrontPage;
import pages.AnnStatusPage;
import pages.AnnouncementPage;
import pages.LoginPage;
import pages.PageBase;
import pages.WarningsBackPage;
import pages.WarningsFeesPage;
import pages.WarningsFrontPage;
import pages.WarningsPage;
import pages.WarningsStatusPage;

public class WarningsTest extends TestBase
{

	LoginPage loginPage;
	WarningsPage warPage;
	WarningsFeesPage warFees;
	WarningsFrontPage warFront;
	WarningsBackPage warBack;
	WarningsStatusPage warStatus;
	
	@BeforeMethod
	public void loginAndGetInAnnPart()
	{
		loginPage=new LoginPage(driver);
		loginPage.fluentWait(loginPage.userNameField);
		loginPage.loginData("fees.war", "Admin123");
		
		warPage=new WarningsPage(driver);
		warPage.getInWarningsFeesTab();

		
	}
	
	
	@Test(priority = 1)
	public void creatWarAttachWithCaseFirstTimeTest() throws InterruptedException
	{
		warFees=new WarningsFeesPage(driver);
		warFees.createWarAttachWithCaseFirstTime("12541","1", "1", "29911111111111","صف الاعلان العام");
		
		Thread.sleep(2000);
		warPage.getInFrontWarningsTab();
		
		warFront=new WarningsFrontPage(driver);
		warFront.addDataInWarnings("28711111111111");
		
		Thread.sleep(3000);
		warPage.getInBackWarningsTab();
		
		warBack=new WarningsBackPage(driver);
		warBack.finishWarProcess();
				
		SoftAssert sAssert=new SoftAssert();
		Thread.sleep(1500);
		sAssert.assertTrue(warBack.statusTxt.getText().contains("تمت المراجعة"),"the change of the announcement status");
		
		Thread.sleep(3000);
		warPage.getInWarningsStatusTab();
		
		warStatus=new WarningsStatusPage(driver);
		//annStatusPage.searchOnAnnNum();
		
		Thread.sleep(2000);
		
		sAssert.assertTrue(warStatus.getAnnType().contains("عرض مبلغ مالي - متهرب من تحصيل الإيجار - إنذار عام"),"Annoucement types");
		
		sAssert.assertAll();
		
	}
	
	@Test(priority = 2)
	public void creatAnnAttachWithCaseSecondeTimeTest() throws InterruptedException
	{
		warFees=new WarningsFeesPage(driver);
		warFees.createWarAttachWithCaseForSecondeTime("12541","اعلان عام","27811111111111");
		
		Thread.sleep(2000);
		warPage.getInFrontWarningsTab();
		
		warFront=new WarningsFrontPage(driver);
		warFront.addDataInWarnings("27811111111111");
		
		Thread.sleep(3000);
		warPage.getInBackWarningsTab();
		
		warBack=new WarningsBackPage(driver);
		warBack.finishWarProcess();
				
		SoftAssert sAssert=new SoftAssert();
		Thread.sleep(1500);
		sAssert.assertTrue(warBack.statusTxt.getText().contains("تمت المراجعة"),"the change of the announcement status");
		
		Thread.sleep(3000);
		warPage.getInWarningsStatusTab();
		
		warStatus=new WarningsStatusPage(driver);
		//annStatusPage.searchOnAnnNum();
		
		//Thread.sleep(2000);
		
		sAssert.assertTrue(warStatus.getAnnType().contains("عرض نقود"),"Annoucement types");
		
		sAssert.assertAll();
	}
	
	@Test(priority = 3)
	public  void creatWarAttachWithOrderFirstTimeTest() throws InterruptedException
	{
		warFees=new WarningsFeesPage(driver);
		warFees.createWarAttachWithOrderFirstTime("18","1", "1", "28711111111111","صف الاعلان العام");
		
		Thread.sleep(2000);
		warPage.getInFrontWarningsTab();
		
		warFront=new WarningsFrontPage(driver);
		warFront.addDataInWarnings("28711111111111");
		
		Thread.sleep(3000);
		warPage.getInBackWarningsTab();
		
		warBack=new WarningsBackPage(driver);
		warBack.finishWarProcess();
				
		SoftAssert sAssert=new SoftAssert();
		Thread.sleep(1500);
		sAssert.assertTrue(warBack.statusTxt.getText().contains("تمت المراجعة"),"the change of the announcement status");
		
		Thread.sleep(4000);
		warPage.getInWarningsStatusTab();
		
		warStatus=new WarningsStatusPage(driver);
		//annStatusPage.searchOnAnnNum();
		
		
		sAssert.assertTrue(warStatus.getAnnType().contains(" عرض مفتاح"),"Annoucement types");
		
		sAssert.assertAll();
	}
	
	@Test(priority = 4)
	public void creatWarAttachWithOrderSecondeTimeTest() throws InterruptedException
	{
		warFees=new WarningsFeesPage(driver);
		warFees.createWarAttachWithOrderForSecondeTime("18","اعلان عام","28711111111111");
		
		Thread.sleep(2000);
		warPage.getInFrontWarningsTab();
		
		warFront=new WarningsFrontPage(driver);
		warFront.addDataInWarnings("23911111111111");
		
		Thread.sleep(3000);
		warPage.getInBackWarningsTab();
		
		warBack=new WarningsBackPage(driver);
		warBack.finishWarProcess();
				
		SoftAssert sAssert=new SoftAssert();
		Thread.sleep(1500);
		sAssert.assertTrue(warBack.statusTxt.getText().contains("تمت المراجعة"),"the change of the announcement status");
		
		Thread.sleep(3000);
		warPage.getInWarningsStatusTab();
		
		warStatus=new WarningsStatusPage(driver);
		//annStatusPage.searchOnAnnNum();
		
		Thread.sleep(2000);
		
		sAssert.assertTrue(warStatus.getAnnType().contains(" مرتبط بأمر أداء"),"Annoucement types");
		
		sAssert.assertAll();
	}
	
}
