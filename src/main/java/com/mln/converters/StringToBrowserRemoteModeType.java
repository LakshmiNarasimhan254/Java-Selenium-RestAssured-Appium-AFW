package com.mln.converters;

import java.lang.reflect.Method;
import java.util.Map;

import org.aeonbits.owner.Converter;

import com.mln.enums.BrowserRemoteModeType;
import com.mln.enums.BrowserType;

public class StringToBrowserRemoteModeType implements Converter<BrowserRemoteModeType> {

	@Override
	public BrowserRemoteModeType convert(Method method, String browserRemoteMode) {
		browserRemoteMode= browserRemoteMode.toUpperCase();
		Map<String,BrowserRemoteModeType> StringToBrowserRemoteModeTypeMap =  Map.of(
					"SELENIUM_GRID",BrowserRemoteModeType.SELENIUM_GRID,
					"SELENOID",BrowserRemoteModeType.SELENOID,
					"BROSWER_STACK",BrowserRemoteModeType.BROWSER_STACK,
					"NOT_APPLICABLE",BrowserRemoteModeType.NOT_APPLICABLE);
		
		return StringToBrowserRemoteModeTypeMap.getOrDefault(StringToBrowserRemoteModeTypeMap, BrowserRemoteModeType.NOT_APPLICABLE);
	}

}
