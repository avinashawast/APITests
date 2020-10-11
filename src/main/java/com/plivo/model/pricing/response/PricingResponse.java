package com.plivo.model.pricing.response;

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
        "country",
        "country_code",
        "country_iso",
        "message",
        "mms",
        "phone_numbers",
        "voice"
})
public class PricingResponse {

    @JsonProperty("api_id")
    private String apiId;
    @JsonProperty("country")
    private String country;
    @JsonProperty("country_code")
    private Integer countryCode;
    @JsonProperty("country_iso")
    private String countryIso;
    @JsonProperty("message")
    private Message message;
    @JsonProperty("mms")
    private Mms mms;
    @JsonProperty("phone_numbers")
    private PhoneNumbers phoneNumbers;
    @JsonProperty("voice")
    private Voice voice;
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

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("country_code")
    public Integer getCountryCode() {
        return countryCode;
    }

    @JsonProperty("country_code")
    public void setCountryCode(Integer countryCode) {
        this.countryCode = countryCode;
    }

    @JsonProperty("country_iso")
    public String getCountryIso() {
        return countryIso;
    }

    @JsonProperty("country_iso")
    public void setCountryIso(String countryIso) {
        this.countryIso = countryIso;
    }

    @JsonProperty("message")
    public Message getMessage() {
        return message;
    }

    @JsonProperty("message")
    public void setMessage(Message message) {
        this.message = message;
    }

    @JsonProperty("mms")
    public Mms getMms() {
        return mms;
    }

    @JsonProperty("mms")
    public void setMms(Mms mms) {
        this.mms = mms;
    }

    @JsonProperty("phone_numbers")
    public PhoneNumbers getPhoneNumbers() {
        return phoneNumbers;
    }

    @JsonProperty("phone_numbers")
    public void setPhoneNumbers(PhoneNumbers phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @JsonProperty("voice")
    public Voice getVoice() {
        return voice;
    }

    @JsonProperty("voice")
    public void setVoice(Voice voice) {
        this.voice = voice;
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
        return new ToStringBuilder(this).append("apiId", apiId).append("country", country).append("countryCode", countryCode).append("countryIso", countryIso).append("message", message).append("mms", mms).append("phoneNumbers", phoneNumbers).append("voice", voice).append("additionalProperties", additionalProperties).toString();
    }

}
