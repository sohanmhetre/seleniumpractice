package Practice;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchChrom 
{
  public static void main(String[] args) 
 {
	String key ="webdriver.chrome.driver";
	String value="./drivers/chromedriver.exe";
	System.setProperty(key, value);
	ChromeDriver driver = new ChromeDriver();
}
}
