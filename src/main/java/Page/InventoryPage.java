package Page;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Base.TestBase;
import Utility.UtilityMethod;

public class InventoryPage extends TestBase {
    //object Repository
	@FindBy(xpath="//div[@class='peek']")private WebElement peekLogo;
	@FindBy(xpath="//img[@alt='Swag Bot Footer']")private WebElement swagLogo;
	@FindBy(xpath="//a[text()='Twitter']")private WebElement twitterLogo;
	@FindBy(xpath="//a[text()='Facebook']")private WebElement fbLogo;
	@FindBy(xpath="//a[text()='LinkedIn']")private WebElement linkdinLogo;
	@FindBy(id="add-to-cart-sauce-labs-backpack")private WebElement bagpack;
	@FindBy(id="add-to-cart-sauce-labs-bike-light")private WebElement bikelight;
	@FindBy(id="add-to-cart-sauce-labs-fleece-jacket")private WebElement jacket;
	@FindBy(id="add-to-cart-sauce-labs-bolt-t-shirt")private  WebElement boltShirt;
	@FindBy(xpath="//select[@class='product_sort_container']")private WebElement sortDropdown;
	@FindBy(xpath="//span[@class='shopping_cart_badge']")private WebElement productcount;
	@FindBy(id="remove-sauce-labs-bolt-t-shirt")private WebElement rmShrit;
	@FindBy(id="remove-sauce-labs-fleece-jacket")private WebElement rmjacket;
	
	//This is Constructor 
	public InventoryPage()
	{
		PageFactory.initElements(driver,this);
	}
//	This method verify peeklogo
	public boolean verifyPeekLogo()
	{
		 return peekLogo.isDisplayed();
	}
	//This method verify swaglogo
	public boolean verifySwagLogo()
	{
		return swagLogo.isDisplayed();
	}
	//This method verify Twitterlogo
	public boolean verifyTwitterLogo()
	{
	   return twitterLogo.isDisplayed();   
	}
	//This method verify fbLogo
	public boolean verifyfbLogo()
	{
	   return fbLogo.isDisplayed();   
	}
	//This method verify linkdinlogo
	public boolean verifyLinkdinLogo()
	{
	   return linkdinLogo.isDisplayed();   
	}
	//This method add product and remove one product
	public String addProduct() throws Exception
	{
		/*Select s=new Select(sortDropdown);
		s.selectByVisibleText("Name (Z to A)");*/
		UtilityMethod.utilityMethod(sortDropdown,"Name (Z to A)");
		Thread.sleep(2000);
		bagpack.click();
		jacket.click();
		bikelight.click();
		boltShirt.click();
		Thread.sleep(5000);
		rmShrit.click();
		Thread.sleep(2000);
		productcount.click();
		return productcount.getText();
	}
	//This method go to cart page and verify URl
	public String goToCartPage() throws Exception
	{
	
		productcount.click();
		Thread.sleep(2000);
		return driver.getCurrentUrl();	
	}
	
	
	   
	
	
	
	   
	
	
	

	
}
