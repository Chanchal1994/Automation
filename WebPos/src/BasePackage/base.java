package BasePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		String url = "http://expressions-staging.streammarket.co.uk/webpos/";
		String path = "D:\\Chanchal\\chromedriver.exe";
		
		
	public void startDriver()
	{
		System.setProperty("webdriver.chrome.driver", "path");
		  
		  driver = new ChromeDriver(); driver.get(url);
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	}

}
