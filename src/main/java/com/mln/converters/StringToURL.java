package com.mln.converters;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import org.aeonbits.owner.Converter;

import com.mln.enums.BrowserRemoteModeType;
import com.mln.enums.BrowserType;

public class StringToURL implements Converter<URL> {
	@Override
	public URL convert(Method method, String seleniumGridURL) {
		URL url = null;
		try {
			url = new URL(seleniumGridURL);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return url;
	}

}
