package TestNGprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseEvent 
{
	WebDriver driver;
	@Test
	public void MouseOver()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Automation\\chrome driver\\chromedriver_win32\\chromedriver.exe"); // Set Property of Chrome driver
	    driver= new ChromeDriver(); //create object
		driver.manage().window().maximize(); // maximize the window
		driver.get("https://www.amazon.in/");
		
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.linkText("Mobiles"));
		element.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement element1 = driver.findElement(By.linkText("Mobiles & Accessories"));
		action.moveToElement(element1).build().perform();
		driver.findElement(By.linkText("Mi")).click();
		System.out.println(driver.getCurrentUrl());
	}

}
