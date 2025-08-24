package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;



public class PageBase {

	protected static WebDriver driver;
	private static String pdfPath = System.getProperty("user.dir") + "/Uploads/sample.pdf";
	private static Actions action;
	private static Wait<WebDriver> noSuchEleWait, eleClkIntercWait;

	public PageBase(WebDriver driver) {
		PageFactory.initElements(driver, this);

		action = new Actions(driver);

		noSuchEleWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);

		eleClkIntercWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(60))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class, ElementClickInterceptedException.class)
				.ignoring(ElementClickInterceptedException.class);

		this.driver = driver;

	}

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/app-header/div/div/ul[2]/li/div")
	static WebElement userAcc;
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/app-header/div/div/ul[2]/li/div/div/a[4]")
	static WebElement logOutBtn;
	
	@FindBy(xpath ="/html/body/ngb-modal-window/div/div/ng-component/form/div[1]/div/div/div/div[1]/input")
	static WebElement selectDocBtn ;
	
	@FindBy(xpath ="/html/body/ngb-modal-window/div/div/ng-component/form/div[2]/button[1]")
	static WebElement saveFileBtn ;
	
	@FindBy(name = "nationalId")
	static WebElement idField ;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/form[1]/div/div/div/div[1]/div[2]/button")
	static WebElement searchBtn ;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/form[2]/div[1]/div[4]/div[2]/div[1]/div/div/button")
	static WebElement sameResidenceAddressBtn ;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/form[2]/div[1]/div[4]/div[2]/div[6]/div/ng-select/div/div/div[2]")
	static WebElement  penMajor;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/form[2]/div[1]/div[4]/div[2]/div[6]/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	static WebElement  penMinor;
	
	@FindBy(id = "inPerson")
	static WebElement withHimSelfCheckBox ;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/form[2]/div[2]/button[1]")
	static WebElement saveBtn;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/form[1]/div/div/div[1]/div/div/div[1]/a/i")
	static WebElement yesBtn;

	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/form[1]/div/div/div[2]/div/div[1]/div[2]/button")
	static WebElement defSearchBtn ;
	
	@FindBy(name="caseSerialNumber")
	static WebElement serialNoSearchFiled;
	
	@FindBy(name = "classificationId")
	static WebElement  classificationIdField; 
	
	@FindBy(css = "button.btn.btn-block.btn-search-outline")
	static WebElement caseSearchBtn;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/div/div[1]/div/form/div[1]/div[4]/ng-select/ng-dropdown-panel/div/div[2]/div")
	static WebElement selectItem;
	
	
	
	
	protected static void clickBtn(WebElement button) {
		button.click();
	}

	protected static void setTxt(WebElement txtField, String txt) {
		txtField.sendKeys(txt);
	}

	protected static void setTxtInAnotherWay(WebElement txtField, String txt) {

		action.moveToElement(txtField).click().sendKeys(txt).build().perform();

	}

	protected static void selectFromDropdownList(WebElement calenderMonth, String month) {
		Select s = new Select(calenderMonth);
		s.selectByVisibleText(month);
	}

	protected static void uploadPdf(WebElement addElementBtn) {
		clickBtn(addElementBtn);
		selectDocBtn.sendKeys(pdfPath);
		fluentWait(saveFileBtn);
		saveFileBtn.click();

	}


	protected static void loginProcess
	(WebElement userNameField, String userName, WebElement passwordField,String password, WebElement loginBtn) 
	{

		fluentWait(loginBtn);
		setTxt(userNameField, userName);
		setTxt(passwordField, password);
		clickBtn(loginBtn);
	}

	protected static void selectFromDropDownNGList(WebElement majorElement, WebElement minorElement) {
		majorElement.click();
		minorElement.click();
	}

	protected static void addNormalPerson(WebElement addType, WebElement addNormalPerson, WebElement idField, String id,
			WebElement searchBtn, WebElement saveBtn) {
		clickBtn(addType);
		clickBtn(addNormalPerson);
		setTxt(idField, id);
		clickBtn(searchBtn);
		clickBtn(saveBtn);
	}
	

	protected static void addNormalDefendantPersonWithFullData
	(WebElement addType, WebElement addNormalPerson, String id)
	{
		clickBtn(addType);
		clickBtn(addNormalPerson);
		clickBtn(yesBtn);
		setTxt(idField, id);
		clickBtn(defSearchBtn);
		clickBtn(sameResidenceAddressBtn);
		selectFromDropDownNGList(penMajor, penMinor);
		clickBtn(withHimSelfCheckBox);
		clickBtn(saveBtn);
	}
	
	
	protected static void addNormalPerson(WebElement addType, WebElement idField, String id,
			WebElement searchBtn, WebElement saveBtn) throws InterruptedException {
		clickBtn(addType);
		setTxt(idField, id);
		clickBtn(searchBtn);
		Thread.sleep(1000);
		clickBtn(saveBtn);	
		
	}
	
	
	protected static void addNormalPersonWithFullData
	(WebElement addType, WebElement addNormalPerson, String id) 
	{
		clickBtn(addType);
		clickBtn(addNormalPerson);
		setTxt(idField, id);
		clickBtn(searchBtn);
		clickBtn(sameResidenceAddressBtn);
		selectFromDropDownNGList(penMajor, penMinor);
		clickBtn(withHimSelfCheckBox);
		clickBtn(saveBtn);
	}
	
	
	
	protected static void caseSearch(String caseNo , String caseClassification) throws InterruptedException
	{
		fluentWait(caseSearchBtn);
		setTxt(serialNoSearchFiled, caseNo);
		setTxtInAnotherWay(classificationIdField, caseClassification);
		clickBtn(selectItem);
		clickBtn(caseSearchBtn);
	}
	
	
	
	
	
	
	
	
	
	

	protected static void selectCalenderDate(WebElement calenderTab, WebElement monthTab, String month,
			WebElement dayElement) throws InterruptedException {
		clickBtn(calenderTab);

		fluentWait(monthTab);

		selectFromDropdownList(monthTab, month);
		clickBtn(dayElement);
	}


	public static void fluentWait(WebElement element) {

		noSuchEleWait.until(ExpectedConditions.visibilityOf(element));

	}

	protected static void escapeMove() {
		action.sendKeys(Keys.ESCAPE).perform();
	}

	protected static void getStepBack() {
		driver.navigate().back();
	}

	protected static void navigateToSpecificURL(String url) {
		driver.navigate().to(url);
	}

	protected static void getInSpecialCase(String caseId) {
		navigateToSpecificURL("http://10.0.10.58:9091/#/hearings/cases/" + caseId);
	}

	protected static WebElement locatElementInTable(String tableClass, int row, int col) {
		return driver
				.findElement(By.xpath("//table[@class='" + tableClass + "']/tbody/tr[" + row + "]/td[" + col + "]"));

	}

	public static void loggedOut() throws InterruptedException {
		Thread.sleep(4000);
		escapeMove();
		fluentWait(userAcc);
		clickBtn(userAcc);
		fluentWait(logOutBtn);
		clickBtn(logOutBtn);

	}
}
