package com.bridgelabz.cabinvoicegenerator;

import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceGeneratorTest {

    //Step1 - Calculate Fare
    @Test
    public void givenDistanceAndTime_shouldReturnTotalFare(){
        CabInvoiceGenerator invoiceGenerator = new CabInvoiceGenerator();
        double distance = 2.0;
        int time = 5;
        double fare = invoiceGenerator.calculateFare(distance,time);
        Assert.assertEquals(25,fare,0.0);
    }

    @Test
    public void givenLessDistanceOrTime_shouldReturnMinFare(){
        CabInvoiceGenerator invoiceGenerator = new CabInvoiceGenerator();
        double distance = 0.1;
        int time = 1;
        double fare = invoiceGenerator.calculateFare(distance,time);
        Assert.assertEquals(5,fare,0.0);
    }

    //Step3 - Enhanced Invoice
    @Test
    public void givenRides_ShouldReturnInvoiceSummary() {
        CabInvoiceGenerator invoiceGenerator = new CabInvoiceGenerator();
        Ride[] rides = {
                new Ride(2.0, 5),
                new Ride(0.1, 1)
        };
        InvoiceSummary actualInvoiceSummary = invoiceGenerator.calculateFare(rides);
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30.0);
        Assert.assertEquals(expectedInvoiceSummary, actualInvoiceSummary);
    }
}
