package CssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterDataInsideTextFiled 
{
  public static void main(String[] args) throws Throwable 
{
  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.get("file:///C:/Users/Akshu/Desktop/CssSelector.html");
  Thread.sleep(3000);
  driver.findElement(By.tagName("input")).sendKeys("sohan");
}
}
