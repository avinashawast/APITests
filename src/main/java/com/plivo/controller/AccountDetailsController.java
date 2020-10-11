package com.plivo.controller;

import com.plivo.model.account.response.AccountDetailsResponse;
import com.plivo.utils.ReadProperties;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class AccountDetailsController {
    static String authID = ReadProperties.getInstance().getValue("authID");
    static String authToken = ReadProperties.getInstance().getValue("authToken");
    String requestURL = ReadProperties.getInstance().getValue("baseUri") + "Account/" + authID + "/";

    public AccountDetailsResponse getAccountDetails() throws Exception {
        AccountDetailsResponse response;
        try {
            response = given()
                    .auth()
                    .preemptive()
                    .basic(authID, authToken)
                    .contentType(ContentType.JSON)
                    .get(requestURL)
                    .as(AccountDetailsResponse.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return response;
    }

    public String getAccountCashCredits(AccountDetailsResponse response) {
        return response.getCashCredits();
    }
}
