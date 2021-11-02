package com.qa.ecom.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BasePage {

	public WebDriver driver;
	public Properties prop;
	
	public WebDriver init_driver(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			
			driver = new ChromeDriver(); 
			
		}
		
		else if(browser.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.firefoxdriver().setup();
			
			driver = new FirefoxDriver(); 
			
		}
		
		else {
			
			System.out.println("Invalid browsername");
		}
	
	
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	
	   return driver;
				
}
		
	
	public Properties init_properties() {
		
		prop = new Properties();
		
		try {
			FileInputStream ip = new FileInputStream(".\\src\\main\\java\\com\\qa\\ecom\\properties\\config.properties");
		
			prop.load(ip);
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return prop;
	}
	

}
