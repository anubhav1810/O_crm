package Open;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceHomePage {
	
	WebDriver d;
	
	@FindBy(xpath = "//div[text()=\"Sauce Labs Backpack\"]")
	WebElement header;
    
	SauceHomePage(WebDriver d )
	{
		this.d = d;
		PageFactory.initElements(d,this);
	}
	
	 void itemclick()
	{
		System.out.print("Item you want to click");
		header.click();
	}

}
