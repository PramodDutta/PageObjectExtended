package com.w2a.zoho.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverManager {

	public static ThreadLocal<WebDriver> dr = new ThreadLocal<WebDriver>();

	public static WebDriver getDriver() {

		return dr.get();

	}

	public static void setWebDriver(WebDriver driver) {

		dr.set(driver);
	}

}
