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
        "ip",
        "local",
        "tollfree"
})
public class Inbound__ {

    @JsonProperty("ip")
    private Ip ip;
    @JsonProperty("local")
    private Local_ local;
    @JsonProperty("tollfree")
    private Tollfree_ tollfree;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ip")
    public Ip getIp() {
        return ip;
    }

    @JsonProperty("ip")
    public void setIp(Ip ip) {
        this.ip = ip;
    }

    @JsonProperty("local")
    public Local_ getLocal() {
        return local;
    }

    @JsonProperty("local")
    public void setLocal(Local_ local) {
        this.local = local;
    }

    @JsonProperty("tollfree")
    public Tollfree_ getTollfree() {
        return tollfree;
    }

    @JsonProperty("tollfree")
    public void setTollfree(Tollfree_ tollfree) {
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
        return new ToStringBuilder(this).append("ip", ip).append("local", local).append("tollfree", tollfree).append("additionalProperties", additionalProperties).toString();
    }

}
