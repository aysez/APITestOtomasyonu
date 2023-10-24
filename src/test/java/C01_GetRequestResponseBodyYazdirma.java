import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C01_GetRequestResponseBodyYazdirma {

    @Test
    public void get01(){
        //1-Request body ve end-point hazirlama
        String url="https://restful-booker.herokuapp.com/booking/100";
        //2- Expected data hazirlama
        //3-Request gonderip, response'i kaydetme
        Response response = given().when().get(url);
        response.prettyPrint();//bodyi yazdirmak icin kullaniyoruz
        //4-Assertion
    }
}
