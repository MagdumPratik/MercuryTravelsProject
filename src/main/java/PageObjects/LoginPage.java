package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
    @FindBy(name = "userName")
    WebElement inputUsername;

    @FindBy(name = "password")
    WebElement inputPassword;

    @FindBy(name = "submit")
    WebElement buttonSubmit;

    @FindBy(xpath = "//h3[contains(text(),'Login Success')]")
    public WebElement loginSuccessMessage;

    @FindBy(xpath="//span[contains(text(),'Enter your userName')]")
    WebElement loginFailureMassage;
    
    public void setUsername(String uname)
    {
    	inputUsername.sendKeys(uname);
    }
    public void setPassword(String pass)
    {
    	inputPassword.sendKeys(pass);
    }
    
    public void clickSubmit()
    {
    	buttonSubmit.click();
    }
    public String getSuccessMassage()
    {
    	String passmsg=loginSuccessMessage.getText();
    	return passmsg;
    }
    public String getFailureMassage()
    {
    	String failmsg=loginFailureMassage.getText();
    	return failmsg;
    }
}
