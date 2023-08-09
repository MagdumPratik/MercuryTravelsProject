package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

import PageObjects.LoginPage;

public class DATLoginTest extends BaseCLass{
	public static LoginPage lp;
	@Test(dataProvider="LoginData")
	public void loginDOt(String user, String pwd) throws InterruptedException
	{
		driver.get(baseURLBS);
		logger.info("ChromeDriver is open");
		lp=new LoginPage(driver);
		lp.setUsername(user);
		logger.info("Username is updated");
		lp.setPassword(pwd);
		logger.info("Password is updated");
		lp.clickSubmit();
		Thread.sleep(3000);
		
		if(driver.getTitle().equals("Login: Mercury Tours"))
		{
			logger.info("Test Case Pass");
			System.out.println(lp.getSuccessMassage());
			driver.navigate().back();
			Thread.sleep(3000);
		
		}
		else
		{
			System.out.println("Test Case Failed");
			System.out.println(lp.getFailureMassage());
			driver.navigate().refresh();
			Thread.sleep(3000);
			Assert.assertTrue(false);
		}
	}
	
	
	@DataProvider(name="LoginData")
	String [][] getData() throws IOException
	{
		String ExcelFilePath=System.getProperty("user.dir") + "\\LoginData.xlsx\\";

		int rownum=xl.getRowCount(ExcelFilePath, "Sheet1");
		int colcount=xl.getCellCount(ExcelFilePath, "Sheet1", 1);
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			
			for(int c=0;c<colcount;c++)
			{
				logindata[i-1][c]=xl.getCellData(ExcelFilePath, "Sheet1", i, c);
				
			}
		}
		return logindata;
	}
	
}
