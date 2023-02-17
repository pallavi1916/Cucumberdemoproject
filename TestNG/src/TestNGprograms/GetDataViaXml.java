package TestNGprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GetDataViaXml 
{
   WebDriver driver;
   
   @BeforeTest
   public void Lunchbrowser()
   {
	   System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Automation\\chrome driver\\chromedriver_win32\\chromedriver.exe"); // Set Property of Chrome driver
	    driver= new ChromeDriver(); //create object
		driver.manage().window().maximize(); // maximize the window
		driver.get("https://mobile.callistoitsolutions.com/"); //Enter URL on Browser  
   }
   @AfterTest
   public void Closebrowser() throws InterruptedException
   {
	   Thread.sleep(3000);
	   driver.close();
   }
   @Test
   @Parameters({"username","password"})
   public void LoginBrowser(String username, String password )
   {
	   driver.findElement(By.xpath("//input[@id='txt_username']")).sendKeys("username");
		driver.findElement(By.xpath("//input[@id='txt_password']")).sendKeys("password");
		driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
   }
}
