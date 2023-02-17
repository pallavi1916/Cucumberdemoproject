package Webapp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import TestNGprograms.utility;

public class DataDrivenTestLoginpage {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Automation\\chrome driver\\chromedriver_win32\\chromedriver.exe");
	  		//Launch browser
	  		WebDriver driver=new ChromeDriver();
	  		driver.manage().window().maximize();
	  		//open URl		        
	         driver.get("https://mobile.callistoitsolutions.com/");		
	         //read data from xlsx
	         utility reader = new utility("D:\\Selenium-Automation\\ReadData.xlsx");
	         int rowcount=reader.getRowCount("TestData");
	         
	         //Parameterazation
	         for(int rownum=2;rownum<=rowcount;rownum++)
	         {
	      	   
	         String UserName=reader.getCellData("TestData", "UserName", rownum);
	         System.out.println(UserName);
	         
	         String Password=reader.getCellData("TestData", "UserName", rownum);
	         System.out.println(Password);
	         
	         //Enter Data  for login 
	         driver.findElement(By.xpath("//input[@id='txt_username']")).clear();
	         driver.findElement(By.xpath("//input[@id='txt_username']")).sendKeys(UserName);
	         
	         driver.findElement(By.xpath("//input[@id='txt_password']")).clear();
	         driver.findElement(By.xpath("//input[@id='txt_password']")).sendKeys(Password);
	         driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
	         
	      // Switching to Alert        
	         Alert alert = driver.switchTo().alert();
	      // Accepting alert		
	         alert.accept();
	}

}
}
