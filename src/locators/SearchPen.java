package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchPen {

	public static void main(String[] args) throws Throwable 
	{
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 Thread.sleep(4000);
		 driver.get("https://www.google.co.in/search");
		 driver.findElement(By.tagName("input")).sendKeys("pen");
		 driver.findElement(By.className("gNO89b")).click();
		 
		 
	
	}

}
