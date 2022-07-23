package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;
import net.bytebuddy.agent.builder.AgentBuilder.FallbackStrategy;

public class LoginPageTest extends TestBase {
	
	LoginPage login;
	@BeforeMethod
	public void setup() throws IOException
	{
		initalization();
	    login = new LoginPage();
	}

	@Test (enabled = false)
	public void verifyTitleTest()
	{
		String title = login.verifyTitle();
		Assert.assertEquals("Kite - Zerodha's fast and elegant flagship trading platform",title );
	}
	
	@Test  (enabled = false)
     public void verifyKiteLogoTest()
     {
		boolean value = login.verifyKiteLogo(); 
		Assert.assertEquals(value, true);
     }
	
	@Test (enabled = false)
	public void verifyZerodhaLogoTest()  
	{
		boolean value = login.verifyZerodhaLogo();
		Assert.assertEquals(value, true);
	}
	
	@Test
	public void loginToAppTest() throws InterruptedException
	{
		login.loginToApp();
	}
	 
	@AfterMethod
	public void exit()
	{
		driver.close();
	}
	

}
