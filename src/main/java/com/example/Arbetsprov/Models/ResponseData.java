package com.example.Arbetsprov.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ResponseData<T> {
  @JsonProperty("Version")
    private String version;
    @JsonProperty("Type")
    private String type;
    @JsonProperty("Result")
    private List<T> result;

    @JsonProperty("Result")
    public List<T> getResult() {
        return result;
    }
}
