package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class LoginPage extends TestBase {

	//Object Repossitory
	
	@FindBy(xpath = "//img[@alt='Kite']")private WebElement kiteLogo;        //Encapsulation = data (private) + method (public)        
	@FindBy(xpath = "//img[@alt='Zerodha']")private WebElement zerodhaLogo;
	@FindBy(xpath = "//input[@id='userid']")private WebElement UserIdTextBox;
	@FindBy(xpath = "//input[@id='password']")private WebElement PasswordTextBox;
	@FindBy(xpath = "//button[@type='submit']") private WebElement loginBtn;
	@FindBy(xpath = "//input[@id='pin']") private WebElement PinTextBox;
	@FindBy(xpath = "//button[@type='submit']") private WebElement continueBtn;
	
	
	
	
	public LoginPage()   // Constructor
	{
		PageFactory.initElements(driver, this);
	}
	
	//Methods 
	
	public String verifyTitle()
	{
		return driver.getTitle();
	}
	public boolean verifyKiteLogo()
	{
		return kiteLogo.isDisplayed();	
	}
	
	public boolean verifyZerodhaLogo()
	{
		return zerodhaLogo.isDisplayed();
	}	
	
	public void loginToApp() throws InterruptedException
	{
		UserIdTextBox.sendKeys("MIZ253");
		PasswordTextBox.sendKeys("Pass@6767");
		loginBtn.click();
		//Thread.sleep(2000);
		PinTextBox.sendKeys("203692");
		continueBtn.click();
		//Thread.sleep(2000);

	}
	
}

//Encapsulation = data (private) + method (public)










