package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClickonLink
{
	public static void main(String[] args) throws Throwable 
	{	 
        System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
        WebDriver driver=new  FirefoxDriver();
        driver.get("file:///C:/Users/Akshu/Desktop/locater.html");
        Thread.sleep(2000);
       // driver.findElement(By.tagName("a")).click();
       // driver.findElement(By.id("a1")).click();
        //driver.findElement(By.name("n1")).click();
       // driver.findElement(By.className("c1")).click();
       // driver.findElement(By.partialLinkText("goo")).click();
        driver.findElement(By.linkText("google")).click();
	}

}
