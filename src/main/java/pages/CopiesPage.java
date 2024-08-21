package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CopiesPage extends PageBase
{

	CertificatesPage cePageElement;
	TreasuryPage treasuryPage;

	public CopiesPage(WebDriver driver) {
		super(driver);
		cePageElement = new CertificatesPage(driver);
		treasuryPage=new TreasuryPage(driver);
	}



	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[1]/div/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement recordeCaseMinorCopy;

	@FindBy(name = "hearingDate")
	WebElement rCDataRecordCaseMajor;


	@FindBy(xpath ="/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[4]/div/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement rCFirstDataRecordCaseMinor;


	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[5]/div[3]/div[1]/ng-select/div/div/div[2]")
	WebElement rCBeneficiaryOfTheCopyMajor;

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[5]/div[3]/div[1]/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement rCBeneficiaryOfTheCopyMinor;

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[7]/div[2]/table/tbody/tr/td[2]/document-actions/button")
	WebElement rCAddCopyOrderDocumentBtn;


	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[8]/button[5]")
	WebElement copySubmitBtn;


	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[8]/button[1]")
	WebElement copyViewFeeReceiptBtn;

	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/div[3]/div/div[1]/button")
	WebElement issuingRecipt;

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/div/div[2]/table-server/div[2]/div/div[2]/div[1]/button[4]")
	public static WebElement deliverTheCopy;

	@FindBy(name = "CopyType")
	WebElement copyTypeMajor;


	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/div/div[2]/table-server/div[2]/div/div[1]/div[5]")
	WebElement rCOrderNum;


	@FindBy(name = "requesterNumber")
	WebElement requesterNumberField;

	@FindBy(css ="button.btn.btn-block.btn-search-outline")
	WebElement searchBtn;



	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/div/div[2]/table-server/div[2]/div/div[2]/div[1]/button[4]")
	WebElement copyDelivery;

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/div/div[2]/table-server/div[2]/div/div[2]/div[1]/button[3]")
	public static WebElement theCopy;


	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[1]/div/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[2]")
	WebElement memorialCopyMinor;

	@FindBy(xpath ="/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[4]/div[2]/div[2]/input")
	WebElement fromExternalBtn;

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[4]/div[3]/div[1]/external-requester-selector/div/div/div/div[1]/button")
	WebElement addType;

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[4]/div[3]/div[1]/external-requester-selector/div/div/div/div[1]/div/a[1]")
	WebElement addNormalPerson;

	@FindBy(name = "nationalId")
	WebElement idField;

	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/div[2]/div/form/div/div/div[1]/div[2]/button")
	WebElement nPsearchBtn;

	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/div[2]/form/div[2]/button[1]")
	WebElement saveBtn;

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[6]/div[2]/div[1]/input")
	WebElement submitDeclarationRadioBtn;

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[7]/div[2]/table/tbody/tr[2]/td[2]/document-actions/button")
	WebElement declarationAddDocBtn;

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/div/div[2]/table-server/div[2]/div/div[1]/div[4]")
	WebElement memorialOrderNum;

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[1]/div/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[3]")
	WebElement officialJudgeTypeMinor;
	
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[2]/div[2]/div/ng-select/div/div/div[2]")
	WebElement officialJudgeTempMajor;

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[2]/div[2]/div/ng-select/ng-dropdown-panel/div/div[2]/div")
	WebElement officialJudgeTempMinor;

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[4]/div[3]/div[1]/ng-select/div/div/div[2]")
	WebElement oJCBeneficiaryMajor;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[4]/div[3]/div[1]/ng-select/ng-dropdown-panel/div/div[2]/div[2]")
	WebElement oJCBeneficiaryScPersonMinor;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[6]/div[2]/table/tbody/tr/td[2]/document-actions/button")
	WebElement addOJCDocBtn;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[7]/button[5]")
	WebElement oJCSaveBtn ;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[7]/button[1]")
	WebElement oJCViewFeeReceiptBtn;
	
	@FindBy(xpath ="/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[1]/div/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[4]")
	WebElement copyFromTheFrontOfTheCaseTypeMinor;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[4]/div[2]/ng-select")
	WebElement documentFoldersMajor;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[4]/div[2]/ng-select/ng-dropdown-panel/div/div[2]/div")
	WebElement documentFoldersMinor;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[5]/div[3]/div[1]/ng-select/div/div/div[2]")
	WebElement dFBeneficiaryMajor;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[5]/div[3]/div[1]/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement dFBeneficiaryFPMinor;
	
/*
	@FindBy(xpath = "")
	WebElement ;
	
	@FindBy(xpath = "")
	WebElement ;
	
	@FindBy(xpath = "")
	WebElement ;
*/
	public void recordeCase(String serialCaseNum) throws InterruptedException
	{
		clickBtn(cePageElement.addBtn);
		fluentWait(copyTypeMajor);
		selectFromDropDownNGList(copyTypeMajor, recordeCaseMinorCopy);
		clickBtn(cePageElement.caseSearchBtn);
		fluentWait(cePageElement.courtMajorElement);
		setTxt(cePageElement.caseSerialNumberField, serialCaseNum);
		selectFromDropDownNGList(cePageElement.yearField, cePageElement.yearMinor);
		selectFromDropDownNGList(cePageElement.classificationTableMajorElement, cePageElement.classificationTableMinorRentals);
		selectFromDropDownNGList(cePageElement.courtMajorElement,cePageElement.courtMinorSouthCairo);
		clickBtn(cePageElement.searchBtn);
		Thread.sleep(1500);
		selectFromDropDownNGList(rCDataRecordCaseMajor, rCFirstDataRecordCaseMinor);
		selectFromDropDownNGList(rCBeneficiaryOfTheCopyMajor, rCBeneficiaryOfTheCopyMinor);
		clickBtn(copySubmitBtn);
		Thread.sleep(2500);
		uploadPdf(rCAddCopyOrderDocumentBtn, cePageElement.selectPermissionBtn, cePageElement.savePermissionBtn);
		Thread.sleep(8000);
		clickBtn(copyViewFeeReceiptBtn);
		fluentWait(issuingRecipt);
		clickBtn(issuingRecipt);

		paymentAndDeliveryOfTheCopy("Recorde Case");

	}


	public void memorialCopy(String serialCaseNum,String personId) throws InterruptedException
	{
		clickBtn(cePageElement.addBtn);
		fluentWait(copyTypeMajor);
		selectFromDropDownNGList(copyTypeMajor, memorialCopyMinor);
		clickBtn(cePageElement.caseSearchBtn);
		fluentWait(cePageElement.courtMajorElement);
		setTxt(cePageElement.caseSerialNumberField, serialCaseNum);
		selectFromDropDownNGList(cePageElement.yearField, cePageElement.yearMinor);
		selectFromDropDownNGList(cePageElement.classificationTableMajorElement, cePageElement.classificationTableMinorRentals);
		selectFromDropDownNGList(cePageElement.courtMajorElement,cePageElement.courtMinorSouthCairo);
		clickBtn(cePageElement.searchBtn);
		fluentWait(fromExternalBtn);
		clickBtn(fromExternalBtn);
		fluentWait(addType);
		addNormalPerson(addType, addNormalPerson, idField, personId, nPsearchBtn, saveBtn);
		fluentWait(submitDeclarationRadioBtn);
		clickBtn(submitDeclarationRadioBtn);
		clickBtn(copySubmitBtn);
		Thread.sleep(2500);
		uploadPdf(rCAddCopyOrderDocumentBtn, cePageElement.selectPermissionBtn, cePageElement.savePermissionBtn);
		Thread.sleep(7000);
		uploadPdf(declarationAddDocBtn,cePageElement.selectPermissionBtn, cePageElement.savePermissionBtn);
		Thread.sleep(7000);
		clickBtn(copyViewFeeReceiptBtn);
		fluentWait(issuingRecipt);
		clickBtn(issuingRecipt);

		paymentAndDeliveryOfTheCopy("Memorial");


	}
	
	public void theOfficialJudgementCopy (String serialCaseNum) throws InterruptedException
	{
		clickBtn(cePageElement.addBtn);
		fluentWait(copyTypeMajor);
		selectFromDropDownNGList(copyTypeMajor, officialJudgeTypeMinor);
		clickBtn(cePageElement.caseSearchBtn);
		fluentWait(cePageElement.courtMajorElement);
		setTxt(cePageElement.caseSerialNumberField, serialCaseNum);
		selectFromDropDownNGList(cePageElement.yearField, cePageElement.yearMinor);
		selectFromDropDownNGList(cePageElement.classificationTableMajorElement, cePageElement.classificationTableMinorRentals);
		selectFromDropDownNGList(cePageElement.courtMajorElement,cePageElement.courtMinorSouthCairo);
		clickBtn(cePageElement.searchBtn);
		fluentWait(officialJudgeTempMajor);
		selectFromDropDownNGList(officialJudgeTempMajor, officialJudgeTempMinor);
		fluentWait(oJCBeneficiaryMajor);
		selectFromDropDownNGList(oJCBeneficiaryMajor, oJCBeneficiaryScPersonMinor);
		clickBtn(oJCSaveBtn);
		Thread.sleep(4500);
		uploadPdf(addOJCDocBtn, cePageElement.selectPermissionBtn, cePageElement.savePermissionBtn);
		Thread.sleep(7000);
		clickBtn(oJCViewFeeReceiptBtn);
		fluentWait(issuingRecipt);
		clickBtn(issuingRecipt);
		
		paymentAndDeliveryOfTheCopy("Official Judgement");
		
		
	}
	
	
	public void copyFromTheFrontOfTheCase(String serialCaseNum) throws InterruptedException
	{
		clickBtn(cePageElement.addBtn);
		fluentWait(copyTypeMajor);
		selectFromDropDownNGList(copyTypeMajor, copyFromTheFrontOfTheCaseTypeMinor);
		clickBtn(cePageElement.caseSearchBtn);
		fluentWait(cePageElement.courtMajorElement);
		setTxt(cePageElement.caseSerialNumberField, serialCaseNum);
		selectFromDropDownNGList(cePageElement.yearField, cePageElement.yearMinor);
		selectFromDropDownNGList(cePageElement.classificationTableMajorElement, cePageElement.classificationTableMinorRentals);
		selectFromDropDownNGList(cePageElement.courtMajorElement,cePageElement.courtMinorSouthCairo);
		clickBtn(cePageElement.searchBtn);
		fluentWait(documentFoldersMajor);
		selectFromDropDownNGList(documentFoldersMajor, documentFoldersMinor);
		fluentWait(dFBeneficiaryMajor);
		selectFromDropDownNGList(dFBeneficiaryMajor, dFBeneficiaryFPMinor);
		clickBtn(copySubmitBtn);
		Thread.sleep(2500);
		uploadPdf(rCAddCopyOrderDocumentBtn, cePageElement.selectPermissionBtn, cePageElement.savePermissionBtn);
		Thread.sleep(8000);
		clickBtn(copyViewFeeReceiptBtn);
		fluentWait(issuingRecipt);
		clickBtn(issuingRecipt);
		
		paymentAndDeliveryOfTheCopy("Copy From The Front Of The Case");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

 	private void paymentAndDeliveryOfTheCopy(String CopyOrderType) throws InterruptedException
	{
		String orderNumber=null;

		getStepBack();
		
		if(CopyOrderType=="Recorde Case" || CopyOrderType=="Copy From The Front Of The Case") 
		{
			fluentWait(rCOrderNum);
			orderNumber=rCOrderNum.getText();
		}
		else if (CopyOrderType=="Memorial" || CopyOrderType=="Official Judgement")
		{
			fluentWait(memorialOrderNum);
			orderNumber=memorialOrderNum.getText();
		}	
		String[] x=orderNumber.split("/");
		String[] xx=x[0].split(":");
		Thread.sleep(5000);
		loggedOut();
		treasuryPage.completeThePaymentProcess(xx[1], "1");
		loggedOut();

		LoginPage.loginData("abdo.cer", "Admin123");
		fluentWait(CertificatesAndCopiesHomePage.copyTab);
		clickBtn(CertificatesAndCopiesHomePage.copyTab);
		fluentWait(requesterNumberField);
		setTxtInAnotherWay(requesterNumberField, xx[1]);
		fluentWait(searchBtn);
		clickBtn(searchBtn);
		fluentWait(copyDelivery);
		Thread.sleep(2500);
		clickBtn(copyDelivery);

	}


}

