package test.java.com.example;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


 public class brandNewDeck {
//    @Test
//    public void New_Deck() {
//       RestAssured.baseURI = "http://deckofcardsapi.com";
//       Response response = given().log().all().queryParam("jokers_enabled", true).

//             when().get("api/deck/new/").then().extract().response();

//       System.out.println(response.asPrettyString());
// // ResponseBody b = response.getBody();
// // String responseBody = b.asString();
// //       JsonPath js = response.jsonPath();
// //       System.out.println(responseBody);
//    }

   @Test
   public void getDeck() {
      RestAssured.baseURI = "http://deckofcardsapi.com/api/deck";
      Response response = given()
            .contentType(ContentType.JSON)
            .get("/new/")
            .then()
            .extract().response();

      JsonPath jsonPathEvaluator = response.jsonPath();
      String deck_id = jsonPathEvaluator.get("deck_id");
      System.out.println(deck_id);
   }
}
