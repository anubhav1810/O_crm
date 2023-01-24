package Open;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pom_test {
	
	WebDriver d ;
	WebElement e,f;
      Pom_test(WebDriver Dri)
       {
		 d = Dri;
	   }
	
	
//	By user = By.xpath("/html/body/div/div/div[2]/div[1]/div[1]/div/form/div[1]/input");
	By nID = By.name("user-name");
	By pswd = By.id("password");
	
	
	public void launchapplication(String URL) 
	{
		d.get(URL);
	//	Thread.sleep(30000);
	}
	
    public void enterYourUsername(String username)
    
    {
    	System.out.println("");
    	System.out.println("@@######");
    	
    	
    	System.out.println("");
    	
    	
    	e = d.findElement(nID);
    	System.out.println("@@######");
    	e.clear();
    	e.click();
    	e.sendKeys(username);
    }
    
    public void enterYourPassword(String yourPassword)
    {
    	f = d.findElement(pswd);
    	f.clear();
    	f.click();
    	f.sendKeys(yourPassword);
    	
    }
    
    public void LoginintoSauceDemo()
    {
      e.submit();
    }
    
    	
    

}
