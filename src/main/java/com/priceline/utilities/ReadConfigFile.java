package com.priceline.utilities;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



public class ReadConfigFile {
	public InputStream input = null;
	public Properties property = null;
	
	public ReadConfigFile() {

		
	input = ReadConfigFile.class.getClassLoader().getResourceAsStream("com//priceline//resources//dataFile.properties");
		//input = ReadConfigFile.class.getClassLoader().getResourceAsStream("resources//config.properties");
		property = new Properties();
		try {
			property.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// This method is to retrieve values from Browser field 
	public String getBrowser() {
		if(property.getProperty("browser") == null)
			return "Browser is null";
		return property.getProperty("browser");
	}

	public String getUrl() {
		if(property.getProperty("url") == null)
			return "url is null";
		return property.getProperty("url");
		
	}
}
