package com.mln.drivers.web.local.managers;

import org.openqa.selenium.WebDriver;

import com.mln.config.ConfigFactory;
import com.mln.drivers.web.local.factories.LocalDriverFactory;


public final class DriverManager {
	private DriverManager() {}

	public static void initDriver() {
		WebDriver driver = LocalDriverFactory.getDriver(ConfigFactory.getConfig().browser());
	}
	
}
