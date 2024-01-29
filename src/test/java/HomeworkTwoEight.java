import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class HomeworkTwoEight {

    public static void main(String[] args) throws InterruptedException {

        Response response = RestAssured
                .get("https://playground.learnqa.ru/ajax/api/longtime_job")
                .andReturn();
        response.prettyPrint();


        Response responseForError = RestAssured
                .given()
                .queryParam("token", "1234567")
                .get("https://playground.learnqa.ru/ajax/api/longtime_job")
                .andReturn();
                responseForError.print();

                Thread.sleep(18);

                Response responseForSuccess = RestAssured
                        .given()
                        .queryParam("token", "QNzojNzojNxASOy0SMw0CNyAjM")
                        .get("https://playground.learnqa.ru/ajax/api/longtime_job")
                        .andReturn();
                responseForSuccess.print();



    }
}
