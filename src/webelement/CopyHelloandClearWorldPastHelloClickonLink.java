package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyHelloandClearWorldPastHelloClickonLink 
{
	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("file:///C:/Users/Akshu/Desktop/HelloWorld.html");
	      WebElement ele = driver.findElement(By.xpath("//input[@value='Hello']"));
	      ele.sendKeys(Keys.CONTROL+"a");
	      Thread.sleep(2000);
	      ele.sendKeys(Keys.CONTROL+"c");
	      ele=driver.findElement(By.xpath("//input[@value='World']"));
	      Thread.sleep(3000);
	      ele.sendKeys(Keys.CONTROL+"a");
	      ele.sendKeys(Keys.DELETE);
	      Thread.sleep(2000);
	      ele.sendKeys(Keys.CONTROL+"v");
	      ele=driver.findElement(By.xpath("//a[.='Google']"));
	      ele.click();
	      Thread.sleep(4000);
	      driver.close();
	      
	      
	}
}

	 
