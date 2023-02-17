package TestNGprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dependsonmethod 
{
     WebDriver driver;
	@Test
	
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Automation\\chrome driver\\chromedriver_win32\\chromedriver.exe"); // Set Property of Chrome driver
	    driver= new ChromeDriver(); //create object
		driver.manage().window().maximize(); // maximize the window
		System.out.println("open browser");
	}
	
	@Test(dependsOnMethods="openbrowser")
	public void openpage()
	{
		driver.get("https://mobile.callistoitsolutions.com/"); //Enter URL on Browser
		System.out.println("open browser");
	}
	@Test(dependsOnMethods="openpage")
	public void url()
	{
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	@Test(dependsOnMethods="url")
	public void closebrowser()
	{
		System.out.println("close browser");
		driver.close();
		
	}
	
	
}
