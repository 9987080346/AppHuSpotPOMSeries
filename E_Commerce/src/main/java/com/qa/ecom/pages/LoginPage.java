package com.qa.ecom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.ecom.base.BasePage;

public class LoginPage extends BasePage{
	
	private WebDriver driver;
	
	//1.By Locators
	
	private By email= By.name("email"); 
	private By password= By.name("password"); 
	private By login_button= By.xpath("//input[@type='submit']"); 
	private By yourStore_link=By.linkText("Your Store");

	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
	}
		
	//Page Actions
	
	public String getLoginPageTitle(){
		
		return driver.getTitle();
	}
	
   public boolean isYourStoreLinkExists(){
		
		 return driver.findElement(yourStore_link).isDisplayed();
	}
	
   public void doLogin(String un,String pwd){
	   
	   System.out.println("Login with email and password " +un+"   "+pwd);
	   
	   driver.findElement(email).sendKeys(un);
	   driver.findElement(password).sendKeys(pwd);
	   driver.findElement(login_button).click();
	   
	   System.out.println("Login succsessfully");
	   
	   //return new AccountsPage(driver);
	   
   }

}
