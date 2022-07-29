package com.mln.drivers.managers.web.local;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public final class EdgeManager {

	static WebDriver driver;
	private EdgeManager() {}

	public static WebDriver getDriver() {
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		return driver;			
	}

}
