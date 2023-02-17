package TestNGprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GetDataViaArray 
{
	WebDriver driver;
 
	@BeforeTest
	public void Browserlunch()
	{
		 System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Automation\\chrome driver\\chromedriver_win32\\chromedriver.exe"); 
	 		driver= new ChromeDriver();
	 		driver.manage().window().maximize();
	 		driver.get("https://mobile.callistoitsolutions.com/");
	 		String url = driver.getCurrentUrl();
	 		System.out.println(url);
	}
	@AfterTest
	public void Close() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
	
	@Test(dataProvider="validate")
	public void Dataarray(String userpassword) throws InterruptedException
	{
		WebElement username =	driver.findElement(By.xpath("//input[@id='txt_username']"));
		username.sendKeys(userpassword);
	     
		  Thread.sleep(3000);
		  
		WebElement password =	driver.findElement(By.xpath("//input[@id='txt_password']"));
		password.sendKeys(userpassword);
		
	      Thread.sleep(3000);
		WebElement click1 = driver.findElement(By.xpath("//a[normalize-space()='Login']"));
		click1.click();
		
		
	}
	
	@DataProvider
	public Object[][] validate()
	{
	
		Object[][] obj = new Object[2][1];
	
	obj[0][0]="mobile";
	obj[1][0]="mobile";
	
	
	return obj;
	
}
}
