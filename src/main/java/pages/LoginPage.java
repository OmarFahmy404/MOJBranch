package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase
{

	public LoginPage(WebDriver driver) {
		super(driver);
		}

	@FindBy(id="Username")
	public static WebElement userNameField;
	@FindBy(id="Password")
	static WebElement passwordField;
	@FindBy(css = "button.btn-first.btn.btn-lg.btn-block")
	static WebElement loginBtn;
	
	public static void loginData(String userName,String password) 
	{
		loginProcess(userNameField,userName, passwordField, password, loginBtn);
	}

}
