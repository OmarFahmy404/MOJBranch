package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppealBackPage extends PageBase {

	public AppealBackPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	AppealFrontPage appealFrontPage;
	
	@FindBy(css ="a[href=\'#/new-case-filing/list\']")
	WebElement appealCasesTab ;
	
	@FindBy(css ="button.btn.btn-sm.btn-grey-gallery-outline.my-2")
	WebElement  fillingDataBtn;
	
	@FindBy(xpath = "(//button[contains(@class, 'btn-add-outline')])[4]")
	WebElement authorizationBtn;
	
	
	@FindBy(xpath = "(//div[contains(@class, 'ng-input')])[3]")
	WebElement establishedCountryMajor;
	
	@FindBy(xpath = "(//div[contains(@class, 'ng-option')])[2]")
	WebElement secondSelectMinor;
	
	
	@FindBy(xpath = "(//div[contains(@class, 'ng-input')])[4]")
	WebElement establishedYearMajor;
	
	
	@FindBy(xpath = "(//div[contains(@class, 'ng-input')])[5]")
	WebElement authorizationTypeMajor;
	
	@FindBy(name = "egyptianMofaCertificationNumber")
	WebElement egyptianMofaCertificationNumberTxt;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/div[2]/power-of-attorney-filter/div/form/div[2]/div/button[1]")
	WebElement showBtn;
	
	@FindBy(xpath = "(//div[contains(@class, 'ng-input')])[7]")
	WebElement editorTypeHasPowerOfAttorneyMajor;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/div[2]/form[2]/div[2]/div[1]/button")
	WebElement addNormalPersonBtn;
	
	@FindBy(name = "nationalId")
	WebElement nationalIdTxt;
	
	@FindBy(xpath = "(//button[contains(@title, 'بحث')])[1]")
	WebElement searchBtn ;
	
	@FindBy(xpath = "(//button[contains(@type, 'submit')])[4]")
	WebElement submitBtn ;
	
	@FindBy(xpath = "(//button[contains(@type, 'submit')])[3]")
	WebElement saveBtn ;
	
	@FindBy(xpath = "(//button[contains(@class, 'btn-close')])[2]")
	WebElement closeBtn;
	
	@FindBy(name ="finalClaims")
	WebElement finalClaimsTxtbox ;
	
	@FindBy(xpath = "(//button[contains(@class, 'btn-add-outline')])[7]")
	WebElement originalOfTheLawsuitBtn ;
	
	@FindBy( xpath ="(//button[contains(@class, 'btn-add-outline')])[7]")    //U Can locate xpath with the following temp (//*type*[contains(class, '')])[*element number*]
	WebElement divisionCommitteeReportBtn ;
	

	
	@FindBy(css ="button.btn.btn-sm.btn-save.float-left")
	WebElement theLastSaveBtn ;
	
	@FindBy( css="button.btn.btn-sm.btn-save-outline.float-right")
	WebElement  doneBtn;
	
	@FindBy( css="button.swal2-confirm.swal2-styled.swal2-default-outline")
	WebElement confirmBtn ;
	
	@FindBy(name="disputeReason")
	WebElement disputeReasonTxtFiled;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[5]/div[2]/div/div/table/tbody/tr/td[2]/document-actions/button")
	WebElement pdfBtn;
	
	public void addingInfoIntoDivisionCommitteeCase(String differentNo,String idNo) throws InterruptedException 
	{
		fluentWait(appealCasesTab);
		clickBtn(appealCasesTab);
		
		caseSearch(HelperPage.getData("Case Number"), HelperPage.getData("Case Classification"));
		
		Thread.sleep(1000);
		fluentWait(fillingDataBtn);
		clickBtn(fillingDataBtn);
		
		fluentWait(authorizationBtn);
		clickBtn(authorizationBtn);
		
		fluentWait(establishedCountryMajor);
		selectFromDropDownNGList(establishedCountryMajor, secondSelectMinor);
		selectFromDropDownNGList(establishedYearMajor, secondSelectMinor);
		selectFromDropDownNGList(authorizationTypeMajor, secondSelectMinor);
		setTxt(egyptianMofaCertificationNumberTxt, differentNo);
		clickBtn(showBtn);
		fluentWait(editorTypeHasPowerOfAttorneyMajor);
		selectFromDropDownNGList(editorTypeHasPowerOfAttorneyMajor, secondSelectMinor);
		fluentWait(addNormalPersonBtn);
		addNormalPerson(addNormalPersonBtn, nationalIdTxt, idNo, searchBtn, submitBtn);
		
		fluentWait(saveBtn);
		clickBtn(saveBtn);
		

		Thread.sleep(2000);
		clickBtn(closeBtn);
		
		fluentWait(originalOfTheLawsuitBtn);
		setTxt(finalClaimsTxtbox, "اي كلام");

		fluentWait(originalOfTheLawsuitBtn);
		uploadPdf(originalOfTheLawsuitBtn);
		Thread.sleep(3000);
		uploadPdf(divisionCommitteeReportBtn);
		
	

		Thread.sleep(2000);
		clickBtn(theLastSaveBtn);
		Thread.sleep(1500);
		clickBtn(doneBtn);
		Thread.sleep(1500);
		clickBtn(confirmBtn);
	}
	
	public void addingInfoIntoLaborArbitrationCase(String differentNo,String idNo) throws InterruptedException 
	{
		fluentWait(appealCasesTab);
		clickBtn(appealCasesTab);
		
		caseSearch(HelperPage.getData("Case Number"), HelperPage.getData("Case Classification"));
		
		Thread.sleep(1000);
		fluentWait(fillingDataBtn);
		clickBtn(fillingDataBtn);
		
		fluentWait(authorizationBtn);
		clickBtn(authorizationBtn);
		
		fluentWait(establishedCountryMajor);
		selectFromDropDownNGList(establishedCountryMajor, secondSelectMinor);
		selectFromDropDownNGList(establishedYearMajor, secondSelectMinor);
		selectFromDropDownNGList(authorizationTypeMajor, secondSelectMinor);
		setTxt(egyptianMofaCertificationNumberTxt, differentNo);
		clickBtn(showBtn);
		fluentWait(editorTypeHasPowerOfAttorneyMajor);
		selectFromDropDownNGList(editorTypeHasPowerOfAttorneyMajor, secondSelectMinor);
		fluentWait(addNormalPersonBtn);
		addNormalPerson(addNormalPersonBtn, nationalIdTxt, idNo, searchBtn, submitBtn);
		
		fluentWait(saveBtn);
		clickBtn(saveBtn);
		

		Thread.sleep(2000);
		clickBtn(closeBtn);
		
		fluentWait(originalOfTheLawsuitBtn);
		setTxt(finalClaimsTxtbox, "اي كلام");

		fluentWait(originalOfTheLawsuitBtn);
		uploadPdf(originalOfTheLawsuitBtn);
		
		Thread.sleep(2000);
		clickBtn(theLastSaveBtn);
		Thread.sleep(1500);
		clickBtn(doneBtn);
		Thread.sleep(1500);
		clickBtn(confirmBtn);
	}
	
	public void addingInfoIntoQuarrelCase(String differentNo,String idNo) throws InterruptedException 
	{
		fluentWait(appealCasesTab);
		clickBtn(appealCasesTab);
		
		caseSearch(HelperPage.getData("Case Number"), HelperPage.getData("Case Classification"));
		
		Thread.sleep(1000);
		fluentWait(fillingDataBtn);
		clickBtn(fillingDataBtn);
		
		fluentWait(authorizationBtn);
		clickBtn(authorizationBtn);
		
		fluentWait(establishedCountryMajor);
		selectFromDropDownNGList(establishedCountryMajor, secondSelectMinor);
		selectFromDropDownNGList(establishedYearMajor, secondSelectMinor);
		selectFromDropDownNGList(authorizationTypeMajor, secondSelectMinor);
		setTxt(egyptianMofaCertificationNumberTxt, differentNo);
		clickBtn(showBtn);
		fluentWait(editorTypeHasPowerOfAttorneyMajor);
		selectFromDropDownNGList(editorTypeHasPowerOfAttorneyMajor, secondSelectMinor);
		fluentWait(addNormalPersonBtn);
		addNormalPerson(addNormalPersonBtn, nationalIdTxt, idNo, searchBtn, submitBtn);
		
		fluentWait(saveBtn);
		clickBtn(saveBtn);
		

		Thread.sleep(2000);
		clickBtn(closeBtn);
		
		fluentWait(originalOfTheLawsuitBtn);
		setTxt(finalClaimsTxtbox, "اي كلام");
		fluentWait(disputeReasonTxtFiled);
		setTxt(disputeReasonTxtFiled, "اي كلام");

		fluentWait(originalOfTheLawsuitBtn);
		//uploadPdfWithDesc(originalOfTheLawsuitBtn);
		uploadPdf(pdfBtn);
		
		Thread.sleep(2000);
		clickBtn(theLastSaveBtn);
		Thread.sleep(1500);
		clickBtn(doneBtn);
		Thread.sleep(1500);
		clickBtn(confirmBtn);
	}
	
}
