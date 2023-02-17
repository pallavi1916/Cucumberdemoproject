package Webapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webpagetitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Automation\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mobile.callistoitsolutions.com/");
		String url = driver.getTitle();
		if(url.equals ("Stock & Inventory Login"))
		{
			System.out.println("Web Page Title is :" +url);
		}
		else
		{
			System.out.println("Web page title is Not Match ");
		}
		
	}

}
