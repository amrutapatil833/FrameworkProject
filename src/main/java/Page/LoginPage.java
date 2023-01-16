package Page;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.google.common.annotations.VisibleForTesting;

import Base.TestBase;
import Utility.ReadData;

public class LoginPage extends TestBase {
   //This is object Repository
	@FindBy(xpath="//div[@class='login_logo']")private WebElement loginLogo;
	@FindBy(xpath="//div[@class='bot_column']")private WebElement botLogo;
	@FindBy(xpath="//input[@name='user-name']")private WebElement userName;
	@FindBy(xpath="//input[@name='password']")private WebElement password;	
	@FindBy(xpath="//input[@name='login-button']")private WebElement loginBtn;
	@FindBy(xpath="//span[text()='Products']")private WebElement products;
	@FindBy(xpath="//div[@class='peek']")private WebElement peek;
	 //This constructor initializes element
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
    //This method verify Title
	public String verifyTitle() throws Exception
	{
		 Thread.sleep(2000);
		 return driver.getTitle();
    }
	//This method verify URL
	public String verifyURL()
	{
		  return driver.getCurrentUrl();
	}
   //	This method verify loginlogo
	public boolean verifyLoginLogo()
	{
		 return loginLogo.isDisplayed();
	}
	//This method verify Botlogo
	public boolean verifyBotLogo()
	{
		 return botLogo.isDisplayed();
	}
	//This method login to webpage and verify URL
    public String verifyLoginBtn() throws Exception
    {
//	    userName.sendKeys("standard_user");
//	    password.sendKeys("secret_sauce");
    	userName.sendKeys(ReadData.readPropertyFile("username"));
        password.sendKeys(ReadData.readPropertyFile("password"));
	    loginBtn.click();
	    Thread.sleep(5000);
	    return driver.getCurrentUrl();
    }
    //This method verify product lable
    public String verifyInventorylable() throws Exception
    {
    	verifyLoginBtn();
    	return products.getText();
    }
   
}
