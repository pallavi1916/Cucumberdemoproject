package Webapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider 

{
     WebDriver driver;
	@BeforeMethod
    public void Openbrowser()
    {
    	 System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Automation\\chrome driver\\chromedriver_win32\\chromedriver.exe"); 
 		driver= new ChromeDriver();
 		driver.manage().window().maximize();
 		driver.get("https://www.google.com/");
    }
	
	@Test(dataProvider="readData")
	
	public void Search(String searchText) throws InterruptedException
	{
		WebElement s = driver.findElement(By.name("q"));
		s.sendKeys(searchText);
		Thread.sleep(2000);
		WebElement b = driver.findElement(By.name("btnK"));
		b.click();
		
		try
		{
			Thread.sleep(5000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	@AfterMethod
	public void close()
	{
		driver.quit();
	}
	
	@DataProvider
	
	public Object[][] readData()
		{
		
		Object[][] obj = new Object[3][1];
		
		obj[0][0]="Manual Testing";
		obj[1][0]="Webdriver";
		obj[2][0]="Selenium";
		return obj;
		
	}
}
