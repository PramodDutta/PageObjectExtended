package com.w2a.zoho.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.w2a.zoho.utilities.DriverManager;

public class ZohoHomePage extends BasePage {
		
	@FindBy(xpath="/html/body/div[1]/div/a[3]")
	public WebElement logIn;
	
	public ZohoHomePage open(String url) {
	
		System.out.println("Page Opened");
		DriverManager.getDriver().navigate().to(url);
		return (ZohoHomePage) openPage(ZohoHomePage.class);
	}
	
	public ZohoLoginPage gotoLogin(){
		System.out.println("inside go to login");
		click(logIn, "Login Link");
		return (ZohoLoginPage) openPage(ZohoLoginPage.class);
			
	}


	@Override
	protected ExpectedCondition getPageLoadCondition() {
		// TODO Auto-generated method stub
		return ExpectedConditions.visibilityOf(logIn);
	}
	
	
	

}
