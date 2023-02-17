package TestNGprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class XmlParameters 
{
	WebDriver driver;
   @Test
   @Parameters({"username","password"})
   public void Login()
   {
	   driver.findElement(By.id("txt_username")).sendKeys("username");
		driver.findElement(By.id("txt_password")).sendKeys("password");
		driver.findElement(By.id("lnk_login")).click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
   }
   
   @BeforeTest
   public void Browser()
   {
	   System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Automation\\chrome driver\\chromedriver_win32\\chromedriver.exe"); // Set Property of Chrome driver
	    driver= new ChromeDriver(); //create object
		driver.manage().window().maximize(); // maximize the window
		driver.get("https://mobile.callistoitsolutions.com/"); //Enter URL on Browser
   }
   
   @AfterTest
   public void Close()
   {
	   driver.close();
   }
}
