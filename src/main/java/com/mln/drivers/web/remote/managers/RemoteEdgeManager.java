package com.mln.drivers.web.remote.managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.mln.config.ConfigFactory;
import com.mln.enums.BrowserType;

public final class RemoteEdgeManager {
	WebDriver driver;
	private RemoteEdgeManager() {
	}

	public static WebDriver getDriver() {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setBrowserName(BrowserType.EDGE.toString());
		return new RemoteWebDriver(ConfigFactory.getConfig().seleniumGridURL(),desiredCapabilities);
	}
}
