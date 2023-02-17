package Webapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrlandtitle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Automation\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobile.callistoitsolutions.com/");
		String url1 = driver.getCurrentUrl();
		System.out.println("The Current Page Url" +url1);
		String title1 = driver.getTitle();
		System.out.println("The Title is :" +title1);
		// Enter User id
		driver.findElement(By.id("txt_username")).sendKeys("mobile");
		
		// Enter Password
		driver.findElement(By.id("txt_password")).sendKeys("mobile");
		
        // Click on Login button
		driver.findElement(By.id("lnk_login")).click();
		
		// Get current title and URL
		String url = driver.getCurrentUrl();
		System.out.println("The Current page URL Is :"+url);
		String title = driver.getTitle();
		System.out.println("Current page Title is : "+title);
		// for close the browser
		driver.close();
		
	}

}
