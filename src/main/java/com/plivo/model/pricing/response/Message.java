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
        "inbound",
        "outbound",
        "outbound_networks_list"
})
public class Message {

    @JsonProperty("inbound")
    private Inbound inbound;
    @JsonProperty("outbound")
    private Outbound outbound;
    @JsonProperty("outbound_networks_list")
    private List<OutboundNetworksList> outboundNetworksList = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("inbound")
    public Inbound getInbound() {
        return inbound;
    }

    @JsonProperty("inbound")
    public void setInbound(Inbound inbound) {
        this.inbound = inbound;
    }

    @JsonProperty("outbound")
    public Outbound getOutbound() {
        return outbound;
    }

    @JsonProperty("outbound")
    public void setOutbound(Outbound outbound) {
        this.outbound = outbound;
    }

    @JsonProperty("outbound_networks_list")
    public List<OutboundNetworksList> getOutboundNetworksList() {
        return outboundNetworksList;
    }

    @JsonProperty("outbound_networks_list")
    public void setOutboundNetworksList(List<OutboundNetworksList> outboundNetworksList) {
        this.outboundNetworksList = outboundNetworksList;
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
        return new ToStringBuilder(this).append("inbound", inbound).append("outbound", outbound).append("outboundNetworksList", outboundNetworksList).append("additionalProperties", additionalProperties).toString();
    }

}
