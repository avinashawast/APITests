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
        "ip",
        "local",
        "rates",
        "tollfree"
})
public class Outbound__ {

    @JsonProperty("ip")
    private Ip_ ip;
    @JsonProperty("local")
    private Local__ local;
    @JsonProperty("rates")
    private List<Rate___> rates = null;
    @JsonProperty("tollfree")
    private Tollfree__ tollfree;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ip")
    public Ip_ getIp() {
        return ip;
    }

    @JsonProperty("ip")
    public void setIp(Ip_ ip) {
        this.ip = ip;
    }

    @JsonProperty("local")
    public Local__ getLocal() {
        return local;
    }

    @JsonProperty("local")
    public void setLocal(Local__ local) {
        this.local = local;
    }

    @JsonProperty("rates")
    public List<Rate___> getRates() {
        return rates;
    }

    @JsonProperty("rates")
    public void setRates(List<Rate___> rates) {
        this.rates = rates;
    }

    @JsonProperty("tollfree")
    public Tollfree__ getTollfree() {
        return tollfree;
    }

    @JsonProperty("tollfree")
    public void setTollfree(Tollfree__ tollfree) {
        this.tollfree = tollfree;
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
        return new ToStringBuilder(this).append("ip", ip).append("local", local).append("rates", rates).append("tollfree", tollfree).append("additionalProperties", additionalProperties).toString();
    }

}
