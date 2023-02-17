package Webapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Getattribute {

	public static void main(String[] args) {
		
System.setProperty("webdriver.gecko.driver", "D:\\Selenium-Automation\\chrome driver\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://mobile.callistoitsolutions.com/");
		
		String value=driver.findElement(By.id("txt_username")).getAttribute("id");
         System.out.println(value);
	}

}
