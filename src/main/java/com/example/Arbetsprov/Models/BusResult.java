package com.example.Arbetsprov.Models;

import java.util.List;

public class BusResult implements Comparable<BusResult> {
    public Integer BusLine;
    public Integer Amount;
    public List<String> Stops;

    public BusResult(int busLine, int amount, List<String> stops){
        this.BusLine = busLine;
        this.Amount = amount;
        this.Stops = stops;
    }

    @Override
	public int compareTo(BusResult e) {
		return this.Amount.compareTo(e.Amount);
	}
}
