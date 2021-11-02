package com.qa.ecom.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.qa.ecom.pages.LoginPage;

public class BaseTest{
	
	public BasePage basepage;
	public LoginPage loginpage;
	public Properties prop;
	public WebDriver driver;
	
	@BeforeTest
	public void setUp() {
	basepage = new BasePage();
	
	prop=basepage.init_properties();
	
	String browsername=prop.getProperty("browser");
	
	driver=basepage.init_driver(browsername);
	
	loginpage = new LoginPage(driver);
	
	driver.get(prop.getProperty("url"));
	 		
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.quit();
		
	}

}
