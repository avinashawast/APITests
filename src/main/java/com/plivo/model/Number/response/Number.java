package com.plivo.model.Number.response;

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
        "api_id",
        "meta",
        "objects"
})
public class Number {

    @JsonProperty("api_id")
    private String apiId;
    @JsonProperty("meta")
    private Meta meta;
    @JsonProperty("objects")
    private List<Object> objects = null;
    @JsonIgnore
    private Map<String, java.lang.Object> additionalProperties = new HashMap<String, java.lang.Object>();

    @JsonProperty("api_id")
    public String getApiId() {
        return apiId;
    }

    @JsonProperty("api_id")
    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    @JsonProperty("meta")
    public Meta getMeta() {
        return meta;
    }

    @JsonProperty("meta")
    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    @JsonProperty("objects")
    public List<Object> getObjects() {
        return objects;
    }

    @JsonProperty("objects")
    public void setObjects(List<Object> objects) {
        this.objects = objects;
    }

    @JsonAnyGetter
    public Map<String, java.lang.Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, java.lang.Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("apiId", apiId).append("meta", meta).append("objects", objects).append("additionalProperties", additionalProperties).toString();
    }

}