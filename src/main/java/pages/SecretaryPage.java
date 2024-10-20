package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecretaryPage extends PageBase
{

	public SecretaryPage(WebDriver driver) {
		super(driver);
	}

<<<<<<< HEAD
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/app-menu/div/div[2]/ul/li[18]/a")
=======
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/app-menu/div/div[2]/ul/li[9]/a")
>>>>>>> 011f2532a7483d49377a5bb1b9f78e5e22b06605
	public
	WebElement feesAdmAnnTab;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/app-menu/div/div[2]/ul/li[10]/a")
	public 
	WebElement admAnnStatusTab;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/app-menu/div/div[2]/ul/li[1]/a")
	WebElement hearingManagementTab;

	public void getInFeesAdvAnnTab()
	{
		fluentWait(feesAdmAnnTab);
		clickBtn(feesAdmAnnTab);
	}
	
	public void getInAdmAnnStatusTab()
	{
		fluentWait(admAnnStatusTab);
		clickBtn(admAnnStatusTab);
	}
	
	public void getInHearingMangementTab()
	{
		fluentWait(hearingManagementTab);
		clickBtn(hearingManagementTab);
	}
	
	
}
