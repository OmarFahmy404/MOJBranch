package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecAdminAnnStatusPage extends PageBase
{

	public SecAdminAnnStatusPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[3]/div/div[1]/div/form/div[1]/div[1]/input")
	WebElement annSearchField;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[3]/div/div[1]/div/form/div[2]/div/button")
	WebElement annSearchBtn;

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[3]/div/div[2]/table-server/div[2]/table/tbody/tr/td[2]/button")
	WebElement annDisplayBtn;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/div[1]/div[2]/div[1]")
	public
	WebElement annNumTxt;

	public void annSearch()
	{
	/*	fluentWait(annSearchField);
		setTxtInAnotherWay(annSearchField, AdministrativeAnnFeesPage.searchOnAnnNum());
		clickBtn(annSearchBtn);*/
		
		clickBtn(annDisplayBtn);
	}

}
