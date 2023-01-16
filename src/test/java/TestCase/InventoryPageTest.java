package TestCase;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Page.InventoryPage;
import Page.LoginPage;

public class InventoryPageTest extends TestBase {
	LoginPage login;
	InventoryPage invent;
	@BeforeMethod
	public void setup() throws Exception
	{
		 initalization();
		 login=new LoginPage();
		 invent=new InventoryPage();
		 login.verifyLoginBtn();
	}
		
	@Test(enabled=false)
	public void verifyPeekLogoTest()
	{
		boolean result = invent.verifyPeekLogo();
		Assert.assertEquals(result, true);
	}
	@Test(enabled=false)
	public void verifySwagLogoTest() 
    {
		 boolean result = invent.verifySwagLogo();
		 Assert.assertEquals(result,true);	 
	}
	@Test(enabled=false)
	public void verifyTwitterLogoTest()
	{
	
	    boolean result = invent.verifyTwitterLogo();
	    Assert.assertEquals(result,true);
	}
	@Test(enabled=false)
	public void verifyFbLogoTest()
	{
	     boolean result = invent.verifyfbLogo();
	     Assert.assertEquals(result, true);
	}
	@Test(enabled=false)
	public void verifyLinkdinLogoTest()
	{
		 boolean result = invent.verifyLinkdinLogo();
		 Assert.assertEquals(result, true);
		 Reporter.log("logo of linkdin="+result);
	}
	@Test
	public void addProductTest() throws Exception
	{
		 String result = invent.addProduct();
		 Assert.assertEquals(result,"3");
		 Reporter.log("Total count add="+result);
	}
	@Test
	public void goToCartPageTest() throws Exception
	{
		 addProductTest();
		 String expurl = "https://www.saucedemo.com/cart.html";
		 String acturl = invent.goToCartPage();
		 Assert.assertEquals(acturl, expurl);
		 Reporter.log("URL of Cart Page="+acturl);
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
