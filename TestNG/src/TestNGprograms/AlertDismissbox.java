package TestNGprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertDismissbox 
{ 
	WebDriver driver;
	
   @Test
   public void Cancelalert() throws InterruptedException
   {
	   System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Automation\\chrome driver\\chromedriver_win32\\chromedriver.exe"); // Set Property of Chrome driver
	    driver= new ChromeDriver(); //create object
		driver.manage().window().maximize(); // maximize the window
		driver.get("https://mobile.callistoitsolutions.com/login.aspx");
   	    driver.findElement(By.xpath("//input[@id='txt_username']")).sendKeys("mobile");
		driver.findElement(By.xpath("//input[@id='txt_password']")).sendKeys("mobile");
		driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
		Thread.sleep(1000);
		driver.navigate().to("https://mobile.callistoitsolutions.com/ManageStock.aspx");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_rpt_Stock_ctl00_btn_Delete']//img")).click();
		Thread.sleep(1000);
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
   }
}
