package com.plivo.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.plivo.model.message.request.MessageRequest;
import com.plivo.model.message.response.MessageResponse;
import com.plivo.utils.ReadProperties;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class MessageController {
    static String authID = ReadProperties.getInstance().getValue("authID");
    static String authToken = ReadProperties.getInstance().getValue("authToken");

    private static final ObjectMapper MAPPER = new ObjectMapper();
    String requestURL = ReadProperties.getInstance().getValue("baseUri") + "Account/" + authID + "/Message/";

    /*
    sendMessage() is used to send SMS(text message, passed in param) from srcNum to destNum
     */
    public MessageResponse sendMessage(String srcNum, String destNum, String message) throws JsonProcessingException {
        MessageRequest req = new MessageRequest();
        MessageResponse res;
        try {
            req.setSrc(srcNum);
            req.setDst(destNum);
            req.setText(message);
            String json = MAPPER.writeValueAsString(req);
            res = given()
                    .auth()
                    .preemptive()
                    .basic(authID, authToken)
                    .contentType(ContentType.JSON)
                    .log()
                    .all(true)
                    .body(json)
                    .post(requestURL)
                    .as(MessageResponse.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            throw e;
        }
        return res;
    }

    /*
    getMessageUUID fetches the message UUID from sendMessage response.
     */
    public String getMessageUUID(MessageResponse mRes) {
        return mRes.getMessageUuid().get(0);
    }
}
