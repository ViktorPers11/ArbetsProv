package com.example.Arbetsprov.Controllers;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.example.Arbetsprov.Models.*;

public class BusController {

    public BusController(){
        
    }

    private static HttpEntity<?> getHeader() {
        HttpHeaders requestHeaders = new HttpHeaders();
        requestHeaders.add(HttpHeaders.ACCEPT_ENCODING, "gzip");
        return new HttpEntity<>(requestHeaders);
    }

    @Bean
    private static RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public List<JourneyPatternPointOnLine> getJourneyPatternPointOnLines(){
        RestTemplate restTemplate = new RestTemplate();

                ResponseEntity<ModelBase<JourneyPatternPointOnLine>> journeyPatternPointOnLineResponse =
                restTemplate.exchange("https://api.sl.se/api2/linedata.json?model=jour&key=462f1dd6640e4b59bdb5d3ea6151670c&model=jour&DefaultTransportModeCode=BUS",
                HttpMethod.GET,
                getHeader(),
                new ParameterizedTypeReference<>() {
                });

                var journeyPatternPointOnLineList = journeyPatternPointOnLineResponse.getBody().getResponseData().getResult();

                return journeyPatternPointOnLineList;
    }

    public List<StopPoint> getStopPoints(){
        RestTemplate restTemplate = new RestTemplate();

                ResponseEntity<ModelBase<StopPoint>> journeyPatternPointOnLineResponse =
                restTemplate.exchange("https://api.sl.se/api2/linedata.json?model=stop&key=462f1dd6640e4b59bdb5d3ea6151670c&model=jour&DefaultTransportModeCode=BUS",
                HttpMethod.GET,
                getHeader(),
                new ParameterizedTypeReference<>() {
                });

                var journeyPatternPointOnLineList = journeyPatternPointOnLineResponse.getBody().getResponseData().getResult();

                return journeyPatternPointOnLineList;
    }
}
