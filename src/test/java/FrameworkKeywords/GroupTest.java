package FrameworkKeywords;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Page.LoginPage;

public class GroupTest extends TestBase {

	LoginPage login;
	@BeforeMethod(alwaysRun=true)
	public void setup() throws Exception
	{
		initalization();
		login=new LoginPage();
		
	}
	@Test(groups="sanity")
	public void Title1() throws Exception
	{
		String expTitle="Swag Labs";
		String actTitle=login.verifyTitle();
		Assert.assertEquals(actTitle, expTitle);
	}
	@Test(groups= {"smoke","regression"})
	public void Title2() throws Exception
	{
		String expTitle="Swag Labs";
		String actTitle=login.verifyTitle();
		Assert.assertEquals(actTitle, expTitle);
	}
	@Test(groups= {"smoke","regression"})
	public void Title3() throws Exception
	{
		String expTitle="Swag Labs";
		String actTitle=login.verifyTitle();
		Assert.assertEquals(actTitle, expTitle);
	}
	@Test(groups="sanity")
	public void Title4() throws Exception
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
