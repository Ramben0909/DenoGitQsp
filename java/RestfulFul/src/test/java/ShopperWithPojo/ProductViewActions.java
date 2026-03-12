package ShopperWithPojo;

import java.util.List;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class ProductViewActions extends BaseClass{
	
	@Test
	public void fetchAllProducts(){
		
		Response res = given()
		.auth().oauth2(accessToken)
		.relaxedHTTPSValidation()
		.contentType("application/json")
		.baseUri(baseUrl)
		.queryParam("zoneId",zoneId)
		.when()
		.get("products");
		
		List<Integer> productIds = res.jsonPath().getList("data.productId");
//		List<Integer> productIds = res.path("data.productId");
		int min = 0 , max = productIds.size();
		productId = productIds.get((int) (Math.random() * (max - min)) + min);
		System.out.println(productId);
		quantity = res.jsonPath().getInt("data[0].quantity");
		System.out.println(quantity);
		
		res.then()
		.assertThat().statusCode(200)
		.log().all();
	}
}
