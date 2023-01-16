package Page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class CompletePage extends TestBase{

	@FindBy(xpath="//span[@class='title']")private WebElement completeLable;
	@FindBy(xpath="//h2[@class='complete-header']")private WebElement ThankULable;
	@FindBy(xpath="//div[@class='complete-text']")private WebElement text;
	@FindBy(xpath="//img[@alt='Pony Express']")private WebElement ponyimg;
	@FindBy(id="back-to-products")private WebElement backHome;
	public CompletePage()
	{
		PageFactory.initElements(driver,this);
	}
	public String verifyCompleteLable()
	{
		return completeLable.getText();
	}
	public String verifyThankULable()
	{
		return ThankULable.getText();
	}
    public String verifyText()
    {
	   return text.getText();
    }
    public boolean verifyPonyImg()
    {
       return ponyimg.isDisplayed();
    }
    public String verifyBackHomeBtn() throws Exception
    {
    	backHome.click();
    	Thread.sleep(2000);
    	return driver.getCurrentUrl();
    }
    
}
