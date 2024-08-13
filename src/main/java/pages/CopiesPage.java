package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CopiesPage extends PageBase
{

	CertificatesPage cePageElement;
	
	public CopiesPage(WebDriver driver) {
		super(driver);
		cePageElement = new CertificatesPage(driver);
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
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[8]/button[3]")
	public static WebElement displayCopy;

	@FindBy(name = "CopyType")
	WebElement copyTypeMajor;
	

	/*@FindBy(xpath = " ")
	WebElement ;
	

	@FindBy(xpath = " ")
	WebElement ;*/
	
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
		fluentWait(rCDataRecordCaseMajor);
		selectFromDropDownNGList(rCDataRecordCaseMajor, rCFirstDataRecordCaseMinor);
		selectFromDropDownNGList(rCBeneficiaryOfTheCopyMajor, rCBeneficiaryOfTheCopyMinor);
		clickBtn(copySubmitBtn);
		Thread.sleep(4000);
		uploadPdf(rCAddCopyOrderDocumentBtn, cePageElement.selectPermissionBtn, cePageElement.savePermissionBtn);
		Thread.sleep(7500);
		clickBtn(copyViewFeeReceiptBtn);
		fluentWait(cePageElement.issuingTheReceiptBtn);
		clickBtn(cePageElement.issuingTheReceiptBtn);
		Thread.sleep(4000);
		
	}
	
}
