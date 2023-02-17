package Webapp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollbar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Automation\\chrome driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mobile.callistoitsolutions.com/login.aspx");
		
		driver.findElement(By.id("txt_username")).sendKeys("mobile");
		driver.findElement(By.id("txt_password")).sendKeys("mobile");
		driver.findElement(By.id("lnk_login")).click();
		
		driver.navigate().to("https://mobile.callistoitsolutions.com/Add_Stock.aspx?Mode=New%27");
		Thread.sleep(1000);
		JavascriptExecutor jre = (JavascriptExecutor) driver;
		//jre.executeScript("window.scrollTo(0,300)");
		WebElement test = driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtOtherCharge']"));
		jre.executeScript("arguments[0].scrollIntoView(true)", test);

	}

}
