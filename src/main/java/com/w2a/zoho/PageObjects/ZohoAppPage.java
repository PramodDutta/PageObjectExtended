package com.w2a.zoho.PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ZohoAppPage extends BasePage{
	
	
	@FindBy(xpath="//*[contains(text(),'Cliq')]")
	public WebElement cliq;
	

	@FindBy(xpath="//*[contains(text(),'Creator')]")
	public WebElement creator;
	
	
	@FindBy(xpath="//*[contains(text(),'CRM')]")
	public WebElement crm;
	
	
	@FindBy(xpath="//*[contains(text(),'SalesIQ')]")
	public WebElement salesIQ;
	
	
	@FindBy(xpath="//*[contains(text(),'Subscriptions')]")
	public WebElement subscriptions;
	
	
	
	@Override
	protected ExpectedCondition getPageLoadCondition() {
		// TODO Auto-generated method stub
		return ExpectedConditions.visibilityOf(crm);
	}

	
	public ZohoCRMPage gotoCRM() {
		
		click(crm,"CRM Link");
		return (ZohoCRMPage) openPage(ZohoCRMPage.class);
	}
	
	public ZohoCliqPage gotoCliq() {
		
		click(cliq,"Cliq Link");
		return (ZohoCliqPage) openPage(ZohoCliqPage.class);
	}
	
	public ZohoSubscriptionsPage gotoSubscriptions() {
		
		click(subscriptions,"Subscriptions Link");
		return (ZohoSubscriptionsPage) openPage(ZohoSubscriptionsPage.class);
	}
	
	public ZohoCreatorPage gotoCreator() {
		
		click(creator,"Creator Link");
		return (ZohoCreatorPage) openPage(ZohoCreatorPage.class);

	}
	
	public ZohoSalesIQPage gotoSalesIQ() {
		
		click(salesIQ,"SalesIQ Link");
		return (ZohoSalesIQPage) openPage(ZohoSalesIQPage.class);
	}
	
	
	
}
