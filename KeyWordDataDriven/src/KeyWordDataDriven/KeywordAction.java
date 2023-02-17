package KeyWordDataDriven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class KeywordAction 
{
	public static WebDriver driver;

	 public static void openbrowser()
	 { 
	 System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Automation\\chrome driver\\chromedriver_win32\\chromedriver.exe");
	 driver=new ChromeDriver();
	 }

	 public static void navigate()
	 { 
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.manage().window().maximize(); 
	 driver.get("http://mobile.callistoitsolutions.com/");
	 String pageTitle = driver.getTitle();
	 Assert.assertEquals(pageTitle, "Stock & Inventory Login");
	 }

	 public static void username()
	 {
	 driver.findElement(By.id("txt_username")).sendKeys("mobile"); 
	 }

	 public static void password()
	 {
	 driver.findElement(By.id("txt_password")).sendKeys("mobile");
	 }

	 public static void clicklogin()
	 {
	 driver.findElement(By.id("lnk_login")).click();
	 }

	
	 	 public static void closebrowser()
	 {
	 driver.quit();
	 }
}
