package TestNGprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 
{
	
	WebDriver driver;
	 
	 @BeforeTest 
	public void Browser() 
	{
    System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Automation\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mobile.callistoitsolutions.com/");
	    String title =	driver.getTitle();
	    String url = driver.getCurrentUrl();
	    System.out.println(title);
	    System.out.println(url);
	    
		
	    
	}
	 
	 @AfterTest
		public void Closebrowser() throws InterruptedException 
		{
		  driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		  Thread.sleep(1000);
		  String value1= driver.findElement(By.id("txt_username")).getAttribute("id");
			String value2 = driver.findElement(By.id("txt_password")).getAttribute("id");
			String value3 =driver.findElement(By.id("lnk_login")).getAttribute("id");
		    System.out.println(value1);
			System.out.println(value2);
			System.out.println(value3);
		     Thread.sleep(1000);
		     
			driver.close();
		}
	 
	@Test
	public void Loginpage()
	{
		driver.findElement(By.xpath("//input[@id='txt_username']")).sendKeys("mobile");
		driver.findElement(By.xpath("//input[@id='txt_password']")).sendKeys("mobile");
		driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		
	
	}

}
