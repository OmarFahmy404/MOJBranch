package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.google.common.collect.Table;

public class TreasuryPage extends PageBase
{

	public static WebDriver driver;
	
	
	public TreasuryPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/app-menu/div/div[2]/ul/li[1]/a")
	static
	WebElement invoiceList;
	
	@FindBy(name = "tempFilingNumber")
	static
	WebElement tempFilingNumberField;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/div/div[1]/div/form/div[2]/div/button")
	static
	WebElement searchBtn;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/div/div[1]/div/form/div[1]/div[1]/ng-select/div/div/div[2]")
	static
	WebElement reciptTypeMajor;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/div/div[1]/div/form/div[1]/div[1]/ng-select/ng-dropdown-panel/div/div[2]/div[20]")
	static
	WebElement reciptTypeOfficialCopyMinor;
	
	@FindBy(css = "button.btn.btn-sm.btn-grey-gallery-outline")
	static
	WebElement showReciptBtn;
	
	@FindBy(name = "paymentOption")
	static
	WebElement paymentOptionMajor;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/div[2]/div/form/div/div[2]/div/div/ng-select/ng-dropdown-panel/div/div[2]/div[1]")
	static
	WebElement paymentOptionMinor;
	
	@FindBy(name = "manualReceiptNumber")
	static
	WebElement manualReceiptNumberField;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/div[2]/div/form/div/div[2]/div/div/button")
	static
	WebElement successPayBtn;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/div[3]/button[2]")
	static
	WebElement closeBtn;
	
	@FindBy(xpath = "/html/body/div/div/div[6]/button[1]")
	static
	WebElement confirmBtn;
	
	
	 //WebElement table=driver.findElement(By.xpath("/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/div/div[2]/div/div/table-server/div[2]/div/table"));
	/*static List<WebElement> rows=table.findElements(By.className("tr"));
	static List<WebElement> cols=table.findElements(By.className("td"));*/
			
	
	/*@FindBy(tagName = "tr")
	static
	List<WebElement> rows;
	
	@FindBy(tagName = "td")
	static
	List<WebElement> cols;*/
	
	
	
	public static void completeThePaymentProcess(String tempNumber, String manualReciptNo) throws InterruptedException
	{
		LoginPage.loginData("treasury", "Admin123!");
		fluentWait(invoiceList);
		clickBtn(invoiceList);
		Thread.sleep(2000);
		//selectFromDropDownNGList(reciptTypeMajor, reciptTypeOfficialCopyMinor);
		setTxtInAnotherWay(tempFilingNumberField, tempNumber);
		fluentWait(searchBtn);
		clickBtn(searchBtn);
		Thread.sleep(500);
		
		clickOnDisplayButton();
		
		fluentWait(paymentOptionMajor);
		selectFromDropDownNGList(paymentOptionMajor, paymentOptionMinor);
		setTxtInAnotherWay(manualReceiptNumberField, manualReciptNo);
		clickBtn(successPayBtn);
		clickBtn(confirmBtn);
		Thread.sleep(1500);
		clickBtn(closeBtn);
	}
	
	
	public static void clickOnDisplayButton() throws InterruptedException
	{
		 WebElement table=driver.findElement(By.xpath("/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/div/div[2]/div/div/table-server/div[2]/div/table"));
		 WebElement row =table.findElement(By.xpath("/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/div/div[2]/div/div/table-server/div[2]/div/table/tbody/tr"));
		 WebElement button=row.findElement(By.xpath("/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/div/div[2]/div/div/table-server/div[2]/div/table/tbody/tr/td[2]/button"));
		Thread.sleep(2000);
		 clickBtn(button);
	}
	

}
