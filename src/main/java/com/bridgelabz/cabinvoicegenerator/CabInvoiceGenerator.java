package com.bridgelabz.cabinvoicegenerator;

public class CabInvoiceGenerator {
    private static final int COST_PER_TIME = 1;
    private static final double MINIMUM_COST_PER_KILOMETER = 10;
    private static final double MINIMUM_FARE = 5;

    public double calculateFare(double distance, int time) {
        Double totalFare = distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
        if(totalFare < MINIMUM_FARE)
            return MINIMUM_FARE;
        return totalFare;
    }
}
