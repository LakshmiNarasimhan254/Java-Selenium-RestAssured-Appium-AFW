package com.mln.converters;

import java.lang.reflect.Method;
import java.util.Map;

import org.aeonbits.owner.Converter;
import com.mln.enums.BrowserRunModeType;


	public class StringToBrowserRunModeType implements Converter<BrowserRunModeType> {

		@Override
		public BrowserRunModeType convert(Method method, String browserRunMode) {
			browserRunMode= browserRunMode.toUpperCase();
			Map<String,BrowserRunModeType> StringToBrowserRunModeTypeMap =  Map.of(
						"LOCAL",BrowserRunModeType.LOCAL,
						"REMOTE",BrowserRunModeType.REMOTE);	
		   return StringToBrowserRunModeTypeMap.getOrDefault(StringToBrowserRunModeTypeMap, BrowserRunModeType.LOCAL);
		}

	}


