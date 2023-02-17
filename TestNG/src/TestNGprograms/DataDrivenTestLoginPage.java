package TestNGprograms;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataDrivenTestLoginPage 
{
  @Test
  public class loginXls 

  {
  	
  public static void main(String[] args) 
  	
  	{
  		
  System.setProperty("webdriver.chrome.driver", "D:\\webdriver jars\\chromedriver.exe");
  		//Launch browser
  		WebDriver driver=new ChromeDriver();
  		driver.manage().window().maximize();
  		//open URl		        
         driver.get("http://jewellery.callistoitsolutions.com/");		
         //read data from xlsx
         utility reader = new utility("D:\\DataDrivern\\ReadData.xlsx");
         int rowcount=reader.getRowCount("TestData");
         
         //Parameterazation
         for(int rownum=2;rownum<=rowcount;rownum++)
         {
      	   
         String UserName=reader.getCellData("TestData", "UserName", rownum);
         System.out.println(UserName);
         
         String Password=reader.getCellData("TestData", "UserName", rownum);
         System.out.println(Password);
         
         //Enter Data  for login 
         driver.findElement(By.id("txt_UserName")).clear();
         driver.findElement(By.id("txt_UserName")).sendKeys(UserName);
         
         driver.findElement(By.id("txt_Password")).clear();
         driver.findElement(By.id("txt_Password")).sendKeys(Password);
         driver.findElement(By.id("btn_Login")).click();
         
      // Switching to Alert        
         Alert alert = driver.switchTo().alert();
      // Accepting alert		
         alert.accept();	
         
  }
  }
  }
}
