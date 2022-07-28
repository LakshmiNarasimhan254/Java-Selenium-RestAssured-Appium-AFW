package com.mln.config;

import org.aeonbits.owner.Config;

import com.mln.config.converters.StringToBrowserType;
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


}	
