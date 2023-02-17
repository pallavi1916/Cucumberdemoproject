package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frameone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			System.setProperty("webdriver.chrome.driver", "D:\\testing video\\Automation video\\java notes\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
			driver.manage().window().maximize();
			//driver.findElement(By.xpath("//input[@class='frmTextBox']")).sendKeys("Home page");
			//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frm1']")));
			//Select sd = new Select (driver.findElement(By.xpath("//select[@id='course']")));
			//sd.selectByIndex(2);
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frm3']")));
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys("i am in frame 3");
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frm1']")));
			Select sd = new Select (driver.findElement(By.xpath("//select[@id='course']")));
			sd.selectByIndex(4);
			driver.switchTo().parentFrame();
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys("i am back in frame 3");
			driver.switchTo().defaultContent();
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys("i am in Home Page");
	
	}

}
