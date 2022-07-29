package com.mln.config;

import java.net.URL;

import org.aeonbits.owner.Config;

import com.mln.converters.StringToBrowserRemoteModeType;
import com.mln.converters.StringToBrowserRunModeType;
import com.mln.converters.StringToBrowserType;
import com.mln.converters.StringToURL;
import com.mln.enums.BrowserRemoteModeType;
import com.mln.enums.BrowserRunModeType;
import com.mln.enums.BrowserType;
@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({ 
	"system:properties",
	"system:env",
	"file:${user.dir}/src/test/resources/config.properties"
})
public interface FrameworkConfig extends Config {

	@DefaultValue("CHROME")
	@ConverterClass(StringToBrowserType.class)
	BrowserType browser();	

	@DefaultValue("LOCAL")
	@ConverterClass(StringToBrowserRunModeType.class)
	BrowserRunModeType browserRunMode();
	
	@DefaultValue("NOT_APPLICABLE")
	@ConverterClass(StringToBrowserRemoteModeType.class)
	BrowserRemoteModeType browserRemoteMode();
	
	@ConverterClass(StringToURL.class)
	URL seleniumGridURL();
	
	

}	
