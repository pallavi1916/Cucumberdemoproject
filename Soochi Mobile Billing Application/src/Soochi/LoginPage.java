package Soochi;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		
		// Launch Browser
         
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Automation\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mobile.callistoitsolutions.com/");
		
		
		// for Login Page //
		
		driver.findElement(By.id("txt_username")).sendKeys("mobile");
		driver.findElement(By.id("txt_password")).sendKeys("mobile");
		driver.findElement(By.id("lnk_login")).click();
		String url = driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		if(url.contains("https://mobile.callistoitsolutions.com/"))
		{
			System.out.println("User Login Successfully");
		}
		else
		{
			System.out.println("Login is unsuccessful ");
		}
		Thread.sleep(1000);
		
		// for product Details link //
		
		driver.findElement(By.linkText("Purchase Details")).click();
		Thread.sleep(1000);
		
		//for record invoice of purches product link //
		
		driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_upPanael > div > div > div.span12 > div > div:nth-child(2) > div:nth-child(1) > ul > li > a > center > span:nth-child(5) > b")).click();
		Thread.sleep(1000);
		
		// for add new Supplier Link //
		
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_lnkOpenModelSuppliers")).click();
		
		// for Add Supplier popup //
	
		driver.getWindowHandle();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("div[id='ctl00_ContentPlaceHolder1_upPanael'] div[id='ctl00_ContentPlaceHolder1_UpdatePanel1'] div[class='modal-content']")).click();
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtModelSupplierName")).sendKeys("Manish RAJKUMAR MESHRAM");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtModelSupplirMobileNo")).sendKeys("1234567889");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtModelSupplierGstin")).sendKeys("GS-1234");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtModelSupplierAddress")).sendKeys("Narendra Nagar Manewada Road Nagpur, Maharashtra");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnModelAddSupplier")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//html[1]/body[1]/form[1]/div[7]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]/input[@id='ctl00_ContentPlaceHolder1_txt_InvoiceNo']")).sendKeys("IN-123577");
		Thread.sleep(1000);
		
		// for  Add New Product 
		
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnOpenModelProduct")).click();
		driver.getWindowHandle();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#AddNewProductModel")).click();
		
		Select dropdown = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlModelProBrand")));
		dropdown.selectByVisibleText("SONY");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtModelProName")).sendKeys("Xa11");
		Select dropdown1 = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlModelProUom")));
		dropdown1.selectByVisibleText("mm");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtModelProPurchaeRate")).sendKeys("470000");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtModelProSallingRate")).sendKeys("500000");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtModelProMrp")).sendKeys("540000");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtModelProGstPer")).sendKeys("18");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtModelProDiscPer")).sendKeys("12");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtModelProHsn")).sendKeys("1232422789");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtModelProColor")).sendKeys("Black");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtModelProSize")).sendKeys("6'7");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtModelProOpeningBal")).sendKeys("21000");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnModelAddProduct")).click();
		Thread.sleep(1000);
		
		// For Add Product Details
		
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtpro")).sendKeys("F7");
		//driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtColor")).sendKeys("Black");
		//driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_PurPrice")).sendKeys("83000");
		//driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtImei")).sendKeys("IEMI-7745884");
		//driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_Quantity")).sendKeys("1");
		//driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_FreeQty")).sendKeys("2");
		//driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_DiscPer")).sendKeys("2");
		//driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_DiscAmt")).sendKeys("1000");
		//driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_GstPer")).sendKeys("2");
		//driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_GstAmt")).sendKeys("500");
		driver.findElement(By.xpath("//html")).click();
         Thread.sleep(1000);
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_upPanael")).click();
		driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_gvCustomers_ctl02 > td:nth-child(1) > a")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtImei")).sendKeys("IEMI-7745774");
		driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_btn_additem")).click();
		Thread.sleep(1000);
		
		// for Other charges
		
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtOtherCharge")).sendKeys("500");
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtGrandDiscPer")).sendKeys("2");
		
		// For Payment Details
		
		Select cash = new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_Drop_PaymentMode")));
		cash.selectByVisibleText("By Cash");
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_Remarks")).sendKeys("payment Details Remark");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_btn_AddStock")).click();
		Thread.sleep(1000);
		driver.getWindowHandle(); // Handle the Alert and Pop up window
		Thread.sleep(1000);
		driver.switchTo().alert().accept(); // Handle OK button on alert 
		
		
		//Purchased Invoice Edit/Delete/Update print
		driver.navigate().to("https://mobile.callistoitsolutions.com/Purchase_All_Report.aspx");
		driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_upPanael > div > div > div.span12 > div > div:nth-child(2) > div:nth-child(2) > ul > li > a > center > span > b")).click();
        WebElement datebox = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtFromDate"));
          datebox.sendKeys("10022019");
        WebElement datebox1 = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtTillDate"));
          datebox1.sendKeys("10062021");
          driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtSearch")).sendKeys("Pritesh");
          driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnSearch")).click();
          Thread.sleep(1000);
		  driver.findElement(By.id("ctl00_ContentPlaceHolder1_rpt_Stock_ctl00_btn_Edit")).click();
		  Thread.sleep(1000);
		  
		  // For Edit Button
		  driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_InvoiceNo")).clear();
		  driver.findElement(By.id("ctl00_ContentPlaceHolder1_txt_InvoiceNo")).sendKeys("IN-4488");
		  driver.findElement(By.id("ctl00_ContentPlaceHolder1_btn_UpdateStock")).click();
		  driver.getWindowHandle();
		  Thread.sleep(1000);
		  driver.switchTo().alert().accept();
		  Thread.sleep(1000);
		  
		  // For Delete Button
		  driver.navigate().to("https://mobile.callistoitsolutions.com/Purchase_All_Report.aspx");
		  driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_upPanael > div > div > div.span12 > div > div:nth-child(2) > div:nth-child(2) > ul > li > a > center > span > b")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.id("ctl00_ContentPlaceHolder1_rpt_Stock_ctl00_btn_Delete")).click();
		  Thread.sleep(1000);
		  driver.switchTo().alert().accept();
		  Thread.sleep(1000);
		  driver.switchTo().alert().accept();
		  Thread.sleep(1000);
		  
		  // For Print Button
		 // driver.findElement(By.id("ctl00_ContentPlaceHolder1_rpt_Stock_ctl00_btnPrintBarcode")).click();
		  //Thread.sleep(1000);
		 // driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_upPanael > div > div > div > div > div.box-head > div > ul > li > a")).click();
		  //driver.getWindowHandle();
		 //Thread.sleep(2000);
		   //driver.switchTo().alert().dismiss();//
		  
		  Thread.sleep(1000);
		  
		  //Add Supplier Edit and update (Purches details)
		  driver.navigate().to("https://mobile.callistoitsolutions.com/Purchase_All_Report.aspx");
		  driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtOtherCharge']")).click();
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txt_SupplierName']")).sendKeys("Satish Sambhre");
		  driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txt_SupplierCompanyName']")).sendKeys("MI");
		  driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txt_SupplierMobileNo']")).sendKeys("7865432415");
		  driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txt_SupplierEmailID']")).sendKeys("satish@gmail.com");
		  driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txt_SupplierCity']")).sendKeys("Akola");
          driver.findElement(By.xpath("//textarea[@id='ctl00_ContentPlaceHolder1_txt_SupplierAddress']")).sendKeys("Shakti nagar Akola");
          driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txt_SupplierPostalCode']")).sendKeys("440021");
          driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txt_SupplierGSTIN']")).sendKeys("GST-09876");
          driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtOpeningBalance']")).sendKeys("23000");
          driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_AddSupplier']")).click();
          
          Thread.sleep(2000);
          
          //Edit/Update/Delete Supplier Details
          
          driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtSearch']")).sendKeys("Ramesh");
          driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnSearch']")).click();
          Thread.sleep(1000);
          //Edit and Delete supplier Report
          
          driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_Rpt_ManageSupplier_ctl00_btn_edit']//img")).click();
          driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txt_SupplierName']")).sendKeys("Ramesh Chawan");
          driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txt_SupplierMobileNo']")).sendKeys("1234567876");
          driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btn_AddSupplier']")).click();
          driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_Rpt_ManageSupplier_ctl00_btn_Delete']//img")).click();
          
          //For Popup Window Handle
		  driver.getWindowHandle();
		  Thread.sleep(1000);
		  driver.switchTo().alert().accept();
		  Thread.sleep(1000);
		  
		  // Delete supplier Report
		  driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_Rpt_ManageSupplier_ctl00_btn_Delete']//img")).click();
		  Thread.sleep(2000);
		  
		  //return to Purchase_All_Report.aspx page
		  // All Purchase Reports

		  driver.navigate().to("https://mobile.callistoitsolutions.com/Purchase_All_Report.aspx");
		  driver.findElement(By.xpath("//b[normalize-space()='Category Report']")).click();
	      Thread.sleep(1000);
	      Select value = new Select(driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_Drop_ReportMode']"))); // Select category Report
	      value.selectByVisibleText("mobile");
	      
	      Select date = new Select (driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtFromDate']"))); // date selection
	      date.selectByVisibleText("01012021"); //date selection
	      
	      Select date1 = new Select (driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtTillDate']"))); // date selection
	      date1.selectByVisibleText("22062021"); //date selection
	      
	      driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnShowReport']")).click(); //for show report button
	      
	      driver.navigate().back(); //for back to page
	      
	      driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_btn_PurchaseBrand']//span"));
          Select brand = new Select(driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_Drop_ReportMode']")));
          brand.selectByVisibleText("OPPO");
          
          Select date2 = new Select (driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtFromDate']"))); // date selection
          date2.selectByVisibleText("01012019"); // date selection
          
          Select date3 = new Select (driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtTillDate']"))); // date selection
          date3.selectByVisibleText("22062021"); // date selection
          
          driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnShowReport']")).clear(); // for show button report
          Thread.sleep(1000);
          
          driver.navigate().back(); //for back to page
          
          driver.findElement(By.xpath("//b[normalize-space()='Model Wise']")).click();
	      Select  model=new Select(driver.findElement(By.xpath("//b[normalize-space()='Model Wise']"))); //Model Name Selection
	      model.selectByVisibleText("7"); //Model Name Selection
        
          Select date4 = new Select (driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtFromDate']"))); // date selection
          date4.selectByVisibleText("01012019"); // date selection
        
          Select date5 = new Select(driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtTillDate']")));
          date5.selectByVisibleText("22062021");
        
          driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnShowReport']")).click(); // for show button report
          Thread.sleep(1000);
        
          driver.navigate().back(); //for back to page
        
          driver.findElement(By.xpath("//b[normalize-space()='Color Wise']")).click();
        
          Select color = new Select (driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_Drop_ReportMode']"))); // select Model Color
          color.selectByVisibleText("Black"); // select Model Color
          
          Select date6 = new Select (driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtFromDate']"))); // date selection
          date6.selectByVisibleText("01012019"); // date selection
          
          Select date7 = new Select(driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtTillDate']")));  // date selection
          date7.selectByVisibleText("22062021"); // date selection
          
          driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnShowReport']")).click(); // for show button report
          
          Thread.sleep(1000);
          
          driver.navigate().back(); //for back to page
          
          driver.findElement(By.xpath("//b[normalize-space()='Size Wise']")).click();
          
          Select sizewise = new Select(driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_Drop_ReportMode']"))); //select mobile size
          sizewise.selectByVisibleText("6");
          
          Select date8 = new Select(driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtFromDate']"))); // date selection
          date8.selectByVisibleText("01012019");
          
          Select date9 = new Select(driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtTillDate']"))); // date selection
          date9.selectByVisibleText("22062021");
          
          driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnShowReport']")).click();
          
          driver.navigate().back(); //for back to page
          
          
          driver.findElement(By.xpath("//b[normalize-space()='Payment Mode Wise']")).click();
          Select payment = new Select( driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_Drop_PayMode']"))); // select Payment mode
          payment.selectByVisibleText("By Cash");
          
          Select date10 = new Select(driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtFromDate']")));// date selection
          date10.selectByVisibleText("01012019");
          
          Select date11 = new Select(driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtTillDate']"))); // date selection
          date11.selectByVisibleText("22062021");
          
          driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnShowReport']")).click();
          Thread.sleep(1000);
          
          driver.navigate().back();
          driver.findElement(By.xpath("//b[normalize-space()='Purchase Discount']")).click();
          Select gst = new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlDiscPer']"))); // select GST % discount
          gst.selectByVisibleText("10");
          
          Select date12 = new Select(driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtFromDate']"))); // select From date
          date12.selectByVisibleText("01012019");
          
          Select date13 = new Select(driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtTillDate']"))); // select To date
          date13.selectByVisibleText("23062021");
          
          driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtTillDate']")).click();
          
          Thread.sleep(2000);
          
          driver.navigate().back();
          driver.findElement(By.xpath("//b[normalize-space()='GST Wise']")).click();
          Select date14 = new Select(driver.findElement(By.xpath("//b[normalize-space()='GST Wise']")));
          date14.selectByVisibleText("01012019");
          
          Select  date15 = new Select(driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtToDate']")));
          date15.selectByVisibleText("23062021");
          
          Select gst1 = new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_Drop_PayMode']")));
          gst1.selectByVisibleText("All GST");
          
          driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_btnShowReport']")).click();
          
          Thread.sleep(2000);
          
          
          
	      
	      
	      
	      
	      
		  
		  
		  
		  
	}

}
