package com.mln.converters;

import java.lang.reflect.Method;
import java.util.Map;

import org.aeonbits.owner.Converter;

import com.mln.enums.BrowserRemoteModeType;
import com.mln.enums.BrowserType;

public class StringToBrowserType implements Converter<BrowserType> {
	@Override
	public BrowserType convert(Method method, String browser) {
		browser= browser.toUpperCase();
		Map<String,BrowserType> StringToBrowserTypeMap =  Map.of("CHROME",BrowserType.CHROME,"EDGE",BrowserType.EDGE);
		return StringToBrowserTypeMap.getOrDefault(browser, BrowserType.CHROME);
	}

}
