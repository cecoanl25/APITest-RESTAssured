import io.restassured.http.ContentType;
import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;
public class RestAssuredTest {


    @Test
    public void userTest() {
        long sure = given()
        .when()
                .get("https://reqres.in/api/users/2")
                .then().
                    log().all().
                and().
                statusCode(200)
                .body("data.email", equalTo("janet.weaver@reqres.in"))
                .time(lessThan(1000L))
                .extract().time();

        System.out.println("Yanıt süresi: " + sure);

    }

    @Test
    public void petTest(){
        long sure = given()
        .when()
                .get("https://petstore.swagger.io/v2/pet/2")

                .then().
                    log().all().
                and().
                statusCode(200)
                .body("category.name", equalTo("555"))
                .time(lessThan(1400L))
                .extract().time();

        System.out.println("Yanıt süresi: " + sure);

    }

    @Test
    public void createPostTest() {
        String postData = """
        {
            "title": "test",
            "body": "deneme",
            "userId": 1
        }
    """;

        given()
                .contentType(ContentType.JSON)
                .body(postData)
                .log().all()

                .when()
                .post("https://jsonplaceholder.typicode.com/posts")

                .then()
                    .log().all()

                .statusCode(201)
                .body("title", equalTo("test"))
                .body("body", equalTo("deneme"))
                .body("userId", equalTo(1));
    }
}
