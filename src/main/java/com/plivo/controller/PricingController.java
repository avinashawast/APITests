package com.plivo.controller;

import com.plivo.model.pricing.response.*;
import com.plivo.utils.ReadProperties;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class PricingController {
    static String authID = ReadProperties.getInstance().getValue("authID");
    static String authToken = ReadProperties.getInstance().getValue("authToken");
    String requestURL = ReadProperties.getInstance().getValue("baseUri") + "Account/" + authID + "/Pricing/";

    /*
    getPricingResponse will invoke the Pricing API which accepts 2 digit country code and return the pricing details of the country.
     */
    public PricingResponse getPricingResponse(String countryCode) throws Exception {
        PricingResponse response;
        try {
            String reqUrl = requestURL + "?country_iso=" + countryCode;
            response = given()
                    .auth()
                    .preemptive()
                    .basic(authID, authToken)
                    .contentType(ContentType.JSON)
                    .get(reqUrl)
                    .as(PricingResponse.class);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return response;
    }

    public String getOutboundRate(PricingResponse response) {
        return response.getMessage().getOutbound().getRate().toString();
    }

}
