package TestNGprograms;

    import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.Iterator;

	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;



	public class  ExcelFile {
 

		public void login() throws IOException, InterruptedException
		
		{
			
			System.setProperty("webdriver.chrome.driver","D:\\Selenium-Automation\\chrome driver\\chromedriver_win32\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			
			driver.get("https://mobile.callistoitsolutions.com/");
			
			ArrayList<String> username = readExcelData(0);
			
			ArrayList<String> password = readExcelData(1);

			for (int i = 0; i < username.size(); i++) 
			{

				driver.findElement(By.xpath("//input[@id='txt_username']")).sendKeys(username.get(i));
				driver.findElement(By.xpath("//input[@id='txt_password']")).sendKeys(password.get(i));
				driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
				
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
				Thread.sleep(5000);

			}
		}

		public ArrayList<String> readExcelData(int colNo) throws InterruptedException, IOException
		
		{
			
			FileInputStream file=new FileInputStream("D:\\Selenium-Automation\\Login.xlsx");
			
			XSSFWorkbook workbook =new XSSFWorkbook(file);
			
			XSSFSheet sheet= workbook.getSheet("login");
			
			Iterator<Row> rowIt=sheet.iterator();

		rowIt.next();
			
			ArrayList<String> Alist = new ArrayList<String>();
			while (rowIt.hasNext()) {
				Alist.add(rowIt.next().getCell(colNo).getStringCellValue());
			}
			System.out.println("Alist data are" + Alist);
			return Alist;
			
			
			
			
			
			
			
			 
	}



	public static void main(String[] args) throws IOException, InterruptedException {

		ExcelFile obj = new ExcelFile();
		obj.login();

		}

	}


	


