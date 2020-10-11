package com.plivo.model.message.response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "api_id",
        "message",
        "message_uuid"
})
public class MessageResponse {

    @JsonProperty("api_id")
    private String apiId;
    @JsonProperty("message")
    private String message;
    @JsonProperty("message_uuid")
    private List<String> messageUuid = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("api_id")
    public String getApiId() {
        return apiId;
    }

    @JsonProperty("api_id")
    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    @JsonProperty("message_uuid")
    public List<String> getMessageUuid() {
        return messageUuid;
    }

    @JsonProperty("message_uuid")
    public void setMessageUuid(List<String> messageUuid) {
        this.messageUuid = messageUuid;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("apiId", apiId).append("message", message).append("messageUuid", messageUuid).append("additionalProperties", additionalProperties).toString();
    }

}