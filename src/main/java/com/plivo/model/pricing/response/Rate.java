package com.plivo.model.pricing.response;

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
        "capabilities",
        "rental_rate",
        "setup_rate"
})
public class Rate {

    @JsonProperty("capabilities")
    private List<String> capabilities = null;
    @JsonProperty("rental_rate")
    private String rentalRate;
    @JsonProperty("setup_rate")
    private String setupRate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("capabilities")
    public List<String> getCapabilities() {
        return capabilities;
    }

    @JsonProperty("capabilities")
    public void setCapabilities(List<String> capabilities) {
        this.capabilities = capabilities;
    }

    @JsonProperty("rental_rate")
    public String getRentalRate() {
        return rentalRate;
    }

    @JsonProperty("rental_rate")
    public void setRentalRate(String rentalRate) {
        this.rentalRate = rentalRate;
    }

    @JsonProperty("setup_rate")
    public String getSetupRate() {
        return setupRate;
    }

    @JsonProperty("setup_rate")
    public void setSetupRate(String setupRate) {
        this.setupRate = setupRate;
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
        return new ToStringBuilder(this).append("capabilities", capabilities).append("rentalRate", rentalRate).append("setupRate", setupRate).append("additionalProperties", additionalProperties).toString();
    }

}
