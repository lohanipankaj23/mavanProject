package APIJANBATCH.mavenproject;
 
import static io.restassured.RestAssured.*; 
public class GetRequestTC
{
	public static void main(String[] args)
	{
		Response test=
    given()
    .ContentType(ContentType.JSON)
    .When()
    .get("http://localhost:3000/APIFolks");
    
    System.outprintln("status code is "+r.getStatusCode());
    
    System.out.println("Response data is");
    System.out.println(r.asString());
	}
}
