package CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterDataInTextFieldUsingClassName 
{
	public static void main(String[] args) throws Throwable 
	{
	 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("file:///C:/Users/Akshu/Desktop/CssSelector.html");
	 Thread.sleep(3000);
	 driver.findElement(By.className("c1")).sendKeys("Sohan Mhetre");
	 Thread.sleep(1000);
	 driver.findElement(By.className("c1")).clear();
	 driver.close();
	}
}
