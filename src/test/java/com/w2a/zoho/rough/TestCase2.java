package com.w2a.zoho.rough;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import com.w2a.zoho.PageObjects.ZohoHomePage;
import com.w2a.zoho.PageObjects.ZohoLoginPage;
import com.w2a.zoho.testcases.BaseTest;
import com.w2a.zoho.utilities.DataProviders;

public class TestCase2  extends BaseTest{

	@Test(dataProviderClass=DataProviders.class,dataProvider="masterDP")
	public void doLogin(String username, String password, String browser) {

	
		openBrowser(browser);
	
		ZohoHomePage home = new ZohoHomePage();
		/*ZohoLoginPage login = home.gotoLogin();
		login.doLogin("trainer@way2automation.com", "Selenium@1234");
	*/
		quit();
	}

	

}
