package TestCases;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.LoginPage;

public class LoginTestCase extends BaseCLass{
	
	@Test
	public void loginTest() throws InterruptedException
	{
		driver.get(baseURLBS);
		logger.info("URL is Open");
		LoginPage lp=new LoginPage(driver);
		Thread.sleep(2000);
		lp.setUsername(usernameBS);
		logger.info("Username is set");
		Thread.sleep(3000);
		lp.setPassword(passWordBS);
		Thread.sleep(3000);
		logger.info("Password is set");
		lp.clickSubmit();
		Thread.sleep(3000);
	}
	
}
