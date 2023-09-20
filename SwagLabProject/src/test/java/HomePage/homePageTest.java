package HomePage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import LoginPage.loginPageTest;
import PageObject.homePageObject;
import Resources.BaseRepo;

public class homePageTest extends BaseRepo {

	WebDriver driver;
	homePageObject hp ;
	
	@Test
	public void validateProductList() throws InterruptedException, IOException
	{
		loginPageTest lpt = new loginPageTest();
		lpt.initializer();
		lpt.validateLoginPage();
		this.driver=lpt.driver;
		hp = new homePageObject(driver);
		for(String list:hp.getProductList())
		{
			System.out.println("Product List:"+list);
		}
	
		 
	}
	
	
	
}
