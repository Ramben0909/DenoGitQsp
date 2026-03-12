package Responses.json;


@Test
public void fetchAllProducts() throws IOException
{
	Response res = given()
	.auth().oauth2(accessToken)
	.relaxedHTTPSValidation()
	.contentType("application/json")
	.baseUri(baseUrl)
	.queryParam("zoneId",zoneId)
	.when()
	.get("products");
	
//	List<Integer> productIds = res.jsonPath().getList("data.productId");
	List<Integer> productIds = res.path("data.productId");
	int min = 0 , max = productIds.size();
	productId = productIds.get((int) (Math.random() * (max - min)) + min);
	System.out.println(productId);
	
	res.then()
	.assertThat().statusCode(200)
	.log().all();
	
	//Store in a file for excessive long responses
	FileWriter file = new FileWriter("src/test/resources/response.json");
	file.write(res.asPrettyString());
	file.close();
}