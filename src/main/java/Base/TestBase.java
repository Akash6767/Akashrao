package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	
	public String readPropertyFile(String value) throws IOException //url
	{
		Properties pro = new Properties();
        FileInputStream file = new FileInputStream("C:\\Users\\Akash\\eclipse-workspace12\\26FebFrame\\src\\main\\java\\Config\\Config.properties");
		pro.load(file);
	
		return pro.getProperty(value); //url
	}
	
	
	public void initalization() throws IOException
	{
	   System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    // driver.get("https://kite.zerodha.com/");
	   driver.get(readPropertyFile("url"));
	}
	

}
