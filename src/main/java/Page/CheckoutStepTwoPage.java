package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CheckoutStepTwoPage extends TestBase {
    
	@FindBy(xpath="//span[text()='Checkout: Overview']")private WebElement overviewLable;
    @FindBy(xpath="//div[text()='SauceCard #31337']")private WebElement PaymentInfomation;
    @FindBy(xpath="//div[text()='FREE PONY EXPRESS DELIVERY!']")WebElement shopingIN;
	@FindBy(xpath="//div[text()='FREE PONY EXPRESS DELIVERY!']")private WebElement shopingIn;
	@FindBy(xpath="//div[@class='summary_total_label']")private WebElement total;
	@FindBy(id="cancel")private WebElement cancelBtn;
	@FindBy(xpath="//button[@name='finish']")private WebElement finishBtn;
	public CheckoutStepTwoPage()
	{
		PageFactory.initElements(driver,this);
	}
	public String verifyOverViewLable()
	{
         return overviewLable.getText();
	}
	public String verifyPaymentInformation() 
	{
      return PaymentInfomation.getText();
      
	}
	public String VerifyShopingInformation()
	{
	    return shopingIn.getText();
	}
	public String verifyTotalAmount()
	{
		return total.getText();
	}
	public String verifyCancelBtn() throws Exception
	{
		cancelBtn.click();
		Thread.sleep(2000);
		return driver.getCurrentUrl();
	}
	public String verifyFinishBtn() throws InterruptedException
	{
		finishBtn.click();
		Thread.sleep(2000);
		return driver.getCurrentUrl();
	}
}
