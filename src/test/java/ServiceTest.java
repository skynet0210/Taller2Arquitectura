import io.restassured.RestAssured;
import static io.restassured.RestAssured.get;
import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.BeforeClass;
import org.junit.Test;


public class ServiceTest {
    @BeforeClass
    public  static void init() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = 4567;
    }

    @Test
    public void testIntegranteListSuccess() {
        get("/group/3/student/2")
                .then()
                .body("pos", equalTo(2))
                .body("nombre", equalTo("Antse Caceres"))
                .body("email", equalTo("Acaceres6utpl.edu.ec"));

    }
}
