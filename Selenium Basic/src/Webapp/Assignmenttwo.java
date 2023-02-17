package Webapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmenttwo {

	public static void main(String[] args) throws InterruptedException {
		
     System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Automation\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://mlmadmin.callistoitsolutions.com/Index.aspx");
	Thread.sleep(2000);	
	boolean check1	= driver.findElement(By.id("Chk_Remember")).isSelected();
	Thread.sleep(1000);
	boolean check2	=  driver.findElement(By.cssSelector("#Chk_Remember")).isEnabled();
		 Thread.sleep(1000);
	boolean check3 =  driver.findElement(By.cssSelector("#Chk_Remember")).isDisplayed();
	
	System.out.println(check1);
	System.out.println(check2);
	System.out.println(check3);
  //System.out.println(driver.getPageSource());
	}

}
