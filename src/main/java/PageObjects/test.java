package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {

	@Test
	public void test()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/index.php");
		System.out.println(driver.getTitle()); //Welcome: Mercury Tours

//		driver.findElement(By.name("userName")).sendKeys("pranay");
//		driver.findElement(By.name("password")).sendKeys("pratik");
//		driver.findElement(By.xpath("//input[@name='submit']")).click();
//		
//		driver.navigate().refresh();
		driver.findElement(By.name("userName")).sendKeys("pratik");
		driver.findElement(By.name("password")).sendKeys("pratik");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		System.out.println(driver.getTitle()); // Login: Mercury Tours

//		driver.findElement(By.xpath("//a[normalize-space()='SIGN-OFF']")).click();
		driver.switchTo().defaultContent();
		System.out.println(driver.getTitle());
	}
}
