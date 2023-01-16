package Page;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CartPage extends TestBase {
   //object Repository
	@FindBy(xpath="//span[@class='title']")private WebElement cartLabel;
	@FindBy(id="remove-sauce-labs-bike-light")private WebElement removeBLProduct;
	@FindBy(xpath="//button[@id='continue-shopping']")private WebElement continueBtn;
	@FindBy(xpath="//button[@id='checkout']")private WebElement checkPoint;
	@FindBy(xpath="//span[@class='shopping_cart_badge']")private WebElement productCount;
	//This is constructor
	public CartPage()
	{
		PageFactory.initElements(driver,this);
	}
	//This method verify cart label
	public String verifyCartLabel()
	{
		return cartLabel.getText();
	}
	
	//This method verify continue shoping button 
	public String verifyContiuneShopingBtn() throws Exception
	{
		
		continueBtn.click();
		Thread.sleep(3000);
		return driver.getCurrentUrl();
	}
	//This method GO to checkout page and verify current page URl
	public String verifyCheckPoint() throws Exception
	{
		removeBLProduct.click();
		Thread.sleep(3000);
		checkPoint.click();
		Thread.sleep(3000);
		return driver.getCurrentUrl();
	}
	
}
