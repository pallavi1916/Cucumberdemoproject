package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart {

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "D:\\testing video\\Automation video\\java notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/search?q=i%20phone%2013pro&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 13 Pro (Gold, 256 GB)']/parent::div/parent::div/parent::a/parent::div/parent::div")).click();
}
}
