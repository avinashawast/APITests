package com.plivo.model.details.response;

import java.util.HashMap;
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
        "error_code",
        "from_number",
        "message_direction",
        "message_state",
        "message_time",
        "message_type",
        "message_uuid",
        "resource_uri",
        "to_number",
        "total_amount",
        "total_rate",
        "units"
})
public class DetailsResponse {

    @JsonProperty("api_id")
    private String apiId;
    @JsonProperty("error_code")
    private String errorCode;
    @JsonProperty("from_number")
    private String fromNumber;
    @JsonProperty("message_direction")
    private String messageDirection;
    @JsonProperty("message_state")
    private String messageState;
    @JsonProperty("message_time")
    private String messageTime;
    @JsonProperty("message_type")
    private String messageType;
    @JsonProperty("message_uuid")
    private String messageUuid;
    @JsonProperty("resource_uri")
    private String resourceUri;
    @JsonProperty("to_number")
    private String toNumber;
    @JsonProperty("total_amount")
    private String totalAmount;
    @JsonProperty("total_rate")
    private String totalRate;
    @JsonProperty("units")
    private Integer units;
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

    @JsonProperty("error_code")
    public String getErrorCode() {
        return errorCode;
    }

    @JsonProperty("error_code")
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @JsonProperty("from_number")
    public String getFromNumber() {
        return fromNumber;
    }

    @JsonProperty("from_number")
    public void setFromNumber(String fromNumber) {
        this.fromNumber = fromNumber;
    }

    @JsonProperty("message_direction")
    public String getMessageDirection() {
        return messageDirection;
    }

    @JsonProperty("message_direction")
    public void setMessageDirection(String messageDirection) {
        this.messageDirection = messageDirection;
    }

    @JsonProperty("message_state")
    public String getMessageState() {
        return messageState;
    }

    @JsonProperty("message_state")
    public void setMessageState(String messageState) {
        this.messageState = messageState;
    }

    @JsonProperty("message_time")
    public String getMessageTime() {
        return messageTime;
    }

    @JsonProperty("message_time")
    public void setMessageTime(String messageTime) {
        this.messageTime = messageTime;
    }

    @JsonProperty("message_type")
    public String getMessageType() {
        return messageType;
    }

    @JsonProperty("message_type")
    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    @JsonProperty("message_uuid")
    public String getMessageUuid() {
        return messageUuid;
    }

    @JsonProperty("message_uuid")
    public void setMessageUuid(String messageUuid) {
        this.messageUuid = messageUuid;
    }

    @JsonProperty("resource_uri")
    public String getResourceUri() {
        return resourceUri;
    }

    @JsonProperty("resource_uri")
    public void setResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
    }

    @JsonProperty("to_number")
    public String getToNumber() {
        return toNumber;
    }

    @JsonProperty("to_number")
    public void setToNumber(String toNumber) {
        this.toNumber = toNumber;
    }

    @JsonProperty("total_amount")
    public String getTotalAmount() {
        return totalAmount;
    }

    @JsonProperty("total_amount")
    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    @JsonProperty("total_rate")
    public String getTotalRate() {
        return totalRate;
    }

    @JsonProperty("total_rate")
    public void setTotalRate(String totalRate) {
        this.totalRate = totalRate;
    }

    @JsonProperty("units")
    public Integer getUnits() {
        return units;
    }

    @JsonProperty("units")
    public void setUnits(Integer units) {
        this.units = units;
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
        return new ToStringBuilder(this).append("apiId", apiId).append("errorCode", errorCode).append("fromNumber", fromNumber).append("messageDirection", messageDirection).append("messageState", messageState).append("messageTime", messageTime).append("messageType", messageType).append("messageUuid", messageUuid).append("resourceUri", resourceUri).append("toNumber", toNumber).append("totalAmount", totalAmount).append("totalRate", totalRate).append("units", units).append("additionalProperties", additionalProperties).toString();
    }

}