package Hybrid;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actionkeyword 
{
	static WebDriver driver;
	public static void OpenBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Automation\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		//Launch browser
		driver=new ChromeDriver();
		}

	public static void Navigate(String url) 

	{
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		
		driver.get(url);
		}
	
	public static void Username(String username) 

	{
				
		driver.findElement(By.id("txt_username")).sendKeys(username);
		}
	
	public static void Password(String password) 

	{
		driver.findElement(By.id("txt_password")).sendKeys(password);
		
		}
	public static void ClickLogin() 

	{
		driver.findElement(By.id("lnk_login")).click();
		}
	
	public static void CloseBrowser(String url) 

	{
				
		driver.close();
		}
}
