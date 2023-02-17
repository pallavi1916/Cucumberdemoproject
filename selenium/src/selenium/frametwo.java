package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class frametwo {

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "D:\\testing video\\Automation video\\java notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frm2']")));
		driver.findElement(By.xpath("//input[@name='fName']")).sendKeys("pallavi");
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@class='frmTextBox']")).sendKeys("I am in Home Page");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frm3']")));
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("I am in frame 3");
		}
}
