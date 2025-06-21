package com.abc.utility.json;

public class JsonUtilityTest {

	public static void main(String[] args) {

		String filePath = "src/test/java/com/abc/utility/json/sample.json";
		String updatedJSON = JsonUtility.addNewAttributeToJson(filePath, "status", "active"); 
		System.out.println("Modified JSON with new attribute" + updatedJSON );
		
	}

}
