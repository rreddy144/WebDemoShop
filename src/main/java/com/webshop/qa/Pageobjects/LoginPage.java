package com.webshop.qa.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.webshop.qa.BaseClass.TestBase;

public class LoginPage extends TestBase {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//input[@type=\"button\" and @class=\"button-1 register-button\"]")
	WebElement rgisterbutton;
	
	@FindBy(id="Email")
	WebElement emailoptionfiled;
	
	@FindBy(id="Password")
	WebElement passwordoptionfield;
	
	@FindBy(xpath="//input[@value='Log in']")
	WebElement loginbtnfield;
	
	public WebElement rgisterbutton() {
		return rgisterbutton;
	}
	
	public WebElement emailoptionfiled() {
		 return emailoptionfiled;
		 }
	
	public WebElement passwordoptionfield() {
		return passwordoptionfield;
	}
	
	public WebElement loginbtnfield() {
		return loginbtnfield;
	}
	
}
