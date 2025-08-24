package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppealFeesPage extends PageBase{

	public AppealFeesPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(css ="a[href=\'#/fees-estimation-requests-new-case\']")
	WebElement caseFeesTab;
	
	@FindBy(css = "button.btn.btn-add-outline")
	WebElement addBtn;
	
	@FindBy(css = "ng-select.ng-select.ng-select-single.ng-select-searchable.ng-select-clearable.ng-untouched.ng-pristine")
	WebElement reqestTypeMajor;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement objectionReqestTypeMinor;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[2]")
	WebElement laborArbitrationMinor;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[4]")
	WebElement quarrelMinor;
	
	@FindBy(name="GuildMembershipNumber")
	WebElement memberShipNoField;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/fer-requester/div/div[2]/form/div[2]/div/div/button")
	WebElement memberShipNoBtn;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/fer-requester/div/div[3]/form/div[2]/div/div/button")
	WebElement memberShipNoBtn2;
	
	@FindBy(css="ng-select.ng-select.ng-select-single.ng-select-clearable.ng-untouched.ng-pristine.ng-invalid")
	WebElement employeeTaskLocationMajor;
	
	@FindBy(xpath = "(//div[contains(@id ,'-0')])")
	WebElement employeeTaskLocationMinor;
	
	
	
	@FindBy(css = "i.fa.fa-circle-o")
	WebElement yesBtn;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/fer-fees-exemption/div/div[2]/div[2]/div[1]/div/div[1]/a/i")
	WebElement allFeesCheckBox;
	
	@FindBy(name = "feesExemptionCategory")
	WebElement feesExemptionCategoryField;
	
	@FindBy(name="feesExemptionReason")
	WebElement feesExemptionReasonField;
	
	@FindBy(css = "button.btn.btn-sm.btn-add-outline.float-right")
	WebElement addRequestBtn;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/form/div[1]/div/div[1]/div/ng-select/div/div/div[2]")
	WebElement orderValueTypeMajor;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/form/div[1]/div/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement OrderValueTypeMinor;
	
	@FindBy(css="input.form-control.ng-untouched.ng-pristine.ng-invalid")
	WebElement orderNoField;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/form/div[2]/button[1]")
	WebElement saveOrderBtn;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[5]/button[1]")
	WebElement saveOrderBtn2;
	
	@FindBy(css ="button.btn.btn-sm.btn-save.float-left")
	WebElement saveCaseBtn;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[3]/button[2]")
	WebElement reciptEstablishBtn;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[5]/button[2]")
	WebElement reciptEstablishBtn2;

	@FindBy(css = "button.swal2-confirm.swal2-styled.swal2-default-outline")
	WebElement saveBtn;
	
	@FindBy(xpath = "(//button[contains(@title , 'بحث')])[1]")
	WebElement searchCaseBtn;

	@FindBy(name="caseId")
	WebElement  caseIdTxtFiled;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/div[2]/form/div/div[3]/div/ng-select/div/div/div[2]")
	WebElement yearMajor ;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/div[2]/form/div/div[3]/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement yearMinor ;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/div[2]/form/div/div[4]/div/ng-select/div/div/div[2]")
	WebElement classificationTypeMajor;

	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/div[2]/form/div/div[4]/div/ng-select/ng-dropdown-panel/div/div[2]/div[3]")
	WebElement classificationTypeMinor ;

	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/div[2]/form/div/div[5]/div/ng-select/div/div/div[2]")
	WebElement courtMajor ;

	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/div[2]/form/div/div[5]/div/ng-select/ng-dropdown-panel/div/div[2]/div[4]")
	WebElement  courtMinor;

	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/div[2]/form/div/div[8]/button[1]")
	WebElement searchBtn ;

	@FindBy(name = "requesterClassificationPerson")
	WebElement requesterClassificationPersonRadioBtn ;

	/*
	@FindBy(xpath = "")
	WebElement  ;

	@FindBy(xpath = "")
	WebElement  ;

	@FindBy(xpath = "")
	WebElement  ;

	@FindBy(xpath = "")
	WebElement  ;

	@FindBy(xpath = "")
	WebElement  ;
	
	@FindBy(xpath = "")
	WebElement  ;

	@FindBy()
	WebElement  ;
	
	@FindBy()
	WebElement  ;
	
	@FindBy()
	WebElement  ;

	@FindBy()
	WebElement  ;
	
	@FindBy()
	WebElement  ;
	
	@FindBy()
	WebElement  ;

	@FindBy()
	WebElement  ;
	
	@FindBy()
	WebElement  ;

	*/
	
	
	
	public void createObjectionCase(String memberShipNo, String feesExemptionCategoryAndReason , String orderNo) throws InterruptedException
	{
		
		fluentWait(caseFeesTab);
		clickBtn(caseFeesTab);
		fluentWait(addBtn);
		clickBtn(addBtn);
		fluentWait(reqestTypeMajor);
		selectFromDropDownNGList(reqestTypeMajor, objectionReqestTypeMinor);
		
		setTxt(memberShipNoField, memberShipNo);
		clickBtn(memberShipNoBtn);
		
		selectFromDropDownNGList(employeeTaskLocationMajor, employeeTaskLocationMinor);
		fluentWait(yesBtn);
		clickBtn(yesBtn);
		fluentWait(allFeesCheckBox);
		clickBtn(allFeesCheckBox);
		
		setTxt(feesExemptionCategoryField, feesExemptionCategoryAndReason);
		setTxt(feesExemptionReasonField, feesExemptionCategoryAndReason);
		
		clickBtn(addRequestBtn);
		fluentWait(orderValueTypeMajor);
		selectFromDropDownNGList(orderValueTypeMajor, OrderValueTypeMinor);
		fluentWait(orderNoField);
		setTxt(orderNoField, orderNo);
		
		clickBtn(saveOrderBtn);
		fluentWait(saveCaseBtn);
		clickBtn(saveCaseBtn);
		fluentWait(reciptEstablishBtn);
		Thread.sleep(2000);
		clickBtn(reciptEstablishBtn);
		fluentWait(saveBtn);
		clickBtn(saveBtn);
		Thread.sleep(2000);

	}
	
	
	public void createLaborArbitrationCase() throws InterruptedException 
	{
		fluentWait(caseFeesTab);
		clickBtn(caseFeesTab);
		fluentWait(addBtn);
		clickBtn(addBtn);
		fluentWait(reqestTypeMajor);
		selectFromDropDownNGList(reqestTypeMajor, laborArbitrationMinor);
		
		setTxt(memberShipNoField, "24");
		clickBtn(memberShipNoBtn);
		
		selectFromDropDownNGList(employeeTaskLocationMajor, employeeTaskLocationMinor);
		fluentWait(yesBtn);
		clickBtn(yesBtn);
		fluentWait(allFeesCheckBox);
		clickBtn(allFeesCheckBox);
		
		setTxt(feesExemptionCategoryField, "سبب الاعفاء");
		setTxt(feesExemptionReasonField, "اعفاء مؤقت كلي");
		
		clickBtn(addRequestBtn);
		fluentWait(orderValueTypeMajor);
		selectFromDropDownNGList(orderValueTypeMajor, OrderValueTypeMinor);
		fluentWait(orderNoField);
		setTxt(orderNoField, "1");
		
		clickBtn(saveOrderBtn);
		fluentWait(saveCaseBtn);
		clickBtn(saveCaseBtn);
		fluentWait(reciptEstablishBtn);
		Thread.sleep(2000);
		clickBtn(reciptEstablishBtn);
		fluentWait(saveBtn);
		clickBtn(saveBtn);
		Thread.sleep(2000);
	}
	
	public void createQuarrelCase() throws InterruptedException 
	{
		fluentWait(caseFeesTab);
		clickBtn(caseFeesTab);
		fluentWait(addBtn);
		clickBtn(addBtn);
		fluentWait(reqestTypeMajor);
		selectFromDropDownNGList(reqestTypeMajor, quarrelMinor);
		
		clickBtn(searchCaseBtn);
		
		setTxt(caseIdTxtFiled, "1");
		selectFromDropDownNGList(yearMajor, yearMinor);
		selectFromDropDownNGList(classificationTypeMajor, classificationTypeMinor);
		selectFromDropDownNGList(courtMajor, courtMinor);
		clickBtn(searchBtn);
		
		fluentWait(requesterClassificationPersonRadioBtn);
		Thread.sleep(2000);
		clickBtn(requesterClassificationPersonRadioBtn);
		setTxt(memberShipNoField, "24");
		clickBtn(memberShipNoBtn2);
		
		selectFromDropDownNGList(employeeTaskLocationMajor, employeeTaskLocationMinor);
		fluentWait(yesBtn);
		clickBtn(yesBtn);
		fluentWait(allFeesCheckBox);
		clickBtn(allFeesCheckBox);
		
		setTxt(feesExemptionCategoryField, "سبب الاعفاء");
		setTxt(feesExemptionReasonField, "اعفاء مؤقت كلي");
				
		fluentWait(saveCaseBtn);
		clickBtn(saveCaseBtn);
		fluentWait(reciptEstablishBtn2);
		Thread.sleep(2000);
		clickBtn(reciptEstablishBtn2);
		fluentWait(saveBtn);
		clickBtn(saveBtn);
		Thread.sleep(2000);
	}
	
}
