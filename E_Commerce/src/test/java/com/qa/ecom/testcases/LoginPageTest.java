package com.qa.ecom.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.ecom.base.BaseTest;
import com.qa.ecom.constants.Constants;

public class LoginPageTest extends BaseTest{
	
	@Test
	public void loginPageTitleTest() {
		
		String title=loginpage.getLoginPageTitle();
		
		System.out.println("Login page title is " +title);
		
		Assert.assertEquals(title, Constants.LOGIN_PAGE_TITLE);
		
	}
	
	@Test
	public void yourStoreLinkTest() {
		
		Assert.assertTrue(loginpage.isYourStoreLinkExists());
	}
	

	@Test
	public void loginTest(){
		
		loginpage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
		
		
	}
	
}
