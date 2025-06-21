package com.abc.utility.common;

import java.io.IOException;

public class TestPropertiesOp {

	public static void main(String[] args) throws IOException {
		PropertiesOperation prop = new PropertiesOperation();
		
		String urlString =  prop.getPropValue("APIURL_QA");
		System.out.println("URL = "+urlString);

	}

}
