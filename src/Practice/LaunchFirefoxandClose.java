package Practice;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxandClose 
{
  public static void main(String[] args) throws Throwable 
{
	  String key = "webdriver.gecko.driver";
		 String value ="./drivers/geckodriver.exe";
		 System.setProperty(key, value);
		 FirefoxDriver driver = new FirefoxDriver();

		 Thread.sleep(5000);
			driver.close();
			 
}
}
