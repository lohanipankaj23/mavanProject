package APIJANBATCH.mavenproject;
 
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GETREQUEST {

	public static void main(String[] args) 
	{
	 
		Response test=	
				
		given()
		.contentType(ContentType.JSON)
		.when()
		.get("http://localhost:3000/APIFolks");
		
		System.out.println("Stats code is " + test.getStatusCode());
		
		System.out.println("Response data is");
		System.out.println(test.asString());
		
		
		
		
	}
}
