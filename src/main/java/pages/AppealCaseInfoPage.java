package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppealCaseInfoPage extends PageBase
{

	public AppealCaseInfoPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/div[1]/div[2]/div[1]/div/div")
	static WebElement caseNo;
	

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/div[1]/div[2]/div[3]/div/div")
	static WebElement caseClassification;
	
	public  String getCaseNo() 
	{
		fluentWait(caseNo);
		String caseData=caseNo.getText();
		String[] caseNumber = caseData.split("/");

		return caseNumber[0];
	}
	
	public  String getCaseClassification()
	{
		fluentWait(caseClassification);
		String caseClassificationType=caseClassification.getText();
		return caseClassificationType;
	}
}
