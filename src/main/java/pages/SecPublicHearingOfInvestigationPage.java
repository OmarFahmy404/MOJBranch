package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecPublicHearingOfInvestigationPage extends PageBase
{

	public SecPublicHearingOfInvestigationPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/hearing-cases/div[2]/div[3]/div[2]/table-client/div[2]/div/div/div[2]/button[3]")
	WebElement openInvestBtn;

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/hearing-cases/div[2]/div[3]/div[2]/table-client/div[2]/div/div/div[2]/button[1]")
	WebElement investReportBtn;

	@FindBy(xpath = "(//button[@class='summary::before'])[1]")
	WebElement insideCasePlusBtn;

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/div/app-attendees-witnesses/div/ngb-accordion/div[1]/div[2]/div/attendees-case-litigants/div/div/ul/li/details/ul/li/div/div/div/table/tbody[1]/tr[1]/td[3]/span/div[2]/input")
	WebElement personalAndReferToHimFPRadioBtn;

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/div/app-attendees-witnesses/div/ngb-accordion/div[1]/div[2]/div/attendees-case-litigants/div/div/ul/li/details/ul/li/div/div/div/table/tbody[1]/tr[1]/td[5]/div/button")
	WebElement fPSaveBtn;

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/div/app-attendees-witnesses/div/ngb-accordion/div[1]/div[2]/div/attendees-case-litigants/div/div/ul/li/details/ul/li/div/div/div/table/tbody[1]/tr[1]/td[2]/input")
	WebElement fPCheckboxBtn;

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/div/app-attendees-witnesses/div/ngb-accordion/div[1]/div[2]/div/div/button[2]")
	WebElement addAgentBtn;

	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/form/div[1]/div/div/ng-select/div/div/div[2]")
	WebElement agentTypeMajor;

	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/form/div[1]/div/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement agentTypeLawersMinor;

	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/form/div[1]/div/div[3]/div/div[2]/div/div/div/div/ng-select/div/div/div[2]")
	WebElement agentDetialsMajor;

	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/form/div[1]/div/div[3]/div/div[2]/div/div/div/div/ng-select/ng-dropdown-panel/div/div[2]/div")
	WebElement agentDetialsMinor;

	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/form/div[1]/div/div[4]/div/div[2]/div/app-lawyer-data/div/div/div/div[2]/div/ng-select/div/div/div[2]")
	WebElement prevouisProvedMajor;

	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/form/div[1]/div/div[4]/div/div[2]/div/app-lawyer-data/div/div/div/div[2]/div/ng-select/ng-dropdown-panel/div/div[2]/div")
	WebElement prevouisProvedMinor;

	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/form/div[2]/button[1]")
	WebElement agentSaveBtn1;

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/div/app-attendees-witnesses/div/ngb-accordion/div[1]/div[2]/div/attendees-case-litigants/div/div/ul/li/details/ul/li/div/div/div/table/tbody[2]/tr[1]/td[3]/span/div[3]/input")
	WebElement personalAndWithHimSPRadioBtn;

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/div/app-attendees-witnesses/div/ngb-accordion/div[1]/div[2]/div/attendees-case-litigants/div/div/ul/li/details/ul/li/div/div/div/table/tbody[2]/tr[1]/td[5]/div/button")
	WebElement sPSaveBtn;

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/div/app-attendees-witnesses/div/ngb-accordion/div[1]/div[2]/div/attendees-case-litigants/div/div/ul/li/details/ul/li/div/div/div/table/tbody[2]/tr[1]/td[2]/input")
	WebElement sPCheckboxBtn;

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/div/app-attendees-witnesses/div/ngb-accordion/div[1]/div[2]/div/div/button[1]")
	WebElement lawyerWithoutPowerOfAttorneyBtn;

	@FindBy(name = "nationalId")
	WebElement nationalIdField;

	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/form/div[1]/div/div/div/div[2]/div/app-lawyer-data/div/div/div/div/div/div[1]/form/div/div/div[1]/div[2]/div/button")
	WebElement searchIdBtn;

	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/form/div[2]/button[1]")
	WebElement saveLWPOABtn;

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/div/app-attendees-witnesses/div/ngb-accordion/div[1]/div[2]/div/attendees-out-case/div/ul/li/details/summary/div/div[1]/button")
	WebElement addFromOutSideCaseBtn;

	@FindBy(name = "nationalId")
	WebElement outSideNationalIdField;

	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/form[1]/div/div/div/div/div/button")
	WebElement outSideIdSearchBtn;

	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/form[2]/div[1]/div[2]/div[2]/div[1]/div/ng-select/div/div/div[2]")
	WebElement adjustMajor;

	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/form[2]/div[1]/div[2]/div[2]/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[2]")
	WebElement adjustMinor;

	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/form[2]/div[1]/div[2]/div[2]/div[2]/div/ng-select/div/div/div[2]")
	WebElement audianceMajor;

	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/form[2]/div[1]/div[2]/div[2]/div[2]/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement audianceMinor;

	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/form[2]/div[2]/button[1]")
	WebElement saveOutSidePersonBtn;
	
	@FindBy(xpath = "(//button[@class='summary::before'])[2]")
	WebElement audianceFromOutSidePlusBtn;

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/div/app-attendees-witnesses/div/ngb-accordion/div[2]/div/button")
	WebElement audianceDataBtn;

	@FindBy(css = "a.open-details")
	WebElement witnessesBtn;

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/div/app-attendees-witnesses/div/ngb-accordion/div[2]/div[2]/div/attendees-details/div/table/tbody/tr[2]/td/div[7]/div/attendees-witnesses/div[1]/button")
	WebElement addWitnessBtn;

	@FindBy(name = "nationalId")
	WebElement witnessnationalIdField;

	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/form[1]/div/div/div/div/div[2]/button")
	WebElement witnessSearchIdBtn;

	@FindBy(name = "age")
	WebElement witnessAgeField;
	
	@FindBy(name = "career")
	WebElement witnessCareerField;

	@FindBy(id = "witnessProof")
	WebElement witnessProofRadioBtn;

	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/form[2]/div[2]/button[1]")
	WebElement saveWitnessBtn;

	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/form[2]/div[1]/div[4]/div[2]/div/div[1]/div/div/a")
	WebElement witnessQBtn;

	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/form[2]/div[1]/div[4]/div[2]/div/div[2]/div/ckeditor/div[2]/div[2]/div")
	WebElement witnessQField;

	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/form[2]/div[1]/div[4]/div[2]/div/div[2]/div/button")
	WebElement witnessSaveQBtn;

	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/form[2]/div[2]/button[2]")
	WebElement witnessCloseBtn;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/div/app-attendees-witnesses/div/ngb-accordion/div[2]/div[2]/div/attendees-details/div/table/tbody/tr[2]/td/div[7]/div/attendees-witnesses/div[2]/div/div/table/tbody/tr/td[5]/div/button[3]")
	WebElement closeWitnessQBtn;

	
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/div/div/div/button[3]")
	WebElement investigationDecisionsBtn;

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/div/investigation-decision/div/form/div[2]/ng-select/div/div/div[2]/input")
	WebElement hearingDateMajor;

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/div/investigation-decision/div/form/div[2]/ng-select/ng-dropdown-panel/div/div[2]/div[35]")
	WebElement hearingDateMinor;

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/div/investigation-decision/div/form/div[4]/div[2]/button[2]")
	WebElement decisionSaveBtn;

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[1]/button[2]")
	WebElement caseCloseBtn;

	@FindBy(xpath = "/html/body/div/div/div[6]/button[1]")
	WebElement confirmofCloseCaseBtn;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[1]/button[3]")
	WebElement admitTheCaseBtn;

	@FindBy(xpath = "/html/body/div/div/div[6]/button[1]")
	WebElement confirmOfAdmitCaseBtn;

	//WebElement witnessBtn=locatElementInTable("table.bg-transparent.table-bordered", 1, 9);
	
	public void compeletInvestigationHearingProcess(String caseId) throws InterruptedException
	{
		
		getInSpecialCase(caseId);
		Thread.sleep(79000);
		clickBtn(openInvestBtn);
		fluentWait(investReportBtn);
		clickBtn(investReportBtn);
		
		fluentWait(insideCasePlusBtn);
		clickBtn(insideCasePlusBtn);
		clickBtn(personalAndReferToHimFPRadioBtn);
		clickBtn(fPSaveBtn);
		clickBtn(fPCheckboxBtn);
		clickBtn(addAgentBtn);
		
		fluentWait(agentTypeMajor);
		selectFromDropDownNGList(agentTypeMajor, agentTypeLawersMinor);
		fluentWait(agentDetialsMajor);
		selectFromDropDownNGList(agentDetialsMajor, agentDetialsMinor);
		fluentWait(prevouisProvedMajor);
		selectFromDropDownNGList(prevouisProvedMajor, prevouisProvedMinor);
		clickBtn(agentSaveBtn1);
		clickBtn(fPCheckboxBtn);
		
		clickBtn(personalAndWithHimSPRadioBtn);
		clickBtn(sPSaveBtn);
		clickBtn(sPCheckboxBtn);
		clickBtn(lawyerWithoutPowerOfAttorneyBtn);
		fluentWait(nationalIdField);
		setTxt(nationalIdField, "28411111111111");
		clickBtn(searchIdBtn);
		fluentWait(saveLWPOABtn);
		clickBtn(saveLWPOABtn);
		clickBtn(sPCheckboxBtn);
		
		clickBtn(addFromOutSideCaseBtn);
		fluentWait(outSideNationalIdField);
		setTxt(outSideNationalIdField, "27411111111111");
		clickBtn(outSideIdSearchBtn);
		fluentWait(audianceMajor);
		selectFromDropDownNGList(adjustMajor, adjustMinor);
		selectFromDropDownNGList(audianceMajor, audianceMinor);
		clickBtn(saveOutSidePersonBtn);
		
		clickBtn(audianceDataBtn);
		/*fluentWait(witnessBtn);
		clickBtn(witnessBtn);*/
		clickBtn(addWitnessBtn);
		fluentWait(witnessnationalIdField);
		setTxt(witnessnationalIdField, "29411111111111");
		setTxt(witnessAgeField, "5");
		setTxt(witnessCareerField, "شاهد");
		clickBtn(witnessProofRadioBtn);
		clickBtn(saveWitnessBtn);
		fluentWait(witnessQBtn);
		clickBtn(witnessQBtn);
		setTxt(witnessQField,"هل حدث؟");
		fluentWait(witnessSaveQBtn);
		clickBtn(witnessSaveQBtn);
		clickBtn(witnessCloseBtn);
		fluentWait(closeWitnessQBtn);
		clickBtn(closeWitnessQBtn);
		
		clickBtn(investigationDecisionsBtn);
		fluentWait(hearingDateMajor);
		selectFromDropDownNGList(hearingDateMajor, hearingDateMinor);
		clickBtn(decisionSaveBtn);
		
		clickBtn(caseCloseBtn);
		fluentWait(confirmofCloseCaseBtn);
		clickBtn(confirmofCloseCaseBtn);
		fluentWait(admitTheCaseBtn);
		clickBtn(admitTheCaseBtn);
		fluentWait(confirmOfAdmitCaseBtn);
		clickBtn(confirmOfAdmitCaseBtn);
				
	}
	
	

}
