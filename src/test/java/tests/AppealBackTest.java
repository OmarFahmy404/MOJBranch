package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

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
		appealBackPage.addingInfoIntoDivisionCommitteeCase(String.valueOf(new Faker().phoneNumber().subscriberNumber(4)),"29811111111124");
	}
	
	@Test
	public void testAddingInfoIntoLaborArbitrationCase() throws InterruptedException 
	{
		appealBackPage=new AppealBackPage(driver);
		appealBackPage.addingInfoIntoLaborArbitrationCase(String.valueOf(new Faker().phoneNumber().subscriberNumber(4)),"29811111111124");
	}
	
	@Test
	public void testAddingInfoIntoQuarrelCase() throws InterruptedException 
	{
		appealBackPage=new AppealBackPage(driver);
		appealBackPage.addingInfoIntoQuarrelCase(String.valueOf(new Faker().phoneNumber().subscriberNumber(4)),"29811111111124");
	}
	
}
