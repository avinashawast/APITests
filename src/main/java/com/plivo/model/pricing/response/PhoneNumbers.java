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
        "local",
        "shortcode",
        "tollfree"
})
public class PhoneNumbers {

    @JsonProperty("local")
    private Local local;
    @JsonProperty("shortcode")
    private Shortcode shortcode;
    @JsonProperty("tollfree")
    private Tollfree tollfree;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("local")
    public Local getLocal() {
        return local;
    }

    @JsonProperty("local")
    public void setLocal(Local local) {
        this.local = local;
    }

    @JsonProperty("shortcode")
    public Shortcode getShortcode() {
        return shortcode;
    }

    @JsonProperty("shortcode")
    public void setShortcode(Shortcode shortcode) {
        this.shortcode = shortcode;
    }

    @JsonProperty("tollfree")
    public Tollfree getTollfree() {
        return tollfree;
    }

    @JsonProperty("tollfree")
    public void setTollfree(Tollfree tollfree) {
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
        return new ToStringBuilder(this).append("local", local).append("shortcode", shortcode).append("tollfree", tollfree).append("additionalProperties", additionalProperties).toString();
    }

}
