package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pages.AnnBackPage;
import pages.AnnFrontPage;
import pages.AnnFeesPage;
import pages.AnnouncementPage;
import pages.AnnStatusPage;
import pages.LoginPage;
import pages.PageBase;

public class AnnouncementTest extends TestBase
{

	LoginPage loginPage;
	AnnouncementPage annPage;
	AnnFeesPage annFeesPage;
	AnnFrontPage annFrontPage;
	AnnBackPage annBackPage;
	AnnStatusPage annStatusPage;
	
	
	@BeforeMethod
	public void loginAndGetInAnnPart()
	{
		loginPage=new LoginPage(driver);
		loginPage.fluentWait(loginPage.userNameField);
		loginPage.loginData("fees.ann", "Admin123");
		
		annPage=new AnnouncementPage(driver);
		PageBase.fluentWait(annPage.annFeesTab);
		annPage.getInAnnFeesTab();

		
	}
	
	
	@Test(priority = 1)
	public void creatAnnAttachWithCaseFirstTimeTest() throws InterruptedException
	{
		annFeesPage=new AnnFeesPage(driver);
<<<<<<< HEAD
		annFeesPage.createAnnAttachWithCaseFirstTime("7100","1", "1", "29911111111111","صف الاعلان العام");
=======
		annFeesPage.createAnnAttachWithCaseFirstTime("12541","1", "1", "29911111111111","صف الاعلان العام");
>>>>>>> 011f2532a7483d49377a5bb1b9f78e5e22b06605
		
		Thread.sleep(2000);
		annPage.getInEntryAnnTab();
		
		annFrontPage=new AnnFrontPage(driver);
		annFrontPage.addDataInAnnouncement("28711111111111");
		
		Thread.sleep(3000);
		annPage.getInCompleteAnnTab();
		
		annBackPage=new AnnBackPage(driver);
		annBackPage.finishAnnProcess();
				
		SoftAssert sAssert=new SoftAssert();
		Thread.sleep(1500);
		sAssert.assertTrue(AnnBackPage.statusTxt.getText().contains("تمت المراجعة"),"the change of the announcement status");
		
		Thread.sleep(3000);
		annPage.getInFollowAnnTab();
		
		annStatusPage=new AnnStatusPage(driver);
<<<<<<< HEAD
		//annStatusPage.searchOnAnnNum();
=======
		annStatusPage.searchOnAnnNum();
>>>>>>> 011f2532a7483d49377a5bb1b9f78e5e22b06605
		
		Thread.sleep(2000);
		
		sAssert.assertTrue(annStatusPage.getAnnType().contains("حكم نهائي - إعادة إعلان - إعلان عام"),"Annoucement types");
		
		sAssert.assertAll();
		
	}
	
	@Test(priority = 2)
	public void creatAnnAttachWithCaseSecondeTimeTest() throws InterruptedException
	{
		annFeesPage=new AnnFeesPage(driver);
<<<<<<< HEAD
		annFeesPage.createAnnAttachWithCaseForSecondeTime("7100","اعلان عام","29111111111111");
=======
		annFeesPage.createAnnAttachWithCaseForSecondeTime("12541","اعلان عام","27811111111111");
>>>>>>> 011f2532a7483d49377a5bb1b9f78e5e22b06605
		
		Thread.sleep(2000);
		annPage.getInEntryAnnTab();
		
		annFrontPage=new AnnFrontPage(driver);
<<<<<<< HEAD
		annFrontPage.addDataInAnnouncement("29111111111111");
=======
		annFrontPage.addDataInAnnouncement("27811111111111");
>>>>>>> 011f2532a7483d49377a5bb1b9f78e5e22b06605
		
		Thread.sleep(3000);
		annPage.getInCompleteAnnTab();
		
		annBackPage=new AnnBackPage(driver);
		annBackPage.finishAnnProcess();
				
		SoftAssert sAssert=new SoftAssert();
		Thread.sleep(1500);
		sAssert.assertTrue(AnnBackPage.statusTxt.getText().contains("تمت المراجعة"),"the change of the announcement status");
		
		Thread.sleep(3000);
		annPage.getInFollowAnnTab();
		
		annStatusPage=new AnnStatusPage(driver);
		//annStatusPage.searchOnAnnNum();
		
		Thread.sleep(2000);
		
		sAssert.assertTrue(annStatusPage.getAnnType().contains("حكم نهائي - إعادة إعلان - إعلان عام"),"Annoucement types");
		
		sAssert.assertAll();
	}
	
