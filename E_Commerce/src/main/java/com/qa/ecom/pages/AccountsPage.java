package com.qa.ecom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.ecom.base.BasePage;

public class AccountsPage extends BasePage{
	
	
	private WebDriver driver;
	
	//1.By Locators

	private By section_Headers= By.xpath("//div[@id='content']/h2");
	private By search_text= By.xpath("//div[@id='search']/input[@name='search']");
	private By search_button= By.xpath("//span[@class='input-group-btn']/button[@type='button']");

	
	
  public AccountsPage(WebDriver driver){
		
		this.driver=driver;
	}
	
	// Page Actions
  
  public String getHomePageTitle(){
		
		return driver.getTitle();
		
	}
	
  public void getAccountSectionCounts() {
	  
	  

	  
  }
  

}
