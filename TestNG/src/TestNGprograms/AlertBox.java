package TestNGprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertBox 
{
	WebDriver driver;
    @Test
    public void Alert() throws InterruptedException
    {
    	 System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Automation\\chrome driver\\chromedriver_win32\\chromedriver.exe"); // Set Property of Chrome driver
 	    driver= new ChromeDriver(); //create object
 		driver.manage().window().maximize(); // maximize the window
 		driver.get("https://mlmadmin.callistoitsolutions.com/Index.aspx");
    	driver.findElement(By.xpath("//input[@id='txt_UserName']")).sendKeys("mobile");
		driver.findElement(By.xpath("//input[@id='txt_password']")).sendKeys("mobile");
		driver.findElement(By.xpath("//input[@id='btn_Login']")).click();
		Thread.sleep(1000);
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
    }
}
