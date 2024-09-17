package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WarningsFeesPage extends PageBase
{

	public WarningsFeesPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[1]/button")
	WebElement addBtn;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[1]/div/div/ng-select")
	WebElement warAttachWithMajor;
	

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[1]/div/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement warAttachWithCaseMinor;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[1]/div/div[1]/ng-select/ng-dropdown-panel/div/div[2]/div[2]")
	WebElement warAttachWithOrderMinor;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[1]/div/div[2]/div/div[1]/div/button")
	WebElement searchBtn;
	
	@FindBy(name = "caseSerialNumber")
	WebElement caseSerialNumberField;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/casetypelinkedsearchpopup/div[2]/form/div/div[2]/div/ng-select/div/div/div[2]")
	WebElement caseYearMajor;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/casetypelinkedsearchpopup/div[2]/form/div/div[2]/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement caseYearMinor;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/casetypelinkedsearchpopup/div[2]/form/div/div[3]/div/ng-select/div/div/div[2]")
	WebElement tableClassificationMajor;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/casetypelinkedsearchpopup/div[2]/form/div/div[3]/div/ng-select/ng-dropdown-panel/div/div[2]/div[3]")
	WebElement tableClassificationMinor;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/casetypelinkedsearchpopup/div[2]/form/div/div[4]/div/ng-select/div/div/div[2]")
	WebElement courtMajor;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/casetypelinkedsearchpopup/div[2]/form/div/div[4]/div/ng-select/ng-dropdown-panel/div/div[2]/div[4]")
	WebElement courtMinor;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/casetypelinkedsearchpopup/div[2]/form/div/div[7]/button")
	WebElement searchCaseBtn;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[2]/div[2]/div[1]/div/ng-select/div/div/div[2]")
	WebElement territorialJurisdictionMajor;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[2]/div[2]/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div")
	WebElement territorialJurisdictionMinor;
	
	@FindBy(name = "paperCount")
	WebElement paperCountField;
	
	@FindBy(name = "receiverCount")
	WebElement receiverCountField;
	
	@FindBy(name="requesterCount")
	WebElement requesterCountField;
	
	@FindBy(name="receiverAddressCount")
	WebElement receiverAddressCount;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[3]/div[2]/form/div[1]/div[1]/div/ng-select/div/div/div[2]")
	WebElement warTypeMajor;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[3]/div[2]/form/div[1]/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[2]")
	WebElement warTypeAmountOfMoneyMinor;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[3]/div[2]/form/div[1]/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[10]")
	WebElement warTypeEscipedFromRentailsMinor;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[3]/div[2]/form/div[1]/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[14]")
	WebElement warTypeGeneralWarMinor;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[3]/div[2]/form/div[1]/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[13]")
	WebElement warTypeReWarMinor;
	
	@FindBy(name = "generalWarningType")
	WebElement descripeAnnfield;
	
	@FindBy(css = "button.btn.btn-sm.btn-save.float-right")
	WebElement saveCaseBtn;
	
	@FindBy(name = "nationalId")
	WebElement nationalIdField;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/fer-requester/div/form/div[1]/div/div/button")
	WebElement searchPersonBtn;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/fer-fees-exemption/div/div[2]/div[1]/div/div[2]/a/i")
	WebElement feeExemptionYesRadioBtn;
	
	@FindBy(name = "feesExemptionCategory")
	WebElement feesExemptionCategoryField;
	
	@FindBy(name = "feesExemptionReason")
	WebElement feesExemptionReasonField;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[5]/button[1]")
	WebElement saveAnnBtn;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[5]/button[2]")
	WebElement issueReciptBtn;
	
	@FindBy(xpath = "/html/body/div/div/div[6]/button[1]")
	WebElement yeaIssueReciptBtn;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[5]/button[4]")
	WebElement closeBtn;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[2]/div[2]/div[2]/div[1]/div/div[2]/input")
	WebElement resendRadioBtn;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[2]/div[2]/div[2]/div[2]/div[2]/div/div/ng-select/div/div/div[2]")
	WebElement originalWarMajor;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[2]/div[2]/div[2]/div[2]/div[2]/div/div/ng-select/ng-dropdown-panel/div/div[2]/div[4]")
	WebElement originalWarMinor;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[2]/div[2]/div[2]/div[2]/div[2]/div/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement originalWarMinor2;
	
	@FindBy(name = "orderSerialNumber")
	WebElement orderSerialNumberField;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/casetypelinkedwithorderwritpopup/div[2]/form/div/div[2]/div/ng-select/div")
	WebElement orderYearMajor;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/casetypelinkedwithorderwritpopup/div[2]/form/div/div[2]/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement orderYearMinor;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/casetypelinkedwithorderwritpopup/div[2]/form/div/div[3]/div/ng-select/div")
	WebElement orderTypeMajor;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/casetypelinkedwithorderwritpopup/div[2]/form/div/div[3]/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement orderTypeMinor;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/casetypelinkedwithorderwritpopup/div[2]/form/div/div[4]/div/ng-select/div/div/div[2]")
	WebElement orderClassificationMajor;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/casetypelinkedwithorderwritpopup/div[2]/form/div/div[4]/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement orderClassificationMinor;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/casetypelinkedwithorderwritpopup/div[2]/form/div/div[5]/div/ng-select/div/div/div[2]")
	WebElement orderCourtMajor;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/casetypelinkedwithorderwritpopup/div[2]/form/div/div[5]/div/ng-select/ng-dropdown-panel/div/div[2]/div[4]")
	WebElement orderCourtMinor;
	
	@FindBy(css = "button.btn.btn-search-outline")
	WebElement orderSearchBtn;	
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[3]/div[2]/form/div[1]/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[3]")
	WebElement warTypeMoneyMinor;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[3]/div[2]/form/div[1]/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[5]")
	WebElement warTypeKeyMinor;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[3]/div[2]/form/div[1]/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[9]")
	WebElement warTypeOrderAdaaMinor;
	
	public void createWarAttachWithCaseFirstTime(String serialCaseNum,String paperCount,String receiverCount,String nationalId,String descripeGeneralWar) throws InterruptedException
	{
		fluentWait(addBtn);
		clickBtn(addBtn);
		fluentWait(warAttachWithMajor);
		selectFromDropDownNGList(warAttachWithMajor, warAttachWithCaseMinor);
		clickBtn(searchBtn);
		setTxt(caseSerialNumberField,serialCaseNum);
		selectFromDropDownNGList(caseYearMajor, caseYearMinor);
		selectFromDropDownNGList(tableClassificationMajor, tableClassificationMinor);
		selectFromDropDownNGList(courtMajor, courtMinor);
		clickBtn(searchCaseBtn);
		
		selectFromDropDownNGList(territorialJurisdictionMajor, territorialJurisdictionMinor);
		setTxt(paperCountField, paperCount);
		setTxt(receiverCountField, receiverCount);
		setTxt(requesterCountField, "1");
		setTxt(receiverAddressCount, "1");
		
		selectFromDropDownNGList(warTypeMajor, warTypeAmountOfMoneyMinor);
		clickBtn(saveCaseBtn);
		
		selectFromDropDownNGList(warTypeMajor, warTypeEscipedFromRentailsMinor);
		clickBtn(saveCaseBtn);
		
		selectFromDropDownNGList(warTypeMajor, warTypeGeneralWarMinor);
		setTxt(descripeAnnfield, descripeGeneralWar);
		clickBtn(saveCaseBtn);
		
		setTxt(nationalIdField, nationalId);
		clickBtn(searchPersonBtn);
		
		clickBtn(feeExemptionYesRadioBtn);
		setTxt(feesExemptionCategoryField, " االفئة  المعفاه");
		setTxt(feesExemptionReasonField, "سبب الاعقاء");
		
		clickBtn(saveAnnBtn);
		Thread.sleep(2000);
		clickBtn(issueReciptBtn);
		fluentWait(yeaIssueReciptBtn);
		clickBtn(yeaIssueReciptBtn);
		fluentWait(closeBtn);
		clickBtn(closeBtn);
		
	}
	
	public void createWarAttachWithCaseForSecondeTime(String serialCaseNum,String descripeGeneralAnn,String nationalId) throws InterruptedException
	{
		fluentWait(addBtn);
		clickBtn(addBtn);
		fluentWait(warAttachWithMajor);
		selectFromDropDownNGList(warAttachWithMajor, warAttachWithCaseMinor);
		clickBtn(searchBtn);
		setTxt(caseSerialNumberField,serialCaseNum);
		selectFromDropDownNGList(caseYearMajor, caseYearMinor);
		selectFromDropDownNGList(tableClassificationMajor, tableClassificationMinor);
		selectFromDropDownNGList(courtMajor, courtMinor);
		clickBtn(searchCaseBtn);
		
		selectFromDropDownNGList(territorialJurisdictionMajor, territorialJurisdictionMinor);
		
		clickBtn(resendRadioBtn);
		Thread.sleep(2000);
		selectFromDropDownNGList(originalWarMajor, originalWarMinor);
		
		selectFromDropDownNGList(warTypeMajor,warTypeMoneyMinor);
		clickBtn(saveCaseBtn);
				
		setTxt(nationalIdField, nationalId);
		clickBtn(searchPersonBtn);
		
		clickBtn(feeExemptionYesRadioBtn);
		setTxt(feesExemptionCategoryField, " االفئة  المعفاه");
		setTxt(feesExemptionReasonField, "سبب الاعقاء");
		
		clickBtn(saveAnnBtn);
		Thread.sleep(2000);
		clickBtn(issueReciptBtn);
		fluentWait(yeaIssueReciptBtn);
		clickBtn(yeaIssueReciptBtn);
		fluentWait(closeBtn);
		clickBtn(closeBtn);
		
	}
	
	public void createWarAttachWithOrderFirstTime(String serialOrderNum,String paperCount,String receiverCount,String nationalId,String descripeGeneralAnn) throws InterruptedException
	{
		fluentWait(addBtn);
		clickBtn(addBtn);
		fluentWait(warAttachWithMajor);
		selectFromDropDownNGList(warAttachWithMajor, warAttachWithOrderMinor);
		clickBtn(searchBtn);
		
		setTxt(orderSerialNumberField, serialOrderNum);
		selectFromDropDownNGList(orderYearMajor, orderYearMinor);
		selectFromDropDownNGList(orderTypeMajor, orderTypeMinor);
		selectFromDropDownNGList(orderClassificationMajor, orderClassificationMinor);
		selectFromDropDownNGList(orderCourtMajor, orderCourtMinor);
		clickBtn(orderSearchBtn);
		
		selectFromDropDownNGList(territorialJurisdictionMajor, territorialJurisdictionMinor);
		setTxt(paperCountField, paperCount);
		setTxt(receiverCountField, receiverCount);
		setTxt(requesterCountField, "1");
		setTxt(receiverAddressCount, "1");
		
		selectFromDropDownNGList(warTypeMajor, warTypeKeyMinor);
		clickBtn(saveCaseBtn);
		setTxt(nationalIdField, nationalId);
		clickBtn(searchPersonBtn);
		
		clickBtn(feeExemptionYesRadioBtn);
		setTxt(feesExemptionCategoryField, " االفئة  المعفاه");
		setTxt(feesExemptionReasonField, "سبب الاعقاء");
		
		clickBtn(saveAnnBtn);
		Thread.sleep(2000);
		clickBtn(issueReciptBtn);
		fluentWait(yeaIssueReciptBtn);
		clickBtn(yeaIssueReciptBtn);
		fluentWait(closeBtn);
		clickBtn(closeBtn);
		
	}
	
	public void createWarAttachWithOrderForSecondeTime(String serialOrderNum,String descripeGeneralAnn,String nationalId) throws InterruptedException
	{
		fluentWait(addBtn);
		clickBtn(addBtn);
		fluentWait(warAttachWithMajor);
		selectFromDropDownNGList(warAttachWithMajor, warAttachWithOrderMinor);
		clickBtn(searchBtn);
		
		setTxt(orderSerialNumberField, serialOrderNum);
		selectFromDropDownNGList(orderYearMajor, orderYearMinor);
		selectFromDropDownNGList(orderTypeMajor, orderTypeMinor);
		selectFromDropDownNGList(orderClassificationMajor, orderClassificationMinor);
		selectFromDropDownNGList(orderCourtMajor, orderCourtMinor);
		clickBtn(orderSearchBtn);
		
		selectFromDropDownNGList(territorialJurisdictionMajor, territorialJurisdictionMinor);
		
		clickBtn(resendRadioBtn);
		Thread.sleep(2000);
		selectFromDropDownNGList(originalWarMajor, originalWarMinor2);
		
		selectFromDropDownNGList(warTypeMajor, warTypeOrderAdaaMinor);
		clickBtn(saveCaseBtn);
		
		setTxt(nationalIdField, nationalId);
		clickBtn(searchPersonBtn);
		
		clickBtn(feeExemptionYesRadioBtn);
		setTxt(feesExemptionCategoryField, " االفئة  المعفاه");
		setTxt(feesExemptionReasonField, "سبب الاعقاء");
		
		clickBtn(saveAnnBtn);
		Thread.sleep(2000);
		clickBtn(issueReciptBtn);
		fluentWait(yeaIssueReciptBtn);
		clickBtn(yeaIssueReciptBtn);
		fluentWait(closeBtn);
		clickBtn(closeBtn);
		
	}
}
