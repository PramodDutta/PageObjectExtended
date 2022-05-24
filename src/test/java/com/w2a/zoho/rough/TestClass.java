package com.w2a.zoho.rough;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestClass {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://zoho.com");

	}

}
