package com.abc.users.SD.userCreate;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONObject;
import org.junit.Assert;

import com.abc.utility.JsonUtility;
import com.abc.utility.common.PropertiesOperation;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UserDelete_SD {
	
	PropertiesOperation prop = new PropertiesOperation();
	Response res ;
	
	@Given("Hit create user API")
	public void hit_create_user_api() throws IOException {
		res = RestAssured
				.given()
				.accept(ContentType.JSON)
				.body("{\r\n"
						+ "    \"name\": \"Mahesh Awale\",\r\n"
						+ "    \"job\": \"QA leader\",\r\n"
						+ "    \"mob\": \"122\",\r\n"
						+ "    \"dept\": \"QA-Automation\",\r\n"
						+ "    \"location\": \"Pune\"\r\n"
						+ "}\r\n"
						+ "")
				.post(prop.getPropValue(""));
	}
	@Then("create new user in system")
	public void create_new_user_in_system() {
	    int statusCode = res.getStatusCode();
	    System.out.println("statuc code ="+statusCode);
	    String resData = res.body().asString();
	    String resData1 =res.getBody().asPrettyString();
	    System.out.println("==="+resData);
	    System.out.println("==="+resData1);
	}
	@Then("validate user created")
	public void validate_user_created() {
		Assert.assertTrue(res.getStatusCode() == 201);
		
		String idValue = res.body().jsonPath().getString("id");
		System.out.println(" ID = "+ idValue);
		Assert.assertTrue(Integer.parseInt(idValue) > 0);
		
		String createdAtValue = res.body().jsonPath().getString("createdAt");
		System.out.println(" time = "+ createdAtValue);
		// String todaysDate = write some code which will always return todays date
		//Assert.assertTrue(createdAtValue.contains(todaysDate"));
	}
	
	@Then("create new user in system with extra attribute of {string} with value {string}")
	public void create_new_user_in_system_with_extra_attribute_of(String attrName,String attrValue ) throws IOException {
		String jsonData  = new String (Files.readAllBytes(Paths.get("src/test/resources/com/abc/users/jsons/createUser.json")));
		JSONObject jsonObj = new JSONObject(jsonData);
		String userJsonString = jsonObj.toString();;
		JsonUtility jsonUtilyObj = new JsonUtility();
		String modifiedJsonString=  jsonUtilyObj.addNewAttributeToJson(attrName, userJsonString);
		res = RestAssured
				.given()
				.accept(ContentType.JSON)
				.body(modifiedJsonString)
				.post(postUrl);
		
	}

	
	

}
