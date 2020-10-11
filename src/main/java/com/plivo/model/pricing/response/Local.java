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
        "rate",
        "rates"
})
public class Local {

    @JsonProperty("rate")
    private String rate;
    @JsonProperty("rates")
    private List<Rate> rates = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("rate")
    public String getRate() {
        return rate;
    }

    @JsonProperty("rate")
    public void setRate(String rate) {
        this.rate = rate;
    }

    @JsonProperty("rates")
    public List<Rate> getRates() {
        return rates;
    }

    @JsonProperty("rates")
    public void setRates(List<Rate> rates) {
        this.rates = rates;
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
        return new ToStringBuilder(this).append("rate", rate).append("rates", rates).append("additionalProperties", additionalProperties).toString();
    }

}
