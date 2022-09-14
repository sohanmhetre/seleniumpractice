package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckElementDisplyed {

	public static void main(String[] args) throws Throwable 
	{
		 System.setProperty("webdriver.chrome.driver",  "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get( "file:///C:/Users/Akshu/Desktop/CssClearSelector.html");
		 WebElement ele = driver.findElement(By.xpath("//input[@type='text']" ));
		Thread.sleep(4000);
		 boolean b = ele.isDisplayed();
		 if (b) 
		 {
			System.out.println("textbox is displyed");
		}
		 else 
		 {
           System.out.println("textbox is not displyed");
		}
	}

}
