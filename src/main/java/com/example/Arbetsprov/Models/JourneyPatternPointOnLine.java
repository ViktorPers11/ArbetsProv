package com.example.Arbetsprov.Models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "LineNumber", "DirectionCode", "JourneyPatternPointNumber", "LastModifiedUtcDateTime",
		"ExistsFromDate" })
public class JourneyPatternPointOnLine {

	@JsonProperty("LineNumber")
	public int lineNumber;
	@JsonProperty("DirectionCode")
	private int directionCode;
	@JsonProperty("JourneyPatternPointNumber")
	private int journeyPatternPointNumber;
	@JsonProperty("LastModifiedUtcDateTime")
	private String lastModifiedUtcDateTime;
	@JsonProperty("ExistsFromDate")
	private String existsFromDate;

	@JsonProperty("LineNumber")
	public int getLineNumber() {
		return lineNumber;
	}

	@JsonProperty("LineNumber")
	public JourneyPatternPointOnLine setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
		return this;
	}

	@JsonProperty("DirectionCode")
	public int getDirectionCode() {
		return directionCode;
	}

	@JsonProperty("JourneyPatternPointNumber")
	public int getJourneyPatternPointNumber() {
		return journeyPatternPointNumber;
	}

	@JsonProperty("JourneyPatternPointNumber")
	public JourneyPatternPointOnLine setJourneyPatternPointNumber(int journeyPatternPointNumber) {
		this.journeyPatternPointNumber = journeyPatternPointNumber;
		return this;
	}

	@JsonProperty("LastModifiedUtcDateTime")
	public String getLastModifiedUtcDateTime() {
		return lastModifiedUtcDateTime;
	}

	@JsonProperty("LastModifiedUtcDateTime")
	public void setLastModifiedUtcDateTime(String lastModifiedUtcDateTime) {
		this.lastModifiedUtcDateTime = lastModifiedUtcDateTime;
	}

	@JsonProperty("ExistsFromDate")
	public String getExistsFromDate() {
		return existsFromDate;
	}

	@JsonProperty("ExistsFromDate")
	public void setExistsFromDate(String existsFromDate) {
		this.existsFromDate = existsFromDate;
	}
}