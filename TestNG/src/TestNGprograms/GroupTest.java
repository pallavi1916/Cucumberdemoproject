package TestNGprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GroupTest 
{
	WebDriver driver;
  
	@Test (groups = {"Regression"})
	
	   public void Browserlunch()
	   {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Automation\\chrome driver\\chromedriver_win32\\chromedriver.exe"); // Set Property of Chrome driver
	    driver= new ChromeDriver(); //create object
		driver.manage().window().maximize(); // maximize the window
		driver.get("https://mobile.callistoitsolutions.com/"); //Enter URL on Browser
	   
		   System.out.println("Regression group" +Thread.currentThread().getId());
	   }
	
	@Test (groups = {"Smoke"})
	public void Test()
	{
		System.out.println("Smoke group" +Thread.currentThread().getId());
	}
	
	@Test (groups = {"Sanity"})
	public void Close()
	{
		
		
		System.out.println("Sanity group" +Thread.currentThread().getId());
	}
	
}
