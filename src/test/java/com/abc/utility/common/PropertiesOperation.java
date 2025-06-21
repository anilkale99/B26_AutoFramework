package com.abc.utility.common;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.bouncycastle.asn1.eac.PublicKeyDataObject;
	

public class PropertiesOperation {
	
	public static String filename1= "src/test/resources/com/abc/config/config.properties";
	static String value = null;
	
	
	public static String getPropValue(String PropName) throws IOException {
		FileInputStream inputFile = new FileInputStream(filename1);
		Properties properties = new Properties();
		properties.load(inputFile);
		inputFile.close();
		try {
			value = properties.getProperty(PropName);
		
			if(value == null || value.equals("")){
				System.out.println("The value for key: " +  PropName + " doesn't exist.");
				System.out.println("Please check the content of the properties file.");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		properties.getProperty(PropName);
		return value;
		
		
		
	}

}
