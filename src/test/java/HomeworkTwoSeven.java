import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

public class HomeworkTwoSeven {
    public static void main(String[] args) {
        Map<String, String> headers = new HashMap<>();
        headers.put("myHeader1", "myValue1");
        headers.put("myHeader2", "myValue2");

        Response response = RestAssured
                .given()
                .redirects()
                .follow(true)
                .when()
                .get("https://playground.learnqa.ru/api/long_redirect")
                .andReturn();
        int statusCode = response.getStatusCode();
        if (statusCode != 200) {
            System.out.println("Не может быть, чтобы я верно решила это задание");
        } else {
            System.out.println(statusCode);
        }


    }
}
