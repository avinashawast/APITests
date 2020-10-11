package com.plivo.model.account.response;

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
        "account_type",
        "address",
        "api_id",
        "auth_id",
        "auto_recharge",
        "billing_mode",
        "cash_credits",
        "city",
        "name",
        "resource_uri",
        "state",
        "timezone"
})
public class AccountDetailsResponse {

    @JsonProperty("account_type")
    private String accountType;
    @JsonProperty("address")
    private String address;
    @JsonProperty("api_id")
    private String apiId;
    @JsonProperty("auth_id")
    private String authId;
    @JsonProperty("auto_recharge")
    private Boolean autoRecharge;
    @JsonProperty("billing_mode")
    private String billingMode;
    @JsonProperty("cash_credits")
    private String cashCredits;
    @JsonProperty("city")
    private String city;
    @JsonProperty("name")
    private String name;
    @JsonProperty("resource_uri")
    private String resourceUri;
    @JsonProperty("state")
    private String state;
    @JsonProperty("timezone")
    private String timezone;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("account_type")
    public String getAccountType() {
        return accountType;
    }

    @JsonProperty("account_type")
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("api_id")
    public String getApiId() {
        return apiId;
    }

    @JsonProperty("api_id")
    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    @JsonProperty("auth_id")
    public String getAuthId() {
        return authId;
    }

    @JsonProperty("auth_id")
    public void setAuthId(String authId) {
        this.authId = authId;
    }

    @JsonProperty("auto_recharge")
    public Boolean getAutoRecharge() {
        return autoRecharge;
    }

    @JsonProperty("auto_recharge")
    public void setAutoRecharge(Boolean autoRecharge) {
        this.autoRecharge = autoRecharge;
    }

    @JsonProperty("billing_mode")
    public String getBillingMode() {
        return billingMode;
    }

    @JsonProperty("billing_mode")
    public void setBillingMode(String billingMode) {
        this.billingMode = billingMode;
    }

    @JsonProperty("cash_credits")
    public String getCashCredits() {
        return cashCredits;
    }

    @JsonProperty("cash_credits")
    public void setCashCredits(String cashCredits) {
        this.cashCredits = cashCredits;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("resource_uri")
    public String getResourceUri() {
        return resourceUri;
    }

    @JsonProperty("resource_uri")
    public void setResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public void setTimezone(String timezone) {
        this.timezone = timezone;
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
        return new ToStringBuilder(this).append("accountType", accountType).append("address", address).append("apiId", apiId).append("authId", authId).append("autoRecharge", autoRecharge).append("billingMode", billingMode).append("cashCredits", cashCredits).append("city", city).append("name", name).append("resourceUri", resourceUri).append("state", state).append("timezone", timezone).append("additionalProperties", additionalProperties).toString();
    }

}