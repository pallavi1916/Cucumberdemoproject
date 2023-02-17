package Webapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Automation\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mobile.callistoitsolutions.com/");
		driver.findElement(By.id("txt_username")).sendKeys("mobile");
		driver.findElement(By.id("txt_password")).sendKeys("mobile");
		driver.findElement(By.id("lnk_login")).click();
		driver.navigate().to("https://mobile.callistoitsolutions.com/Dashboard.aspx");
		driver.findElement(By.linkText("Purchase Details")).click();
		driver.findElement(By.partialLinkText("Purchased")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(1000);
		
	}

}
