package TestNGprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewLogin 
{
	WebDriver driver;
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Automation\\chrome driver\\chromedriver_win32\\chromedriver.exe"); // Set Property of Chrome driver
	    driver= new ChromeDriver(); //create object
		
		driver.get("https://mobile.callistoitsolutions.com/"); 
		String url = driver.getCurrentUrl();
		System.out.println(url);
		

	}
	
}
