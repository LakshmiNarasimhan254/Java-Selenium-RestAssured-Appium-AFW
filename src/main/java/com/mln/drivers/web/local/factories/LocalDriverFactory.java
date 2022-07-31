package com.mln.drivers.web.local.factories;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

import org.openqa.selenium.WebDriver;

import com.mln.config.ConfigFactory;
import com.mln.drivers.web.local.managers.ChromeManager;
import com.mln.drivers.web.local.managers.EdgeManager;
import com.mln.enums.BrowserType;

public final class LocalDriverFactory {
	static WebDriver Driver;
	private LocalDriverFactory() {}
	
	private static Map<BrowserType,Supplier<WebDriver>> LocalDriverMap =new EnumMap<>(BrowserType.class);
	private static Supplier<WebDriver>CHROME = ChromeManager::getDriver;//This is another way of writing Lamda function
	private static Supplier<WebDriver>EDGE = ()->EdgeManager.getDriver();
	
	static {
		LocalDriverMap.put(BrowserType.CHROME, CHROME);
		LocalDriverMap.put(BrowserType.EDGE, EDGE);
	}
	

	public static WebDriver getDriver(BrowserType browserType) {
		return LocalDriverMap.get(browserType).get();
	}


}
