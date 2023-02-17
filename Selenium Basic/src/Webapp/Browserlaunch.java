package Webapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserlaunch {

	public static void main(String[] args) {
		
		// Launch Browser
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Automation\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// Open Browser
		driver.get("https://mobile.callistoitsolutions.com/");
		
		// Enter User id
		driver.findElement(By.id("txt_username")).sendKeys("mobile");
		
		// Enter Password
		driver.findElement(By.id("txt_password")).sendKeys("mobile");
		
        // Click on Login button
		driver.findElement(By.id("lnk_login")).click();
	}

}
