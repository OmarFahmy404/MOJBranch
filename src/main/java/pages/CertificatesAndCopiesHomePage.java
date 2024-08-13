package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CertificatesAndCopiesHomePage extends PageBase
{

	public CertificatesAndCopiesHomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/app-menu/div/div[2]/ul/li[1]/a")
	public static WebElement certificateTab;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/app-menu/div/div[2]/ul/li[2]/a")
	public static WebElement copyTab;
	
	@FindBy(xpath = "/html/body/app-root/block-ui/div/inner-container/main/app-menu/div/div[2]/ul/li[3]/a")
	public static WebElement executiveFormulaCopyTab;
	
	public void getIntoCertifitcateSection() 
	{
		clickBtn(certificateTab);
	}
	
	public void getIntoCopySection() 
	{
		clickBtn(copyTab);
	}
	
	public void getIntoexecutiveFormulaCopyTab() 
	{
		clickBtn(executiveFormulaCopyTab);
	}
	

}
