package Webapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clearcommand {

	public static void main(String[] args) throws InterruptedException {
		
       System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Automation\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://mobile.callistoitsolutions.com/");
		driver.findElement(By.id("txt_username")).sendKeys("mobile");
		Thread.sleep(1000);
		driver.findElement(By.id("txt_username")).clear();

	}

}
