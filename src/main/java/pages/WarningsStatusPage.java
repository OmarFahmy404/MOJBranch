package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WarningsStatusPage extends PageBase
{

	static WarningsBackPage warBack;
	public WarningsStatusPage(WebDriver driver) {
		super(driver);
		 warBack=new WarningsBackPage(driver);
	}
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/div/div[1]/div/form/div[1]/div[1]/input")
	static
	WebElement annNumField;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/div/div[1]/div/form/div[2]/div/button")
	static
	WebElement annSearchBtn;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/div/div[2]/table-server/div[2]/table/tbody/tr/td[1]/div[4]")
	static
	WebElement annTypeTxt;
	
		
	public static String getAnnType() 
	{
		fluentWait(annTypeTxt);
		String annType=annTypeTxt.getText();
		return annType;
	}

	
	public static void searchOnAnnNum()
	{
		
		fluentWait(annNumField);
		setTxtInAnotherWay(annNumField, warBack.getWarSerialNum());
		clickBtn(annSearchBtn);
	}

}
