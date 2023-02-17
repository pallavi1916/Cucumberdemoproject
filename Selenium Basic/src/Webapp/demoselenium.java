package Webapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoselenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Automation\\chrome driver\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get("https://www.google.com/");
         driver.manage().window().maximize();
      String url =   driver.getCurrentUrl();
         String title = driver.getTitle();
         System.out.println("Current url is" +url);
         System.out.println("Title is" +title);
         driver.close();
         
         
         
	}

}
