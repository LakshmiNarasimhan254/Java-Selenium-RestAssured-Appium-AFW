package com.mln.drivers.factories;

import org.openqa.selenium.WebDriver;


import com.mln.enums.BrowserRemoteModeType;
import com.mln.enums.BrowserType;

public class RemoteDriverFactory {
	private RemoteDriverFactory(){}

	public static WebDriver getDriver(BrowserRemoteModeType browserRemoteMode,BrowserType browserType) {

		if (browserRemoteMode==BrowserRemoteModeType.SELENIUM_GRID) {	
			return SeleniumGridFactory.getDriver(browserType);
			
		}else if (browserRemoteMode==BrowserRemoteModeType.SELENOID) {

		}else if (browserRemoteMode==BrowserRemoteModeType.BROWSER_STACK) {

		}else {

		}
		return null;
	}

}
