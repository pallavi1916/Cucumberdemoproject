package TestNGprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseeventAssignment 
{
	WebDriver driver;
	
	@Test
	public void Browser()
	{
		// Launch Browser
				System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Automation\\chrome driver\\chromedriver_win32\\chromedriver.exe"); // Set Property of Chrome driver
			    driver= new ChromeDriver(); //create object
				driver.manage().window().maximize(); // maximize the window
				driver.get("https://mobile.callistoitsolutions.com/");
				
				// Login into dashboard
				driver.findElement(By.id("txt_username")).sendKeys("mobile");
				driver.findElement(By.id("txt_password")).sendKeys("mobile");
				driver.findElement(By.id("lnk_login")).click();
	}
   
	@Test(dependsOnMethods="Browser")
	public void KeyDownEvents() throws InterruptedException
	{
		
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.linkText("Dashboard"));
		action.moveToElement(element).build().perform();
		WebElement element1 = driver.findElement(By.linkText("Purchase Details"));
		action.moveToElement(element1).build().perform();
		WebElement element2 = driver.findElement(By.linkText("Sales Invoice"));
		action.moveToElement(element2).build().perform();
		WebElement element3 = driver.findElement(By.linkText("Estimate & Quotation"));
		action.moveToElement(element3).build().perform();
		WebElement element4 = driver.findElement(By.linkText("Product Master Details"));
		action.moveToElement(element4).build().perform();
		WebElement element5 = driver.findElement(By.linkText("Used Mobile Pur/Sales"));
		action.moveToElement(element5).build().perform();
		WebElement element6 = driver.findElement(By.linkText("Mobile Repairing"));
		action.moveToElement(element6).build().perform();
		WebElement element7 = driver.findElement(By.linkText("Payment Vouchers"));
		action.moveToElement(element7).build().perform();
		WebElement element8 = driver.findElement(By.linkText("Credit (Sales/Purchase)"));
		action.moveToElement(element8).build().perform();
		WebElement element9 = driver.findElement(By.linkText("Cr & Dr Note Adjustment"));
		action.moveToElement(element9).build().perform();
		WebElement element10 = driver.findElement(By.linkText("Finance Customers"));
		action.moveToElement(element10).build().perform();
		WebElement element11 = driver.findElement(By.linkText("Stock"));
		action.moveToElement(element11).build().perform();
		WebElement element12 = driver.findElement(By.linkText("Ledger"));
		action.moveToElement(element12).build().perform();
		WebElement element13 = driver.findElement(By.linkText("Incomes"));
		action.moveToElement(element13).build().perform();
		WebElement element14 = driver.findElement(By.linkText("Expenses"));
		action.moveToElement(element14).build().perform();
		WebElement element15 = driver.findElement(By.linkText("GSTR"));
		action.moveToElement(element15).build().perform();
		WebElement element16 = driver.findElement(By.linkText("Cheque Manager"));
		action.moveToElement(element16).build().perform();
		WebElement element17 = driver.findElement(By.linkText("Banking"));
		action.moveToElement(element17).build().perform();
		WebElement element18 = driver.findElement(By.linkText("Returns"));
		action.moveToElement(element18).build().perform();
		WebElement element19 = driver.findElement(By.linkText("Agent"));
		action.moveToElement(element19).build().perform();
		WebElement element20 = driver.findElement(By.linkText("CRM"));
		action.moveToElement(element20).build().perform();
		WebElement element21 = driver.findElement(By.linkText("Setting"));
		action.moveToElement(element21).build().perform();
		action.keyDown(Keys.SHIFT);
		
		
		
		}
	
	@Test(dependsOnMethods="KeyDownEvents")
	public void KeyUpEvents()
	{
		Actions action = new Actions(driver);
		WebElement element21 = driver.findElement(By.linkText("Setting"));
		action.moveToElement(element21).build().perform();
		WebElement element20 = driver.findElement(By.linkText("CRM"));
		action.moveToElement(element20).build().perform();
		WebElement element19 = driver.findElement(By.linkText("Agent"));
		action.moveToElement(element19).build().perform();
		WebElement element18 = driver.findElement(By.linkText("Returns"));
		action.moveToElement(element18).build().perform();
		WebElement element17 = driver.findElement(By.linkText("Banking"));
		action.moveToElement(element17).build().perform();
		WebElement element16 = driver.findElement(By.linkText("Cheque Manager"));
		action.moveToElement(element16).build().perform();
		WebElement element15 = driver.findElement(By.linkText("GSTR"));
		action.moveToElement(element15).build().perform();
		WebElement element14 = driver.findElement(By.linkText("Expenses"));
		action.moveToElement(element14).build().perform();
		WebElement element13 = driver.findElement(By.linkText("Incomes"));
		action.moveToElement(element13).build().perform();
		WebElement element12 = driver.findElement(By.linkText("Ledger"));
		action.moveToElement(element12).build().perform();
		WebElement element11 = driver.findElement(By.linkText("Stock"));
		action.moveToElement(element11).build().perform();
		WebElement element10 = driver.findElement(By.linkText("Finance Customers"));
		action.moveToElement(element10).build().perform();
		WebElement element9 = driver.findElement(By.linkText("Cr & Dr Note Adjustment"));
		action.moveToElement(element9).build().perform();
		WebElement element8 = driver.findElement(By.linkText("Credit (Sales/Purchase)"));
		action.moveToElement(element8).build().perform();
		WebElement element7 = driver.findElement(By.linkText("Payment Vouchers"));
		action.moveToElement(element7).build().perform();
		WebElement element6 = driver.findElement(By.linkText("Mobile Repairing"));
		action.moveToElement(element6).build().perform();
		WebElement element5 = driver.findElement(By.linkText("Used Mobile Pur/Sales"));
		action.moveToElement(element5).build().perform();
		WebElement element4 = driver.findElement(By.linkText("Product Master Details"));
		action.moveToElement(element4).build().perform();
		WebElement element3 = driver.findElement(By.linkText("Estimate & Quotation"));
		action.moveToElement(element3).build().perform();
		WebElement element2 = driver.findElement(By.linkText("Sales Invoice"));
		action.moveToElement(element2).build().perform();
		WebElement element1 = driver.findElement(By.linkText("Purchase Details"));
		action.moveToElement(element1).build().perform();
		WebElement element = driver.findElement(By.linkText("Dashboard"));
		action.moveToElement(element).build().perform();
		action.keyUp(Keys.SHIFT);
	}
}
