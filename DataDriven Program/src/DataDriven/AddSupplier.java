package DataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddSupplier 
{
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	
	{
		
		LoginPage obj = new LoginPage();
		obj.Login();
		//driver.navigate().to("https://mobile.callistoitsolutions.com/Dashboard.aspx");
				
				utility reader = new utility("D:\\Selenium-Automation\\AddSupplier.xlsx");
			       int rowcount=reader.getRowCount("Sheet1");
			       for(int rownum=2;rownum<=rowcount;rownum++)
			       {
			    	   
			       String SupplierCompanyName =reader.getCellData("Sheet1", "UserName", rownum);
			       System.out.println(SupplierCompanyName);
			       
			       String mobile=reader.getCellData("Sheet1", "UserName", rownum);
			       System.out.println(mobile);
			       
			       String state=reader.getCellData("Sheet1", "UserName", rownum);
			       System.out.println(state);
			       
			       String gst=reader.getCellData("Sheet1", "UserName", rownum);
			       System.out.println(gst);
			       
			       String address=reader.getCellData("Sheet1", "UserName", rownum);
			       System.out.println(address);
			       
			       //Enter Data  for login 
			       driver.findElement(By.xpath("//a[normalize-space()='Purchase Details']")).click();
					driver.findElement(By.xpath("//b[normalize-space()='Record Invoice of Purchased Product']")).click();
					driver.findElement(By.xpath("//a[normalize-space()='Add New Supplier *']")).click();
			       driver.findElement(By.id("ctl00_ContentPlaceHolder1_lnkOpenModelSuppliers")).click();
					driver.getWindowHandle();
					Thread.sleep(3000);
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
