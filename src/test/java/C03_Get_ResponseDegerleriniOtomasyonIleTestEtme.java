import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C03_Get_ResponseDegerleriniOtomasyonIleTestEtme
{
    @Test
    public void test02(){

        /*
        https://restful-booker.herokuapp.com/booking/10 url’ine
        bir GET request gonderdigimizde donen Response’un,
        status code’unun 200,
        ve content type’inin application/json; charset=utf-8,
        ve Server isimli Header’in degerinin Cowboy,
        ve status Line’in HTTP/1.1 200 OK
        test edin
         */
        //
        // 1- end point ve request body olustur

        String url= "https://restful-booker.herokuapp.com/booking/10";

        // 2- Expected body olustur
        // 3- Request gonderip, donen response'i kaydet

        Response response= given().when().get(url);//endpointe gidip request yapicak ve response donecek

        // 4- Assertion
        response
                .then()//response al
                .assertThat()// dogrulama, verification
                .statusCode(200)//status code u test et
                .contentType("application/json; charset=utf-8")//application jsoni test et
                .header("Server", "Cowboy")// server isimli headerin cowbpy oldugunu test et
                .statusLine("HTTP/1.1 200 OK"); //status line i test et

    }
}

