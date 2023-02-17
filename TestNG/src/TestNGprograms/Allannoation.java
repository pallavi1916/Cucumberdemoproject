package TestNGprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Allannoation 

{
	WebDriver driver;
	@BeforeTest 
	
	public void Openbrowser()
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Automation\\chrome driver\\chromedriver_win32\\chromedriver.exe");
			
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			System.out.println("Before Test");
	}
	
	@AfterTest
	
	public void Closebrowser()
	{
		driver.close();
		System.out.println("After Test");
	}
	
	@BeforeClass
	public void enterurl()
	{
		driver.get("https://mobile.callistoitsolutions.com/");
		System.out.println("Before class");
	    
	}
	@AfterClass
	public void Browserurltitle() throws InterruptedException
	{
		String value1= driver.findElement(By.id("txt_username")).getAttribute("id");
		String value2 = driver.findElement(By.id("txt_password")).getAttribute("id");
		String value3 =driver.findElement(By.id("lnk_login")).getAttribute("id");
	    System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	     Thread.sleep(1000);
	     System.out.println("after class");
	    
	}
	
	@Test
	public void Login()
	{
		driver.findElement(By.xpath("//input[@id='txt_username']")).sendKeys("mobile");
		driver.findElement(By.xpath("//input[@id='txt_password']")).sendKeys("mobile");
		driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		System.out.println(" Test");
	}
	
	@BeforeMethod
	public void titleurl()
	{
		String title =	driver.getTitle();
	    String url = driver.getCurrentUrl();
	    System.out.println(title);
	    System.out.println(url);
	    System.out.println("Before Method");
	}
	
	@AfterMethod
	public void Attribute() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		  Thread.sleep(1000);
		  System.out.println("after method");
		  
	}


}
