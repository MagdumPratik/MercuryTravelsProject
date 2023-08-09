package TestCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import Utils.ReadPropertyConfig;
import Utils.XLUtils;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseCLass {
	ReadPropertyConfig rd=new ReadPropertyConfig();
	XLUtils xl=new XLUtils();
	
	public  String baseURLBS=rd.getApplicationIURL();
	public  String usernameBS=rd.getUser();
	public  String passWordBS=rd.getPassword();
	public static WebDriver driver;
	public static Logger logger;
	@BeforeClass
	public void setup()
	{
		logger=Logger.getLogger("Ebanking");
		PropertyConfigurator.configure("log4j.properties");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
}
