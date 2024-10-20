package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WarningsPage extends PageBase
{

	public WarningsPage(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/app-menu/div/div[2]/ul/li[1]/a")
	WebElement warningsFeesTab;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/app-menu/div/div[2]/ul/li[3]/a")
	WebElement frontWarningsTab;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/app-menu/div/div[2]/ul/li[4]/a")
	WebElement backWarningsTab;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/app-menu/div/div[2]/ul/li[2]/a")
	WebElement warningsStatusTab;
	
	public void getInWarningsFeesTab() 
	{
		fluentWait(warningsFeesTab);
		clickBtn(warningsFeesTab);
	}
	
	public void getInFrontWarningsTab() 
	{
		fluentWait(frontWarningsTab);
		clickBtn(frontWarningsTab);
	}
	
	public void getInBackWarningsTab() 
	{
		fluentWait(backWarningsTab);
		clickBtn(backWarningsTab);
	}
	
	public void getInWarningsStatusTab()
	{
		fluentWait(warningsStatusTab);
		clickBtn(warningsStatusTab);
	}
	
	
	
}
