package com.webshop.qa.BaseClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	  WebDriver driver;
	 public Properties prop;
     
	
	public WebDriver initialdriver() throws IOException {
		
	   prop=new Properties();
		String proppath=System.getProperty("user.dir")+"\\src\\main\\java\\com\\webshop\\qa\\Config\\Config.properties";
		FileInputStream ip=new FileInputStream(proppath);
		prop.load(ip);
		
		 String browsername=prop.getProperty("browser");
		 if(browsername.equals("chrome")) { 
			 WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			 
		 }
		 else if(browsername.equalsIgnoreCase("firefox")) {
			 WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
			 
		 }
		 else if(browsername.equalsIgnoreCase("ie")) {
			 WebDriverManager.iedriver().setup();
			 driver=new InternetExplorerDriver();
			 
		 }
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		
		  return driver;
	}
	   

}
