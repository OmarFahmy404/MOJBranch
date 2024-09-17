package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AnnouncementPage extends PageBase 
{

	public AnnouncementPage(WebDriver driver) {
		super(driver);
	}


	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/app-menu/div/div[2]/ul/li[1]/a")
	public static
	WebElement annFeesTab;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/app-menu/div/div[2]/ul/li[3]/a")
	public static
	WebElement entryAnnTab;

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/app-menu/div/div[2]/ul/li[4]/a")
	public static
	WebElement completeAnnTab;

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/app-menu/div/div[2]/ul/li[2]/a")
	public static
	WebElement followAnnTab;

	
	
	public static void getInAnnFeesTab() 
	{
		clickBtn(annFeesTab);
	}
	
	public static void getInEntryAnnTab() 
	{
		clickBtn(entryAnnTab);
	}
	
	public static void getInCompleteAnnTab() 
	{
		clickBtn(completeAnnTab);
	}
	
	public static void getInFollowAnnTab()
	{
		clickBtn(followAnnTab);
	}
}
