import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

public class HomeworkTwoSix {
    public static void main(String[] args) {
        Map<String, String> headers = new HashMap<>();
        headers.put("myHeader1", "myValue1");
        headers.put("myHeader2", "myValue2");

        Response response = RestAssured
                .given()
                .redirects()
                .follow(false)
                .when()
                .get("https://playground.learnqa.ru/api/long_redirect")
                .andReturn();
        String locationHeader = response.getHeader("Location");
        System.out.println(locationHeader);

    }

}
