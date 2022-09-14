package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckwheterElementisEnabled {

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver",  "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("file:///C:/Users/Akshu/Desktop/webelement.html");
	WebElement ele = driver.findElement(By.xpath( "//input[@type='text']"));
	  boolean b = ele.isEnabled();
	  if (b) 
	  {
		System.out.println("textbox is enabled");
	  }
		else {
			System.out.println("textbox is displayed");
			
		}
	  driver.close();
	}
	
	  
	}


