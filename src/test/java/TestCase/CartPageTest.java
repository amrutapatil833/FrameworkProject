package TestCase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Page.CartPage;
import Page.InventoryPage;
import Page.LoginPage;

public class CartPageTest extends TestBase {
      LoginPage login;
      InventoryPage invent;
      CartPage cart;
	@BeforeMethod
	public void setup() throws Exception
	{
		initalization();
	    login=new LoginPage();
	    invent=new InventoryPage();
	    cart=new CartPage();
	    login.verifyLoginBtn();
	    invent.addProduct();
	  
	}
	@Test(enabled=false)
	public void verifyCartLableTest()
	{
		 
		 String expLabel = "YOUR CART";
		 String actLabel = cart.verifyCartLabel();
		 Assert.assertEquals(actLabel, expLabel);
		 Reporter.log("Atual Label of Cart label="+actLabel);
    }
	@Test(enabled=false)
	public void verifyContinueShopingBtnTest() throws Exception
	{
	    String expUrl = "https://www.saucedemo.com/inventory.html";
		String actUrl = cart.verifyContiuneShopingBtn();
		Assert.assertEquals(actUrl,expUrl);
		Reporter.log("URL of CheckOut="+actUrl);
	}
	@Test(enabled=true)
	public void VerifyChecKPointTest() throws Exception
	{
		String expUrl = "https://www.saucedemo.com/checkout-step-one.html";
		String actUrl = cart.verifyCheckPoint();
		Assert.assertEquals(actUrl,expUrl);
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}



