package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchflipcardandclose 
{
 public static void main(String[] args) throws Throwable 
{
		String key ="webdriver.chrome.driver";
		String value="./drivers/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
}
}
