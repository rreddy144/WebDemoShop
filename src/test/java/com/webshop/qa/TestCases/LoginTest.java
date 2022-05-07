package com.webshop.qa.TestCases;



import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import com.webshop.qa.BaseClass.TestBase;
import com.webshop.qa.Pageobjects.Homepage;
import com.webshop.qa.Pageobjects.LoginPage;

public class LoginTest extends TestBase {
	
	WebDriver driver;
	@Test
	public void logintest()  throws IOException, InterruptedException  {
		
		  driver=initialdriver();
				 driver.get(prop.getProperty("url"));
		 
		 Homepage homepage=new  Homepage(driver);
		 homepage.Logingpagelink().click();
		 
		 Thread.sleep(2000);
		 LoginPage loginpage=new LoginPage(driver);
		 //loginpage.rgisterbutton().click();
		 loginpage.emailoptionfiled().sendKeys(prop.getProperty("username"));
		 loginpage.passwordoptionfield().sendKeys("password");
		 loginpage.loginbtnfield().click();
		 
		 	 
	}	
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	
}
