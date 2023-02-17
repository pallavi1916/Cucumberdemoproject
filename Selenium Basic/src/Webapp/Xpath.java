package Webapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Automation\\chrome driver\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://mlmadmin.callistoitsolutions.com/Index.aspx");
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Automation\\chrome driver\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver1 = new ChromeDriver();
			driver1.manage().window().maximize();
			driver1.get("https://www.google.com/");
			driver1.close();
			driver1.quit();
			driver1.getCurrentUrl();
			driver1.getTitle();
			driver1.getWindowHandle();
			driver1.getPageSource();driver1.switchTo().alert().accept();
			driver.findElement(By.xpath("")).sendKeys("yes");
			driver1.findElement(By.xpath("")).click();
			driver1.findElement(By.xpath("")).clear();
			driver1.findElement(By.xpath("")).isSelected();
			Select s = new Select(driver1.findElement(By.xpath("")));
			s.selectByVisibleText("");
	}

}
