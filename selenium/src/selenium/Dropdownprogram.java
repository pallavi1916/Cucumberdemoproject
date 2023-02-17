package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownprogram {
   
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "D:\\testing video\\Automation video\\java notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("pallavi");
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("Raut");
		driver.findElement(By.name("UserEmail")).sendKeys("pallu.raut995@gmail.com");
		driver.findElement(By.name("CompanyName")).sendKeys("Mednet");
		driver.findElement(By.name("UserPhone")).sendKeys("9561732684");
		//dropdown
		Select sd = new Select(driver.findElement(By.name("UserTitle")));
		sd.selectByIndex(2);
		
	   WebElement dropdown = driver.findElement(By.name("CompanyEmployees"));
	   Select sd1 = new Select(dropdown);
	   sd1.selectByValue("250");
	   
	   Select sd2 = new Select(driver.findElement(By.name("CompanyCountry")));
	   sd2.selectByVisibleText("United States");
	   
	   Select sd3 = new Select(driver.findElement(By.name("CompanyState")));
	   sd3.selectByValue("CA");
	   
	   driver.findElement(By.className("checkbox-ui")).click();
		
		
		
	}
}
