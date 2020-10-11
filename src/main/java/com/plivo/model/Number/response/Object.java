package com.plivo.model.Number.response;

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
        "active",
        "added_on",
        "alias",
        "application",
        "carrier",
        "city",
        "country",
        "mms_enabled",
        "mms_rate",
        "monthly_rental_rate",
        "number",
        "number_type",
        "region",
        "resource_uri",
        "sms_enabled",
        "sms_rate",
        "sub_account",
        "type",
        "verification_info",
        "voice_enabled",
        "voice_rate"
})
public class Object {

    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("added_on")
    private String addedOn;
    @JsonProperty("alias")
    private String alias;
    @JsonProperty("application")
    private String application;
    @JsonProperty("carrier")
    private String carrier;
    @JsonProperty("city")
    private String city;
    @JsonProperty("country")
    private String country;
    @JsonProperty("mms_enabled")
    private Boolean mmsEnabled;
    @JsonProperty("mms_rate")
    private String mmsRate;
    @JsonProperty("monthly_rental_rate")
    private String monthlyRentalRate;
    @JsonProperty("number")
    private String number;
    @JsonProperty("number_type")
    private String numberType;
    @JsonProperty("region")
    private String region;
    @JsonProperty("resource_uri")
    private String resourceUri;
    @JsonProperty("sms_enabled")
    private Boolean smsEnabled;
    @JsonProperty("sms_rate")
    private String smsRate;
    @JsonProperty("sub_account")
    private java.lang.Object subAccount;
    @JsonProperty("type")
    private String type;
    @JsonProperty("verification_info")
    private List<java.lang.Object> verificationInfo = null;
    @JsonProperty("voice_enabled")
    private Boolean voiceEnabled;
    @JsonProperty("voice_rate")
    private String voiceRate;
    @JsonIgnore
    private Map<String, java.lang.Object> additionalProperties = new HashMap<String, java.lang.Object>();

    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    @JsonProperty("added_on")
    public String getAddedOn() {
        return addedOn;
    }

    @JsonProperty("added_on")
    public void setAddedOn(String addedOn) {
        this.addedOn = addedOn;
    }

    @JsonProperty("alias")
    public String getAlias() {
        return alias;
    }

    @JsonProperty("alias")
    public void setAlias(String alias) {
        this.alias = alias;
    }

    @JsonProperty("application")
    public String getApplication() {
        return application;
    }

    @JsonProperty("application")
    public void setApplication(String application) {
        this.application = application;
    }

    @JsonProperty("carrier")
    public String getCarrier() {
        return carrier;
    }

    @JsonProperty("carrier")
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("mms_enabled")
    public Boolean getMmsEnabled() {
        return mmsEnabled;
    }

    @JsonProperty("mms_enabled")
    public void setMmsEnabled(Boolean mmsEnabled) {
        this.mmsEnabled = mmsEnabled;
    }

    @JsonProperty("mms_rate")
    public String getMmsRate() {
        return mmsRate;
    }

    @JsonProperty("mms_rate")
    public void setMmsRate(String mmsRate) {
        this.mmsRate = mmsRate;
    }

    @JsonProperty("monthly_rental_rate")
    public String getMonthlyRentalRate() {
        return monthlyRentalRate;
    }

    @JsonProperty("monthly_rental_rate")
    public void setMonthlyRentalRate(String monthlyRentalRate) {
        this.monthlyRentalRate = monthlyRentalRate;
    }

    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    @JsonProperty("number_type")
    public String getNumberType() {
        return numberType;
    }

    @JsonProperty("number_type")
    public void setNumberType(String numberType) {
        this.numberType = numberType;
    }

    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    @JsonProperty("resource_uri")
    public String getResourceUri() {
        return resourceUri;
    }

    @JsonProperty("resource_uri")
    public void setResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
    }

    @JsonProperty("sms_enabled")
    public Boolean getSmsEnabled() {
        return smsEnabled;
    }

    @JsonProperty("sms_enabled")
    public void setSmsEnabled(Boolean smsEnabled) {
        this.smsEnabled = smsEnabled;
    }

    @JsonProperty("sms_rate")
    public String getSmsRate() {
        return smsRate;
    }

    @JsonProperty("sms_rate")
    public void setSmsRate(String smsRate) {
        this.smsRate = smsRate;
    }

    @JsonProperty("sub_account")
    public java.lang.Object getSubAccount() {
        return subAccount;
    }

    @JsonProperty("sub_account")
    public void setSubAccount(java.lang.Object subAccount) {
        this.subAccount = subAccount;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("verification_info")
    public List<java.lang.Object> getVerificationInfo() {
        return verificationInfo;
    }

    @JsonProperty("verification_info")
    public void setVerificationInfo(List<java.lang.Object> verificationInfo) {
        this.verificationInfo = verificationInfo;
    }

    @JsonProperty("voice_enabled")
    public Boolean getVoiceEnabled() {
        return voiceEnabled;
    }

    @JsonProperty("voice_enabled")
    public void setVoiceEnabled(Boolean voiceEnabled) {
        this.voiceEnabled = voiceEnabled;
    }

    @JsonProperty("voice_rate")
    public String getVoiceRate() {
        return voiceRate;
    }

    @JsonProperty("voice_rate")
    public void setVoiceRate(String voiceRate) {
        this.voiceRate = voiceRate;
    }

    @JsonAnyGetter
    public Map<String, java.lang.Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, java.lang.Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("active", active).append("addedOn", addedOn).append("alias", alias).append("application", application).append("carrier", carrier).append("city", city).append("country", country).append("mmsEnabled", mmsEnabled).append("mmsRate", mmsRate).append("monthlyRentalRate", monthlyRentalRate).append("number", number).append("numberType", numberType).append("region", region).append("resourceUri", resourceUri).append("smsEnabled", smsEnabled).append("smsRate", smsRate).append("subAccount", subAccount).append("type", type).append("verificationInfo", verificationInfo).append("voiceEnabled", voiceEnabled).append("voiceRate", voiceRate).append("additionalProperties", additionalProperties).toString();
    }

}