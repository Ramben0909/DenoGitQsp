package ShopperWithPojo;

import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.is;


public class ShopperCart extends BaseClass{
	
	CartPojo payload;
	
	@Test(dependsOnMethods = "ShopperWithPojo.ProductViewActions.fetchAllProducts")
	public void addProductToCart()
	{
		payload = new CartPojo(productId , quantity+1);
		Response res = given()
			.contentType("application/json")
			.relaxedHTTPSValidation()
			.auth().oauth2(accessToken)
			.baseUri(baseUrl)
			.body(payload)
			.pathParam("shopperId", shopperId)
		.when()
			.post("/shoppers/{shopperId}/carts");
		
		itemId = res.path("data.itemId");
		res.then()
			.statusCode(anyOf(is(409), is(201)))
			.log().all();
	}
	
	@Test(dependsOnMethods = "addProductToCart")
	public void updateCart()
	{
		payload.setQuantity(3);
		given()
			.contentType("application/json")
			.relaxedHTTPSValidation()
			.auth().oauth2(accessToken)
			.baseUri(baseUrl)
			.body(payload)
			.pathParams("shopperId", shopperId, "itemId", itemId)
		.when()
		.put("shoppers/{shopperId}/carts/{itemId}")
		.then()
		.statusCode(200)
		.log().all();
	}
	
	@Test(dependsOnMethods = "updateCart")
	public void DeleteFromCart()
	{
		given()
			.contentType("application/json")
			.relaxedHTTPSValidation()
			.auth().oauth2(accessToken)
			.baseUri(baseUrl)
			.pathParams("shopperId", shopperId, "productId", productId)
		.when()
			.delete("shoppers/{shopperId}/carts/{productId}")
		.then()
		.statusCode(200)
		.log().all();
	}
	
}
