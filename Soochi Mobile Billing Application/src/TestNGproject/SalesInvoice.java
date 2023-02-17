package TestNGproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SalesInvoice 
{

	WebDriver driver;
	
    @Test
	
	public void LoginPage()
	{
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Automation\\chrome driver\\chromedriver_win32\\chromedriver.exe"); // Set Property of Chrome driver
	    driver= new ChromeDriver(); //create object
		driver.manage().window().maximize(); // maximize the window
		driver.get("https://mobile.callistoitsolutions.com/"); //Enter URL on Browser
	}
    
    @Test(dependsOnMethods="LoginPage")
    
	public void EnterUserpassword() throws InterruptedException
	{
		driver.findElement(By.id("txt_username")).sendKeys("mobile");
		driver.findElement(By.id("txt_password")).sendKeys("mobile");
		driver.findElement(By.id("lnk_login")).click();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		String actualurl = "https://mobile.callistoitsolutions.com/Dashboard.aspx";
		  String expectedUrl= driver.getCurrentUrl(); 
		  //Assert.assertEquals(expectedUrl,actualurl); // compare URL
		  
		  if(actualurl.equalsIgnoreCase(expectedUrl)) // comparing URL for user id and password
		  {
			  System.out.println("Login Successfully");
		  }
		  else
		  {
			  System.out.println("Error! Please enter Correct username/password.");
		  }
		
	}

	// Sales Invoice Module
	
		@Test(dependsOnMethods="EnterUserpassword")
		
		public void SalesInvoiceModule() throws InterruptedException
		{
			
	         Thread.sleep(1000);
	        driver.findElement(By.linkText("Sales Invoice")).click();
	        
		}
		
		// Create Sales Invoice
	@Test(dependsOnMethods="SalesInvoiceModule")
	
	public void CreatesalesInvoce() throws InterruptedException
	{
		
		driver.findElement(By.xpath("//b[normalize-space()='Create Sales Invoice']")).click();
		// Add  New Customer
		driver.findElement(By.xpath("//a[normalize-space()='(Add New Customer*)']")).click(); 
		driver.getWindowHandle();
		Thread.sleep(4000);
		//Detail of Customer
		driver.findElement(By.cssSelector("div[id='ctl00_ContentPlaceHolder1_upPanael'] div[id='ctl00_ContentPlaceHolder1_UpdatePanel1'] div[class='modal-content']")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_upPanael']//input[@id='ctl00_ContentPlaceHolder1_txtModelCustomerName']")).sendKeys("Rajendr  Suresh sharmaji");
		driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_upPanael']//input[@id='ctl00_ContentPlaceHolder1_txtModelMobileNo']")).sendKeys("6578493248");
		driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_upPanael']//input[@id='ctl00_ContentPlaceHolder1_txtModelEmail']")).sendKeys("rs@mail.com");
		driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_upPanael']//textarea[@id='ctl00_ContentPlaceHolder1_txtModelCustAddress']")).sendKeys("Pratap Nagar Nagpur ");
		driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_upPanael']//input[@id='ctl00_ContentPlaceHolder1_txtModelCustDOB']")).sendKeys("0207202135");
		Select value = new Select(driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_upPanael']//select[@id='ctl00_ContentPlaceHolder1_ddlModel_ModeOfEnquiry']")));
		value.selectByVisibleText("KNOP");
		driver.findElement(By.xpath("//div[@id='ctl00_ContentPlaceHolder1_upPanael']//input[@id='ctl00_ContentPlaceHolder1_txtModelGstInNo']")).sendKeys("GST-099929");
		try
		{
		
		driver.findElement(By.xpath("/html[1]/body[1]/form[1]/div[7]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/center[1]/div[1]/div[1]/div[1]/div[5]/div[1]/a[1]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/form[1]/div[7]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/center[1]/div[1]/div[1]/div[1]/div[5]/div[1]/a[1]")).click();
	    }
		catch(Exception e)
		{
			System.out.println(e);
		}
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txt_InvoiceNo']")).sendKeys("I-023145");
		Select value1 = new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddl_AgentName']")));
		value1.selectByVisibleText("Mayuri");
		
		// Add Delivery MEmo Details
		
		driver.findElement(By.xpath("//a[normalize-space()='D.M. Details']")).click();
		driver.getWindowHandle();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='AddOtherDetailsModel']//div[@class='modal-content']")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtOrderNo']")).sendKeys("0001");
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtOrderDate']")).sendKeys("01072021");
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtDmNumber']")).sendKeys("111");
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtDmDate']")).sendKeys("01072021");
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtLrNo']")).sendKeys("3333");
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtLrDate']")).sendKeys("01072021");
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtTransporter']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtNoOfCases']")).sendKeys("15");
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtDestination']")).sendKeys("Gondiya");
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtSalesman']")).sendKeys("rakesh sharma");
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtMtrlThrough']")).sendKeys("N/A");
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtDueDate']")).sendKeys("01072021");
		driver.findElement(By.xpath("//a[normalize-space()='Add DM Details']")).click();
		Thread.sleep(1000);
		
		
		
		
		
	}
}
