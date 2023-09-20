package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPageObject {
	
	WebDriver driver;
	
	public loginPageObject(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	By userName = By.id("user-name");
	By password = By.id("password");
	By loginButton = By.id("login-button");
	By acceptedUserNames = By.id("login_credentials");
	By getpassword = By.className("login_password");
	public String getAcceptedUserNames()
	{
		String accptUser=driver.findElement(acceptedUserNames).getText();
		return accptUser;
	}
	
	public String getPassword()
	{
		return driver.findElement(getpassword).getText();
	}
	
	public WebElement enterUserName()
	{
		return driver.findElement(userName);
	}
	public WebElement enterPassword()
	{
		return driver.findElement(password);
	}
	public void clickOnLoginButton()
	{
		driver.findElement(loginButton).click();
	}
	
}
