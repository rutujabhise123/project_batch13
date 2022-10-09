package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	
	//Load config properties
	
	Properties pro;
	
	public ConfigDataProvider() throws Exception {
		
		String pathfile="C:\\Users\\Rutuja Bhise\\eclipse-workspace\\Framework_Batch_13\\Config\\Config.properties";
		FileInputStream file=new FileInputStream(pathfile);
		
		Properties pro=new Properties();
		pro.load(file);
		
	}

	//url
	public String getBaseUrl() {
		return pro.getProperty("BaseUrl");
	}
}
