package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class AppealFrontPage extends PageBase
{

	public AppealFrontPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
public	String caseNo=null;
public 	String caseClassification=null;



	AppealCaseInfoPage appealCaseInfoPage;

	@FindBy(css ="a[href=\'#/fees-estimation-requests-new-case\']")
	WebElement requestsForRegistrationOfAppealCasesTab;

	@FindBy(css ="button.btn.btn-xs.btn-add-outline")
	WebElement objectionToTheDivisionCommitteeBtn;

	@FindBy(name ="classification")
	WebElement tableClassificationMajor ;

	@FindBy(xpath ="/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[2]/div[2]/div[2]/div/ng-select/ng-dropdown-panel/div/div[2]/div[4]")
	WebElement testSeleniumClassificationMinor;

	@FindBy( name ="caseType")
	WebElement caseNameMajor ;

	@FindBy(xpath ="/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[2]/div[2]/div[3]/div/ng-select/ng-dropdown-panel/div/div[2]/div")
	WebElement caseNameMinor;

	@FindBy(name ="announcementServiceType")
	WebElement annTypeMajor;

	@FindBy(xpath ="/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[2]/div[2]/div[4]/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement annTypeMinor;

	@FindBy(id ="plaintiffDropdownMenuButton")
	WebElement addPlaintiffDropdownMenuButton;

	@FindBy(xpath ="/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[3]/div[1]/div/div/a[1]")
	WebElement addNormalPersonBtn;

	@FindBy(name ="nationalId")
	WebElement idField ;

	@FindBy(xpath ="/html/body/ngb-modal-window/div/div/ng-component/form[1]/div/div/div/div[1]/div[2]/button")
	WebElement searchBtn;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/form[1]/div/div/div[2]/div/div[1]/div[2]/button")
	WebElement searchDefBtn;

	
	@FindBy(xpath ="/html/body/ngb-modal-window/div/div/ng-component/form[2]/div[2]/button[1]")
	WebElement saveBtn;
	
	@FindBy(id ="defendantDropdownMenuButton")
	WebElement addDefendantDropdownMenuButton;

	@FindBy(xpath ="/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[4]/div[1]/div/div/a[1]")
	WebElement addNormalDefendantPersonBtn ;

	@FindBy( xpath ="/html/body/ngb-modal-window/div/div/ng-component/form[1]/div/div/div[1]/div/div/div[1]/a/i")
	WebElement yesBtn;

	@FindBy(xpath ="/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[5]/button[1]")
	WebElement lastSaveBtn ;
	
	
	public void addInfoToCase(String normalPersonIdNumber,String normalDefendantPersonIdNumber) throws InterruptedException
	{
		fluentWait(requestsForRegistrationOfAppealCasesTab);
		clickBtn(requestsForRegistrationOfAppealCasesTab);
		fluentWait(objectionToTheDivisionCommitteeBtn);
		clickBtn(objectionToTheDivisionCommitteeBtn);
		fluentWait(tableClassificationMajor);
		
		selectFromDropDownNGList(tableClassificationMajor, testSeleniumClassificationMinor);
		selectFromDropDownNGList(caseNameMajor, caseNameMinor);
		selectFromDropDownNGList(annTypeMajor, annTypeMinor);
		
		addNormalPersonWithFullData(addPlaintiffDropdownMenuButton, addNormalPersonBtn,normalPersonIdNumber);
		addNormalDefendantPersonWithFullData(addDefendantDropdownMenuButton, addNormalDefendantPersonBtn, normalDefendantPersonIdNumber);
		fluentWait(lastSaveBtn);
		clickBtn(lastSaveBtn);
		
		appealCaseInfoPage=new AppealCaseInfoPage(driver);
		caseNo=	appealCaseInfoPage.getCaseNo();
		caseClassification=	appealCaseInfoPage.getCaseClassification();
		
		HelperPage.saveDate("Case Number", caseNo);
		HelperPage.saveDate("Case Classification", caseClassification);
		
		System.out.println(caseNo +" //"+ caseClassification);
	}
}
