package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AnnFeesPage extends PageBase
{

	public AnnFeesPage(WebDriver driver) {
		super(driver);
	}
	
	

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[1]/button")
	WebElement addBtn;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[1]/div/div/ng-select")
	WebElement annAttachWithMajor;
	

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[1]/div/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement annAttachWithCaseMinor;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[1]/div/div[1]/ng-select/ng-dropdown-panel/div/div[2]/div[2]")
	WebElement annAttachWithOrderMinor;
	
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
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[3]/div[2]/form/div[1]/div[1]/div/ng-select/div/div/div[2]")
	WebElement annTypeMajor;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[3]/div[2]/form/div[1]/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[16]")
	WebElement annTypeFinalJudgMinor;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[3]/div[2]/form/div[1]/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[18]")
	WebElement annTypeReAnnMinor;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[3]/div[2]/form/div[1]/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[19]")
	WebElement annTypeGeneralAnnMinor;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[3]/div[2]/form/div[1]/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[4]")
	WebElement redirectAnotherCourtMinor;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[3]/div[2]/form/div[1]/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[8]")
	WebElement expirtReportMinor;
	
	@FindBy(name = "generalWarningType")
	WebElement descripeAnnfield;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[3]/div[2]/form/div[1]/div[2]/div/ng-select/div/div/div[2]")
	WebElement selectCaseMajor;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[3]/div[2]/form/div[1]/div[2]/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement firstCaseMinor;
	
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
	WebElement originalAnnMajor;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[2]/div[2]/div[2]/div[2]/div[2]/div/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement originalAnnMinor;
	
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
	
	/*@FindBy(xpath = "")
	WebElement ;*/
	
	public void createAnnAttachWithCaseFirstTime(String serialCaseNum,String paperCount,String receiverCount,String nationalId,String descripeGeneralAnn) throws InterruptedException
	{
		fluentWait(addBtn);
		clickBtn(addBtn);
		fluentWait(annAttachWithMajor);
		selectFromDropDownNGList(annAttachWithMajor, annAttachWithCaseMinor);
		clickBtn(searchBtn);
		setTxt(caseSerialNumberField,serialCaseNum);
		selectFromDropDownNGList(caseYearMajor, caseYearMinor);
		selectFromDropDownNGList(tableClassificationMajor, tableClassificationMinor);
		selectFromDropDownNGList(courtMajor, courtMinor);
		clickBtn(searchCaseBtn);
		
		selectFromDropDownNGList(territorialJurisdictionMajor, territorialJurisdictionMinor);
		setTxt(paperCountField, paperCount);
		setTxt(receiverCountField, receiverCount);
		
		selectFromDropDownNGList(annTypeMajor, annTypeFinalJudgMinor);
		selectFromDropDownNGList(selectCaseMajor, firstCaseMinor);
		clickBtn(saveCaseBtn);
		
		selectFromDropDownNGList(annTypeMajor, annTypeReAnnMinor);
		clickBtn(saveCaseBtn);
		
		selectFromDropDownNGList(annTypeMajor, annTypeGeneralAnnMinor);
		setTxt(descripeAnnfield, descripeGeneralAnn);
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
	
	
	public void createAnnAttachWithCaseForSecondeTime(String serialCaseNum,String descripeGeneralAnn,String nationalId) throws InterruptedException
	{
		fluentWait(addBtn);
		clickBtn(addBtn);
		fluentWait(annAttachWithMajor);
		selectFromDropDownNGList(annAttachWithMajor, annAttachWithCaseMinor);
		clickBtn(searchBtn);
		setTxt(caseSerialNumberField,serialCaseNum);
		selectFromDropDownNGList(caseYearMajor, caseYearMinor);
		selectFromDropDownNGList(tableClassificationMajor, tableClassificationMinor);
		selectFromDropDownNGList(courtMajor, courtMinor);
		clickBtn(searchCaseBtn);
		
		selectFromDropDownNGList(territorialJurisdictionMajor, territorialJurisdictionMinor);
		
		clickBtn(resendRadioBtn);
		Thread.sleep(2000);
		selectFromDropDownNGList(originalAnnMajor, originalAnnMinor);
		
		selectFromDropDownNGList(annTypeMajor, annTypeFinalJudgMinor);
		selectFromDropDownNGList(selectCaseMajor, firstCaseMinor);
		clickBtn(saveCaseBtn);
		
		selectFromDropDownNGList(annTypeMajor, annTypeReAnnMinor);
		clickBtn(saveCaseBtn);
		
		selectFromDropDownNGList(annTypeMajor, annTypeGeneralAnnMinor);
		setTxt(descripeAnnfield, descripeGeneralAnn);
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
	
	public void createAnnAttachWithOrderFirstTime(String serialOrderNum,String paperCount,String receiverCount,String nationalId,String descripeGeneralAnn) throws InterruptedException
	{
		fluentWait(addBtn);
		clickBtn(addBtn);
		fluentWait(annAttachWithMajor);
		selectFromDropDownNGList(annAttachWithMajor, annAttachWithOrderMinor);
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
		
		selectFromDropDownNGList(annTypeMajor, redirectAnotherCourtMinor);
		clickBtn(saveCaseBtn);
		
		selectFromDropDownNGList(annTypeMajor, expirtReportMinor);
		clickBtn(saveCaseBtn);
		
		selectFromDropDownNGList(annTypeMajor, annTypeGeneralAnnMinor);
		setTxt(descripeAnnfield, descripeGeneralAnn);
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
	
	public void createAnnAttachWithOrderForSecondeTime(String serialOrderNum,String descripeGeneralAnn,String nationalId) throws InterruptedException
	{
		fluentWait(addBtn);
		clickBtn(addBtn);
		fluentWait(annAttachWithMajor);
		selectFromDropDownNGList(annAttachWithMajor, annAttachWithOrderMinor);
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
		selectFromDropDownNGList(originalAnnMajor, originalAnnMinor);
		
		selectFromDropDownNGList(annTypeMajor, redirectAnotherCourtMinor);
		clickBtn(saveCaseBtn);
		
		selectFromDropDownNGList(annTypeMajor, expirtReportMinor);
		clickBtn(saveCaseBtn);
		
		selectFromDropDownNGList(annTypeMajor, annTypeGeneralAnnMinor);
		setTxt(descripeAnnfield, descripeGeneralAnn);
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
