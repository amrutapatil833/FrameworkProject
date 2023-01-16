package TestCase;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Page.CartPage;
import Page.CheckoutStepOnePage;
import Page.CheckoutStepTwoPage;
import Page.InventoryPage;
import Page.LoginPage;

public class CheckoutStepTwoTest extends TestBase {
     LoginPage login;
     InventoryPage invent;
     CartPage cart;
     CheckoutStepOnePage checkout;
     CheckoutStepTwoPage checkoutTwo;
     
	@BeforeMethod
	public void Setup() throws Exception
	{
		initalization();
		login=new LoginPage();
		invent=new InventoryPage();
		cart= new CartPage();
		checkout=new CheckoutStepOnePage();
		checkoutTwo=new CheckoutStepTwoPage();
		login.verifyLoginBtn();
		invent.addProduct();
		invent.goToCartPage();
		cart.verifyCheckPoint();
		checkout.verifyContinueBtn();
		
		
	}
	@Test(enabled=false)
	public void verifyOverViewLableTest()
	{
		String expLable ="CHECKOUT: OVERVIEW";
		String actLable =checkoutTwo.verifyOverViewLable();
		Assert.assertEquals(actLable,expLable);
		Reporter.log("Checkout overview Lable="+actLable);
		
	}
	@Test(enabled=false)
	public void verifyPaymentInformationTest()
	{
		String expIn = "SauceCard #31337";
		String actIn = checkoutTwo.verifyPaymentInformation();
		Assert.assertEquals(actIn, expIn);
		Reporter.log("payment information="+actIn);
	}
	@Test(enabled=false)
	public void verifyShoingInformationTest()
	{
		String expIN = "FREE PONY EXPRESS DELIVERY!";
		String actIN = checkoutTwo.VerifyShopingInformation();
		Assert.assertEquals(actIN, expIN);
		Reporter.log("shoping information="+actIN);
	}
	@Test(enabled=false)
	public void verifyTotalAmountTest()
	{
		String expTotal = "Total: $86.38";
		String actTotal = checkoutTwo.verifyTotalAmount();
		Assert.assertEquals(actTotal,expTotal);
		Reporter.log("Total amount="+actTotal);
	}
	@Test(enabled=false)
	public void verifyCancelBtnTest() throws Exception
	{
		String expUrl = "https://www.saucedemo.com/inventory.html";
		String actUrl = checkoutTwo.verifyCancelBtn();
		Assert.assertEquals(actUrl, expUrl);
		Reporter.log("URL of Checkout Step One="+actUrl);
	}
	@Test(enabled=true)
	public void verifyFinishBtn() throws Exception
	{
		String expUrl = "https://www.saucedemo.com/checkout-complete.html";
		String actUrl = checkoutTwo.verifyFinishBtn();
		Assert.assertEquals(actUrl, expUrl);
	    Reporter.log("URL of complete order="+actUrl);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
   @AfterMethod
   public void closeBrowser()
   {
	   driver.close();
   }
}
