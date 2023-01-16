package FrameworkKeywords;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Page.LoginPage;

public class InvocationTimeout extends TestBase {
	
	LoginPage login;
	@BeforeMethod
	public void setup() throws Exception
	{
		initalization();
		login=new LoginPage();
		
	}
	@Test(invocationCount=1)
	public void verifyTitle() throws Exception
	{
		String expTitle="Swag Labs";
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
	@Test(timeOut=2)
	public void verifyLoginLogo()
	{
		  boolean result = login.verifyLoginLogo();
		  Assert.assertEquals(result, true);
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	
	
}
