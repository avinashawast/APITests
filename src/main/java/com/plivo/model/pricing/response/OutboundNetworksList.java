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
        "group_name",
        "rate"
})
public class OutboundNetworksList {

    @JsonProperty("group_name")
    private String groupName;
    @JsonProperty("rate")
    private String rate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("group_name")
    public String getGroupName() {
        return groupName;
    }

    @JsonProperty("group_name")
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @JsonProperty("rate")
    public String getRate() {
        return rate;
    }

    @JsonProperty("rate")
    public void setRate(String rate) {
        this.rate = rate;
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
        return new ToStringBuilder(this).append("groupName", groupName).append("rate", rate).append("additionalProperties", additionalProperties).toString();
    }

}
