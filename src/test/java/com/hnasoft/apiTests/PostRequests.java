package com.hnasoft.apiTests;

import com.hnasoft.utilities.ConfigurationReader;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


import static io.restassured.RestAssured.*;


import java.util.HashMap;
import java.util.List;
import java.util.Map;




public class PostRequests {

    @BeforeClass
    public void beforeClass(){
        RestAssured.baseURI = ConfigurationReader.getProperty("url");
    }


    @Test
    public void newUserRegister(){
        Map<String,Object> requestMap = new HashMap<>();

        requestMap.put("name","Maria");
        requestMap.put("email","maria@maria.com");
        requestMap.put("password","Maria123$");

        Response response = given().accept(ContentType.JSON)
                .and().contentType(ContentType.JSON)
                .and().body(requestMap)
                .when().post("/api/register");

        //verify status code
        assertEquals(response.statusCode(),200);
        //verify content type
        assertEquals(response.contentType(),"application/json; charset=utf-8");

        //verify message
        String message = response.path("message");
        assertEquals(message,"You have been successfully registered");

        String name = response.path("data.name");
        String email = response.path("data.email");


        //assertion
        assertEquals(name,"Maria");
        assertEquals(email,"maria@maria.com");




    }
}
