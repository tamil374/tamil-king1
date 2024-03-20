package demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class Setuptest {

	WebDriver driver;
	Homepage page;
	@Test(priority=1)
	public void setUp()
	{
		 driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		 driver.get("https://www.browserstack.com/");
		 driver.manage().window().maximize();
		 

	}
	@Test(priority=2)
	public void navigate_Homepage()
	{
		page=new Homepage(driver);
		page.verifyHeader();
		page.clickOnGetStarted();
		
		
	}
	@Test(priority=3)
  public void tearDown()
  {
	  driver.close();
  }
}
