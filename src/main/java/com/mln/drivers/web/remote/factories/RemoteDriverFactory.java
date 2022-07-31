package com.mln.drivers.web.remote.factories;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;

import org.openqa.selenium.WebDriver;


import com.mln.enums.BrowserRemoteModeType;
import com.mln.enums.BrowserType;

public class RemoteDriverFactory {
	private RemoteDriverFactory(){}
	
	private static Map<BrowserRemoteModeType,Function<BrowserType,WebDriver>> RemoteDriveMap = new EnumMap(BrowserRemoteModeType.class);
	private static Function<BrowserType,WebDriver>SELENIUM_GRID =(BrowserType)->SeleniumGridFactory.getDriver(BrowserType);
	//private static Function<BrowserType,WebDriver>SELENIOD =(BrowserType)->SelenoidGridFactory.getDriver(BrowserType);
	//private static Function<BrowserType,WebDriver>BROWSER_STACK =(BrowserType)->BrowserStackGridFactory.getDriver(BrowserType);
	
	static {
		RemoteDriveMap.put(BrowserRemoteModeType.SELENIUM_GRID, SELENIUM_GRID);
		//RemoteDriveMap.put(BrowserRemoteModeType.SELENIOD, SELENIOD);
		//RemoteDriveMap.put(BrowserRemoteModeType.BROWSER_STACK, BROWSER_STACK);
	}
	
	public static WebDriver getDriver(BrowserRemoteModeType browserRemoteMode,BrowserType browserType) {
		return RemoteDriveMap.get(browserRemoteMode).apply(browserType);
		
	}

}
