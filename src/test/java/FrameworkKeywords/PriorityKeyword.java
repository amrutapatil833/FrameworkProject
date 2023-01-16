package FrameworkKeywords;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Page.LoginPage;

public class PriorityKeyword extends TestBase {

	LoginPage login;
	@BeforeMethod(alwaysRun=true)
	public void setup() throws Exception
	{
		initalization();
		login=new LoginPage();
		
	}
	@Test(priority=4)
	public void verifyTitle1() throws Exception
	{
		String expTitle="Swag Labs";
		String actTitle=login.verifyTitle();
		Assert.assertEquals(actTitle, expTitle);
	}
	@Test(priority=3)
	public void verifyTitle2() throws Exception
	{
		String expTitle="Swag Labs";
		String actTitle=login.verifyTitle();
		Assert.assertEquals(actTitle, expTitle);
	}
	@Test(priority=2)
	public void verifyTitle3() throws Exception
	{
		String expTitle="Swag Labs";
		String actTitle=login.verifyTitle();
		Assert.assertEquals(actTitle, expTitle);
	}	@Test(priority=1)
	public void verifyTitle4() throws Exception
	{
		String expTitle="Swag Labs";
		String actTitle=login.verifyTitle();
		Assert.assertEquals(actTitle, expTitle);
	}
	
	

	@AfterMethod(alwaysRun=true)
	public void closeBrowser()
	{
		driver.close();
	}
}


