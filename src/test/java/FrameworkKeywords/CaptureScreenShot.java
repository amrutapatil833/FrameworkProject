package FrameworkKeywords;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Page.LoginPage;
import Utility.UtilityMethod;

public class CaptureScreenShot extends TestBase {
	LoginPage login;
	@BeforeMethod(alwaysRun=true)
	public void setup() throws Exception
	{
		initalization();
		login=new LoginPage();
		
	}
	@Test(enabled=true)
	public void verifyTitle() throws Exception
	{
		String expTitle="Swag1 Labs";
		String actTitle=login.verifyTitle();
		Assert.assertEquals(actTitle, expTitle);
	}
	@Test(enabled=false)
	public void verifyURl()
	{
		String expURL="https://www.saucedemo.com/";
		String actURL=login.verifyURL();
		Assert.assertEquals(actURL, expURL);
	}
	@Test(enabled=false)
	public void verifyLoginLogo()
	{
		  boolean result = login.verifyLoginLogo();
		  Assert.assertEquals(result, true);
	}
	@Test(enabled=false)
	public void verifyBotLogo()
	{
		  boolean result = login.verifyBotLogo();
		  Assert.assertEquals(result, true);
	}
	@Test(enabled=false)
	public void verifyLoginBtn() throws Exception
	{
		  String expUrl="https://www.saucedemo.com/inventory.html";
		  String actUrl=login.verifyLoginBtn();
		  Assert.assertEquals(actUrl,expUrl);	  
	}
	@Test(enabled=false)
	public void verifyInventoyLable() throws Exception
	{
		String explabel = "PRODUCTS";
		String actlabel = login.verifyInventorylable();
		Assert.assertEquals(actlabel,explabel);	
	}
	
	

	@AfterMethod(alwaysRun=true)
	public void closeBrowser(ITestResult a) throws Exception
	{
		if(ITestResult.FAILURE==a.getStatus())
		{
		   UtilityMethod.captureSrcreenShot(a.getName());
		}
		driver.close();
	}
}