	@Test(priority = 3)
	public  void creatAnnAttachWithOrderFirstTimeTest() throws InterruptedException
	{
		annFeesPage=new AnnFeesPage(driver);
<<<<<<< HEAD
		annFeesPage.createAnnAttachWithOrderFirstTime("34","1", "1", "29111111111111","صف الاعلان العام");
=======
		annFeesPage.createAnnAttachWithOrderFirstTime("18","1", "1", "28711111111111","صف الاعلان العام");
>>>>>>> 011f2532a7483d49377a5bb1b9f78e5e22b06605
		
		Thread.sleep(2000);
		annPage.getInEntryAnnTab();
		
		annFrontPage=new AnnFrontPage(driver);
<<<<<<< HEAD
		annFrontPage.addDataInAnnouncement("29111111111111");
=======
		annFrontPage.addDataInAnnouncement("28711111111111");
>>>>>>> 011f2532a7483d49377a5bb1b9f78e5e22b06605
		
		Thread.sleep(3000);
		annPage.getInCompleteAnnTab();
		
		annBackPage=new AnnBackPage(driver);
		annBackPage.finishAnnProcess();
				
		SoftAssert sAssert=new SoftAssert();
		Thread.sleep(1500);
		sAssert.assertTrue(AnnBackPage.statusTxt.getText().contains("تمت المراجعة"),"the change of the announcement status");
		
		Thread.sleep(3000);
		annPage.getInFollowAnnTab();
		
		annStatusPage=new AnnStatusPage(driver);
		//annStatusPage.searchOnAnnNum();
		
		
		sAssert.assertTrue(annStatusPage.getAnnType().contains(" قرار إحالة لدائرة أخرى - قرار لورود تقرير الخبير - إعلان عام"),"Annoucement types");
		
		sAssert.assertAll();
	}
	
	@Test(priority = 4)
	public void creatAnnAttachWithOrderSecondeTimeTest() throws InterruptedException
	{
		annFeesPage=new AnnFeesPage(driver);
<<<<<<< HEAD
		annFeesPage.createAnnAttachWithOrderForSecondeTime("34","اعلان عام","29111111111111");
=======
		annFeesPage.createAnnAttachWithOrderForSecondeTime("18","اعلان عام","28711111111111");
>>>>>>> 011f2532a7483d49377a5bb1b9f78e5e22b06605
		
		Thread.sleep(2000);
		annPage.getInEntryAnnTab();
		
		annFrontPage=new AnnFrontPage(driver);
<<<<<<< HEAD
		annFrontPage.addDataInAnnouncement("29111111111111");
=======
		annFrontPage.addDataInAnnouncement("23911111111111");
>>>>>>> 011f2532a7483d49377a5bb1b9f78e5e22b06605
		
		Thread.sleep(3000);
		annPage.getInCompleteAnnTab();
		
		annBackPage=new AnnBackPage(driver);
		annBackPage.finishAnnProcess();
				
		SoftAssert sAssert=new SoftAssert();
		Thread.sleep(1500);
		sAssert.assertTrue(AnnBackPage.statusTxt.getText().contains("تمت المراجعة"),"the change of the announcement status");
		
		Thread.sleep(3000);
		annPage.getInFollowAnnTab();
		
		annStatusPage=new AnnStatusPage(driver);
	//	annStatusPage.searchOnAnnNum();
		
		Thread.sleep(2000);
		
		sAssert.assertTrue(annStatusPage.getAnnType().contains(" قرار إحالة لدائرة أخرى - قرار لورود تقرير الخبير - إعلان عام"),"Annoucement types");
		
		sAssert.assertAll();
	}
	
}
