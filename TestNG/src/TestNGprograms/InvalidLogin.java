package TestNGprograms;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class InvalidLogin 
{
	WebDriver driver;
   @Test
   public void InvalidData() throws BiffException, IOException, InterruptedException
   {
       File file = new File("D:\\Selenium-Automation\\Login.xls");
       Workbook wb = Workbook.getWorkbook(file);
       Sheet sh = wb.getSheet("login");
       int rows = sh.getRows();
       int columns = sh.getColumns();
       System.out.println(rows+ " "+columns);
	   
	   System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Automation\\chrome driver\\chromedriver_win32\\chromedriver.exe"); // Set Property of Chrome driver
	    driver= new ChromeDriver(); //create object
		driver.manage().window().maximize(); // maximize the window
		driver.get("https://mlmadmin.callistoitsolutions.com/Index.aspx");
		driver.findElement(By.xpath("//input[@id='txt_UserName']")).sendKeys(sh.getCell(0,1).getContents());
		driver.findElement(By.xpath("//input[@id='txt_password']")).sendKeys(sh.getCell(1,1).getContents());
		driver.findElement(By.xpath("//input[@id='btn_Login']")).click();
		Thread.sleep(4000);
		String url = driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		if(url.contains("https://mlmadmin.callistoitsolutions.com/Index.aspx"))
		{
			System.out.println("User Login Successfully");
		}
		else
		{
			System.out.println("Login is unsuccessful ");
		}
		Thread.sleep(2000);
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
   }
}
