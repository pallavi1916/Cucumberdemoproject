package TestNGprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class User 
{
	WebDriver driver;
	@Test
	
	public void loginid()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Automation\\chrome driver\\chromedriver_win32\\chromedriver.exe"); // Set Property of Chrome driver
	    driver= new ChromeDriver(); //create object
		driver.manage().window().maximize(); // maximize the window
		driver.get("https://mobile.callistoitsolutions.com/"); 
	}
	@Test
    public void userid()
    {
    	
		driver.findElement(By.id("txt_username")).sendKeys("mobile");
		driver.findElement(By.id("txt_password")).sendKeys("mobile");
		driver.findElement(By.id("lnk_login")).click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
    }
}
