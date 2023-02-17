package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demotwo {
 public static void main(String args[])
 {
	 System.setProperty("webdriver.chrome.driver", "D:\\testing video\\Automation video\\java notes\\chromedriver_win32\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");
	 driver.manage().window().maximize();
	 //System.out.println(driver.getCurrentUrl());
	 //System.out.println(driver.getTitle());
	 //String url = driver.getCurrentUrl();
	// System.out.println(url);
	// String title = driver.getTitle();
	// System.out.println(title);
	 
	 driver.findElement(By.name("UserFirstName")).sendKeys("pallavi");
	 driver.findElement(By.name("UserLastName")).sendKeys("Raut");
	 driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("pallavir032@gmail.com");
	 driver.findElement(By.name("CompanyName")).sendKeys("Mednet");
	 WebElement wb = driver.findElement(By.name("UserPhone"));
	 wb.sendKeys("9561732684");
	 
	 
	 
	 //driver.close();
	 
 }
}
