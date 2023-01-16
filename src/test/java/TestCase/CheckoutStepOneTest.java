package TestCase;

import org.testng.Assert;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Page.CartPage;
import Page.CheckoutStepOnePage;
import Page.InventoryPage;
import Page.LoginPage;

public class CheckoutStepOneTest extends TestBase{
	LoginPage login;
	InventoryPage invent;
	CartPage cart;
	CheckoutStepOnePage checkout;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initalization();
		 login=new LoginPage();
		 invent=new InventoryPage();
		 cart=new CartPage();
		 checkout=new CheckoutStepOnePage();
		 login.verifyLoginBtn();
		 invent.addProduct();
		 invent.goToCartPage();
		 cart.verifyCheckPoint();
		
	}
	@Test(enabled=false)
	public void verifyCheckoutLabel()
	{
		String expLabel = "CHECKOUT: YOUR INFORMATION";
		String actLabel = checkout.verifyCheckoutLabel();
		Assert.assertEquals(actLabel, expLabel);
	}
	@Test(enabled=false)
	public void verifyCancelBtnTest() throws Exception
	{
		 String expUrl = "https://www.saucedemo.com/cart.html";
		 String actUrl = checkout.verifyCancelBtn();
		 Assert.assertEquals(actUrl, expUrl);
		 Reporter.log("url of cart page="+actUrl);
	}
	@Test(enabled=true)
	public void verifyContinueBtnTest() throws Exception
	{
		String expUrl = "https://www.saucedemo.com/checkout-step-two.html";
		String actUrl = checkout.verifyContinueBtn();
		Assert.assertEquals(actUrl,expUrl);
		Reporter.log("URL of checkout step two="+actUrl);	
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
}
