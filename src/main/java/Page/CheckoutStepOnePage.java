package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;
import Utility.ReadData;

public class CheckoutStepOnePage extends TestBase {

	@FindBy(xpath="//span[text()='Checkout: Your Information']")private WebElement checkoutLabel;
	@FindBy(id="first-name")private WebElement fristName;
	@FindBy(id="last-name")private WebElement lastName;
	@FindBy(id="postal-code")private WebElement postalCode;
	@FindBy(xpath="//button[@name='cancel']")WebElement cancelBtn;
	@FindBy(xpath="//input[@name='continue']")WebElement continueBtn;
	public CheckoutStepOnePage()
	{
		PageFactory.initElements(driver,this);
	}
	public String verifyCheckoutLabel()
	{
		 return checkoutLabel.getText();
		
	}
	public String verifyContinueBtn() throws Exception
	{
		fristName.sendKeys(ReadData.readPropertyFile("FirstName"));
		lastName.sendKeys(ReadData.readPropertyFile("LastName"));
		postalCode.sendKeys(ReadData.readPropertyFile("PostalCode"));
		Thread.sleep(2000);	
		continueBtn.click();
		Thread.sleep(3000);
		return driver.getCurrentUrl();
	}
	public String verifyCancelBtn() throws Exception
	{
		cancelBtn.click();
		Thread.sleep(3000);
		return driver.getCurrentUrl();
		
	}
	
	
}
