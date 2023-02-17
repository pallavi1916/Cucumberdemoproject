package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frameselenium 
{

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "D:\\testing video\\Automation video\\java notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Hello Pallavi");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frm1']")));
		Select sd = new Select(driver.findElement(By.xpath("//select[@id='course']")));
		sd.selectByValue("java");
	}
}
