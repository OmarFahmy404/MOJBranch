package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdministrativeAnnFeesPage extends PageBase
{

	public AdministrativeAnnFeesPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(css = "button.btn.btn-add-outline")
	WebElement addBtn;

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/div/div[2]/table-server/div[2]/div[1]/div/table/tbody/tr/td[1]/div/div[6]")
	public
	WebElement annTypeTxt;

	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/admin-announcements-add-edit/div[2]/form/div[2]/div[2]/div/ng-select/div/div/div[2]")
	WebElement annAttachWithMajor;

	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/admin-announcements-add-edit/div[2]/form/div[2]/div[2]/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement annAttachWithCaseMinor;

	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/admin-announcements-add-edit/div[2]/form/div[2]/div[2]/div/ng-select/ng-dropdown-panel/div/div[2]/div[2]")
	WebElement annAttachWithOrderMinor;

	
	@FindBy(css = "button.btn.btn-search.font-size-18")
	WebElement SearchBtn;

	
	@FindBy(name = "caseSerialNumber")
	WebElement caseSerialNumberField;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/casetypelinkedsearchpopup/div[2]/form/div/div[2]/div/ng-select/div/div/div[2]")
	WebElement caseYearMajor;

	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/casetypelinkedsearchpopup/div[2]/form/div/div[2]/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement caseYearMinor;

	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/casetypelinkedsearchpopup/div[2]/form/div/div[3]/div/ng-select/div")
	WebElement caseTableClassificationMajor;

	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/casetypelinkedsearchpopup/div[2]/form/div/div[3]/div/ng-select/ng-dropdown-panel/div/div[2]/div[3]")
	WebElement caseTableClassificationMinor;

	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/casetypelinkedsearchpopup/div[2]/form/div/div[4]/div/ng-select/div/div/div[2]")
	WebElement caseCourtMajor;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/casetypelinkedsearchpopup/div[2]/form/div/div[4]/div/ng-select/ng-dropdown-panel/div/div[2]/div[4]")
	WebElement caseCourtMinor;

	
	@FindBy(css = "button.btn.btn-search-outline")
	WebElement caseSearchBtn;

	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/admin-announcements-add-edit/div[2]/form/div[2]/div[3]/div[1]/div/ng-select/div/div/div[2]")
	WebElement annTypeMajor;

	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/admin-announcements-add-edit/div[2]/form/div[2]/div[3]/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement annTypeMinor;

	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/admin-announcements-add-edit/div[2]/form/div[3]/form/div[1]/div[1]/div/ng-select/div/div/div[2]")
	WebElement annTypeMajor2;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/admin-announcements-add-edit/div[2]/form/div[3]/form/div[1]/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement annTypeReriseMinor2;

	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/admin-announcements-add-edit/div[2]/form/div[3]/form/div[1]/div[2]/div/ng-select/div/div/div[2]")
	WebElement selectCaseMajor;

	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/admin-announcements-add-edit/div[2]/form/div[3]/form/div[1]/div[2]/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement selectCaseMinor;

	
	@FindBy(css = "button.btn.btn-sm.btn-save.float-right")
	WebElement saveAnnTypeBtn;

	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/admin-announcements-add-edit/div[2]/form/div[4]/button[2]")
	WebElement saveAnnBtn;
	
	@FindBy(css = "button.btn.btn-add-outline.mb-3")
	WebElement selectFromInsideCaseBtn;

	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/form/div[1]/div/div/div/ng-select/div/div/div[2]")
	WebElement selectFromInsideCaseMajor;

	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/form/div[1]/div/div/div/ng-select/ng-dropdown-panel/div/div[2]/div[2]")
	WebElement selectFromInsideCaseMinor;

	
	@FindBy(xpath  = "/html/body/ngb-modal-window/div/div/ng-component/form/div[2]/button[1]")
	WebElement saveSelectionPersonBtn;

	
	@FindBy(css = "button.btn.btn-xs.btn-search")
	WebElement sameAnnBtn;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-recieverpersonpopup/form[2]/div[1]/div[4]/div[2]/div[6]/div/ng-select/div/div/div[2]")
	WebElement penMajor;

	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-recieverpersonpopup/form[2]/div[1]/div[4]/div[2]/div[6]/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement penMinor;

	
	@FindBy(css = "button.btn.btn-sm.btn-save.float-left")
	WebElement savePersonBtn;

	
	@FindBy(css = "button.btn.btn-sm.btn-add-outline")
	WebElement addDocAnnBtn;

	
	@FindBy(xpath =  "/html/body/ngb-modal-window/div/div/ng-component/form/div[1]/div/div/div/div[1]/input")
	WebElement selectDocBtn;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/form/div[2]/button[1]")
	WebElement saveDocBtn;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/admin-announcements-add-edit/div[2]/form/div[6]/button[2]")
	WebElement doneBtn;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/div/div[2]/table-server/div[2]/div[1]/div/table/tbody/tr/td[1]/div/div[2]")
	public static
	WebElement annNumTxt;
	
	@FindBy(name="orderSerialNumber")
	WebElement orderSerialNumberField;

	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/casetypelinkedwithorderwritpopup/div[2]/form/div/div[2]/div/ng-select/div/div/div[2]")
	WebElement orderYearMajor;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/casetypelinkedwithorderwritpopup/div[2]/form/div/div[2]/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement orderYearMinor;

	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/casetypelinkedwithorderwritpopup/div[2]/form/div/div[3]/div/ng-select/div/div/div[2]")
	WebElement orderTypeMajor;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/casetypelinkedwithorderwritpopup/div[2]/form/div/div[3]/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement orderTypeMinor;

	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/casetypelinkedwithorderwritpopup/div[2]/form/div/div[4]/div/ng-select/div/div/div[2]")
	WebElement orderClassifictionTabelMajor;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/casetypelinkedwithorderwritpopup/div[2]/form/div/div[4]/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement orderClassifictionTabelMinor;

	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/casetypelinkedwithorderwritpopup/div[2]/form/div/div[5]/div/ng-select/div/div/div[2]")
	WebElement orderCourtMajor;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/casetypelinkedwithorderwritpopup/div[2]/form/div/div[5]/div/ng-select/ng-dropdown-panel/div/div[2]/div[4]")
	WebElement orderCourtMinor;

	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/casetypelinkedwithorderwritpopup/div[2]/form/div/div[8]/button")
	WebElement orderSearchBtn;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/admin-announcements-add-edit/div[2]/form/div[3]/form/div[1]/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[20]")
	WebElement orderTypeReAnnMinor; 

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/admin-announcements-add-edit/div[2]/form/div[3]/form/div[2]/button")
	WebElement saveOrderTypeBtn;
	
	public void caseAdmAnnFeesProcess(String caseSerialNum) throws InterruptedException
	{
		fluentWait(addBtn);
		clickBtn(addBtn);
		fluentWait(annAttachWithMajor);
		selectFromDropDownNGList(annAttachWithMajor, annAttachWithCaseMinor);
		clickBtn(SearchBtn);
		fluentWait(caseSerialNumberField);
		setTxt(caseSerialNumberField, caseSerialNum);
		selectFromDropDownNGList(caseYearMajor, caseYearMinor);
		selectFromDropDownNGList(caseTableClassificationMajor, caseTableClassificationMinor);
		selectFromDropDownNGList(caseCourtMajor, caseCourtMinor);
		clickBtn(caseSearchBtn);
		
		Thread.sleep(1500);
		selectFromDropDownNGList(annTypeMajor, annTypeMinor);
		
		selectFromDropDownNGList(annTypeMajor2, annTypeReriseMinor2);
		selectFromDropDownNGList(selectCaseMajor, selectCaseMinor);
		clickBtn(saveAnnTypeBtn);
		clickBtn(saveAnnBtn);
		
		
		fluentWait(selectFromInsideCaseBtn);
		clickBtn(selectFromInsideCaseBtn);
		fluentWait(selectFromInsideCaseMajor);
		selectFromDropDownNGList(selectFromInsideCaseMajor, selectFromInsideCaseMinor);
		clickBtn(saveSelectionPersonBtn);
		
		clickBtn(sameAnnBtn);
		selectFromDropDownNGList(penMajor, penMinor);
		clickBtn(savePersonBtn);
		
		Thread.sleep(3000);
		uploadPdf(addDocAnnBtn, selectDocBtn, saveDocBtn);
		Thread.sleep(8000);

		clickBtn(doneBtn);
		fluentWait(annTypeTxt);
		
	}
	
	public void orderAdmAnnFeesProcess(String orderSerialNum) throws InterruptedException
	{
		fluentWait(addBtn);
		clickBtn(addBtn);
		fluentWait(annAttachWithMajor);
		selectFromDropDownNGList(annAttachWithMajor, annAttachWithOrderMinor);
		clickBtn(SearchBtn);
		setTxt(orderSerialNumberField, orderSerialNum);
		selectFromDropDownNGList(orderYearMajor, orderYearMinor);
		selectFromDropDownNGList(orderTypeMajor, orderTypeMinor);
		selectFromDropDownNGList(orderClassifictionTabelMajor, orderClassifictionTabelMinor);
		selectFromDropDownNGList(orderCourtMajor, orderCourtMinor);
		clickBtn(orderSearchBtn);
		
		Thread.sleep(1500);
		selectFromDropDownNGList(annTypeMajor, annTypeMinor);
		
		selectFromDropDownNGList(annTypeMajor2, orderTypeReAnnMinor);
		clickBtn(saveOrderTypeBtn);
		clickBtn(saveAnnBtn);
		
		
		fluentWait(selectFromInsideCaseBtn);
		clickBtn(selectFromInsideCaseBtn);
		fluentWait(selectFromInsideCaseMajor);
		selectFromDropDownNGList(selectFromInsideCaseMajor, selectFromInsideCaseMinor);
		clickBtn(saveSelectionPersonBtn);
		
		clickBtn(sameAnnBtn);
		selectFromDropDownNGList(penMajor, penMinor);
		clickBtn(savePersonBtn);
		
		Thread.sleep(3000);
		uploadPdf(addDocAnnBtn, selectDocBtn, saveDocBtn);
		Thread.sleep(8000);

		clickBtn(doneBtn);
		fluentWait(annTypeTxt);
		
	}
	
	public static String searchOnAnnNum()
	{
		fluentWait(annNumTxt);
		String wholeTxt=annNumTxt.getText();
		String[] fPart=wholeTxt.split(":");
		String[] sPart=fPart[1].split("/");
		
		return sPart[0];
	}
}
