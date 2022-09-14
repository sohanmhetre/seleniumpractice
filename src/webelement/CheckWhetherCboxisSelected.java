package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckWhetherCboxisSelected {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
	      driver.get("file:///C:/Users/Akshu/Desktop/webelement1.html");
	      WebElement ele = driver.findElement( By.xpath( "//input[@type='checkbox']"));
	      boolean b = ele.isSelected();
	      if (b) 
	     {
			System.out.println("checkboe is selected");
		}
	      else {
			System.out.println("checkbox is not selected");
		}
	      driver.close();
	}
}
