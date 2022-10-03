package test.java.com.example;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class shuffle {
       public static void main(String[] args) {
        RestAssured.baseURI= "http://deckofcardsapi.com";
        given().log().all().queryParam("deck_count", 5).
        
        when().get("/api/deck/new/shuffle/").then().log().all();
}



}