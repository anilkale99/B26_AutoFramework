package com.abc.utility.json;

import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONObject;

public class JsonUtility {
	
	
	public static String  addNewAttributeToJson(String pathOfJsonFile, String attributeToAdd, String defaultValue) {
		
		try {
				String jsonContent = new String(Files.readAllBytes(Paths.get(pathOfJsonFile)));
				
				JSONObject jsonObject = new JSONObject(jsonContent);
				
				jsonObject.put(attributeToAdd, defaultValue);
				
				return jsonObject.toString(2);
			
		} catch (Exception e) {
			
				e.printStackTrace();
				return null;
		}
		
		
	}
	
	public static String deleteAttributeFromJson(String pathOfJsonFile, String attributeToDelete) {
		
		try {
			String jsonContent = new String(Files.readAllBytes(Paths.get(pathOfJsonFile)));
			
			JSONObject jsonObject = new JSONObject(jsonContent);
			
			jsonObject.remove(attributeToDelete);
			
			return jsonObject.toString(2);
		
		} catch (Exception e) {
		
			e.printStackTrace();
			return null;
		}
		
	}

}
