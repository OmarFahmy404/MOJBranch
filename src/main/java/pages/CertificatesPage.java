package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CertificatesPage extends PageBase
{

	public CertificatesPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css = "button.btn.btn-add-outline")
	public static WebElement addBtn;
	@FindBy(xpath="/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[1]/div/div[1]/div/ng-select/div/div/div[2]")
	WebElement certTypeMajorElement;
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[1]/div/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement certTypeMinorSessionsCases;
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[1]/div/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[2]")
	WebElement certTypeMinorBrotstoCase;
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[1]/div/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[3]")
	WebElement certTypeMinorTerroristGroups;
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[1]/div/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[6]")
	WebElement certTypeMinorNotExistedCase;
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[1]/div/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[11]")
	WebElement certTypeMinorNoAppealNegative;
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[2]/div/div[1]/div/button")
	WebElement caseSearchBtn;
	@FindBy(name = "caseSerialNumber")
	WebElement caseSerialNumberField ;
	@FindBy(name = "year")
	WebElement yearField;
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/casetypelinkedsearchpopup/div[2]/form/div/div[2]/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement yearMinor;
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/casetypelinkedsearchpopup/div[2]/form/div/div[3]/div/ng-select/div")
	WebElement classificationTableMajorElement;
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/casetypelinkedsearchpopup/div[2]/form/div/div[3]/div/ng-select/ng-dropdown-panel/div/div[2]/div[3]")
	WebElement classificationTableMinorRentals;
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/casetypelinkedsearchpopup/div[2]/form/div/div[4]/div/ng-select/div/div/div[2]")
	WebElement courtMajorElement;
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/casetypelinkedsearchpopup/div[2]/form/div/div[4]/div/ng-select/ng-dropdown-panel/div/div[2]/div[4]")
	WebElement courtMinorSouthCairo;
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/casetypelinkedsearchpopup/div[2]/form/div/div[7]/button")
	WebElement searchBtn;
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[3]/div[3]/div[1]/ng-select/div/div/div[2]")
	WebElement BeneficiaryOfTheCertificateFromCaseMajorElement;
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[3]/div[3]/div[1]/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement BeneficiaryOfTheCertificateFromCaseMinorFirstPerson;
	@FindBy(name = "external")
	WebElement outsideCaseRadioBtn;
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[3]/div[3]/div[1]/external-requester-selector/div/div/div/div[1]/button")
	WebElement addPersonMajorElement;
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[3]/div[3]/div[1]/external-requester-selector/div/div/div/div[1]/div/a[1]")
	WebElement normalPersonMinorElement;
	@FindBy(name = "nationalId")
	WebElement nationalIdField;
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/div[2]/div/form/div/div/div[1]/div[2]/button")
	WebElement nationalIdSearchBtn;	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/div[2]/form/div[2]/button[1]")
	WebElement savePersonBtn;
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[4]/div[2]/div[1]/input")
	WebElement authorizatedPaperRadioBtn;
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[6]/div[2]/table/tbody/tr[1]/td[2]/document-actions/button")
	WebElement addTheCertificateOrder;
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[7]/button[5]")
	WebElement submitBtn1;
	@FindBy(xpath = "/html/body/div/div/div[6]/button[1]")
	WebElement submitBtn2;
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/form/div[1]/div/div/div/div[1]/input")
	WebElement selectTheCertificateOrder;
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/form/div[2]/button[1]")
	WebElement saveCertificateBtn;
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[7]/div[2]/table/tbody/tr[2]/td[2]/document-actions/button")
	WebElement addPermissionBtn;
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/form/div[1]/div/div/div/div[1]/input")
	WebElement selectPermissionBtn;
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/form/div[2]/button[1]")
	WebElement savePermissionBtn;
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[7]/button[1]")
	WebElement viewFeeReceiptBtn;
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/div[3]/div/div[1]/button")
	WebElement issuingTheReceiptBtn;
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[8]/button[1]")
	WebElement printTheOrderTypeBtn;
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[7]/button[3]")
	public static WebElement displayTheCertificateBtn;
		
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[5]/div[3]/div[2]/input")
	WebElement exemptedRadioBtn;
	@FindBy(name="feesExemptionReason")
	WebElement exemptionReasonField;
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[6]/div[2]/table/tbody/tr[2]/td[2]/document-actions/button")
	WebElement addFeeExemptionDocumentbtn;
	@FindBy(xpath="/html/body/ngb-modal-window/div/div/ng-component/form/div[1]/div/div/div/div[1]/input")
	WebElement selectFeeExemptionDocumentbtn;
	@FindBy(xpath="/html/body/ngb-modal-window/div/div/ng-component/form/div[2]/button[1]")
	WebElement saveFeeExemptionDocumentbtn;
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[2]/div[2]/div[1]/external-requester-selector/div/div/div/div[1]/button")
	WebElement brotstoBeneficiaryTypeOfTheCertificate;
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[2]/div[2]/div[1]/external-requester-selector/div/div/div/div[1]/div/a[1]")
	WebElement brotstoBenfcNormalPerson;
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[3]/div[2]/div[1]/div/custom-ng-date/div/input")
	WebElement startCalenderTab;
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[3]/div[2]/div[1]/div/custom-ng-date/div/ngb-datepicker/div[1]/ngb-datepicker-navigation/ngb-datepicker-navigation-select/select[1]")
	WebElement sMonthTab;
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[3]/div[2]/div[1]/div/custom-ng-date/div/ngb-datepicker/div[2]/div/ngb-datepicker-month/div[2]/div[3]")
	WebElement firstDayInJan;
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[3]/div[2]/div[2]/div/custom-ng-date/div/input")
	WebElement endCalenderTab;
	@FindBy(css = "button.btn.btn-search")
	WebElement searchPersonBtn;
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[3]/div[2]/div[2]/div/custom-ng-date/div/ngb-datepicker/div[1]/ngb-datepicker-navigation/ngb-datepicker-navigation-select/select[1]")
	WebElement eMonthTab;
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[3]/div[2]/div[2]/div/custom-ng-date/div/ngb-datepicker/div[2]/div/ngb-datepicker-month/div[6]/div[5]")
	WebElement lastDayInJan;
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[4]/div[2]")
	WebElement extraContentElement;
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[6]/div[2]/table/tbody/tr[3]/td[2]/document-actions/button")
	WebElement validityOfTheAdditionalContent;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[4]/div[3]/div[2]/input")
	WebElement tGexemptedRadioBtn;
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[6]/button[5]")
	WebElement tGsubmitBtn1;
	@FindBy(xpath = "/html/body/div/div/div[6]/button[1]")
	WebElement tGsubmitBtn2;
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[3]/div[2]")
	WebElement  terroristGExtraContent;
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[5]/div[2]/table/tbody/tr[1]/td[2]/document-actions/button")
	WebElement tGaddTheCertificateOrder;
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[5]/div[2]/table/tbody/tr[2]/td[2]/document-actions/button")
	WebElement tGaddFeeExemptionDocumentbtn;
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[5]/div[2]/table/tbody/tr[3]/td[2]/document-actions/button")
	WebElement tGvalidityOfTheAdditionalContent;
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[6]/button[1]")
	WebElement  tGviewFeeReceiptBtn;
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/div[3]/div/div[1]/button")
	WebElement  tGissuingTheReceiptBtn;                                  ///////////////////
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[6]/button[3]")
	public static WebElement  tGdisplayTheCertificateBtn;                              ///////////////////
	@FindBy(name="plaintiffName")
	WebElement caseBy;
	@FindBy(xpath ="/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[4]/div[2]/div[1]/div/ng-select/div/div/div[2]")
	WebElement tDClassificationTableMajor;
	@FindBy(xpath ="/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[4]/div[2]/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[3]")
	WebElement tDClassificationMinorRentals;
	@FindBy(xpath ="/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[4]/div[2]/div[2]/div/ng-select/div/div/div[2]")
	WebElement tDCourtMajor;
	@FindBy(xpath ="/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[4]/div[2]/div[2]/div/ng-select/ng-dropdown-panel/div/div[2]/div[4]")
	WebElement tDCourtMinorSouthCairo;
	@FindBy(xpath ="/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[5]/div[2]/div[1]/div/custom-ng-date/div/input")
	WebElement dStartDate;
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[5]/div[2]/div[1]/div/custom-ng-date/div/ngb-datepicker/div[1]/ngb-datepicker-navigation/ngb-datepicker-navigation-select/select[1]")
	WebElement dSMonth;
	@FindBy(xpath ="/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[5]/div[2]/div[2]/div/custom-ng-date/div/input")
	WebElement dEndDate;
	@FindBy(xpath ="/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[5]/div[2]/div[1]/div/custom-ng-date/div/ngb-datepicker/div[2]/div/ngb-datepicker-month/div[2]/div[3]")
	WebElement dFDofJan;
	@FindBy(xpath ="/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[5]/div[2]/div[2]/div/custom-ng-date/div/ngb-datepicker/div[1]/ngb-datepicker-navigation/ngb-datepicker-navigation-select/select[1]")
	WebElement dEMonth;
	@FindBy(xpath ="/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[5]/div[2]/div[2]/div/custom-ng-date/div/ngb-datepicker/div[2]/div/ngb-datepicker-month/div[6]/div[5]")
	WebElement dLDofJan;
	@FindBy(xpath ="/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[6]/div[2]")
	WebElement dExtraContent;
	@FindBy(id ="yesFeesExemption")
	WebElement dYesFeesRadioBtn;
	@FindBy(xpath ="/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[8]/div[2]/table/tbody/tr[1]/td[2]/document-actions/button")
	WebElement dAddCetificateOrderDocumentBtn;
	@FindBy(xpath ="/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[8]/div[2]/table/tbody/tr[2]/td[2]/document-actions/button")
	WebElement dAddFeeExemptionDocumentBtn;
	@FindBy(xpath ="/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[8]/div[2]/table/tbody/tr[3]/td[2]/document-actions/button")
	WebElement dAddValidationDocumentBtn;
	@FindBy(xpath ="/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[9]/button[5]")
	WebElement dSubmitBtn;
	@FindBy(xpath ="/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[9]/button[1]")
	WebElement dViewFeeReceiptBtn;
	@FindBy(xpath ="/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[9]/button[3]")
	public static WebElement dDisplayTheCertificateBtn;
	@FindBy(xpath ="/html/body/ngb-modal-window/div/div/ng-component/div[3]/div/div[1]/button")
	WebElement dissuingTheReceiptBtn;
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[9]/button[3]")
	WebElement dDisplayCertificateBtn;
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[2]/div[2]/div/ng-select/div/div/div[2]")
	WebElement nPOfficialJudgeSchemaMajor;
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[2]/div[2]/div/ng-select/ng-dropdown-panel/div/div[2]/div")
	WebElement nPOfficialJudgeSchemaMinor;


	public void sessionCaseType(String serialCaseNum,String exemptionReason) throws InterruptedException
	{
		clickBtn(addBtn);
		fluentWait(certTypeMajorElement);
		selectFromDropDownNGList(certTypeMajorElement, certTypeMinorSessionsCases);
		clickBtn(caseSearchBtn);
		fluentWait(courtMajorElement);
		setTxt(caseSerialNumberField, serialCaseNum);
		selectFromDropDownNGList(yearField, yearMinor);
		selectFromDropDownNGList(classificationTableMajorElement, classificationTableMinorRentals);
		selectFromDropDownNGList(courtMajorElement,courtMinorSouthCairo);
		clickBtn(searchBtn);
		Thread.sleep(2000);
		selectFromDropDownNGList(BeneficiaryOfTheCertificateFromCaseMajorElement,BeneficiaryOfTheCertificateFromCaseMinorFirstPerson);
		fluentWait(exemptedRadioBtn);
		clickBtn(exemptedRadioBtn);
		setTxt(exemptionReasonField, exemptionReason);
		fluentWait(submitBtn1);
		clickBtn(submitBtn1);
		clickBtn(submitBtn2);
		Thread.sleep(4000);
		uploadPdf(addTheCertificateOrder, selectTheCertificateOrder, saveCertificateBtn);
		Thread.sleep(10000);
		uploadPdf(addFeeExemptionDocumentbtn, selectFeeExemptionDocumentbtn, saveFeeExemptionDocumentbtn);
		Thread.sleep(12000);
		clickBtn(viewFeeReceiptBtn);
		fluentWait(issuingTheReceiptBtn);
		clickBtn(issuingTheReceiptBtn);
		Thread.sleep(4000);
		clickBtn(displayTheCertificateBtn);
		Thread.sleep(9000);
	}
	public void constraintNonConstraintBrotesto(String benfcNormalPersonId,String start_end_Month ,String extraContent ,String exemptionReason) throws InterruptedException
	{

		clickBtn(addBtn);
		fluentWait(certTypeMajorElement);
		selectFromDropDownNGList(certTypeMajorElement, certTypeMinorBrotstoCase);
		addNormalPerson(brotstoBeneficiaryTypeOfTheCertificate, brotstoBenfcNormalPerson, nationalIdField, benfcNormalPersonId, searchPersonBtn,savePersonBtn);
		fluentWait(startCalenderTab);
		selectCalenderDate(startCalenderTab,sMonthTab,start_end_Month,firstDayInJan);
		fluentWait(endCalenderTab);
		selectCalenderDate(endCalenderTab, eMonthTab, start_end_Month, lastDayInJan);
		setTxtInAnotherWay(extraContentElement, extraContent);
		fluentWait(exemptedRadioBtn);
		clickBtn(exemptedRadioBtn);
		setTxt(exemptionReasonField, exemptionReason);
		fluentWait(submitBtn1);
		clickBtn(submitBtn1);
		clickBtn(submitBtn2);
		Thread.sleep(4000);
		//	fluentWait(addTheCertificateOrder, "clkInterceptedEx");    Didn't work in anyway !! , and deleted from the following ones , replaced by Thread.sleep .
		uploadPdf(addTheCertificateOrder, selectTheCertificateOrder, saveCertificateBtn);
		Thread.sleep(8000);
		uploadPdf(addFeeExemptionDocumentbtn, selectFeeExemptionDocumentbtn, saveFeeExemptionDocumentbtn);
		Thread.sleep(10000);
		uploadPdf(validityOfTheAdditionalContent, selectFeeExemptionDocumentbtn, saveFeeExemptionDocumentbtn);
		Thread.sleep(10000);
		clickBtn(viewFeeReceiptBtn);
		Thread.sleep(2000);
		clickBtn(issuingTheReceiptBtn);
		Thread.sleep(2000);
		clickBtn(displayTheCertificateBtn);
	}
	public void terroristGroups(String benfcNormalPersonId,String tGextraContent ,String exemptionReason) throws InterruptedException
	{
		clickBtn(addBtn);
		fluentWait(certTypeMajorElement);
		selectFromDropDownNGList(certTypeMajorElement,certTypeMinorTerroristGroups);
		addNormalPerson(brotstoBeneficiaryTypeOfTheCertificate, brotstoBenfcNormalPerson, nationalIdField, benfcNormalPersonId, searchPersonBtn,savePersonBtn);
		Thread.sleep(200);
		setTxtInAnotherWay(terroristGExtraContent, tGextraContent);
		Thread.sleep(500);
		clickBtn(tGexemptedRadioBtn);
		setTxt(exemptionReasonField, exemptionReason);
		fluentWait(tGsubmitBtn1);
		clickBtn(tGsubmitBtn1);
		clickBtn(tGsubmitBtn2);
		Thread.sleep(4000);
		uploadPdf(tGaddTheCertificateOrder, selectTheCertificateOrder, saveCertificateBtn);
		Thread.sleep(8000);
		uploadPdf(tGaddFeeExemptionDocumentbtn, selectFeeExemptionDocumentbtn, saveFeeExemptionDocumentbtn);
		Thread.sleep(8000);
		uploadPdf(tGvalidityOfTheAdditionalContent, selectFeeExemptionDocumentbtn, saveFeeExemptionDocumentbtn);
		Thread.sleep(9000);
		clickBtn(tGviewFeeReceiptBtn);
		fluentWait(tGissuingTheReceiptBtn);
		clickBtn(tGissuingTheReceiptBtn);
		Thread.sleep(4000);
		clickBtn(tGdisplayTheCertificateBtn);
	}
	public void caseDoesNotExist(String benfcNormalPersonId, String caseByWhome, String s_e_month , String extraContent , String exemptionReason) throws InterruptedException
	{
		clickBtn(addBtn);
		fluentWait(certTypeMajorElement);
		selectFromDropDownNGList(certTypeMajorElement,certTypeMinorNotExistedCase);
		addNormalPerson(brotstoBeneficiaryTypeOfTheCertificate, brotstoBenfcNormalPerson, nationalIdField, benfcNormalPersonId, searchPersonBtn,savePersonBtn);
		Thread.sleep(500);
		setTxtInAnotherWay(caseBy,caseByWhome);
		selectFromDropDownNGList(tDClassificationTableMajor, tDClassificationMinorRentals);
		selectFromDropDownNGList(tDCourtMajor, tDCourtMinorSouthCairo);
		selectCalenderDate(dStartDate, dSMonth, s_e_month, dFDofJan);
		selectCalenderDate(dEndDate, dEMonth, s_e_month, dLDofJan);
		setTxtInAnotherWay(dExtraContent, extraContent);
		clickBtn(dYesFeesRadioBtn);
		setTxtInAnotherWay(exemptionReasonField, exemptionReason);
		clickBtn(dSubmitBtn);
		clickBtn(submitBtn2);
		Thread.sleep(3000);
		uploadPdf(dAddCetificateOrderDocumentBtn, selectTheCertificateOrder, saveCertificateBtn);
		Thread.sleep(7500);
		uploadPdf(dAddFeeExemptionDocumentBtn, selectFeeExemptionDocumentbtn, saveFeeExemptionDocumentbtn);
		Thread.sleep(7500);
		uploadPdf(dAddValidationDocumentBtn, selectPermissionBtn, savePermissionBtn);
		Thread.sleep(7500);
		clickBtn(dViewFeeReceiptBtn);
		fluentWait(dissuingTheReceiptBtn);
		clickBtn(dissuingTheReceiptBtn);
		Thread.sleep(2000);
		clickBtn(dDisplayCertificateBtn);

	}
	public void appealCase(String serialCaseNum,String exemptionReason) throws InterruptedException
	{
		clickBtn(addBtn);
		fluentWait(certTypeMajorElement);
		selectFromDropDownNGList(certTypeMajorElement,certTypeMinorNoAppealNegative);
		clickBtn(caseSearchBtn);
		fluentWait(courtMajorElement);
		setTxt(caseSerialNumberField, serialCaseNum);
		selectFromDropDownNGList(yearField, yearMinor);
		selectFromDropDownNGList(classificationTableMajorElement, classificationTableMinorRentals);
		selectFromDropDownNGList(courtMajorElement,courtMinorSouthCairo);
		clickBtn(searchBtn);
		selectFromDropDownNGList(nPOfficialJudgeSchemaMajor, nPOfficialJudgeSchemaMinor);
		selectFromDropDownNGList(BeneficiaryOfTheCertificateFromCaseMajorElement,BeneficiaryOfTheCertificateFromCaseMinorFirstPerson);
		fluentWait(exemptedRadioBtn);
		clickBtn(exemptedRadioBtn);
		setTxt(exemptionReasonField, exemptionReason);
		fluentWait(submitBtn1);
		clickBtn(submitBtn1);
		clickBtn(submitBtn2);
		Thread.sleep(2000);
		uploadPdf(addTheCertificateOrder, selectTheCertificateOrder, saveCertificateBtn);
		Thread.sleep(7500);
		uploadPdf(addFeeExemptionDocumentbtn, selectFeeExemptionDocumentbtn, saveFeeExemptionDocumentbtn);
		Thread.sleep(7500);
		clickBtn(viewFeeReceiptBtn);
		fluentWait(issuingTheReceiptBtn);
		clickBtn(issuingTheReceiptBtn);
		Thread.sleep(2000);
		clickBtn(displayTheCertificateBtn);

		
		
	}


}
