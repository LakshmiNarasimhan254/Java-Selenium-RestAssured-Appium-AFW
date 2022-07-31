package com.mln.drivers.web.remote.factories;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

import org.openqa.selenium.WebDriver;

import com.mln.drivers.web.remote.managers.RemoteChromeManager;
import com.mln.drivers.web.remote.managers.RemoteEdgeManager;
import com.mln.enums.BrowserType;

public class SeleniumGridFactory {
	private SeleniumGridFactory() {
	}
	
	private static Map<BrowserType,Supplier<WebDriver>>SeleniumGridMap  = new EnumMap(BrowserType.class);
	private static Supplier<WebDriver>RemoteCHROME = ()->RemoteChromeManager.getDriver();
	private static Supplier<WebDriver>RemoteEDGE = ()->RemoteEdgeManager.getDriver();
	static {
		SeleniumGridMap.put(BrowserType.CHROME, RemoteCHROME);
		SeleniumGridMap.put(BrowserType.EDGE, RemoteEDGE);
	}
	
	public static WebDriver getDriver(BrowserType browserType) {
		return SeleniumGridMap.get(browserType).get();
	}

	
	

}
