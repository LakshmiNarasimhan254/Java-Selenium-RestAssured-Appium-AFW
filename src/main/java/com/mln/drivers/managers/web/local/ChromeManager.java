package com.mln.drivers.managers.web.local;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public final class ChromeManager {
	
	static WebDriver driver;
	private ChromeManager() {}
	
	public static WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;			
	}
	

}
