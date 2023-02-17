package Webapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Automation\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// Open Browser
		driver.get("https://mobile.callistoitsolutions.com/");
		String s = driver.findElement(By.id("lnk_login")).getText();
		System.out.println("The Text is : " +s);
		

	}

}
