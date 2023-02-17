package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertinselenium {
   
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\testing video\\Automation video\\java notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='promptBox']")).click();
		driver.switchTo().alert().sendKeys("pallavi");
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		
		
		//driver.switchTo().alert().getText();
		//driver.switchTo().alert().accept();
		//driver.findElement(By.xpath("//button[@id='confirmBox']")).click();
		//Thread.sleep(1000);
		//driver.switchTo().alert().dismiss();
		//driver.findElement(By.xpath("//button[@id='promptBox']")).click();
		//driver.switchTo().alert().sendKeys("Pallavi Raut");
		//driver.switchTo().alert().accept();
	}
}
