package com.mln.drivers.factories;

import org.openqa.selenium.WebDriver;

import com.mln.drivers.managers.web.remote.RemoteChromeManager;
import com.mln.drivers.managers.web.remote.RemoteEdgeManager;
import com.mln.enums.BrowserType;

public class SeleniumGridFactory {
	private SeleniumGridFactory() {
	}
	public static WebDriver getDriver(BrowserType browserType) {
		return (isBrowserChrome(browserType))? 
				RemoteChromeManager.getDriver(): 
					RemoteEdgeManager.getDriver();
	}

	private static boolean isBrowserChrome(BrowserType browserType) {
		return browserType	== BrowserType.CHROME;
	}

	

}
