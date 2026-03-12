package ShopperWithPojo;

import static io.restassured.RestAssured.given;
import org.testng.annotations.BeforeClass;
import io.restassured.response.Response;

public class BaseClass{
	public static String baseUrl = "https://www.shoppersstack.com/shopping";
	public static String zoneId = "alpha";
	public static String accessToken;
	public static int shopperId;
	public static int productId;
	public static int itemId;
	public static int quantity;
	
	@BeforeClass
	public void login(){
		
		ShopperLoginPojo body = new ShopperLoginPojo("ritam117bhattacharya@gmail.com", "abc12@JH", "SHOPPER");
		
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
}