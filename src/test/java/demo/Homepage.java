package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Homepage {
	
	WebDriver driver;
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//h1")
WebElement header;

@FindBy(xpath="//span[text()='Sign in']")
WebElement signin ;

public void verifyHeader()
{
 String headers= header.getText();
 Assert.assertEquals(headers, "App & Browser Testing Made Easy");
 System.out.println(headers);
}
public void clickOnGetStarted()
{
	signin.click();
	
}
}
