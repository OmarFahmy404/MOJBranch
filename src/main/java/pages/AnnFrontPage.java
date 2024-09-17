package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AnnFrontPage extends PageBase
{

	public AnnFrontPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/div/div[2]/table-server/div[2]/div[2]/div/button[1]")
	WebElement creatAnnBtn;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[2]/div[2]/div[1]/div/ng-select/div/div/div[2]")
	WebElement annTypeMajor;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[2]/div[2]/div[1]/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement annTypeMinor;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[3]/div[1]/div/button[1]")
	WebElement addFromInsideTheCaseBtn;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/form/div[1]/div/div/div/ng-select/div")
	WebElement selectOpponentMajor;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/form/div[1]/div/div/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement firstPersonMinor;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/form/div[2]/button[1]")
	WebElement submitBtn;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-senderpersonpopup/form[2]/div[1]/div[4]/div[2]/div[1]/div[1]/div/button")
	WebElement sameAddressAnnBtn;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-senderpersonpopup/form[2]/div[1]/div[4]/div[2]/div[5]/div/ng-select/div/div/div[2]")
	WebElement penMajor;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-senderpersonpopup/form[2]/div[1]/div[4]/div[2]/div[5]/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement penMinor;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-senderpersonpopup/form[2]/div[2]/button[1]")
	WebElement submitPersonBtn;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[4]/div[1]/div/button[2]")
	WebElement addFromOutsideTheCaseBtn;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[4]/div[1]/div/div/a[1]")
	WebElement normalPerson;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-recieverpersonpopup/form[1]/div/div/div[1]/div/div/div[1]/a/i")
	WebElement officialPaperYes;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-recieverpersonpopup/form[1]/div/div/div[2]/div/div[1]/input")
	WebElement nationlIdField;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-recieverpersonpopup/form[1]/div/div/div[2]/div/div[1]/div[2]/button")
	WebElement searchBtn;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-recieverpersonpopup/form[2]/div[1]/div[4]/div[2]/div[1]/div[1]/div/button")
	WebElement sameAddressAnnBtn2;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-recieverpersonpopup/form[2]/div[1]/div[4]/div[2]/div[6]/div/ng-select/div/div/div[2]")
	WebElement penMajor2;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-recieverpersonpopup/form[2]/div[1]/div[4]/div[2]/div[6]/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	WebElement penMinor2;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/app-recieverpersonpopup/form[2]/div[2]/button[1]")
	WebElement submitPersonBtn2;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[5]/button[2]")
	WebElement saveAnnBtn;
	
	
	public void addDataInAnnouncement(String strangerNationalId)
	{
		fluentWait(creatAnnBtn);
		clickBtn(creatAnnBtn);
	
		fluentWait(addFromInsideTheCaseBtn);
		selectFromDropDownNGList(annTypeMajor, annTypeMinor);
		
		clickBtn(addFromInsideTheCaseBtn);
		selectFromDropDownNGList(selectOpponentMajor, firstPersonMinor);
		clickBtn(submitBtn);
		clickBtn(sameAddressAnnBtn);
		selectFromDropDownNGList(penMajor, penMinor);
		clickBtn(submitPersonBtn);
		
		clickBtn(addFromOutsideTheCaseBtn);
		clickBtn(normalPerson);
		clickBtn(officialPaperYes);
		
		setTxt(nationlIdField, strangerNationalId);
		clickBtn(searchBtn);
		clickBtn(sameAddressAnnBtn2);
		selectFromDropDownNGList(penMajor2, penMinor2);
		clickBtn(submitPersonBtn2);
		
		clickBtn(saveAnnBtn);
		
	}
	

}
