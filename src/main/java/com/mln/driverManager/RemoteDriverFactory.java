package com.mln.driverManager;

import org.openqa.selenium.WebDriver;

import com.mln.config.ConfigFactory;
import com.mln.enums.BrowserRemoteModeType;

public class RemoteDriverFactory {
	private RemoteDriverFactory(){}
	
	public static WebDriver getDriver() {
			BrowserRemoteModeType browserRemoteMode = ConfigFactory.getConfig().browserRemoteMode();
			if (browserRemoteMode==BrowserRemoteModeType.SELENIUM_GRID) {
				
			}else if (browserRemoteMode==BrowserRemoteModeType.SELENOID) {
				
			}else if (browserRemoteMode==BrowserRemoteModeType.BROWSER_STACK) {
				
			}else {
				
			}
			return null;
	}

}
