package Open;

import javax.security.auth.login.LoginContext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class NewTest {
	WebDriver d;
 /* @BeforeMethod
  public void f() {
	 // WebDriver d;
	  System.out.println("Start");
	  }
  */
  @Test(priority = 1)
  public void Login() throws InterruptedException
  {
	  System.setProperty("webdriver.chrome.driver","/Users/mac/Desktop/Automation/chromedriver");
	  d = new ChromeDriver();
	
	 Pom_test p = new Pom_test(d);
	 p.launchapplication("https://www.saucedemo.com/");
	 p.enterYourUsername("standard_user");
	 p.enterYourPassword("secret_sauce");
	 p.LoginintoSauceDemo();
	 
  }
 @Test(priority =2 , dependsOnMethods = {Login})
 public void Createorder() 
 {
	 System.out.print("Already logined ");
	 SauceHomePage Sau = new SauceHomePage(d);
	 Sau.itemclick();
	 
	 
 }
 
    
  @Test(priority = 3 )
  public void quit() {
	   d.close();
	//  System.out.print("We are close");
	  }
  
  
  
 /* 
  @AfterMethod
  public void testttt() {
	  System.out.println("close Method");
  }
*/
}
