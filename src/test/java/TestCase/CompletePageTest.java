package TestCase;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Page.CartPage;
import Page.CheckoutStepOnePage;
import Page.CheckoutStepTwoPage;
import Page.CompletePage;
import Page.InventoryPage;
import Page.LoginPage;

public class CompletePageTest extends TestBase {
	LoginPage login;
    InventoryPage invent;
    CartPage cart;
    CheckoutStepOnePage checkout;
    CheckoutStepTwoPage checkoutTwo;
    CompletePage complete;
	@BeforeMethod
	public void setUp() throws Exception
	{
		initalization();
		login=new LoginPage();
		invent=new InventoryPage();
		cart=new CartPage();
		checkout=new CheckoutStepOnePage();
		checkoutTwo=new CheckoutStepTwoPage();
		complete=new CompletePage();
		login.verifyLoginBtn();
		invent.addProduct();
		invent.goToCartPage();
		cart.verifyCheckPoint();
		checkout.verifyContinueBtn();
		checkoutTwo.verifyFinishBtn();
	}
	@Test(enabled=false)
	public void verifyCompleteLableTest()
	{
		String explable = "CHECKOUT: COMPLETE!";
		String actlable = complete.verifyCompleteLable();
		Assert.assertEquals(actlable, explable);
		Reporter.log("Complete lable ="+actlable);
	}
	@Test(enabled=false)
	public void verifyThankULable()
	{
		String explable = "THANK YOU FOR YOUR ORDER";
		String actlable = complete.verifyThankULable();
	    Assert.assertEquals(actlable, explable);
	    Reporter.log("Thank lable="+actlable);
	}
	@Test(enabled=false)
	public void verifyTextTest()
	{
		String expText = "Your order has been dispatched, and will arrive just as fast as the pony can get there!"; 
		String actText = complete.verifyText();
		Assert.assertEquals(actText, expText);
		Reporter.log("actual text="+actText);
	}
	@Test()
	public void verifyPonyImgTest()
	{
	   boolean result = complete.verifyPonyImg();
	   Assert.assertEquals(result, true);
	}
	@Test
	public void verifyBackHomeBtn() throws Exception
	{
		 String expurl = "https://www.saucedemo.com/inventory.html";
		 String acturl = complete.verifyBackHomeBtn();
		 Assert.assertEquals(acturl, expurl);
		 Reporter.log("Home page Url="+acturl);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    @AfterMethod
    public void closeBrowser()
    {
    	driver.close();
    }
}
