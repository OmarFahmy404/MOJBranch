package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pages.CertificatesPage;
import pages.PageBase;
import utilities.Helper;

public class TestBase
{
	public static WebDriver driver;
	private static PageBase base;

	
	@BeforeTest
	public void startDriver() {
		
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("http://10.0.10.58:9091/#/login");
	}	
	
	
	@AfterTest
	public void stopDriver() {
		driver.close();
	}
	@AfterMethod
	public void screenshotOnFailure(ITestResult result) throws InterruptedException 
	{

		base=new PageBase(driver);
		
		if(result.getStatus()==ITestResult.FAILURE) 
		{
			System.out.println("Failed");
			System.out.println("Taking Screenshot....");
			
			//Thread.sleep(3000);
			
			Helper.captureScreenshot(driver, result.getName());
		}
		base.loggedOut();
		
		
	}

}
