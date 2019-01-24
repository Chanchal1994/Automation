package BasePackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

	public static WebDriver driver = null;
	String url = "http://expressions-staging.streammarket.co.uk/webpos/";
	String path = "D:\\Chanchal\\chromedriver.exe";
	
	  
	  @BeforeSuite public void startdriver() 
	  {
	  System.setProperty("webdriver.chrome.driver", "path");
	  
	  driver = new ChromeDriver(); driver.get(url);
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	  }
	  
	  
	  @AfterTest public void tearDown() throws Exception { 
		  driver.quit();
	  
	  }
	 
}
