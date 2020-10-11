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
        "inbound",
        "outbound"
})
public class Voice {

    @JsonProperty("inbound")
    private Inbound__ inbound;
    @JsonProperty("outbound")
    private Outbound__ outbound;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("inbound")
    public Inbound__ getInbound() {
        return inbound;
    }

    @JsonProperty("inbound")
    public void setInbound(Inbound__ inbound) {
        this.inbound = inbound;
    }

    @JsonProperty("outbound")
    public Outbound__ getOutbound() {
        return outbound;
    }

    @JsonProperty("outbound")
    public void setOutbound(Outbound__ outbound) {
        this.outbound = outbound;
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
        return new ToStringBuilder(this).append("inbound", inbound).append("outbound", outbound).append("additionalProperties", additionalProperties).toString();
    }

}
