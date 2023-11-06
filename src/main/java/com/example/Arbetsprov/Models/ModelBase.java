package com.example.Arbetsprov.Models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"StatusCode", "Message", "ExecutionTime", "ResponseData"})

public class ModelBase<T> {
    @JsonProperty("StatusCode")
    private int statusCode;
    @JsonProperty("Message")
    private Object message;
    @JsonProperty("ExecutionTime")
    private int executionTime;
    @JsonProperty("ResponseData")
    private ResponseData<T> responseData;

    @JsonProperty("ResponseData")
    public ResponseData<T> getResponseData() {
        return responseData;
    }
}
