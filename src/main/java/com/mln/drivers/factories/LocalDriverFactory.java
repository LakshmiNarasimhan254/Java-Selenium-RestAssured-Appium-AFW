package com.mln.drivers.factories;

import org.openqa.selenium.WebDriver;

import com.mln.config.ConfigFactory;
import com.mln.drivers.managers.web.local.ChromeManager;
import com.mln.drivers.managers.web.local.EdgeManager;
import com.mln.enums.BrowserType;

public final class LocalDriverFactory {
	static WebDriver Driver;
	private LocalDriverFactory() {}
	

	public static WebDriver getDriver(BrowserType browserType) {
		return (isBrowserChrome(browserType))? 
				ChromeManager.getDriver(): 
				EdgeManager.getDriver();
	}

	private static boolean isBrowserChrome(BrowserType browserType) {
		return browserType	== BrowserType.CHROME;
	}


}
