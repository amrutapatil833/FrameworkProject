package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.ReadData;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
    //This method open browser and open link
	  public static WebDriver driver;
	
     public void initalization() throws Exception
	{
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(ReadData.readPropertyFile("url"));
		//driver.get("https://www.saucedemo.com/");
	}
}
