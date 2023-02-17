package Webapp;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.io.FileHandler;


public class screenshot {

	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Automation\\chrome driver\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://mlmadmin.callistoitsolutions.com/Index.aspx");
			File screen = driver.findElement(By.id("txt_UserName")).getScreenshotAs(OutputType.FILE);
		

			//import java.io.File;
			

			FileHandler.copy(screen, new File(System.getProperty("user.dir")+ "\\image.png"));
		     //FileUtils.copyFile(screen, new File("D:\\reports\\screenshot.png"));
			

			
	}

}
