package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoone {

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "D:\\testing video\\Automation video\\java notes\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");
		 driver.manage().window().maximize();
	      String url =   driver.getCurrentUrl();
	         String title = driver.getTitle();
	         System.out.println("Current url is" +url);
	         System.out.println("Title is" +title);
	         driver.findElement(By.xpath("html/body/div[3]/div/div/div[6]/div/div[2]/div/div/div[2]/div/div/div/form/div/div/div/div/div/input[@name='UserFirstName']")).sendKeys("pallavi");
	         driver.findElement(By.name("UserLastName")).sendKeys("Raut");
	         driver.findElement(By.name("UserEmail")).sendKeys("pallu.raut995@gmail.com");
	         driver.findElement(By.name("CompanyName")).sendKeys("Mednet");
	         driver.findElement(By.name("UserPhone")).sendKeys("9561732684");
	        // driver.close();
	}
}
