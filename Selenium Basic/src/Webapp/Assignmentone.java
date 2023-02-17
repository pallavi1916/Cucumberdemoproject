package Webapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmentone {

	public static void main(String[] args) throws InterruptedException 
	{

	System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Automation\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Animal Testing Wikipedia");
	    driver.findElement(By.name("btnK")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Animal testing - Wikipedia")).click();
		driver.findElement(By.linkText("Animal studies (disambiguation)")).click();
		driver.findElement(By.linkText("Animal studies")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();

	}

}
