package Utility;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import Base.TestBase;

public class UtilityMethod extends TestBase{

public static void utilityMethod(WebElement ele,String option)
   {
	   Select s=new Select(ele);
	   s.selectByVisibleText(option);
   }
 public static void captureSrcreenShot(String name) throws Exception
 {
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\Shree\\eclipse-workspace\\FrameworkProject\\ScreenShot/"+name+".jpeg");
    FileHandler.copy(source, dest);
 }

}
