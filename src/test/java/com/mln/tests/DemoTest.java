package com.mln.tests;



import org.testng.annotations.Test;
import com.mln.config.ConfigFactory;



public class DemoTest {

	@Test
	public void testLogin(){
		//FrameworkConfig config = ConfigFactory.create(FrameworkConfig.class);			
		System.out.println(ConfigFactory.getConfig().browser());
	}


}
