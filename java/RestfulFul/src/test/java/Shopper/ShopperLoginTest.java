package Shopper;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class ShopperLoginTest {
	private final static String baseUrl = "https://www.shoppersstack.com/shopping";
	private static String accessToken;
	private static int shopperId;
	@Test
	public void loginTest()
	{
		HashMap<String, Object> body = new HashMap<>();

		body.put("email", "ritam117bhattacharya@gmail.com");
		body.put("password", "abc12@JH");
		body.put("role", "SHOPPER");
		
		Response res = given()
				.contentType("application/json")
				.relaxedHTTPSValidation()  
				.body(body)
				.baseUri(baseUrl)
				.when()
				.post("/users/login");
			
		res.then()
			.assertThat().statusCode(200)
			.log().all();
		
		accessToken = res.path("data.jwtToken"); 
		shopperId = res.jsonPath().getInt("data.userId");
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void fetchData()
	{
		given()
			.contentType("application/json")
			.auth().oauth2(accessToken)
			.pathParam("shopperId", shopperId)
			.baseUri(baseUrl)
			.relaxedHTTPSValidation()
		.when()
			.get("/shoppers/{shopperId}")
		.then()
			.assertThat().statusCode(200)
			.log().all();
	}

}