package pages;

import java.time.Duration;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class PageBase 
{
	
	protected static WebDriver driver;
	private static String pdfPath=System.getProperty("user.dir")+"/Uploads/sample.pdf";
	private static Actions action;
	private static Wait<WebDriver> noSuchEleWait , eleClkIntercWait;
	
	
	public PageBase(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
		 action=new Actions(driver);
		 
		 noSuchEleWait=new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(60))
				 .pollingEvery(Duration.ofSeconds(2))
				 .ignoring(NoSuchElementException.class );
		 
		 eleClkIntercWait=new FluentWait<WebDriver>(driver)
				 .withTimeout(Duration.ofSeconds(60))
				 .pollingEvery(Duration.ofSeconds(2))
				 .ignoring(NoSuchElementException.class, ElementClickInterceptedException.class)
				 .ignoring(ElementClickInterceptedException.class);
		 
		 this.driver=driver;
		 
		 
		 
	}
	
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/app-header/div/div/ul[2]/li/div")
	static
	WebElement userAcc;
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/app-header/div/div/ul[2]/li/div/div/a[4]")
	static
	WebElement logOutBtn;
	
	protected static void clickBtn(WebElement button) 
	{
		button.click();
	}
	protected static void setTxt(WebElement txtField,String txt)
	{
		txtField.sendKeys(txt);
	}
	protected static void setTxtInAnotherWay(WebElement txtField,String txt) 
	{
		
		action.moveToElement(txtField).click().sendKeys(txt).build().perform();
		
	}
	protected static void selectFromDropdownList(WebElement calenderMonth,String month)
	{
		Select s=new Select(calenderMonth);
		s.selectByVisibleText(month);
	}
	protected static void uploadPdf(WebElement addElementBtn,WebElement selectFile,WebElement saveElementBtn)
	{
		addElementBtn.click();
		selectFile.sendKeys(pdfPath);
		saveElementBtn.click();
		
	}
	protected static void loginProcess(WebElement userNameField,String userName,WebElement passwordField,String password , WebElement loginBtn)
	{
		userNameField.sendKeys(userName);
		passwordField.sendKeys(password);
		loginBtn.click();
	}
	protected static void selectFromDropDownNGList(WebElement majorElement, WebElement minorElement)
	{
		majorElement.click();
		minorElement.click();
	}
	protected static void addNormalPerson(WebElement addType,WebElement addNormalPerson,WebElement idField,String id,WebElement searchBtn,WebElement saveBtn)
	{
		clickBtn(addType);
		clickBtn(addNormalPerson);
		setTxt(idField, id);
		clickBtn(searchBtn);
		clickBtn(saveBtn);
	}
	protected static void selectCalenderDate(WebElement calenderTab,WebElement monthTab,String month,WebElement dayElement) throws InterruptedException
	{
		clickBtn(calenderTab);
		
		fluentWait(monthTab);
		
		selectFromDropdownList(monthTab, month);
		clickBtn(dayElement);
	}
  /*public static void fluentWait(WebElement element , String expectedConditionsString) 
	{
		if(expectedConditionsString=="noSuchElementEx") 
		{
			noSuchEleWait.until(ExpectedConditions.visibilityOf(element));
		}else if (expectedConditionsString=="clkInterceptedEx")
		
		eleClkIntercWait.until(ExpectedConditions.elementToBeClickable(element));
			
		}else if(ex
		*/
	public static void fluentWait(WebElement element) 
	{
		
			noSuchEleWait.until(ExpectedConditions.visibilityOf(element));
		
	}
	protected static void escapeMove()
	{
		action.sendKeys(Keys.ESCAPE).perform();
	}
	
	protected static void getStepBack() 
	{
		driver.navigate().back();
	}
	
	protected static void navigateToSpecificURL(String url)
	{
		driver.navigate().to(url);
	}
	
	public static void loggedOut() throws InterruptedException
	{
		Thread.sleep(8000);
		escapeMove();
		fluentWait(userAcc);		
		clickBtn(userAcc);
		fluentWait(logOutBtn);
		clickBtn(logOutBtn);

	}
}
