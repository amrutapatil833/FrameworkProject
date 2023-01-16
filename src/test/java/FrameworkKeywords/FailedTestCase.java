package FrameworkKeywords;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Page.LoginPage;

public class FailedTestCase extends TestBase{
	LoginPage login;
	@BeforeMethod
	public void setup() throws Exception
	{
		initalization();
		login=new LoginPage();
	}
	@Test
	public void Test1()
	{
		  boolean result = login.verifyLoginLogo();
		  Assert.assertEquals(result, true);
	}
	@Test
	public void Test2()
	{
		  boolean result = login.verifyLoginLogo();
		  Assert.assertEquals(result, true);
	}
	@Test
	public void Test3()
	{
		  boolean result = login.verifyLoginLogo();
		  Assert.assertEquals(result,true);
	}@Test
	public void Test4()
	{
		  boolean result = login.verifyLoginLogo();
		  Assert.assertEquals(result,true);
	}
	@Test
	public void Test5()
	{
		  boolean result = login.verifyLoginLogo();
		  Assert.assertEquals(result,true);
	}

	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
}
