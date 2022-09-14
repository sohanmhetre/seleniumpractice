package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchMobleinAmzaon {

	public static void main(String[] args) throws Throwable 
	{
		 System.setProperty("webdriver.chrome.driver",  "./drivers/chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.amazon.in/");
		 Thread.sleep(3000);
		WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
		 ele.sendKeys("mobile");
		 Thread.sleep(2000);
		  driver.findElement(By.id("nav-search-submit-button")).click();
	}
		  

}
