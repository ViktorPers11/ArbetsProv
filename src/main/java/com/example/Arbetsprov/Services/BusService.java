package com.example.Arbetsprov.Services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import com.example.Arbetsprov.Models.BusResult;
import com.example.Arbetsprov.Models.JourneyPatternPointOnLine;

import com.example.Arbetsprov.Controllers.*;

public class BusService {
    public List<BusResult> GetBusStopsWithTheMostStops(){

                // Get values from API
                var busController = new BusController();

                var journeyPatternPointOnLineList = busController.getJourneyPatternPointOnLines();
                var stops = busController.getStopPoints();

                // Start with grouping by LineNumber, filet out direction != 1 as it looked like it send in douplicates
                // Most likely the "way back" is included as well, and we want to remove those for this function
                var journeyPatternPointsOnLineGrouped = journeyPatternPointOnLineList
                .stream()
                .filter(t -> t.getDirectionCode() == 1)
                .collect(
                    Collectors.groupingBy(
                        JourneyPatternPointOnLine::getLineNumber,
                        Collectors.toList()));

                // We want to put all the information we need in a list of the object BusResult
                // BusResult holds: 1) The Line number 2) the number of stops on said line and 3) a list of stings containing all the stop names
                ArrayList<BusResult> busResults = new ArrayList<BusResult>();
                for (Entry<Integer, List<JourneyPatternPointOnLine>> journeyPatternPointOnLine : journeyPatternPointsOnLineGrouped.entrySet()) {
                    busResults.add(
                        new BusResult(
                            journeyPatternPointOnLine.getKey(), 
                            journeyPatternPointOnLine.getValue().size(), 
                            stops
                                .stream().filter(t -> (journeyPatternPointOnLine.getValue()
                                    .stream()
                                    .map(JourneyPatternPointOnLine::getJourneyPatternPointNumber)
                                    .collect(Collectors.toList()))
                                    .contains(t.getStopPointNumber()))
                                    .map(t -> t.getStopPointName())
                                .collect(Collectors.toList()))
                            );   
                }

                // Get the top 10, also sort
                var top10 = getTop10(busResults);

                return top10;
    }

    private List<BusResult> getTop10(List<BusResult> busResults){
                Comparator<BusResult> compareByValue = 
	                (BusResult o1, BusResult o2) -> o2.Amount.compareTo( o1.Amount );

                Collections.sort(busResults, compareByValue);

                return busResults.subList(0, 10);
    }
}
