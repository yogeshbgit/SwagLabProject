package PageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePageObject {
	
	WebDriver driver;
	
	public homePageObject(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
By productList = By.className("inventory_item_name");


public List<String> getProductList()
{
	List<WebElement> list= driver.findElements(productList);
	List<String> allList = new ArrayList<>();
	for(WebElement l : list)
	{
		allList.add(l.getText());
	}
	
	return allList;
}
	
}
