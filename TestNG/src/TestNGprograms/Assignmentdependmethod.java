package TestNGprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Assignmentdependmethod 
{
   WebDriver driver;
   
   @Test
   public void Loginuser()
   {
	   System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Automation\\chrome driver\\chromedriver_win32\\chromedriver.exe"); 
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mobile.callistoitsolutions.com/");
		
		// Enter User name and password //
		
		driver.findElement(By.id("txt_username")).sendKeys("mobile");
		driver.findElement(By.id("txt_password")).sendKeys("mobile");
		driver.findElement(By.id("lnk_login")).click();
   }
   
   @Test(dependsOnMethods="Loginuser")
   public void Productdetails()
   {
	   driver.findElement(By.xpath("//a[normalize-space()='Purchase Details']")).click();
	   driver.findElement(By.xpath("//b[normalize-space()='Record Invoice of Purchased Product']")).click();
	   
   }
   
   @Test(dependsOnMethods="Productdetails")
   public void Addsupplier()throws InterruptedException
   {
	   driver.findElement(By.xpath("//a[normalize-space()='Add New Supplier *']")).click();
	   driver.getWindowHandle();
		Thread.sleep(3000);
	   driver.findElement(By.cssSelector("div[id='ctl00_ContentPlaceHolder1_upPanael'] div[id='ctl00_ContentPlaceHolder1_UpdatePanel1'] div[class='modal-content']")).click();
	   driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_upPanael']//input[@id='ctl00_ContentPlaceHolder1_txtModelSupplierName']")).sendKeys("MI");
	   driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_upPanael']//input[@id='ctl00_ContentPlaceHolder1_txtModelSupplirMobileNo']")).sendKeys("2341567677");
	   Select value = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlModelState")));
	   value.selectByVisibleText("Goa");
	   driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_upPanael']//input[@id='ctl00_ContentPlaceHolder1_txtModelSupplierGstin']")).sendKeys("GST-0021");
	   driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_upPanael']//textarea[@id='ctl00_ContentPlaceHolder1_txtModelSupplierAddress']")).sendKeys("Shankar Nagar Nagpur");
	   driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_upPanael']//a[@id='ctl00_ContentPlaceHolder1_btnModelAddSupplier']")).click();
	   Thread.sleep(1000);
	   
   }
   
   @Test(dependsOnMethods="Addsupplier")
   public void Categoryreport() throws InterruptedException
   {
	   driver.navigate().to("https://mobile.callistoitsolutions.com/Purchase_All_Report.aspx");
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//b[normalize-space()='Category Report']")).click();
          Thread.sleep(1000);
	   driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[7]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Samsung A30");
	   driver.findElement(By.xpath("//html")).click();
       driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtFromDate")).sendKeys("01012019");
	   driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[7]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]")).sendKeys("28062021");
	   driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnShowReport")).click();
	   Thread.sleep(1000);
	      
   }
   
   @Test(dependsOnMethods="Categoryreport")
   public void Closebrowser() throws InterruptedException
   {
	   Thread.sleep(1000);
	  String url = driver.getCurrentUrl();
	  System.out.println(url);
	   driver.close();
   }
}
