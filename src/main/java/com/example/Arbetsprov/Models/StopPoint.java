package com.example.Arbetsprov.Models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "StopPointNumber", "StopPointName", "StopAreaNumber", "LocationNorthingCoordinate",
		"LocationEastingCoordinate", "ZoneShortName", "StopAreaTypeCode", "LastModifiedUtcDateTime", "ExistsFromDate" })
public class StopPoint {
    @JsonProperty("StopPointNumber")
    private Integer stopPointNumber;

    @JsonProperty("StopPointName")
    private String stopPointName;

    @JsonProperty("StopAreaNumber")
    private Integer stopAreaNumber;

    @JsonProperty("LocationNorthingCoordinate")
    private Double locationNorthingCoordinate;
    
    @JsonProperty("LocationEastingCoordinate")
    private Double locationEastingCoordinate;
    
    @JsonProperty("ZoneShortName")
    private String zoneShortName;
    
    @JsonProperty("StopAreaTypeCode")
    private String stopAreaTypeCode;
    
    @JsonProperty("LastModifiedUtcDateTime")
    private String lastModifiedUtcDateTime;
    
    @JsonProperty("ExistsFromDate")
    private String existsFromDate;

    @JsonProperty("StopPointNumber")
    public Integer getStopPointNumber(){
        return stopPointNumber;
    }

    @JsonProperty("StopPointName")
    public String getStopPointName(){
        return stopPointName;
    }
}
