package webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearDataWithoutUseingClearMethode {

	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("file:///C:/Users/Akshu/Desktop/webelement2.html"); 
           WebElement ele = driver.findElement( By.xpath( "//input[@type='text']"));
           Thread.sleep(3000);
           //ele.clear();
           ele.sendKeys(Keys.CONTROL+"a");
           Thread.sleep(2000);
           ele.sendKeys(Keys.DELETE);
           Thread.sleep(2000);
           driver.close();
           
	}

}

