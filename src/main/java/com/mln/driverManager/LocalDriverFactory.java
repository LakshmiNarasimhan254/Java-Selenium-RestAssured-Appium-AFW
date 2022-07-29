package com.mln.driverManager;

import org.openqa.selenium.WebDriver;

import com.mln.config.ConfigFactory;
import com.mln.enums.BrowserType;

public final class LocalDriverFactory {
	static WebDriver Driver;
	private LocalDriverFactory() {}
	

	public static WebDriver getDriver() {
		if (isChrome()) return ChromeManager.getDriver();
		else return EdgeManager.getDriver();
	}

	private static boolean isChrome() {
		return ConfigFactory.getConfig().browser()	== BrowserType.CHROME;
	}


}
