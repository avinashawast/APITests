package com.plivo.controller;

import com.plivo.model.Number.response.Number;
import com.plivo.utils.ReadProperties;
import io.restassured.http.ContentType;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class NumberController {
    static String authID = ReadProperties.getInstance().getValue("authID");
    static String authToken = ReadProperties.getInstance().getValue("authToken");
    String requestURL = ReadProperties.getInstance().getValue("baseUri") + "Account/" + authID + "/Number/";

    public Number getNumResponse() throws Exception {
        Number num;
        try{
            num = given()
                    .auth()
                    .preemptive()
                    .basic(authID, authToken)
                    .contentType(ContentType.JSON)
                    .get(requestURL)
                    .as(Number.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return num;
    }
    /*
    getNNumbers(int N) is used to fetch a list of N Phone Numbers from <baseURL>/Number/ API
     */
    public List<String> getNNumbers(int N) throws Exception {
        List<String> Numbers = new ArrayList();
        try {
        Number num = getNumResponse();
            for (int i = 0; i < N; i++) {
                Numbers.add(num.getObjects().get(i).getNumber());
            }
        } catch (Exception e) {
            System.out.println("Exception while getting Numbers from " + requestURL + " API");
            e.printStackTrace();
        }
        return Numbers;
    }
}
