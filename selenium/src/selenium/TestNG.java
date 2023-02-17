package selenium;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {
  WebDriver driver;
  
	@BeforeMethod
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\testing video\\Automation video\\java notes\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closebrowser() throws InterruptedException
	{
	 Thread.sleep(1000);
		driver.close();
	}
	
	@Test (priority = 2)
	public void testcases()
	{
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("pallavi");
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("Raut");
	}
	
	@Test (priority = 1)
	public void testcasestwo()
	{
		driver.findElement(By.xpath("//a[text()='Legal']")).click();
	}
}
