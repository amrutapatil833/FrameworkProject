package FrameworkKeywords;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTest {
 @Test
public void Test1() throws Exception
{
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.saucedemo.com/");
	 Thread.sleep(5000);
	 driver.close();
}
 @Test
 public void Test2() throws Exception
 {
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.facebook.com/login/");
	 Thread.sleep(5000);
	 driver.close();
 }
 @Test
 public void Test3() throws Exception
 {
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.google.com/");
	 Thread.sleep(5000);
	 driver.close();
 }
 @Test
 public void Test4() throws Exception
 {
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.linkedin.com/login");
	 Thread.sleep(5000);
	 driver.close();
 }
 
 
	
	
}
