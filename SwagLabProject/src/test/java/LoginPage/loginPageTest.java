package LoginPage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import PageObject.loginPageObject;
import Resources.BaseRepo;

public class loginPageTest extends BaseRepo{

public	WebDriver driver;
	loginPageObject lp;
	@BeforeTest
	public void initializer() throws IOException
	{
		driver=initialize();
	}
	
	@Test(priority=1)
	public  void validateLoginPage() throws InterruptedException
	{
		lp = new loginPageObject(driver);
		String userName = lp.getAcceptedUserNames().split(":")[1].split("l")[0];
		System.out.println(userName);
		String password = lp.getPassword().split(":")[1].trim();
		System.out.println(password);
		lp.enterUserName().sendKeys(userName);
		Thread.sleep(1000);
		lp.enterPassword().sendKeys(password);
		Thread.sleep(1000);
		lp.clickOnLoginButton();
		
	}
	
}
