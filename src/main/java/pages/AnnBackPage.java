package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AnnBackPage extends PageBase
{

	public AnnBackPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/div/div[2]/table-server/div[2]/div[1]/div/table/tbody/tr/td[2]/button")
	WebElement completeAnnDataBtn;

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[4]/div[2]/div/div/table/tbody/tr/td[2]/document-actions/button")
	WebElement annDocBtn;

	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/form/div[1]/div/div/div/div[1]/input")
	WebElement selectDocBtn;

	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/ng-component/form/div[2]/button[1]")
	WebElement saveFileBtn;

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[5]/button[2]")
	public static
	WebElement submitBtn;

	@FindBy(xpath = "/html/body/div/div/div[6]/button[1]")
	public static
	WebElement confirmBtn ;

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[1]/div[6]")
	public static WebElement statusTxt;

	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/div/div[2]/ng-component/div[2]/form/div[1]/div[3]")
	public static
	WebElement annSerialNum;
	

	
	public void finishAnnProcess() throws InterruptedException
	{
		fluentWait(completeAnnDataBtn);
		clickBtn(completeAnnDataBtn);
		Thread.sleep(2000);
		fluentWait(annDocBtn);
		uploadPdf(annDocBtn, selectDocBtn, saveFileBtn);
		Thread.sleep(9000);
		clickBtn(submitBtn);
		fluentWait(confirmBtn);
		clickBtn(confirmBtn);
	
	}
	
	public String getAnnSerialNum() throws InterruptedException 
	{
		Thread.sleep(9000);
		String annNum=annSerialNum.getText();
		String[] firstPart=annNum.split(":");
		String[] secondPart=annNum.split("/");
	
		return secondPart[0];
	}

	
}
