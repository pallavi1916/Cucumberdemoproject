package TestNGprograms;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelProgram {

	public static void main(String[] args) throws BiffException, IOException {
		
		// Fetch data from Excel sheet
		File file = new File("D:\\Selenium-Automation\\Login.xls");
		Workbook wb = Workbook.getWorkbook(file);
		Sheet sh = wb.getSheet("login");
		int rows = sh.getRows();
		int columns = sh.getColumns();
		System.out.println(rows+" " +columns);
		
		  System.setProperty("webdriver.chrome.driver", "D:\\Selenium-Automation\\chrome driver\\chromedriver_win32\\chromedriver.exe"); // Set Property of Chrome driver
		   WebDriver driver= new ChromeDriver(); //create object
			driver.manage().window().maximize(); // maximize the window
			driver.get("https://mobile.callistoitsolutions.com/"); //Enter URL on Browser
		// For Login Page
			driver.findElement(By.xpath("//input[@id='txt_username']")).sendKeys(sh.getCell(0,1).getContents());
			driver.findElement(By.xpath("//input[@id='txt_password']")).sendKeys(sh.getCell(1,1).getContents());
			driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
			
			
		
		

	}

}
