package com.plivo.model.message.request;

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
        "src",
        "dst",
        "text"
})
public class MessageRequest {

    @JsonProperty("src")
    private String src;
    @JsonProperty("dst")
    private String dst;
    @JsonProperty("text")
    private String text;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("src")
    public String getSrc() {
        return src;
    }

    @JsonProperty("src")
    public void setSrc(String src) {
        this.src = src;
    }

    @JsonProperty("dst")
    public String getDst() {
        return dst;
    }

    @JsonProperty("dst")
    public void setDst(String dst) {
        this.dst = dst;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
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
        return new ToStringBuilder(this).append("src", src).append("dst", dst).append("text", text).append("additionalProperties", additionalProperties).toString();
    }

}