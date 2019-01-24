package pacakage1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestFirefoxGrid {
	
	@Test
	
	public void test1() throws MalformedURLException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Chanchal\\chromedriver.exe");
		
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setAcceptInsecureCerts(true);
		cap.setPlatform(Platform.WINDOWS);
		
		
		ChromeOptions options =new ChromeOptions();
		
		WebDriver driver=new ChromeDriver(options);
		
		URL url=new URL("http://localhost:4444/wd/hub");
	    driver=new RemoteWebDriver(url, cap);
		
		driver.get("http://www.google.com");
		
		System.out.println("Title is "+driver.getTitle());
		driver.quit();
		
	}
	
	
	
	

}
