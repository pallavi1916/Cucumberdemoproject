package DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPage 
{
	WebDriver driver;
   @Test
   
   public void Login() throws InterruptedException
   {
	   System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Automation\\chrome driver\\chromedriver_win32\\chromedriver.exe");
 		//Launch browser
 	    driver=new ChromeDriver();
 		driver.manage().window().maximize();
 		//open URl		        
        driver.get("https://mobile.callistoitsolutions.com/");		
        //read data from xls
        utility reader = new utility("D:\\Selenium-Automation\\ReadData.xlsx");
        int rowcount=reader.getRowCount("TestData");
        //Enter Data  for login 
        driver.findElement(By.xpath("//input[@id='txt_username']")).clear();
        driver.findElement(By.xpath("//input[@id='txt_username']")).sendKeys("mobile");
        
        driver.findElement(By.xpath("//input[@id='txt_password']")).clear();
        driver.findElement(By.xpath("//input[@id='txt_password']")).sendKeys("mobile");
        driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
        
        //Parameterazation
        for(int rownum=2;rownum<=rowcount;rownum++)
        {
     	   
        driver.findElement(By.xpath("//a[normalize-space()='Purchase Details']")).click();
		driver.findElement(By.xpath("//b[normalize-space()='Record Invoice of Purchased Product']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Add New Supplier *']")).click();
		  
		   String SupplierCompanyName =reader.getCellData("Sheet1", "UserName", rownum);
	       System.out.println(SupplierCompanyName);
	       
	       String mobile=reader.getCellData("TestData", "UserName", rownum);
	       System.out.println(mobile);
	       
	       String state=reader.getCellData("TestData", "UserName", rownum);
	       System.out.println(state);
	       
	       String gst=reader.getCellData("TestData", "UserName", rownum);
	       System.out.println(gst);
	       
	       String address=reader.getCellData("TestData", "UserName", rownum);
	       System.out.println(address);
	       
	       //Enter Data  for login 
	       driver.findElement(By.id("ctl00_ContentPlaceHolder1_lnkOpenModelSuppliers")).click();
			driver.getWindowHandle();
			Thread.sleep(1000);
			driver.findElement(By.cssSelector("div[id='ctl00_ContentPlaceHolder1_upPanael'] div[id='ctl00_ContentPlaceHolder1_UpdatePanel1'] div[class='modal-content']")).click();
			driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_upPanael']//input[@id='ctl00_ContentPlaceHolder1_txtModelSupplierName']")).sendKeys(SupplierCompanyName);
			driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_upPanael']//input[@id='ctl00_ContentPlaceHolder1_txtModelSupplirMobileNo']")).sendKeys(mobile);
			driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_upPanael']//select[@id='ctl00_ContentPlaceHolder1_ddlModelState']")).sendKeys(state);
			driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_upPanael']//input[@id='ctl00_ContentPlaceHolder1_txtModelSupplierGstin']")).sendKeys(gst);
			driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_upPanael']//textarea[@id='ctl00_ContentPlaceHolder1_txtModelSupplierAddress']")).sendKeys(address);
			driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_upPanael']//a[@id='ctl00_ContentPlaceHolder1_btnModelAddSupplier']")).click();
			Thread.sleep(3000);
	       
		
	
        

}

   }
   
  
}
