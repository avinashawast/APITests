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
public class Mms {

    @JsonProperty("inbound")
    private Inbound_ inbound;
    @JsonProperty("outbound")
    private Outbound_ outbound;
    @JsonProperty("outbound_networks_list")
    private List<OutboundNetworksList_> outboundNetworksList = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("inbound")
    public Inbound_ getInbound() {
        return inbound;
    }

    @JsonProperty("inbound")
    public void setInbound(Inbound_ inbound) {
        this.inbound = inbound;
    }

    @JsonProperty("outbound")
    public Outbound_ getOutbound() {
        return outbound;
    }

    @JsonProperty("outbound")
    public void setOutbound(Outbound_ outbound) {
        this.outbound = outbound;
    }

    @JsonProperty("outbound_networks_list")
    public List<OutboundNetworksList_> getOutboundNetworksList() {
        return outboundNetworksList;
    }

    @JsonProperty("outbound_networks_list")
    public void setOutboundNetworksList(List<OutboundNetworksList_> outboundNetworksList) {
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
