package com.mln.drivers;

import org.openqa.selenium.WebDriver;

import com.mln.config.ConfigFactory;
import com.mln.drivers.factories.LocalDriverFactory;


public final class DriverManager {
	private DriverManager() {}

	public static void initDriver() {
		WebDriver driver = LocalDriverFactory.getDriver(ConfigFactory.getConfig().browser());
	}
	
}
