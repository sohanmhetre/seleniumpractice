package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeofKanadainFBLoginPage {

	public static void main(String[] args) throws Throwable 
	{
		 System.setProperty("webdriver.chrome.driver",  "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://en-gb.facebook.com/");
		 Thread.sleep(3000);
		 WebElement ele = driver.findElement(By.xpath("//a[@title='Hindi']"));
	      String attributevale = ele.getAttribute("href");
	      System.out.println(attributevale);
	}

	 

}
