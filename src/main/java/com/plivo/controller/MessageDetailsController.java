package com.plivo.controller;

import com.plivo.model.Number.response.Number;
import com.plivo.model.details.response.DetailsResponse;
import com.plivo.utils.ReadProperties;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class MessageDetailsController {
    static String authID = ReadProperties.getInstance().getValue("authID");
    static String authToken = ReadProperties.getInstance().getValue("authToken");
    String requestURL = ReadProperties.getInstance().getValue("baseUri") + "Account/" + authID + "/Message/";

    /*
    getMessageDetails will invoke the details API which accepts messageUUID and return the details of the message.
     */
    public DetailsResponse getMessageDetails(String messageUUID) throws Exception {
        DetailsResponse response;
        try {
            String reqUrl = requestURL + messageUUID;
            response = given()
                    .auth()
                    .preemptive()
                    .basic(authID, authToken)
                    .contentType(ContentType.JSON)
                    .get(reqUrl)
                    .as(DetailsResponse.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return response;
    }

    public String getDeductedAmount(DetailsResponse response) {
        return response.getTotalAmount().toString();
    }
}
