package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String args[])
			{
		      System.setProperty("webdriver.chrome.driver","D:\\testing video\\Automation video\\java notes\\chromedriver_win32\\chromedriver.exe");
		      WebDriver driver = new ChromeDriver();
		      driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		      driver.manage().window().maximize();
		     String parentid = driver.getWindowHandle();
		     System.out.println(parentid);
		      //driver.findElement(By.xpath("//button[@class='whButtons']")).click();
		      //Set <String> allwindowid = driver.getWindowHandles();
		      
		      //System.out.println(allwindowid);
		    //  for(String windowno :allwindowid )
		     // {
		    	//  System.out.println(windowno);
		    	//  if(windowno.equals(parentid))
		    	 // {
		    		  //System.out.println("Do not Perform Any Operation");
		    	 // }
		    	  
		    	//  else
		    	  //{
		    	//	  driver.switchTo().window(windowno);
		    		//  driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("pallavi");
		    		//  driver.close();
		    	//  }
		     // }
		      driver.switchTo().window(parentid);
		      driver.findElement(By.xpath("//button[@id='newTabBtn']")).click();
		      Set <String> allwindowid1 = driver.getWindowHandles();
		      System.out.println("Button two windo ids" +allwindowid1);
		      for(String windowno1 :allwindowid1 )
		      {
		    	  System.out.println(windowno1);
		    	  if(windowno1.equals(parentid))
		    	  {
		    		  System.out.println("Do not Perform Any Operation on parent window");
		    	  }
		    	  else
		    	  {
		    		  driver.switchTo().window(windowno1);
		    		  driver.findElement(By.xpath("//button[@id='alertBox']")).click();
		    		  driver.switchTo().alert().accept();
		    	  }
		      }
		      
		
			}
		}
