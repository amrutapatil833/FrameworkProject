package FrameworkKeywords;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Base.TestBase;
import Page.LoginPage;

public class Assertion extends TestBase {
	LoginPage login;
	@BeforeMethod
	public void setup() throws Exception
	{
		initalization();
		login=new LoginPage();
		
	}
	@Test(enabled=false)
	public void verifyTitle1() throws Exception
	{
		String expTitle="Swag Labs";
		String actTitle=login.verifyTitle();
		Assert.assertEquals(actTitle, expTitle);
	}
	// hard Assertion
	@Test(timeOut=2000,enabled=false)
	public void verifyTitle2() throws Exception
	{
		String expTitle="1Swag Labs";
		String actTitle=login.verifyTitle();
		Assert.assertEquals(actTitle, expTitle,"Test case fail zali ka");
		System.out.println("this is title testcase");
		Reporter.log("actual title="+actTitle);
		Assert.assertTrue(true);
	}
	//soft Assertion
	@Test
	public void verifyLoginLogo()
	{
		  System.out.println("execution start");
		  SoftAssert soft=new SoftAssert();
		  boolean result = login.verifyLoginLogo();
		  soft.assertEquals(result, false);
		 // Assert.assertEquals(result,true);
		  System.out.println("execution stop");
		  soft.assertAll();
		  
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
