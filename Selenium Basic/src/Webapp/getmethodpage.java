package Webapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getmethodpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Automation\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		//driver.get("https://mobile.callistoitsolutions.com/");
		
		String url="https://www.google.com/";
		driver.get(url);
		
		String url1 = "https://mobile.callistoitsolutions.com/";
		driver.get(url1);
	}

}