package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class NewClass {
	static WebDriver d;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		d=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "D:\\Chanchal\\chromedriver.exe");
		
		d.get("http://expressions-staging.streammarket.co.uk/webpos/");
		d.manage().window().maximize();
		
		
		d.findElement(By.id("username")).sendKeys("chanchal");
		d.findElement(By.id("pwd")).sendKeys("Welcome!1");
		d.findElement(By.xpath("//*[@id=\"webpos-login\"]/div[2]/button")).click();
		
		Thread.sleep(3000);
	
//********************Continue to Sign in **********************************
		
			WebElement e=	d.findElement(By.xpath("//*[@id=\"maincontent\"]/div/div/div/div/div[2]/div/div[2]/button[1]"));

			if(e.isEnabled())
			{
				e.click();
			}
			else
			{
				System.out.println("Element not found");
			}
			
			Thread.sleep(3000);
			
//********************Select location & Store **********************************
				
			WebElement e1=	d.findElement(By.xpath("//*[@id=\"location\"]"));		//location
			if(e1.isEnabled())
			{
				e1.click();
				Select oselect=new Select(e1);
				
				oselect.selectByValue("2");
			}
			else
			{
				System.out.println("Element not found");
			}
		
			Thread.sleep(3000);
			WebElement e2=	d.findElement(By.xpath("//*[@id=\"pos\"]"));		//store
			if(e2.isEnabled())
			{
				e2.click();
				
				Select oselect1=new Select(e2);
				
				oselect1.selectByValue("2");
			}
			else
			{
				System.out.println("Element not found");
			}
		
			
			d.findElement(By.xpath("//*[@id=\"webpos-location\"]/div[2]/button")).click(); //button click to submit
			Thread.sleep(10000);

//********************Select Product & Cart **********************************
			
			
	
	}

}